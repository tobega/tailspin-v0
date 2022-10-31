package tailspin.matchers;

import java.util.Objects;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;
import tailspin.types.Membrane;
import tailspin.types.TaggedIdentifier;
import tailspin.types.TailspinArray;

public class Equality implements Membrane {
  private final Value value;

  public Equality(Value value) {
    this.value = value;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope) {
    Object required = value.getResults(it, scope);
    return eq(toMatch, required);
  }

  private Object eq(Object toMatch, Object required) {
    if (toMatch instanceof Measure || required instanceof Measure
        || toMatch instanceof TaggedIdentifier || required instanceof TaggedIdentifier)
      return RangeMatch.compare(toMatch, RangeMatch.Comparison.EQUAL, required);
    if (toMatch instanceof TailspinArray t && required instanceof TailspinArray r) {
      if (t.length() != r.length()) return null;
      if (!Objects.equals(t.getOffset(), r.getOffset())) throw new IllegalArgumentException("Trying to compare array of index type " + t.getOffsetDescription() + " with array of index type " + r.getOffsetDescription());
      for (int i = 0; i < t.length(); i++) {
        if (eq(t.getNative(i), r.getNative(i)) == null) return null;
      }
      return t;
    }
    return Objects.deepEquals(toMatch, required) ? toMatch : null;
  }

  @Override
  public String toString() {
    return "=" + value;
  }
}
