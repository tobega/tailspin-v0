package tailspin.ast;

import tailspin.interpreter.Scope;

public interface Value extends Expression {

  Object getResults(Object it, Scope scope);

  static Value of(Expression expression) {
    return (it, scope) -> oneValue(expression.getResults(it, scope));
  }

  static Object oneValue(Object value) {
    ResultIterator ri = ResultIterator.flat(value);
    Object result = ri.getNextResult();
    if (ri.getNextResult() != null) {
      throw new AssertionError("Expected exactly one value");
    }
    return result;
  }
}
