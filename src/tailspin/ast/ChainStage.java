package tailspin.ast;

import java.util.Queue;
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
    if (nextValue != null && nextStage != null) {
      if (nextValue instanceof ResultIterator) {
        nextValue = nextStage.runAll((ResultIterator) nextValue, blockScope);
      } else {
        nextValue = nextStage.getResults(nextValue, blockScope);
      }
    }
    return nextValue;
  }

  @SuppressWarnings("unchecked")
  private Object runAll(ResultIterator its, Scope scope) {
    Object result = null;
    Object it;
    while ((it = its.getNextResult()) != null) {
      Object nextValue = currentExpression.getResults(it, scope);
      if (nextValue == null) {
        continue;
      }
      if (nextValue instanceof ResultIterator) {
        // I think we need to iterate through and resolve values
        if (result == null) {
          result = ResultIterator.toQueue((ResultIterator) nextValue);
          continue;
        }
        if (!(result instanceof Queue)) {
          result = Expression.queueOf(result);
        }
        ResultIterator.appendToQueue((Queue<Object>) result, (ResultIterator) nextValue);
        continue;
      }
      if (result == null) {
        result = nextValue;
        continue;
      }
      if (!(result instanceof Queue)) {
        result = Expression.queueOf(result);
      }
      ((Queue<Object>) result).add(nextValue);
    }
    if (result instanceof Queue) {
      result = (ResultIterator) ((Queue) result)::poll;
    }
    return runNextStage(result, scope);
  }
}
