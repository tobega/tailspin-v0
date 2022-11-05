package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Membrane;
import tailspin.types.TaggedIdentifier;

public class StereotypeMatch implements Membrane {

  final String identifier;

  public StereotypeMatch(String identifier) {
    this.identifier = identifier;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
    Membrane stereotype = scope.getLocalDictionary().getDataDefinition(identifier);
    Object value = toMatch;
    if (value instanceof String || value instanceof Long) {
      value = new TaggedIdentifier(identifier, value);
    }
    return stereotype.permeate(value, null, scope, typeBound) == null ? null : toMatch;
  }

  @Override
  public String toString() {
    return identifier;
  }
}
