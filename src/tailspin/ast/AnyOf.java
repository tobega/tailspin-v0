package tailspin.ast;

import java.util.List;
import tailspin.interpreter.Scope;

public class AnyOf implements Condition {

  private final boolean invert;
  private final List<Condition> alternativeConditions;

  public AnyOf(boolean invert, List<Condition> alternativeConditions) {
    this.invert = invert;
    this.alternativeConditions = alternativeConditions;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope) {
    for (Condition condition : alternativeConditions) {
      if (condition.matches(toMatch, it, scope)) {
        return !invert;
      }
    }
    return invert;
  }
}
