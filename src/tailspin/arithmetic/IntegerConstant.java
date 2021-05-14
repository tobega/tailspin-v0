package tailspin.arithmetic;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;

public class IntegerConstant implements Value {
  private final long value;
  private final String unit;

  public IntegerConstant(long value, String unit) {
    this.value = value;
    this.unit = unit;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    if (unit == null) {
      return value;
    }
    return new Measure(value, unit);
  }
}
