package tailspin.ast;

import java.util.function.Function;
import java.util.stream.Stream;

public class RangeGenerator {

  private final Bound lowerBound;
  private final Bound upperBound;
  private final Integer step;

  public RangeGenerator(Bound lowerBound, Bound upperBound, Integer step) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
    this.step = step;
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
