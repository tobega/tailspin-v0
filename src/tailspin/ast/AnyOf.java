package tailspin.ast;

import java.util.List;
import tailspin.interpreter.Scope;

public class AnyOf implements Condition {
  private final List<Condition> alternativeConditions;

  public AnyOf(List<Condition> alternativeConditions) {
    this.alternativeConditions = alternativeConditions;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope) {
    for (Condition condition : alternativeConditions) {
      if (condition.matches(toMatch, it, scope)) {
        return true;
      }
    }
    return false;
  }
}
