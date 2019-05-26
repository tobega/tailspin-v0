package tailspin.ast;

public class RangeMatch {

  private final Bound lowerBound;
  private final Bound upperBound;

  public RangeMatch(Bound lowerBound, Bound upperBound) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
  }

  public boolean contains(Comparable<Object> it) {
    if (lowerBound != null) {
      if (it.compareTo(lowerBound.value) < 0) return false;
      if (!lowerBound.inclusive && it.compareTo(lowerBound.value) == 0) return false;
    }
    if (upperBound != null) {
      if (it.compareTo(upperBound.value) > 0) return false;
      if (!upperBound.inclusive && it.compareTo(upperBound.value) == 0) return false;
    }
    return true;
  }
}
