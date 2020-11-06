package tailspin.literals;

import java.io.ByteArrayOutputStream;
import java.util.List;
import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class ByteLiteral implements Value {

  private final List<Value> byteValues;

  public ByteLiteral(List<Value> byteValues) {
    this.byteValues = byteValues;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    ByteArrayOutputStream result = new ByteArrayOutputStream();
    byteValues.stream()
        .map(v -> v.getResults(it, scope))
        .map(byte[].class::cast)
        .forEach(result::writeBytes);
    return result.toByteArray();
  }
}
