package tailspin.arithmetic;

import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class IntegerExpression implements Value {
  private final boolean isNegative;
  private final Value dereferenceValue;

  public IntegerExpression(boolean isNegative, Value dereferenceValue) {
    this.isNegative = isNegative;
    this.dereferenceValue = dereferenceValue;
  }

  @Override
  public Long getResults(Object it, Scope scope) {
    long value = ((Number) dereferenceValue.getResults(it, scope)).longValue();
    return isNegative ? -value : value;
  }
}
