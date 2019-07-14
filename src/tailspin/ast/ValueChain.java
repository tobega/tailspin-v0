package tailspin.ast;

import java.util.Queue;
import tailspin.interpreter.RunMain;
import tailspin.interpreter.Scope;
import tailspin.parser.TailspinParser;

public class ValueChain implements Expression {
  private final TailspinParser.ValueChainContext valueChainContext;

  public ValueChain(TailspinParser.ValueChainContext valueChainContext) {
    this.valueChainContext = valueChainContext;
  }

  @Override
  public Queue<Object> run(Object it, Scope blockScope) {
    blockScope.setIt(Expression.queueOf(it));
    return new RunMain(blockScope).visitValueChain(valueChainContext);
  }
}
