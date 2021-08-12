package tailspin.matchers;

import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class Condition {
  private final Value lhs;
  private final AnyOf matcher;

  public Condition(Value lhs, AnyOf matcher) {
    this.lhs = lhs;
    this.matcher = matcher;
  }

  boolean isFulfilled(Object toMatch, Scope scope) {
    Object value = lhs.getResults(toMatch, scope);
    return null != matcher.permeate(value, toMatch, scope);
  }

  @Override
  public String toString() {
    return "?(" + lhs + " " + matcher + ")";
  }
}
