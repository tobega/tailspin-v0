package tailspin.control;

import static tailspin.control.ResultIterator.toQueue;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Queue;
import java.util.stream.Stream;
import tailspin.interpreter.Scope;

public interface Expression {
  Queue<Object> EMPTY_RESULT = new ArrayDeque<>();

  /**
   * Returns null if there are no results, a ResultIterator if there are more than one result,
   * else the single result.
   */
  Object getResults(Object it, Scope blockScope);

  static Queue<Object> queueOf(Object generated) {
    if (generated == null) return EMPTY_RESULT;
    if (generated instanceof ResultIterator) {
      return toQueue((ResultIterator) generated);
    }
    Deque<Object> result = new ArrayDeque<>();
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
