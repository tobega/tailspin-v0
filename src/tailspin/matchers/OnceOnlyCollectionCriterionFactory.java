package tailspin.matchers;

import tailspin.types.Criterion;

public class OnceOnlyCollectionCriterionFactory implements CollectionCriterionFactory {

  private final Criterion criterion;

  public OnceOnlyCollectionCriterionFactory(Criterion criterion) {
    this.criterion = criterion;
  }

  @Override
  public CollectionCriterion newCriterion() {
    return new OnceOnlyCollectionCriterion(criterion);
  }
}
