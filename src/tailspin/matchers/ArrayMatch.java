package tailspin.matchers;

import java.util.List;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.types.Membrane;
import tailspin.types.TailspinArray;

public class ArrayMatch implements Membrane {
  // @Nullable
  private final Membrane lengthMembrane;
  private final List<CollectionCriterionFactory> contentMatcherFactories;
  private final boolean nothingElseAllowed;

  public ArrayMatch(Membrane lengthMembrane,
      List<CollectionCriterionFactory> contentMatcherFactories, boolean nothingElseAllowed) {
    this.lengthMembrane = lengthMembrane;
    this.contentMatcherFactories = contentMatcherFactories;
    this.nothingElseAllowed = nothingElseAllowed;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope) {
    if (!(toMatch instanceof TailspinArray listToMatch)) return null;
    if (lengthMembrane != null && (null == lengthMembrane.permeate((long) listToMatch.length(), it, scope
    ))) {
      return null;
    }
    if (contentMatcherFactories.isEmpty()) {
      return toMatch;
    }
    List<CollectionCriterion> criteria = contentMatcherFactories.stream()
        .map(CollectionCriterionFactory::newCriterion).toList();
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
        return null;
      }
      tail = tail.tailFrom(2);
    }
    return criteria.stream().allMatch(c -> c.isSatisfied(it, scope)) ? toMatch : null;
  }

  @Override
  public String toString() {
    return "[" + contentMatcherFactories.stream().map(Object::toString).collect(Collectors.joining(",")) + (nothingElseAllowed ? "VOID" : "") + "]"
        + (lengthMembrane != null ? "(" + lengthMembrane + ")" : "");
  }
}
