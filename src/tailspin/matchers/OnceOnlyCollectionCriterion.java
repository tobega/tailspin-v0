package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class OnceOnlyCollectionCriterion implements CollectionCriterion {
  final Criterion criterion;
  boolean wasMatched;

  public OnceOnlyCollectionCriterion(Criterion criterion) {
    this.criterion = criterion;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    if (!wasMatched && criterion.isMet(toMatch, it, scope)) {
      wasMatched = true;
      return true;
    }
    return false;
  }

  @Override
  public boolean isSatisfied(Object it, Scope scope) {
    return wasMatched;
  }
}
