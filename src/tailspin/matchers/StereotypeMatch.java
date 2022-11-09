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
    if (toMatch instanceof String || toMatch instanceof Long) {
      if (typeBound != null && typeBound.contextTag() != null) {
        toMatch = new TaggedIdentifier(typeBound.contextTag(), toMatch);
      }
    }
    return stereotype.permeate(toMatch, null, scope, TypeBound.anyInContext(identifier)) == null ? null : toMatch;
  }

  @Override
  public String toString() {
    return identifier;
  }
}
