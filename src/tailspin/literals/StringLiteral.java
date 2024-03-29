package tailspin.literals;

import java.util.List;
import java.util.stream.Collectors;
import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class StringLiteral implements Value {
  private final List<Value> stringLiteral;

  public StringLiteral(List<Value> stringLiteral) {
    this.stringLiteral = stringLiteral;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    return stringLiteral.stream()
        .map(v -> v.getResults(it, scope))
        .map(Object::toString)
        .collect(Collectors.joining());
  }

  @Override
  public String toString() {
    return stringLiteral.stream().map(Object::toString).collect(Collectors.joining());
  }
}
