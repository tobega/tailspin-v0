package tailspin.control;

import tailspin.interpreter.Scope;

public interface Value extends Expression {

  Object getResults(Object it, Scope scope);

  static Value of(Expression expression) {
    return (it, scope) -> oneValue(expression.getResults(it, scope));
  }

  static Object oneValue(Object value) {
    Object result = ResultIterator.resolveSideEffects(value);
    if (result == null) {
      throw new AssertionError("Expected to get a value");
    }
    if (result instanceof ResultIterator) {
      throw new AssertionError("Expected only one value");
    }
    return result;
  }
}
