package tailspin.ast;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Yields the results of the underlying Expression one at a time, ending with null.
 *
 * <p>A ResultIterator may be returned, in which case it should replace the current iterator in the calling program</p>
 */
public interface ResultIterator {
  Object getNextResult();

  static Queue<Object> toQueue(ResultIterator ri) {
    java.util.Queue<java.lang.Object> results = new ArrayDeque<>();
    java.lang.Object r;
    while ((r = ri.getNextResult()) != null) {
      if (r instanceof ResultIterator) {
        ri = (ResultIterator) r;
      } else {
        results.offer(r);
      }
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
            return this;
          }
        }
        return result;
      }
    };
  }
}
