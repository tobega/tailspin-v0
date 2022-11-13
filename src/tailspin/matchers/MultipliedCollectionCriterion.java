package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.TailspinArray;

public class MultipliedCollectionCriterion implements CollectionCriterion {
  private final CollectionSegmentCriterion criterion;
  private final RangeMatch multiplier;
  private long count = 0;

  public MultipliedCollectionCriterion(CollectionSegmentCriterion criterion, RangeMatch multiplier) {
    this.criterion = criterion;
    this.multiplier = multiplier;
  }

  /**
   * Elements are fed into this method which returns true for every element that meets the
   * underlying criterion.
   */
  @Override
  public int isMetAt(TailspinArray.Tail tail, Object it, Scope scope) {
    int chop = criterion.isMetAt(tail, it, scope);
    if (chop == 0) {
      return 0;
    }
    count++;
    return chop;
  }

  /**
   * Returns true if the additional collection specification for this criterion has been satisfied.
   */
  @Override
  public boolean isSatisfied(Object it, Scope scope) {
    return multiplier.matches(count, it, scope, null);
  }
}
