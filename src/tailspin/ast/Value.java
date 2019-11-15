package tailspin.ast;

import java.util.Queue;
import tailspin.interpreter.Scope;

public interface Value extends Expression {

  Object getResults(Object it, Scope scope);

  static Value of(Expression expression) {
    return (it, scope) -> oneValue(expression.run(it, scope));
  }

  static Object oneValue(Object value) {
    if (value instanceof Queue) {
      if (((Queue) value).size() != 1) {
        throw new AssertionError("Expected exactly one value but was " + value);
      }
      return ((Queue) value).peek();
    }
    if (value instanceof ResultIterator) {
      Object result = ((ResultIterator) value).getNextResult();
      if (((ResultIterator) value).getNextResult() != null) {
        throw new AssertionError("Expected exactly one value but was " + value);
      }
      return result;
    }
    return value;
  }
}
