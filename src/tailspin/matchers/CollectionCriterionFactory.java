package tailspin.matchers;

import tailspin.types.Criterion;

public class CollectionCriterionFactory {
  private Criterion criterion;
  private RangeMatch multiplier;

  public CollectionCriterionFactory(Criterion criterion, RangeMatch multiplier) {
    this.criterion = criterion;
    this.multiplier = multiplier;
  }

  CollectionCriterion newCriterion() {
    return new CollectionCriterion(criterion, multiplier);
  }
}
