package tailspin.control;

import tailspin.interpreter.Scope;

public class StateAssignment implements Expression {
  private final Expression valueChain;
  public final Reference stateReference;
  private final Reference.Merge merge;

  public StateAssignment(Expression valueChain, Reference stateReference, Reference.Merge merge) {
    this.valueChain = valueChain;
    this.stateReference = stateReference;
    this.merge = merge;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    Object values = ResultIterator.resolveSideEffects(valueChain.getResults(it, blockScope));
    stateReference.setValue(merge, values, it, blockScope);
    if (values instanceof ResultIterator && ((ResultIterator) values).getNextResult() != null) {
      // TODO: add source reference
      throw new IllegalStateException("Too many values");
    }
    return null;
  }
}
