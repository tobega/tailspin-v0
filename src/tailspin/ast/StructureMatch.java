package tailspin.ast;

import java.util.Map;
import tailspin.interpreter.Scope;

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
      Object valueToMatch = mapToMatch.get(keyMatch.getKey());
      if (!keyMatch.getValue().matches(valueToMatch, mapToMatch, scope)) {
        return false;
      }
    }
    return true;
  }
}
