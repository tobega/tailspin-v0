package tailspin.matchers;

import java.util.Objects;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;
import tailspin.types.Measure;
import tailspin.types.TaggedIdentifier;

public class Equality implements Criterion {
  private final Value value;

  public Equality(Value value) {
    this.value = value;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    Object required = value.getResults(it, scope);
    if (toMatch instanceof Measure || toMatch instanceof TaggedIdentifier || required instanceof Measure || required instanceof TaggedIdentifier)
      return RangeMatch.Comparison.EQUAL.equals(RangeMatch.compare(toMatch, required));
    return Objects.deepEquals(toMatch, required);
  }
}
