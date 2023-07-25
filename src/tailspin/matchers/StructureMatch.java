package tailspin.matchers;

import tailspin.TypeError;
import tailspin.interpreter.Scope;
import tailspin.types.DataDictionary;
import tailspin.types.Membrane;
import tailspin.types.Structure;

import java.util.Map;
import java.util.stream.Collectors;

public class StructureMatch implements Membrane {
  private final Map<String, Membrane> keyConditions;
  private final boolean allowExcessKeys;

  private class SubType implements Membrane {
    @Override
    public boolean matches(Object toMatch, Object it, Scope scope, Membrane typeBound) {
      if (!(toMatch instanceof Structure structureToMatch)) return false;
      for (Map.Entry<String, Membrane> keyMatch : keyConditions.entrySet()) {
        if (!structureToMatch.containsKey(keyMatch.getKey())) {
          if  (keyMatch.getValue() == Membrane.ALWAYS_FALSE) {
            continue;
          }
          return false;
        }
      }
      return (allowExcessKeys || structureToMatch.keySet().stream().allMatch(keyConditions::containsKey));
    }
  }

  public StructureMatch(Map<String, Membrane> keyConditions, boolean allowExcessKeys) {
    this.keyConditions = keyConditions;
    this.allowExcessKeys = allowExcessKeys;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope, Membrane typeBound) {
    if (typeBound == null) {
      typeBound = keyConditions.isEmpty() ? Membrane.ALWAYS_TRUE : new SubType();
    }
    if (!typeBound.matches(toMatch, it, scope, Membrane.ALWAYS_TRUE)) {
      throw new TypeError("Value " + DataDictionary.formatErrorValue(toMatch) + " is not a subtype of expected structure in " + this);
    }
    if (!(toMatch instanceof Structure structureToMatch)) return false;
    for (Map.Entry<String, Membrane> keyMatch : keyConditions.entrySet()) {
      if (!structureToMatch.containsKey(keyMatch.getKey())) {
        if  (keyMatch.getValue() == Membrane.ALWAYS_FALSE) {
          continue;
        }
        return false;
      }
      Object valueToMatch = structureToMatch.get(keyMatch.getKey());
      Membrane keyType = scope.getLocalDictionary().getDataDefinition(keyMatch.getKey());
      if (!keyMatch.getValue().matches(valueToMatch, it, scope, keyType)) {
        return false;
      }
    }
    return (allowExcessKeys || structureToMatch.keySet().stream().allMatch(keyConditions::containsKey));
  }

  @Override
  public String toString() {
    return "{" + keyConditions.entrySet().stream().map(e -> e.getKey() + ":" + e.getValue()).collect(
        Collectors.joining(",")) + (allowExcessKeys ? "" : "VOID") + "}";
  }
}
