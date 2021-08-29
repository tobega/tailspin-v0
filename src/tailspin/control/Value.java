package tailspin.control;

import tailspin.interpreter.Scope;

public interface Value extends Expression {

  Object getResults(Object it, Scope scope);

  static Value of(Expression expression) {
    return new Value() {
      @Override
      public Object getResults(Object it, Scope scope) {
        return oneValue(expression.getResults(it, scope));
      }

      @Override
      public String toString() {
        return expression.toString();
      }
    };
  }

  static Object oneValue(Object value) {
    Object result = ResultIterator.resolveSideEffects(value);
    if (result instanceof ResultIterator ri) {
      result = ri.getNextResult();
      if (result != null && ri.getNextResult() != null)
        throw new AssertionError("Expected only one value");
    }
    if (result == null) {
      throw new AssertionError("Expected to get a value");
    }
    return result;
  }
}
