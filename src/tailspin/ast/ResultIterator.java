package tailspin.ast;

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
    apply(results::offer, ri);
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
            return this;
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

  class QueueResult implements ResultIterator {
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

  static ResultIterator ofIterator(Iterator iterator) {
    return () -> {
      if (!iterator.hasNext()) {
        return null;
      }
      return iterator.next();
    };
  }
}
