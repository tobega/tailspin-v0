package tailspin.matchers;

import java.util.Objects;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;
import tailspin.types.Measure;
import tailspin.types.Unit;

public class Equality implements Criterion {
  private final Value value;

  public Equality(Value value) {
    this.value = value;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    Object required = value.getResults(it, scope);
    if (toMatch instanceof Measure m && !(required instanceof Measure)) toMatch = m.getValue();
    if (toMatch instanceof Number
        && !(toMatch instanceof Measure)
        && required instanceof Measure r
        && r.getUnit().equals(Unit.SCALAR)) required = r.getValue();
    return Objects.deepEquals(toMatch, required);
  }
}
