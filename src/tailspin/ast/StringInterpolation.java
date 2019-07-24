package tailspin.ast;

import java.util.stream.Collectors;
import tailspin.interpreter.Scope;

public class StringInterpolation implements Value {
  private final Expression expression;

  public StringInterpolation(Expression expression) {
    this.expression = expression;
  }

  @Override
  public Object evaluate(Object it, Scope scope) {
    return expression.run(it, scope).stream()
        .map(Object::toString)
        .collect(Collectors.joining());
  }
}
