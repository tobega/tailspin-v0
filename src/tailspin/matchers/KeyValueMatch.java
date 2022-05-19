package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.KeyValue;
import tailspin.types.Membrane;

public class KeyValueMatch implements Membrane {

  private final Object key;
  private final Membrane valueMatch;

  public KeyValueMatch(Object key, Membrane valueMatch) {
    this.key = key;
    this.valueMatch = valueMatch;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope) {
    if (!(toMatch instanceof KeyValue keyValue)) return null;
    if (key instanceof String && !keyValue.getKey().equals(key)) return null;
    if (key instanceof Membrane m && m.permeate(keyValue.getKey(), it, scope) == null) return null;
    return valueMatch.permeate(keyValue.getValue(), it, scope) == null ? null : toMatch;
  }
}
