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

  @Override
  public String toString() {
    return criterion.toString() + multiplierString();
  }

  private String multiplierString() {
    if (multiplier == RangeMatch.ANY_AMOUNT) {
      return "*";
    }
    if (multiplier == RangeMatch.AT_LEAST_ONE) {
      return "+";
    }
    if (multiplier == RangeMatch.AT_MOST_ONE) {
      return "?";
    }
    return "=" + multiplier;
  }
}
