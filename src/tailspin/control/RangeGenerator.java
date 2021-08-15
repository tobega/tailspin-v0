package tailspin.control;

import java.util.function.Function;
import java.util.stream.LongStream;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;
import tailspin.types.TaggedIdentifier;
import tailspin.types.Unit;

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
    Unit unit = null;
    String tag = null;
    long increment = step == null ? 1 : ((Number) step.getResults(it, scope)).longValue();
    if (increment == 0) {
      throw new IllegalArgumentException("Cannot produce range with zero increment");
    }
    Object lowerValue = lowerBound.value.getResults(it, scope);
    if (lowerValue instanceof Measure m) {
      unit = m.getUnit();
      lowerValue = m.getValue();
    }
    if (lowerValue instanceof TaggedIdentifier t) {
      tag = t.getTag();
      lowerValue = t.getValue();
    }
    long startBound = ((Number) lowerValue).longValue();
    Long start = lowerBoundTransform.apply(lowerBound.inclusive ? startBound : startBound + increment);
    Object upperValue = upperBound.value.getResults(it, scope);
    if (upperValue instanceof Measure m) {
      if (!m.getUnit().equals(unit))
        throw new IllegalArgumentException("Range lower bound unit " + unit + " incompatible with upper bound " + m);
      upperValue = m.getValue();
    } else if (unit != null)
      throw new IllegalArgumentException("Range lower bound unit " + unit + " incompatible with upper bound " + upperValue);
    if (upperValue instanceof TaggedIdentifier t) {
      if (!t.getTag().equals(tag))
        throw new IllegalArgumentException("Range lower bound tag " + tag + " incompatible with upper bound " + t.getTag() + ":" + t.getValue());
      upperValue = t.getValue();
    } else if (tag != null)
      throw new IllegalArgumentException("Range lower bound tag " + tag + " incompatible with upper bound " + upperValue);
    long endBound = ((Number) upperValue).longValue();
    Long end = upperBoundTransform.apply(upperBound.inclusive ? endBound
        : Math.floorDiv((endBound - 1 - startBound), increment) * increment + startBound);
    if (start == null || end == null || (increment > 0 && start > end) || (increment < 0 && start < end)) {
      return null;
    }
    return new RangeIterator(start, increment, end, unit, tag);
  }

  public static class RangeIterator implements ResultIterator {
    private long i;
    private final long increment;
    private final long end;
    private final Unit unit;
    private final String tag;

    RangeIterator(long start, long increment, long end, Unit unit, String tag) {
      this.i = start;
      this.increment = increment;
      this.end = end;
      this.unit = unit;
      this.tag = tag;
    }

    @Override
    public Object getNextResult() {
      if (!isValid(i)) {
        return null;
      }
      if (unit != null) {
        return new Measure(getNextLong(), unit);
      }
      if (tag != null) {
        return new TaggedIdentifier(tag, getNextLong());
      }
      return getNextLong();
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
