package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class CollectionCriterion implements Criterion {
  private final Criterion criterion;
  private final RangeMatch multiplier;
  private long count = 0;

  public CollectionCriterion(Criterion criterion, RangeMatch multiplier) {
    this.criterion = criterion;
    this.multiplier = multiplier;
  }

  /**
   * Elements are fed into this method which returns true for every element that meets the
   * underlying criterion.
   */
  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    if (!criterion.isMet(toMatch, it, scope)) {
      return false;
    }
    count++;
    return true;
  }

  /**
   * Returns true if the additional collection specification for this criterion has been satisfied.
   */
  public boolean isSatisfied(Object it, Scope scope) {
    return multiplier.isMet(count, it, scope);
  }
}
