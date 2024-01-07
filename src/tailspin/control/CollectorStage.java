package tailspin.control;

import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.types.Processor;
import tailspin.types.Transform;

public class CollectorStage implements ChainStage {
  private final Reference constructor;
  private final ChainStage nextStage;

  public CollectorStage(Reference constructor, ChainStage nextStage) {
    this.constructor = constructor;
    this.nextStage = nextStage;
  }

  @Override
  public Object runOne(Object it, Scope scope) {
    return runAll(ResultIterator.wrap(it), scope);
  }

  @Override
  public Object runAll(ResultIterator.Flat stream, Scope scope) {
    Transform constructor = (Transform) ResultIterator.resolveSideEffects(this.constructor.getValue(null, scope));
    Processor collector = (Processor) ResultIterator.resolveSideEffects(constructor.getResults(null, Map.of()
    ));
    ResultIterator.forEach(stream,
        v -> ResultIterator.resolveSideEffects(
            collector.resolveMessage("accumulate", Map.of()).getResults(v, Map.of()
            )));
    Object nextValue = collector.resolveMessage("result", Map.of()).getResults(null, Map.of()
    );
    return ChainStage.runNextStage(nextStage, nextValue, scope);
  }
}
