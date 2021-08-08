package tailspin.literals;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class ByteLiteral implements Value {

  private final List<Expression> byteValues;

  public ByteLiteral(List<Expression> byteValues) {
    this.byteValues = byteValues;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    ByteArrayOutputStream result = new ByteArrayOutputStream();
    byteValues.stream()
        .map(v -> ResultIterator.wrap(ResultIterator.resolveSideEffects(v.getResults(it, scope))))
        .flatMap(v -> Stream.iterate(v.getNextResult(), Objects::nonNull, o -> v.getNextResult()))
        .map(byte[].class::cast)
        .forEach(result::writeBytes);
    return result.size() == 0 ? null : result.toByteArray();
  }

  @Override
  public String toString() {
    return "[x " + byteValues.stream().map(Object::toString).collect(Collectors.joining(" ")) + " x]";
  }
}
