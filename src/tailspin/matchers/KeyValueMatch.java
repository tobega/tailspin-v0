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
  public Object permeate(Object toMatch, Object it, Scope scope, String contextTag) {
    if (!(toMatch instanceof KeyValue keyValue)) return null;
    if (!keyValue.getKey().equals(key)) return null;
    return valueMatch.permeate(keyValue.getValue(), it, scope, key) == null ? null : toMatch;
  }
}
