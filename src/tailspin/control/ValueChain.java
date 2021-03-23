package tailspin.control;

import tailspin.interpreter.Scope;

public class ValueChain implements Expression {
  private final Expression source;
  private final ChainStage chainStage;

  public ValueChain(Expression source, ChainStage chainStage) {
    this.source = source;
    this.chainStage = chainStage;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    Object nextValue = source.getResults(it, blockScope);
    return ChainStage.runNextStage(chainStage, nextValue, blockScope);
  }
}
