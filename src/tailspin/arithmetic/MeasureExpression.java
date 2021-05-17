package tailspin.arithmetic;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;

public class MeasureExpression implements Value {
  private final Value value;
  private final String unit;

  public MeasureExpression(Value value, String unit) {
    this.value = value;
    this.unit = unit;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    Object result = value.getResults(it, scope);
    if (result instanceof Measure m) {
      return new Measure(m.getValue(), unit);
    }
    return result;
  }
}
