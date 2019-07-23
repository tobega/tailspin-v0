package tailspin.ast;

import tailspin.interpreter.Scope;

public class IntegerExpression implements Value {
  private final boolean isNegative;
  private final Expression dereferenceValue;

  public IntegerExpression(boolean isNegative, Expression dereferenceValue) {
    this.isNegative = isNegative;
    this.dereferenceValue = dereferenceValue;
  }

  @Override
  public Long evaluate(Object it, Scope scope) {
    long value = ((Number) Value.oneValue(dereferenceValue.run(it, scope))).longValue();
    return isNegative ? -value : value;
  }
}
