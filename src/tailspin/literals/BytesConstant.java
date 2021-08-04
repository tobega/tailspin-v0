package tailspin.literals;

import java.math.BigInteger;
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

  @Override
  public String toString() {
    BigInteger bigInteger = new BigInteger(1, bytes);
    return String.format("%0" + (bytes.length << 1) + "x", bigInteger);
  }
}
