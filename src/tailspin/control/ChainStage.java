package tailspin.control;

import tailspin.interpreter.Scope;

public interface ChainStage {

  Object runOne(Object it, Scope blockScope);

  Object runAll(ResultIterator.Flat its, Scope scope);

  static Object runNextStage(ChainStage chainStage, Object nextValue, Scope blockScope) {
    if (chainStage != null) {
      nextValue = ResultIterator.resolveSideEffects(nextValue);
      // Delayed executions may have no results
      if (nextValue == null) return null;
      if (nextValue instanceof ResultIterator) {
        nextValue = chainStage.runAll((ResultIterator.Flat) nextValue, blockScope);
      } else {
        nextValue = chainStage.runOne(nextValue, blockScope);
      }
    }
    return nextValue;
  }
}
