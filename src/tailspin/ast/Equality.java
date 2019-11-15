package tailspin.ast;

import java.util.Objects;
import tailspin.interpreter.Scope;

public class Equality implements Condition {
  private final Value value;

  public Equality(Value value) {
    this.value = value;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope) {
    return Objects.equals(toMatch, value.getResults(it, scope));
  }
}
