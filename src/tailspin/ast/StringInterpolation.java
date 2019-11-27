package tailspin.ast;

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
    ResultIterator.apply(string::append, (ResultIterator) result);
    return string.toString();
  }
}
