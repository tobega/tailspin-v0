package tailspin.arithmetic;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.DataDictionary;
import tailspin.types.Measure;

public class IntegerExpression implements Value {
  private final boolean isNegative;
  private final Value dereferenceValue;

  public IntegerExpression(boolean isNegative, Value dereferenceValue) {
    this.isNegative = isNegative;
    this.dereferenceValue = dereferenceValue;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    Object value = dereferenceValue.getResults(it, scope);
    if (value instanceof Measure m) {
      return isNegative ? new Measure(-m.getValue(), m.getUnit()) : m;
    }
    if (value instanceof Long n) {
      return isNegative ? -n : n;
    }
    throw new ArithmeticException("Cannot do arithmetic on " + DataDictionary.formatErrorValue(value) + " in " + this);
  }

  @Override
  public String toString() {
    return (isNegative ? "-" : "") + dereferenceValue;
  }
}
