package tailspin.literals;

import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class BytesConstant implements Value {

  private final byte[] bytes;

  public BytesConstant(byte[] bytes) {
    this.bytes = bytes;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    return bytes;
  }
}
