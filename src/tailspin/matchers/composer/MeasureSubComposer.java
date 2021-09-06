package tailspin.matchers.composer;

import java.util.regex.Pattern;
import tailspin.types.Measure;
import tailspin.types.Unit;

public class MeasureSubComposer extends RegexpSubComposer {
  private static final Pattern NUMBER = Pattern.compile("[+-]?(0|[1-9][0-9]*)");
  private final Unit unit;

  public MeasureSubComposer(Unit unit) {
    super(NUMBER, Long::valueOf);
    this.unit = unit;
  }

  @Override
  public Object getValues() {
    return new Measure((Long) super.getValues(), unit);
  }
}
