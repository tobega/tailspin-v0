package tailspin.ast;

import java.util.Queue;
import tailspin.interpreter.Scope;

public class StateAssignment implements Expression {
  private final Expression valueChain;
  private final Reference stateReference;
  private final boolean merge;

  public StateAssignment(Expression valueChain, Reference stateReference, boolean merge) {
    this.valueChain = valueChain;
    this.stateReference = stateReference;
    this.merge = merge;
  }

  @Override
  public Queue<Object> run(Object it, Scope blockScope) {
    Queue<Object> values = valueChain.run(it, blockScope);
    stateReference.setValue(merge, values, it, blockScope);
    if (!values.isEmpty()) {
      // TODO: add source reference
      throw new IllegalStateException("Too many values");
    }
    return Expression.EMPTY_RESULT;
  }
}
