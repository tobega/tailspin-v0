package tailspin.arithmetic;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;
import tailspin.types.Unit;

public class IntegerConstant implements Value {
  private final long value;
  private final Unit unit;

  public IntegerConstant(long value, Unit unit) {
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

  @Override
  public String toString() {
    return value + (unit == null ? "" : unit.toString());
  }
}
