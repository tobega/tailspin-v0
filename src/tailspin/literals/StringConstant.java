package tailspin.literals;

import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class StringConstant implements Value {
  private final String value;

  public StringConstant(String value) {
    this.value = value;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    return value;
  }
}
