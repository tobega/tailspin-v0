package tailspin.control;

import java.util.function.Function;
import java.util.stream.LongStream;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;

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
    return resultIterator(Function.identity(), Function.identity(), it, blockScope);
  }

  public RangeIterator resultIterator(Function<Long, Long> lowerBoundTransform,
      Function<Long, Long> upperBoundTransform, Object it, Scope scope) {
    String unit = null;
    long increment = step == null ? 1 : ((Number) step.getResults(it, scope)).longValue();
    if (increment == 0) {
      throw new IllegalArgumentException("Cannot produce range with zero increment");
    }
    Object lowerValue = lowerBound.value.getResults(it, scope);
    if (lowerValue instanceof Measure m) {
      unit = m.getUnit();
      lowerValue = m.getValue();
    }
    long startBound = ((Number) lowerValue).longValue();
    Long start = lowerBoundTransform.apply(lowerBound.inclusive ? startBound : startBound + increment);
    Object upperValue = upperBound.value.getResults(it, scope);
    if (upperValue instanceof Measure m) {
      if (unit != null && !unit.equals(m.getUnit()))
        throw new IllegalArgumentException("Range lower bound unit " + unit + " incompatible with upper bound " + m);
      unit = m.getUnit();
      upperValue = m.getValue();
    }
    long endBound = ((Number) upperValue).longValue();
    Long end = upperBoundTransform.apply(upperBound.inclusive ? endBound
        : Math.floorDiv((endBound - 1 - startBound), increment) * increment + startBound);
    if (start == null || end == null || (increment > 0 && start > end) || (increment < 0 && start < end)) {
      return null;
    }
    return new RangeIterator(start, increment, end, unit);
  }

  public static class RangeIterator implements ResultIterator {
    private long i;
    private final long increment;
    private final long end;
    private final String unit;

    RangeIterator(long start, long increment, long end, String unit) {
      this.i = start;
      this.increment = increment;
      this.end = end;
      this.unit = unit;
    }

    @Override
    public Object getNextResult() {
      if (!isValid(i)) {
        return null;
      }
      return unit == null ? getNextLong() : new Measure(getNextLong(), unit);
    }

    private long getNextLong() {
      long result = i;
      i = i + increment;
      return result;
    }

    private boolean isValid(long v) {
      return (increment > 0 && v <= end) || (increment < 0 && v >= end);
    }

    public LongStream stream() {
      return LongStream.iterate(getNextLong(), this::isValid, v -> getNextLong());
    }
  }
}
