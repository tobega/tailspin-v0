package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Membrane;

public class StereotypeMatch implements Membrane {

  final String identifier;

  public StereotypeMatch(String identifier) {
    this.identifier = identifier;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope) {
    Membrane stereotype = scope.getLocalDictionary().getDataDefinition(identifier);
    return stereotype.permeate(toMatch, null, null);
  }

  @Override
  public String toString() {
    return identifier;
  }
}
