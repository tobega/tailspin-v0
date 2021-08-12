package tailspin.matchers;

import java.util.Map;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.types.Membrane;
import tailspin.types.Structure;

public class StructureMatch implements Membrane {
  private final Map<String, Membrane> keyConditions;
  private final boolean allowExcessKeys;

  public StructureMatch(Map<String, Membrane> keyConditions, boolean allowExcessKeys) {
    this.keyConditions = keyConditions;
    this.allowExcessKeys = allowExcessKeys;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope) {
    if (!(toMatch instanceof Structure structureToMatch)) return null;
    for (Map.Entry<String, Membrane> keyMatch : keyConditions.entrySet()) {
      if (!structureToMatch.containsKey(keyMatch.getKey())) {
        if  (keyMatch.getValue() == AlwaysFalse.INSTANCE) {
          continue;
        }
        return null;
      }
      Object valueToMatch = structureToMatch.get(keyMatch.getKey());
      if ((null == keyMatch.getValue().permeate(valueToMatch, it, scope))) {
        return null;
      }
    }
    return (allowExcessKeys || structureToMatch.keySet().stream().allMatch(keyConditions::containsKey)) ? toMatch : null;
  }

  @Override
  public String toString() {
    return "{" + keyConditions.entrySet().stream().map(e -> e.getKey() + ":" + e.getValue()).collect(
        Collectors.joining(",")) + (allowExcessKeys ? "" : "VOID") + "}";
  }
}
