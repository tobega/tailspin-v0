package tailspin.control;

import tailspin.interpreter.Scope;

public class ChainStage implements Expression {
  private final Expression currentExpression;
  // @Nullable
  private final ChainStage nextStage;

  public ChainStage(Expression currentExpression, ChainStage nextStage) {
    this.currentExpression = currentExpression;
    this.nextStage = nextStage;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    Object nextValue = currentExpression.getResults(it, blockScope);
    return runNextStage(nextValue, blockScope);
  }

  private Object runNextStage(Object nextValue, Scope blockScope) {
    if (nextStage != null) {
      nextValue = ResultIterator.resolveSideEffects(nextValue);
      // Delayed executions may have no results
      if (nextValue == null) return null;
      if (nextValue instanceof ResultIterator) {
        nextValue = nextStage.runAll((ResultIterator.Flat) nextValue, blockScope);
      } else {
        nextValue = nextStage.getResults(nextValue, blockScope);
      }
    }
    return nextValue;
  }

  private Object runAll(ResultIterator.Flat its, Scope scope) {
    Object result = null;
    Object it;
    while ((it = its.getNextResult()) != null) {
      // We have to iterate through and resolve values (possible delayed executions) because
      // all values need to pass previous stage before any go to the next
      Object nextValue = ResultIterator.resolveSideEffects(currentExpression.getResults(it, scope));
      result = ResultIterator.appendResultValue(result, nextValue);
    }
    return runNextStage(result, scope);
  }
}
