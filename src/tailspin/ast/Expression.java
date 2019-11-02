package tailspin.ast;

import static tailspin.ast.ResultIterator.toQueue;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.stream.Stream;
import tailspin.interpreter.Scope;

public interface Expression {
  Queue<Object> EMPTY_RESULT = new ArrayDeque<>();

  default Queue<Object> run(Object it, Scope blockScope) {
    ResultIterator ri = getResults(it, blockScope);
    return toQueue(ri);
  }

  default ResultIterator getResults(Object it, Scope blockScope) {
    Queue<Object> results = run(it, blockScope);
    return results::poll;
  }

  static Expression wrap(Value value) {
    return new Expression() {
      @Override
      public Queue<Object> run(Object it, Scope blockScope) {
        return queueOf(value.evaluate(it, blockScope));
      }
    };
  }

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
