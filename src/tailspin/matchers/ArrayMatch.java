package tailspin.matchers;

import java.util.List;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;
import tailspin.types.TailspinArray;

public class ArrayMatch implements Criterion {
  // @Nullable
  private final Criterion lengthCriterion;
  private final List<CollectionCriterionFactory> contentMatcherFactories;
  private final boolean nothingElseAllowed;

  public ArrayMatch(Criterion lengthCriterion,
      List<CollectionCriterionFactory> contentMatcherFactories, boolean nothingElseAllowed) {
    this.lengthCriterion = lengthCriterion;
    this.contentMatcherFactories = contentMatcherFactories;
    this.nothingElseAllowed = nothingElseAllowed;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    if (!(toMatch instanceof TailspinArray)) return false;
    TailspinArray listToMatch = (TailspinArray) toMatch;
    if (lengthCriterion != null && !lengthCriterion.isMet((long) listToMatch.length(), it, scope)) {
      return false;
    }
    if (contentMatcherFactories.isEmpty()) {
      return true;
    }
    List<CollectionCriterion> criteria = contentMatcherFactories.stream()
        .map(CollectionCriterionFactory::newCriterion).collect(
            Collectors.toList());
    TailspinArray.Tail tail = listToMatch.tailFrom(1);
    nextElement:
    while(!tail.isEmpty()) {
      for (CollectionCriterion c : criteria) {
        int chop = c.isMetAt(tail, it, scope);
        if (chop != 0) {
          tail = tail.tailFrom(chop+1);
          continue nextElement;
        }
      }
      if (nothingElseAllowed) {
        return false;
      }
      tail = tail.tailFrom(2);
    }
    return criteria.stream().allMatch(c -> c.isSatisfied(it, scope));
  }
}
