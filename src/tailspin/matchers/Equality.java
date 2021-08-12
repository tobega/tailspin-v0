package tailspin.matchers;

import java.util.Objects;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Membrane;
import tailspin.types.Measure;
import tailspin.types.TaggedIdentifier;

public class Equality implements Membrane {
  private final Value value;

  public Equality(Value value) {
    this.value = value;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope) {
    Object required = value.getResults(it, scope);
    if (toMatch instanceof Measure || required instanceof Measure
        || toMatch instanceof TaggedIdentifier || required instanceof TaggedIdentifier)
      return RangeMatch.compare(toMatch, RangeMatch.Comparison.EQUAL, required);
    return Objects.deepEquals(toMatch, required) ? toMatch : null;
  }

  @Override
  public String toString() {
    return "=" + value;
  }
}
