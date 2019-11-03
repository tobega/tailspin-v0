package tailspin.ast;

import java.util.List;
import tailspin.interpreter.Scope;

public class Block implements Expression {
  private final List<Expression> blockExpressions;

  public Block(List<Expression> blockExpressions) {
    this.blockExpressions = blockExpressions;
  }

  @Override
  public ResultIterator getResults(Object it, Scope blockScope) {
    return new ResultIterator() {
      int i = 0;
      @Override
      public Object getNextResult() {
        if (i >= blockExpressions.size()) {
          return null;
        }
        ResultIterator results = blockExpressions.get(i++).getResults(it, blockScope);
        if (i == blockExpressions.size()) {
          return results;
        }
        return ResultIterator.prefix(results, this);
      }
    };
  }
}
