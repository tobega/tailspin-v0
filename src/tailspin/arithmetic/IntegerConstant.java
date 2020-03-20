package tailspin.arithmetic;

import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class IntegerConstant implements Value {
  private final long value;

  public IntegerConstant(long value) {
    this.value = value;
  }

  @Override
  public Long getResults(Object it, Scope scope) {
    return value;
  }
}
