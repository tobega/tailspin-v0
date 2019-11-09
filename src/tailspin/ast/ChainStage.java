package tailspin.ast;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.stream.Collectors;
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
  public Queue<Object> run(Object it, Scope blockScope) {
    Queue<Object> nextValue = currentExpression.run(it, blockScope);
    if (nextStage != null) {
      nextValue = nextStage.runAll(nextValue, blockScope);
    }
    return nextValue;
  }

  public Queue<Object> runAll(Queue<Object> its, Scope scope) {
    Queue<Object> nextValue = its.stream().flatMap(it -> currentExpression.run(it, scope).stream())
        .collect(Collectors.toCollection(ArrayDeque::new));
    if (nextStage != null) {
      nextValue = nextStage.runAll(nextValue, scope);
    }
    return nextValue;
  }
}
