package tailspin.control;

import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.types.Processor;
import tailspin.types.Transform;

public class CollectorChain implements Expression {

  private final Expression valueChain;
  private final Reference constructor;

  public CollectorChain(Expression valueChain, Reference constructor) {
    this.valueChain = valueChain;
    this.constructor = constructor;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    Object stream = ResultIterator.resolveSideEffects(valueChain.getResults(it, scope));
    Transform constructor = (Transform) ResultIterator.resolveSideEffects(this.constructor.getValue(it, scope));
    Processor collector = (Processor) ResultIterator.resolveSideEffects(constructor.getResults(null, Map.of()));
    ResultIterator.forEach(stream,
        v -> ResultIterator.resolveSideEffects(
            collector.resolveMessage("accumulate", Map.of()).getResults(v, Map.of())));
    return collector.resolveMessage("result", Map.of()).getResults(null, Map.of());
  }
}
