package tailspin.ast;

import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

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
      if (lowerBound != null) {
        Object low = lowerBound.value.getResults(it, scope);
        Comparison comparison = compare(toMatch, low);
        if (comparison == Comparison.INCOMPARABLE) return false;
        if (comparison == Comparison.LESS) return false;
        if (!lowerBound.inclusive && comparison == Comparison.EQUAL) return false;
      }
      if (upperBound != null) {
        Object high = upperBound.value.getResults(it, scope);
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

  private enum Comparison {
    LESS, EQUAL, GREATER, INCOMPARABLE;
    static Comparison of(int comparatorResult) {
      if (comparatorResult < 0) return LESS;
      if (comparatorResult == 0) return EQUAL;
      return GREATER;
    }
  }

  private Comparison compare(Object lhs, Object rhs) {
    if ((lhs instanceof String) && (rhs instanceof String)) {
      return Comparison.of(((String) lhs).compareTo((String) rhs));
    } else if ((lhs instanceof Number) && (rhs instanceof Number)) {
      return Comparison.of(Long.compare(((Number) lhs).longValue(), ((Number) rhs).longValue()));
    }
    return Comparison.INCOMPARABLE;
  }
}
