package tailspin.arithmetic;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;
import tailspin.types.Unit;

public class MeasureExpression implements Value {
  private final Value value;
  private final Unit unit;

  public MeasureExpression(Value value, Unit unit) {
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
