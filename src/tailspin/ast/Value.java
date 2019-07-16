package tailspin.ast;

import java.util.Queue;
import tailspin.interpreter.Scope;

public interface Value {

  Object evaluate(Object it, Scope scope);

  static Value of(Expression expression) {
    return (it, scope) -> oneValue(expression.run(it, scope));
  }

  static Object oneValue(Queue<Object> itStream) {
    if (itStream.size() != 1) {
      throw new AssertionError("Expected exactly one value but was " + itStream);
    }
    return itStream.peek();
  }
}
