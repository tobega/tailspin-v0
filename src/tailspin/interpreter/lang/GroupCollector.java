package tailspin.interpreter.lang;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tailspin.transform.Lens;
import tailspin.types.Processor;
import tailspin.types.Relation;
import tailspin.types.Structure;
import tailspin.types.Transform;

public class GroupCollector implements Transform {
  public static String NAME = "Group";

  @Override
  public Processor getResults(Object it, Map<String, Object> parameters) {
    if (parameters.size() != 1 || !parameters.containsKey("of"))
      throw new IllegalArgumentException("Expected parameter 'of:' for " + NAME + ", not " + parameters.keySet());
    return new Instance((Lens.ScopedLens) parameters.get("of"));
  }

  private static class Instance implements Processor {

    private final Lens.ScopedLens of;
    private final Set<Structure> result = new HashSet<>();

    public Instance(Lens.ScopedLens of) {
      this.of = of;
    }

    @Override
    public Transform resolveMessage(String message, Map<String, Object> parameters) {
      if ("accumulate".equals(message))
        return (it, params) -> {result.add((Structure) of.get(List.of(), it)); return null;};
      if ("result".equals(message))
        return (it, params) -> new Relation(result);
      throw new IllegalArgumentException("Unknown message " + message + " to " + NAME + " processor");
    }
  }
}
