package tailspin.control;

import java.util.ArrayDeque;
import java.util.Deque;

public abstract class DelayedExecution implements ResultIterator {
  private final Deque<ResultIterator> prefixes = new ArrayDeque<>();
  @Override
  public Object getNextResult() {
    Object result = null;
    while (result == null) {
      if (prefixes.isEmpty()) return nextBaseResult();
      result = prefixes.peek().getNextResult();
      if (result == null) {
        prefixes.pop();
      } else if (result instanceof ResultIterator r) {
        prefixes.pop();
        prefix(r);
        result = null;
      }
    }
    return result;
  }

  protected abstract Object nextBaseResult();

  protected DelayedExecution prefix(ResultIterator r) {
    prefixes.push(r);
    if (r instanceof DelayedExecution d) {
      while (!d.prefixes.isEmpty()) {
        prefixes.push(d.prefixes.removeLast());
      }
    }
    return this;
  }
}
