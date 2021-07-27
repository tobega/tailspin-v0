package tailspin.matchers;

import tailspin.control.Bound;
import tailspin.interpreter.Scope;
import tailspin.java.JavaObject;
import tailspin.types.Criterion;
import tailspin.types.Measure;
import tailspin.types.Unit;

public class RangeMatch implements Criterion {

  private final Bound lowerBound;
  private final Bound upperBound;

  public RangeMatch(Bound lowerBound, Bound upperBound) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    try {
      Unit unit = null;
      if (lowerBound != null) {
        Object low = lowerBound.value.getResults(it, scope);
        if (low instanceof Measure m) unit = m.getUnit();
        Comparison comparison = compare(toMatch, low);
        if (comparison == Comparison.INCOMPARABLE) return false;
        if (comparison == Comparison.LESS) return false;
        if (!lowerBound.inclusive && comparison == Comparison.EQUAL) return false;
      }
      if (upperBound != null) {
        Object high = upperBound.value.getResults(it, scope);
        if (high instanceof Measure m && unit != null && !unit.equals(m.getUnit()))
          throw new IllegalArgumentException("Match lower bound unit " + unit + " incompatible with upper bound " + m);
        Comparison comparison = compare(toMatch, high);
        if (comparison == Comparison.INCOMPARABLE) return false;
        if (comparison == Comparison.GREATER) return false;
        if (!upperBound.inclusive && comparison == Comparison.EQUAL) return false;
      }
      return true;
    } catch (ClassCastException e) {
      return false;
    }
  }

  public enum Comparison {
    LESS, EQUAL, GREATER, INCOMPARABLE;
    static Comparison of(int comparatorResult) {
      if (comparatorResult < 0) return LESS;
      if (comparatorResult == 0) return EQUAL;
      return GREATER;
    }
  }

  public static Comparison compare(Object lhs, Object rhs) {
    if (lhs instanceof Measure l && rhs instanceof Measure r) {
      if (l.getUnit().equals(r.getUnit())) {
        lhs = l.getValue();
        rhs = r.getValue();
      } else {
        throw new IllegalArgumentException("Cannot compare " + lhs + " with " + rhs);
      }
    }
    else if (lhs instanceof Measure m && m.getUnit().equals(Unit.SCALAR) && rhs instanceof Number) lhs = m.getValue();
    else if (lhs instanceof Number && rhs instanceof Measure m && m.getUnit().equals(Unit.SCALAR)) rhs = m.getValue();
    else if (lhs instanceof Measure || rhs instanceof Measure) throw new IllegalArgumentException("Cannot compare " + lhs + " with " + rhs);

    if ((lhs instanceof String) && (rhs instanceof String)) {
      return Comparison.of(((String) lhs).compareTo((String) rhs));
    } else if ((lhs instanceof Number) && (rhs instanceof Number)) {
      return Comparison.of(Long.compare(((Number) lhs).longValue(), ((Number) rhs).longValue()));
    } else if ((lhs instanceof JavaObject) && (rhs instanceof JavaObject)) {
      lhs = ((JavaObject) lhs).getRealObject();
      rhs = ((JavaObject) rhs).getRealObject();
      if ((lhs instanceof Comparable) && (rhs instanceof Comparable)) {
        @SuppressWarnings("unchecked")
        Comparable<Object> comparable = (Comparable<Object>) lhs;
        return Comparison.of(comparable.compareTo(rhs));
      }
    }
    return Comparison.INCOMPARABLE;
  }
}
