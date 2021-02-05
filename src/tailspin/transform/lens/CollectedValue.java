package tailspin.transform.lens;

import java.util.Map;
import tailspin.control.Reference;
import tailspin.control.TemplatesReference;
import tailspin.interpreter.Scope;
import tailspin.types.Processor;
import tailspin.types.Transform;

public class CollectedValue {

  private final String key;
  private final TemplatesReference templatesReference;

  public CollectedValue(String key, Reference templatesReference) {
    this.key = key;
    this.templatesReference = (TemplatesReference) templatesReference;
  }

  public Accumulator newAccumulator(Object it, Scope scope) {
    Transform constructor = templatesReference.getValue(it, scope);
    Processor collector = (Processor) constructor.getResults(null, Map.of());
    return new Accumulator(collector);
  }

  public class Accumulator {

    private final Processor collector;

    public Accumulator(Processor collector) {
      this.collector = collector;
    }

    public void accumulate(Object s) {
      collector.resolveMessage("accumulate", Map.of()).getResults(s, Map.of());
    }

    public String key() {
      return key;
    }

    public Object result() {
      return collector.resolveMessage("result", Map.of()).getResults(null, Map.of());
    }
  }
}
