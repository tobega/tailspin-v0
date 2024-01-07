package tailspin.transform.lens;

import tailspin.control.Reference;
import tailspin.control.ResultIterator;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Processor;
import tailspin.types.Transform;

import java.util.Map;

public class CollectedValue {

  private final String key;
  private final Reference constructor;

  public CollectedValue(String key, Reference constructor) {
    this.key = key;
    this.constructor = constructor;
  }

  public Accumulator newAccumulator(Object it, Scope scope) {
    Transform constructor = (Transform) this.constructor.getValue(it, scope);
    Processor collector = (Processor) constructor.getResults(null, Map.of()
    );
    return new Accumulator(collector);
  }

  public class Accumulator {

    private final Processor collector;

    public Accumulator(Processor collector) {
      this.collector = collector;
    }

    public void accumulate(Object s) {
      ResultIterator.resolveSideEffects(collector.resolveMessage("accumulate", Map.of())
          .getResults(s, Map.of()));
    }

    public String key() {
      return key;
    }

    public Object result() {
      return Value.oneValue(collector.resolveMessage("result", Map.of())
          .getResults(null, Map.of()));
    }
  }
}
