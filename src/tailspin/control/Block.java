package tailspin.control;

import java.util.List;
import tailspin.interpreter.Scope;

public class Block implements Expression {
  private final List<Expression> blockExpressions;

  public Block(List<Expression> blockExpressions) {
    this.blockExpressions = blockExpressions;
  }

  @Override
  public DelayedExecution getResults(Object it, Scope blockScope) {
    return new DelayedExecution() {
      int i = 0;

      @Override
      public Object nextBaseResult() {
        Object results = null;
        while (results == null) {
          if (i >= blockExpressions.size()) {
            return null;
          }
          results = blockExpressions.get(i++).getResults(it, blockScope);
        }
        if (i == blockExpressions.size()) {
          return results;
        }
        if (results instanceof ResultIterator r) {
          return prefix(r);
        }
        return results;
      }
    };
  }
}
