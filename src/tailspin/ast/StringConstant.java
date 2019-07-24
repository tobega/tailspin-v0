package tailspin.ast;

import tailspin.interpreter.Scope;

public class StringConstant implements Value {
  private final String value;

  public StringConstant(String value) {
    this.value = value;
  }

  @Override
  public Object evaluate(Object it, Scope scope) {
    return value;
  }
}
