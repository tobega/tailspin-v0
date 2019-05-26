package tailspin.ast;

import java.util.function.Function;
import java.util.stream.Stream;

public class Range {

  private final Bound lowerBound;
  private final Bound upperBound;
  private final Integer step;

  public Range(Bound lowerBound, Bound upperBound) {
    this(lowerBound, upperBound, null);
  }

  public Range(Bound lowerBound, Bound upperBound, Integer step) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
    this.step = step;
  }

  public boolean contains(Comparable<Object> it) {
    if (step == null || step > 0) {
      if (lowerBound != null) {
        if (it.compareTo(lowerBound.value) < 0) return false;
        if (!lowerBound.inclusive && it.compareTo(lowerBound.value) == 0) return false;
      }
      if (upperBound != null) {
        if (it.compareTo(upperBound.value) > 0) return false;
        if (!upperBound.inclusive && it.compareTo(upperBound.value) == 0) return false;
      }
    } else {
      if (upperBound != null) {
        if (it.compareTo(upperBound.value) < 0) return false;
        if (!upperBound.inclusive && it.compareTo(upperBound.value) == 0) return false;
      }
      if (lowerBound != null) {
        if (it.compareTo(lowerBound.value) > 0) return false;
        if (!lowerBound.inclusive && it.compareTo(lowerBound.value) == 0) return false;
      }
    }
    if (step != null) {
      if ((Integer.class.cast(it) - Integer.class.cast(lowerBound.value)) % step != 0)
        return false;
    }
    return true;
  }

  public Stream<Integer> stream() {
    return stream(Function.identity());
  }

  public Stream<Integer> stream(Function<Integer, Integer> boundTransform) {
    int increment = step == null ? 1 : step;
    int start = boundTransform.apply((int) lowerBound.value);
    int end = boundTransform.apply((int) upperBound.value);
    if (start < 0 || (increment > 0 && start > end) || (increment < 0 && start < end)) {
      return Stream.empty();
    }
    return Stream.iterate(
        lowerBound.inclusive ? start : start + increment,
        i -> (increment > 0 && i < end) || (increment < 0 && i > end) || (upperBound.inclusive && i.equals(end)),
        i -> i + increment);
  }
}
