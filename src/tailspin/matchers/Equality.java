package tailspin.matchers;

import tailspin.TypeError;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.*;

import java.util.Objects;

public class Equality implements Membrane {
  private final Value value;

  public Equality(Value value) {
    this.value = value;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope, Membrane typeBound) {
    Object required = value.getResults(it, scope);
    if (typeBound == null) {
      typeBound = DataDictionary.getDefaultTypeCriterion(required, scope.getLocalDictionary());
    } else {
      toMatch = typeBound.inContext(toMatch);
      required = typeBound.inContext(required);
      if (!typeBound.matches(required, it, scope, Membrane.ALWAYS_TRUE)) {
        throw new TypeError("Matcher " + this + " not in expected type bound " + typeBound);
      }
    }
    if (typeBound != null && !typeBound.matches(toMatch, it, scope, Membrane.ALWAYS_TRUE)) {
      throw new TypeError("Value " + DataDictionary.formatErrorValue(toMatch) + " not in expected type bound " + typeBound);
    }
    return eq(toMatch, required);
  }

  private boolean eq(Object toMatch, Object required) {
    if (toMatch instanceof Measure || required instanceof Measure
        || toMatch instanceof TaggedIdentifier || required instanceof TaggedIdentifier)
      return RangeMatch.compare(toMatch, RangeMatch.Comparison.EQUAL, required);
    if (toMatch instanceof TailspinArray t && required instanceof TailspinArray r) {
      if (t.length() != r.length()) return false;
      if (!Objects.equals(t.getOffset(), r.getOffset())) throw new IllegalArgumentException("Trying to compare array of index type " + t.getOffsetDescription() + " with array of index type " + r.getOffsetDescription());
      for (int i = 0; i < t.length(); i++) {
        if (!eq(t.getNative(i), r.getNative(i))) return false;
      }
      return true;
    }
    return Objects.deepEquals(toMatch, required);
  }

  @Override
  public String toString() {
    return "=" + value;
  }
}
