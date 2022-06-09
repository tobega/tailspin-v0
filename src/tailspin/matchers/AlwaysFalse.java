package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Membrane;

public class AlwaysFalse implements Membrane {
  public static final AlwaysFalse INSTANCE = new AlwaysFalse();

  private AlwaysFalse() {}

  @Override
  public String toString() {
    return "false";
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope, String contextTag) {
    return null;
  }
}
