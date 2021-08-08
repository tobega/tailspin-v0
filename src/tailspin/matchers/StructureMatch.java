package tailspin.matchers;

import java.util.Map;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;
import tailspin.types.Structure;

public class StructureMatch implements Criterion {
  private final Map<String, Criterion> keyConditions;
  private final boolean allowExcessKeys;

  public StructureMatch(Map<String, Criterion> keyConditions, boolean allowExcessKeys) {
    this.keyConditions = keyConditions;
    this.allowExcessKeys = allowExcessKeys;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    if (!(toMatch instanceof Structure structureToMatch)) return false;
    for (Map.Entry<String, Criterion> keyMatch : keyConditions.entrySet()) {
      if (!structureToMatch.containsKey(keyMatch.getKey())) {
        if  (keyMatch.getValue() == AlwaysFalse.INSTANCE) {
          continue;
        }
        return false;
      }
      Object valueToMatch = structureToMatch.get(keyMatch.getKey());
      if (!keyMatch.getValue().isMet(valueToMatch, it, scope)) {
        return false;
      }
    }
    return allowExcessKeys || structureToMatch.keySet().stream().allMatch(keyConditions::containsKey);
  }

  @Override
  public String toString() {
    return "{" + keyConditions.entrySet().stream().map(e -> e.getKey() + ":" + e.getValue()).collect(
        Collectors.joining(",")) + (allowExcessKeys ? "" : "VOID") + "}";
  }
}
