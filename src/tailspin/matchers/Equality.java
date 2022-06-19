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
  public Object permeate(Object toMatch, Object it, Scope scope, String contextTag) {
    Object required = value.getResults(it, scope);
    return eq(toMatch, required, contextTag, scope);
  }

  private Object eq(Object toMatch, Object required, String contextTag, Scope scope) {
    if (toMatch instanceof Measure || required instanceof Measure
        || toMatch instanceof TaggedIdentifier || required instanceof TaggedIdentifier)
      return RangeMatch.compare(toMatch, RangeMatch.Comparison.EQUAL, required, contextTag, scope);
    if (toMatch instanceof TailspinArray t && required instanceof TailspinArray r) {
      if (t.length() != r.length()) return null;
      for (int i = 1; i <= t.length(); i++) {
        if (eq(t.get(i), r.get(i),contextTag, scope) == null) return null;
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
