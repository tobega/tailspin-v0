package tailspin.control;

import static tailspin.types.DataDictionary.formatErrorValue;

import java.util.stream.LongStream;
import java.util.stream.Stream;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;
import tailspin.types.TaggedIdentifier;
import tailspin.types.Unit;

public class RangeGenerator implements Expression {

  record Bounds(Object lower, Object upper){}

  interface BoundsResolver {
    Long resolveLowerRangeLimit(long calculated);

    Long resolveUpperRangeLimit(long calculated);
  }

  static final BoundsResolver RANGE_BOUNDS = new BoundsResolver(){
    @Override
    public Long resolveLowerRangeLimit(long calculated) {
      return calculated;
    }

    @Override
    public Long resolveUpperRangeLimit(long calculated) {
      return calculated;
    }
  };

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
    return resultIterator(RANGE_BOUNDS, it, blockScope);
  }

  public RangeIterator resultIterator(BoundsResolver resolver, Object it, Scope scope) {
    long increment = step == null ? 1 : ((Number) step.getResults(it, scope)).longValue();
    if (increment == 0) {
      throw new IllegalArgumentException("Cannot produce range with zero increment");
    }
    Unit unit = null;
    String tag = null;
    Bounds bounds = resolveBounds(lowerBound.value, upperBound.value, it, scope);
    Object lowerValue = bounds.lower();
    if (lowerValue instanceof Measure m) {
      unit = m.getUnit();
      lowerValue = m.getValue();
    }
    if (lowerValue instanceof TaggedIdentifier t) {
      tag = t.getTag();
      lowerValue = t.getValue();
    }
    long startBound = ((Number) lowerValue).longValue();
    Long start = resolver.resolveLowerRangeLimit(lowerBound.inclusive ? startBound : startBound + increment);
    Object upperValue = bounds.upper();
    if (upperValue instanceof Measure m) {
      if (!m.getUnit().equals(unit))
        throw new IllegalArgumentException("Range lower bound " + formatErrorValue(bounds.lower()) + " incompatible with upper bound " + formatErrorValue(bounds.upper()));
      upperValue = m.getValue();
    } else if (unit != null)
      throw new IllegalArgumentException("Range lower bound " + formatErrorValue(bounds.lower()) + " incompatible with upper bound " + formatErrorValue(bounds.upper()));
    if (upperValue instanceof TaggedIdentifier t) {
      if (!t.getTag().equals(tag))
        throw new IllegalArgumentException("Range lower bound " + formatErrorValue(bounds.lower()) + " incompatible with upper bound " + formatErrorValue(bounds.upper()));
      upperValue = t.getValue();
    } else if (tag != null)
      throw new IllegalArgumentException("Range lower bound " + formatErrorValue(bounds.lower()) + " incompatible with upper bound " + formatErrorValue(bounds.upper()));
    long endBound = ((Number) upperValue).longValue();
    if (!upperBound.inclusive) {
      if (increment > 0) {
        endBound = Math.floorDiv((endBound - 1 - startBound), increment) * increment + startBound;
      } else {
        endBound = Math.floorDiv((endBound + 1 - startBound), increment) * increment + startBound;
      }
    }
    Long end = resolver.resolveUpperRangeLimit(endBound);
    if (start == null || end == null || (increment > 0 && start > end) || (increment < 0 && start < end)) {
      return null;
    }
    return new RangeIterator(start, increment, end, unit, tag);
  }

  private Bounds resolveBounds(Value lower, Value upper, Object it, Scope scope) {
    return new Bounds(lower.getResults(it, scope), upper.getResults(it, scope));
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
      return longToResult(getNextLong());
    }

    private Object longToResult(long v) {
      if (unit != null) {
        return new Measure(v, unit);
      }
      if (tag != null) {
        return new TaggedIdentifier(tag, v);
      }
      return v;
    }

    private long getNextLong() {
      long result = i;
      i = i + increment;
      return result;
    }

    private boolean isValid(long v) {
      return (increment > 0 && v <= end) || (increment < 0 && v >= end);
    }

    public Stream<Object> stream() {
      return LongStream.iterate(getNextLong(), this::isValid, v -> getNextLong()).mapToObj(this::longToResult);
    }
  }
}
