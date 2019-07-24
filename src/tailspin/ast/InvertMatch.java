package tailspin.ast;

import tailspin.interpreter.Scope;

public class InvertMatch implements Condition {
  private final Condition condition;

  public InvertMatch(Condition condition) {
    this.condition = condition;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope) {
    return !condition.matches(toMatch, it, scope);
  }
}
