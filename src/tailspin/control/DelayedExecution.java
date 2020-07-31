package tailspin.control;

public interface DelayedExecution extends ResultIterator {

  static DelayedExecution prefix(ResultIterator prefix, DelayedExecution suffix) {
    return new DelayedExecution() {
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
}
