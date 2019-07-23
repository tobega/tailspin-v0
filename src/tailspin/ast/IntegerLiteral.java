package tailspin.ast;

import tailspin.interpreter.Scope;

public class IntegerLiteral implements Value {
  private final long value;

  public IntegerLiteral(long value) {
    this.value = value;
  }

  @Override
  public Long evaluate(Object it, Scope scope) {
    return value;
  }
}
