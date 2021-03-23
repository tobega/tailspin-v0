package tailspin.control;

import tailspin.interpreter.Scope;

public class TransformStage implements ChainStage {
  private final Expression currentExpression;
  // @Nullable
  private final ChainStage nextStage;

  public TransformStage(Expression currentExpression, ChainStage nextStage) {
    this.currentExpression = currentExpression;
    this.nextStage = nextStage;
  }

  @Override
  public Object runOne(Object it, Scope blockScope) {
    Object nextValue = currentExpression.getResults(it, blockScope);
    return ChainStage.runNextStage(nextStage, nextValue, blockScope);
  }

  @Override
  public Object runAll(ResultIterator.Flat its, Scope scope) {
    Object result = null;
    Object it;
    while ((it = its.getNextResult()) != null) {
      // We have to iterate through and resolve values (possible delayed executions) because
      // all values need to pass previous stage before any go to the next
      Object nextValue = ResultIterator.resolveSideEffects(currentExpression.getResults(it, scope));
      result = ResultIterator.appendResultValue(result, nextValue);
    }
    return ChainStage.runNextStage(nextStage, result, scope);
  }
}
