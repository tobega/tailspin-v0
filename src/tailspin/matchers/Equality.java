package tailspin.matchers;

import java.util.Objects;
import tailspin.TypeError;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.DataDictionary;
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
  public Object permeate(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
    Object required = value.getResults(it, scope);
    if (typeBound == null) {
      typeBound = TypeBound.of(DataDictionary.getDefaultTypeCriterion(null, required, scope.getLocalDictionary()));
    } else if (typeBound.outOfBound(required, it, scope)) {
      throw new TypeError("Matcher " + this + " not in expected type bound " + typeBound);
    }
    if (typeBound != null && typeBound.outOfBound(toMatch, it, scope)) {
      throw new TypeError("Value " + DataDictionary.formatErrorValue(toMatch) + " not in expected type bound " + typeBound);
    }
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
