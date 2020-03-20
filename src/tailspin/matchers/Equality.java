package tailspin.matchers;

import java.util.Objects;
import tailspin.ast.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class Equality implements Criterion {
  private final Value value;

  public Equality(Value value) {
    this.value = value;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    return Objects.equals(toMatch, value.getResults(it, scope));
  }
}
