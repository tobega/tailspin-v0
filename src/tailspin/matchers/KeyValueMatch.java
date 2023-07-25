package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.KeyValue;
import tailspin.types.Membrane;

public class KeyValueMatch implements Membrane {

  private final String key;
  private final Membrane valueMatch;

  public KeyValueMatch(String key, Membrane valueMatch) {
    this.key = key;
    this.valueMatch = valueMatch;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope, Membrane typeBound) {
    if (!(toMatch instanceof KeyValue keyValue)) return false;
    if (!keyValue.getKey().equals(key)) return false;
    Membrane keyType = scope.getLocalDictionary().getDataDefinition(key);
    return valueMatch.matches(keyValue.getValue(), it, scope, keyType);
  }
}
