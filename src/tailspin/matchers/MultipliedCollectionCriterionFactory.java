package tailspin.matchers;

public class MultipliedCollectionCriterionFactory implements CollectionCriterionFactory {
  private final CollectionSegmentCriterion criterion;
  private final RangeMatch multiplier;

  public MultipliedCollectionCriterionFactory(CollectionSegmentCriterion criterion, RangeMatch multiplier) {
    this.criterion = criterion;
    this.multiplier = multiplier;
  }

  @Override
  public CollectionCriterion newCriterion() {
    return new MultipliedCollectionCriterion(criterion, multiplier);
  }
}
