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
  public boolean matches(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
    if (!(toMatch instanceof KeyValue keyValue)) return false;
    if (!keyValue.getKey().equals(key)) return false;
    TypeBound keyType = TypeBound.inContext(key, scope.getLocalDictionary().getDataDefinition(key));
    return valueMatch.matches(keyValue.getValue(), it, scope, keyType);
  }
}
