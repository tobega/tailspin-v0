package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.KeyValue;
import tailspin.types.Membrane;
import tailspin.types.TaggedIdentifier;

public class KeyValueMatch implements Membrane {

  private final String key;
  private final Membrane valueMatch;

  public KeyValueMatch(String key, Membrane valueMatch) {
    this.key = key;
    this.valueMatch = valueMatch;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope) {
    if (!(toMatch instanceof KeyValue keyValue)) return null;
    if (!keyValue.getKey().equals(key)) return null;
    // try context-elided tag first
    if (keyValue.getValue() instanceof TaggedIdentifier t && t.getTag().equals(key)) {
      if (valueMatch.permeate(t.getValue(), it, scope) != null) {
        return toMatch;
      }
    }
    if (valueMatch.permeate(keyValue.getValue(), it, scope) != null) {
      return toMatch;
    }
    return null;
  }
}
