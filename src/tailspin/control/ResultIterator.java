package tailspin.control;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.function.Consumer;

/**
 * Yields the results of the underlying Expression one at a time, ending with null.
 *
 * <p>A ResultIterator may be returned, in which case it should replace the current iterator in the calling program</p>
 */
public interface ResultIterator {
  Object getNextResult();

  static Queue<Object> toQueue(ResultIterator ri) {
    Queue<Object> results = new ArrayDeque<>();
    if (ri != null) {
      apply(results::offer, ri);
    }
    return results;
  }

  static ResultIterator prefix(ResultIterator prefix, ResultIterator suffix) {
    return new ResultIterator() {
      ResultIterator current = prefix;

      @Override
      public Object getNextResult() {
        Object result = null;
        while (result == null) {
          result = current.getNextResult();
          if (result == null) {
            return suffix;
          }
          if (result instanceof ResultIterator) {
            current = (ResultIterator) result;
            result = null;
          }
        }
        return result;
      }
    };
  }

  static void apply(Consumer<Object> receiver, ResultIterator ri) {
    Object r;
    while ((r = ri.getNextResult()) != null) {
      if (r instanceof ResultIterator) {
        ri = (ResultIterator) r;
      } else {
        receiver.accept(r);
      }
    }
  }

  static void forEach(Object obj, Consumer<Object> receiver) {
    if (obj == null) return;
    if (obj instanceof ResultIterator) {
      apply(receiver, (ResultIterator) obj);
    } else {
      receiver.accept(obj);
    }
  }

  /** Returns null, a value or a ResultIterator.Flat with no included delayed executions */
  static Object resolveSideEffects(Object obj) {
    if (obj == null) return null;
    if (obj instanceof ResultIterator) {
      Object result = null;
      ResultIterator ri = (ResultIterator) obj;
      Object r;
      while ((r = ri.getNextResult()) != null) {
        if (r instanceof ResultIterator) {
          ri = (ResultIterator) r;
        } else {
          result = resolveResult(result, r);
        }
      }
      return result;
    } else {
      return obj;
    }
  }

  /** A ResultIterator that never returns a nested ResultIterator */
  interface Flat extends ResultIterator {}

  static ResultIterator.Flat flat(Object value) {
    if (value instanceof ResultIterator) {
      return new ResultIterator.Flat() {
        ResultIterator current = (ResultIterator) value;
        @Override
        public Object getNextResult() {
          Object result;
          while (true) {
            result = current.getNextResult();
            if (result instanceof ResultIterator) {
              current = (ResultIterator) result;
              continue;
            }
            return result;
          }
        }
      };
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
  static Object resolveResult(Object result, Object nextValue) {
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

    QueueResult() {
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
  }

  static ResultIterator ofIterator(Iterator<?> iterator) {
    return () -> {
      if (!iterator.hasNext()) {
        return null;
      }
      return iterator.next();
    };
  }
}
