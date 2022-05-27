package tailspin.matchers.composer;

import tailspin.types.Measure;
import tailspin.types.Unit;

public class MeasureSubComposer implements SubComposer {
  private final SubComposer number;
  private final Unit unit;

  public MeasureSubComposer(SubComposer number, Unit unit) {
    this.number = number;
    this.unit = unit;
  }

  @Override
  public Memo nibble(String s, Memo memo) {
    return number.nibble(s, memo);
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    return number.backtrack(s, memo);
  }

  @Override
  public Object getValues() {
    return new Measure((Long) number.getValues(), unit);
  }

  @Override
  public boolean isSatisfied() {
    return number.isSatisfied();
  }
}
