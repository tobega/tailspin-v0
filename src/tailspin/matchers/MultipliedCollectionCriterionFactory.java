package tailspin.matchers;

import tailspin.types.Criterion;

public class MultipliedCollectionCriterionFactory implements CollectionCriterionFactory {
  private Criterion criterion;
  private RangeMatch multiplier;

  public MultipliedCollectionCriterionFactory(Criterion criterion, RangeMatch multiplier) {
    this.criterion = criterion;
    this.multiplier = multiplier;
  }

  @Override
  public CollectionCriterion newCriterion() {
    return new MultipliedCollectionCriterion(criterion, multiplier);
  }
}
