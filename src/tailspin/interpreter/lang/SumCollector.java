package tailspin.interpreter.lang;

import java.util.List;
import java.util.Map;
import tailspin.transform.Lens;
import tailspin.types.Processor;
import tailspin.types.Transform;

public class SumCollector implements Transform {
  public static String NAME = "Sum";

  @Override
  public Processor getResults(Object it, Map<String, Object> parameters) {
    if (parameters.size() != 1 || !parameters.containsKey("of"))
      throw new IllegalArgumentException("Expected parameter 'of:' for " + NAME + ", not " + parameters.keySet());
    return new Instance((Lens.ScopedLens) parameters.get("of"));
  }

  private static class Instance implements Processor {

    private final Lens.ScopedLens of;
    private long result = 0L;

    public Instance(Lens.ScopedLens of) {
      this.of = of;
    }

    @Override
    public Transform resolveMessage(String message, Map<String, Object> parameters) {
      if ("accumulate".equals(message))
        return (it, params) -> {result += (Long) of.get(List.of(), it); return null;};
      if ("result".equals(message))
        return (it, params) -> result;
      throw new IllegalArgumentException("Unknown message " + message + " to " + NAME + " processor");
    }
  }
}
