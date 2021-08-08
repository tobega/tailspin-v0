package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class AlwaysFalse implements Criterion {
  public static final AlwaysFalse INSTANCE = new AlwaysFalse();

  private AlwaysFalse() {}

  @Override
  public String toString() {
    return "false";
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    return false;
  }
}
