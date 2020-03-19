package tailspin.ast;

import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.types.Condition;

public class StructureMatch implements Condition {
  private final Map<String, Condition> keyConditions;

  public StructureMatch(Map<String, Condition> keyConditions) {
    this.keyConditions = keyConditions;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope) {
    if (!(toMatch instanceof Map)) return false;
    @SuppressWarnings("unchecked")
    Map<String, Object> mapToMatch = (Map<String, Object>) toMatch;
    for (Map.Entry<String, Condition> keyMatch : keyConditions.entrySet()) {
      if (!mapToMatch.containsKey(keyMatch.getKey())) {
        return false;
      }
      Object valueToMatch = mapToMatch.get(keyMatch.getKey());
      if (!keyMatch.getValue().matches(valueToMatch, it, scope)) {
        return false;
      }
    }
    return true;
  }
}
