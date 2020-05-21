package tailspin.matchers;

import java.util.List;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

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
    if (!(toMatch instanceof List)) return false;
    List<?> listToMatch = (List<?>) toMatch;
    if (lengthCriterion != null && !lengthCriterion.isMet((long) listToMatch.size(), it, scope)) {
      return false;
    }
    if (contentMatcherFactories.isEmpty()) {
      return true;
    }
    List<CollectionCriterion> criteria = contentMatcherFactories.stream()
        .map(CollectionCriterionFactory::newCriterion).collect(
            Collectors.toList());
    nextElement:
    for(Object e: listToMatch) {
      for (Criterion c : criteria) {
        if (c.isMet(e, it, scope)) {
          continue nextElement;
        }
      }
      if (nothingElseAllowed) {
        return false;
      }
    }
    return criteria.stream().allMatch(c -> c.isSatisfied(it, scope));
  }
}
