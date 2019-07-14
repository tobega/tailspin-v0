package tailspin.ast;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import tailspin.interpreter.Scope;

public class Block {
  private final List<Expression> blockExpressions;

  public Block(List<Expression> blockExpressions) {
    this.blockExpressions = blockExpressions;
  }

  public Queue<Object> run(Object it, Scope blockScope) {
    Queue<Object> result = new ArrayDeque<>();
    for (Expression exp : blockExpressions) {
      result.addAll(exp.run(it, blockScope));
    }
    return result;
  }
}
