package tailspin.ast;

import tailspin.interpreter.Scope;

public class SuchThatMatch {
  private final Value lhs;
  private final AnyOf matcher;

  public SuchThatMatch(Value lhs, AnyOf matcher) {
    this.lhs = lhs;
    this.matcher = matcher;
  }

  public boolean resolveValue(Object toMatch, Scope scope) {
    Object value = lhs.evaluate(toMatch, scope);
    return matcher.matches(value, toMatch, scope);
  }
}
