package tailspin.control;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Consumer;

/**
 * Yields the results of the underlying Expression one at a time, ending with null.
 *
 * <p>A ResultIterator may be returned, in which case it should replace the current iterator in the calling program</p>
 */
public interface ResultIterator {
  Object getNextResult();

  static void forEach(Object obj, Consumer<Object> receiver) {
    if (obj == null) return;
    if (obj instanceof ResultIterator ri) {
      Object r;
      while ((r = ri.getNextResult()) != null) {
        if (r instanceof ResultIterator) {
          ri = (ResultIterator) r;
        } else {
          receiver.accept(r);
        }
      }
    } else {
      receiver.accept(obj);
    }
  }

  /** Returns null, a value or a ResultIterator.Flat with no included delayed executions */
  static Object resolveSideEffects(Object obj) {
    if (obj == null) return null;
    if (obj instanceof ResultIterator ri) {
      if (obj instanceof ResultIterator.Flat) return obj;
      Object result = null;
      Object r;
      while ((r = ri.getNextResult()) != null) {
        if (r instanceof ResultIterator) {
          ri = (ResultIterator) r;
        } else {
          result = appendResultValue(result, r);
        }
      }
      return result;
    } else {
      return obj;
    }
  }

  /** A ResultIterator that never returns a nested ResultIterator */
  interface Flat extends ResultIterator {}

  static ResultIterator.Flat wrap(Object value) {
    if (value instanceof ResultIterator.Flat) return (Flat) value;
    if (value instanceof ResultIterator) {
      throw new IllegalArgumentException("Non-flat ResultIterator passed to wrap");
    }
    return new ResultIterator.Flat() {
      Object result = value;
      @Override
      public Object getNextResult() {
        Object next = result;
        result = null;
        return next;
      }
    };
  }

  /** Returns null, a value or a ResultIterator.Flat */
  static Object appendResultValue(Object result, Object nextValue) {
    if ((result instanceof DelayedExecution) || (nextValue instanceof DelayedExecution)) {
      // Current guarantee that side-effects for all values are processed before first value moves on
      throw new AssertionError("Sequences of DelayedExecutions not allowed");
    }
    if (result == null) {
      return nextValue;
    }
    if (nextValue == null) {
      return result;
    }
    if (!(result instanceof QueueResult)) {
      QueueResult qr = new QueueResult();
      qr.append(result);
      result = qr;
    }
    ((QueueResult) result).append(nextValue);
    return result;
  }

  class QueueResult implements ResultIterator.Flat {
    private final Queue<Object> results;
    ResultIterator nested;

    public QueueResult() {
      results = new ArrayDeque<>();
    }

    @Override
    public Object getNextResult() {
      while (true) {
        if (nested != null) {
          Object result = nested.getNextResult();
          if (result instanceof ResultIterator) {
            nested = (ResultIterator) result;
            continue;
          } else if (result == null) {
            nested = null;
            // fall through
          } else {
            return result;
          }
        }
        Object result = results.poll();
        if (result instanceof ResultIterator) {
          nested = (ResultIterator) result;
        } else {
          return result;
        }
      }
    }

    public void append(Object nextValue) {
      results.add(nextValue);
    }

    public Object simplifiedResultIterator() {
      if (results.isEmpty()) return null;
      if (results.size() == 1) return results.peek();
      return this;
    }
  }
}
