package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.TailspinArray;

public class OnceOnlyCollectionCriterion implements CollectionCriterion {
  final CollectionSegmentCriterion criterion;
  boolean wasMatched;

  public OnceOnlyCollectionCriterion(CollectionSegmentCriterion criterion) {
    this.criterion = criterion;
  }

  @Override
  public int isMetAt(TailspinArray.Tail tail, Object it, Scope scope) {
    if (wasMatched) return 0;
    int chop = criterion.isMetAt(tail, it, scope);
    wasMatched = chop != 0;
    return chop;
  }

  @Override
  public boolean isSatisfied(Object it, Scope scope) {
    return wasMatched;
  }

  @Override
  public String toString() {
    return criterion.toString();
  }
}
