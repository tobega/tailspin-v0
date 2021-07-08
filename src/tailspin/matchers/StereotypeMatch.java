package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Criterion;
import tailspin.types.Membrane;

public class StereotypeMatch implements Criterion {

  private final String identifier;

  public StereotypeMatch(String identifier) {
    this.identifier = identifier;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    Membrane stereotype = scope.getDataDefinition(identifier);
    return stereotype.permeate(toMatch) != null;
  }
}
