package tailspin.ast;

import java.util.List;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;

public class StringLiteral implements Value {
  final List<Value> stringLiteral;

  public StringLiteral(List<Value> stringLiteral) {
    this.stringLiteral = stringLiteral;
  }

  @Override
  public Object evaluate(Object it, Scope scope) {
    return stringLiteral.stream()
        .map(v -> v.evaluate(it, scope))
        .map(Object::toString)
        .collect(Collectors.joining());
  }
}
