package tailspin.ast;

import tailspin.interpreter.Scope;

public class IntegerConstant implements Value {
  private final long value;

  public IntegerConstant(long value) {
    this.value = value;
  }

  @Override
  public Long evaluate(Object it, Scope scope) {
    return value;
  }
}
