package tailspin.ast;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.stream.Stream;
import tailspin.interpreter.Scope;

public interface Expression {
  Queue<Object> EMPTY_RESULT = new ArrayDeque<>();

  Queue<Object> run(Object it, Scope blockScope);

  static Queue<Object> queueOf(Object generated) {
    if (generated == null) return EMPTY_RESULT;
    Queue<Object> result = new ArrayDeque<>();
    if (generated instanceof Stream) {
      ((Stream<?>) generated).forEach(result::add);
    } else if (generated instanceof Queue) {
      result.addAll((Collection<?>) generated);
    } else {
      result.add(generated);
    }
    return result;
  }

  static Object atMostOneValue(Queue<Object> itStream) {
    if (itStream == null) {
      return null;
    }
    if (itStream.size() > 1) {
      throw new AssertionError("Expected at most one value but was " + itStream);
    }
    return itStream.peek();
  }
}
