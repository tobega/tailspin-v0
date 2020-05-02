package tailspin.matchers;

import java.util.List;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class ArrayMatch implements Criterion {
  // @Nullable
  private final Criterion lengthCriterion;
  private final List<CollectionCriterionFactory> contentMatcherFactories;

  public ArrayMatch(Criterion lengthCriterion,
      List<CollectionCriterionFactory> contentMatcherFactories) {
    this.lengthCriterion = lengthCriterion;
    this.contentMatcherFactories = contentMatcherFactories;
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
    for(Object e: listToMatch) {
      for (Criterion c : criteria) {
        if (c.isMet(e, it, scope)) {
          break;
        }
      }
    }
    return criteria.stream().allMatch(c -> c.isSatisfied(it, scope));
  }
}
