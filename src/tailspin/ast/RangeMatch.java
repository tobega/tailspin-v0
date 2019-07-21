package tailspin.ast;

import tailspin.interpreter.Scope;

public class RangeMatch implements Condition {

  private final Bound lowerBound;
  private final Bound upperBound;

  public RangeMatch(Bound lowerBound, Bound upperBound) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
  }

  @Override
  public boolean evaluate(Object oit, Scope scope) {
    @SuppressWarnings("unchecked")
    Comparable<Object> it = (Comparable<Object>) oit;
    try {
      if (lowerBound != null) {
        Object low = lowerBound.value.evaluate(oit, scope);
        if (it.compareTo(low) < 0) return false;
        if (!lowerBound.inclusive && it.compareTo(low) == 0) return false;
      }
      if (upperBound != null) {
        Object high = upperBound.value.evaluate(oit, scope);
        if (it.compareTo(high) > 0) return false;
        if (!upperBound.inclusive && it.compareTo(high) == 0) return false;
      }
      return true;
    } catch (ClassCastException e) {
      return false;
    }
  }
}
