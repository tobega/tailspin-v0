package tailspin.literals;

import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class StringInterpolation implements Value {
  private final Expression expression;

  public StringInterpolation(Expression expression) {
    this.expression = expression;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    Object result = expression.getResults(it, scope);
    if (result == null) {
      return "";
    }
    if (!(result instanceof ResultIterator)) {
      return result.toString();
    }
    StringBuilder string = new StringBuilder();
    ResultIterator.forEach(result, string::append);
    return string.toString();
  }
}
