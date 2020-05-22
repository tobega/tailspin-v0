package tailspin.matchers;

import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class StructureMatch implements Criterion {
  private final Map<String, Criterion> keyConditions;
  private final boolean allowExcessKeys;

  public StructureMatch(Map<String, Criterion> keyConditions, boolean allowExcessKeys) {
    this.keyConditions = keyConditions;
    this.allowExcessKeys = allowExcessKeys;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    if (!(toMatch instanceof Map)) return false;
    @SuppressWarnings("unchecked")
    Map<String, Object> mapToMatch = (Map<String, Object>) toMatch;
    for (Map.Entry<String, Criterion> keyMatch : keyConditions.entrySet()) {
      if (!mapToMatch.containsKey(keyMatch.getKey())) {
        if  (keyMatch.getValue() == AlwaysFalse.INSTANCE) {
          continue;
        }
        return false;
      }
      Object valueToMatch = mapToMatch.get(keyMatch.getKey());
      if (!keyMatch.getValue().isMet(valueToMatch, it, scope)) {
        return false;
      }
    }
    return allowExcessKeys || mapToMatch.keySet().stream().allMatch(keyConditions::containsKey);
  }
}
