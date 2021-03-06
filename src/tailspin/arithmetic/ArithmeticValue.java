package tailspin.arithmetic;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;

public class ArithmeticValue implements Value {
  private final Value value;

  public ArithmeticValue(Value value) {
    this.value = value;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    Object result = value.getResults(it, scope);
    if (result instanceof Measure m && m.getUnit().isEmpty()) {
      throw new ArithmeticException("Cannot infer type for expression " + value);
    }
    return result;
  }
}
