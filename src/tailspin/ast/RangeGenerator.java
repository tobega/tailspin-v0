package tailspin.ast;

import java.util.function.Function;
import java.util.stream.LongStream;
import tailspin.interpreter.Scope;

public class RangeGenerator implements Expression {

  private final Bound lowerBound;
  private final Bound upperBound;
  private final Value step;

  public RangeGenerator(Bound lowerBound, Bound upperBound, Value step) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
    this.step = step;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    return resultIterator(Function.identity(), it, blockScope);
  }

  RangeIterator resultIterator(Function<Long, Long> boundTransform, Object it, Scope scope) {
    long increment = step == null ? 1 : ((Number) step.getResults(it, scope)).longValue();
    if (increment == 0) {
      throw new IllegalArgumentException("Cannot produce range with zero increment");
    }
    Long start = boundTransform.apply(((Number) lowerBound.value.getResults(it, scope)).longValue());
    Long end = boundTransform.apply(((Number) upperBound.value.getResults(it, scope)).longValue());
    if (start == null || end == null || (increment > 0 && start > end) || (increment < 0 && start < end)) {
      return null;
    }
    return new RangeIterator(
        lowerBound.inclusive ? start : start + increment, increment, end, upperBound.inclusive);
  }

  public static class RangeIterator implements ResultIterator {
    private long i;
    private final long increment;
    private final long end;
    private final boolean endInclusive;

    RangeIterator(long start, long increment, long end, boolean endInclusive) {
      this.i = start;
      this.increment = increment;
      this.end = end;
      this.endInclusive = endInclusive;
    }

    @Override
    public Object getNextResult() {
      if (!isValid(i)) {
        return null;
      }
      return getNextLong();
    }

    private long getNextLong() {
      long result = i;
      i = i + increment;
      return result;
    }

    private boolean isValid(long v) {
      return (increment > 0 && v < end) || (increment < 0 && v > end) || (endInclusive && v == end);
    }

    public LongStream stream() {
      return LongStream.iterate(getNextLong(), this::isValid, v -> getNextLong());
    }
  }
}
