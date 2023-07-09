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
  public boolean matches(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
    Membrane stereotype = scope.getLocalDictionary().getDataDefinition(identifier);
    if (toMatch instanceof String || toMatch instanceof Long) {
      if (typeBound != null && typeBound.contextTag() != null) {
        toMatch = new TaggedIdentifier(typeBound.contextTag(), toMatch);
      }
    }
    return stereotype.matches(toMatch, null, scope, TypeBound.anyInContext(identifier));
  }

  @Override
  public Object inContext(Object value) {
    if (value instanceof String || value instanceof Long) {
      return new TaggedIdentifier(identifier, value);
    }
    return value;
  }

  @Override
  public String toString() {
    return identifier;
  }
}
