package tailspin.matchers;

public class OnceOnlyCollectionCriterionFactory implements CollectionCriterionFactory {

  private final CollectionSegmentCriterion criterion;

  public OnceOnlyCollectionCriterionFactory(CollectionSegmentCriterion criterion) {
    this.criterion = criterion;
  }

  @Override
  public CollectionCriterion newCriterion() {
    return new OnceOnlyCollectionCriterion(criterion);
  }
}
