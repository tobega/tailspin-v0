package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class StereotypeMatch implements Criterion {

  private final String identifier;

  public StereotypeMatch(String identifier) {
    this.identifier = identifier;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    AnyOf stereotype = (AnyOf) scope.resolveValue(identifier);
    return stereotype.isMet(toMatch, it, scope);
  }
}
