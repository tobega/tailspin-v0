package tailspin.control;

import tailspin.arithmetic.ArithmeticContextKeywordResolver;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;
import tailspin.types.TaggedIdentifier;
import tailspin.types.Unit;

public class DimensionContextKeywordResolver implements ArithmeticContextKeywordResolver,
    RangeGenerator.BoundsResolver {

  private final long offset;
  private final String tag;
  private final Unit unit;
  private final Integer dimensionSize;
  private final boolean allowNegative;

  private boolean resolvedKeyword;

  public DimensionContextKeywordResolver(Object offset, Integer dimensionSize, boolean allowNegative) {
    tag = (offset instanceof TaggedIdentifier t) ? t.getTag() : null;
    unit = (offset instanceof Measure m) ? m.getUnit() : null;
    this.offset = decodeObject(offset);
    this.dimensionSize = dimensionSize;
    this.allowNegative = allowNegative;
  }

  @Override
  public Object getValue(String name) {
    resolvedKeyword = true;
    if (name.equals("last")) {
      return dimensionSize + offset - 1;
    } else if (name.equals("first")) {
      return offset;
    } else {
      throw new UnsupportedOperationException("Unknown dimension context keyword " + name);
    }
  }

  public Integer resolveNativeIndex(Object indexValue) {
    long index = decodeObject(indexValue);
    if ((!allowNegative && index < offset) || index >= dimensionSize + offset) return null;
    return (int) (index - offset);
  }

  private long decodeObject(Object indexValue) {
    if (indexValue instanceof TaggedIdentifier t) {
      if (!t.getTag().equals(tag)) throw new IllegalArgumentException("Array indexed by " + t + ". Expected " + getExpectedUnitErrorMessage());
      return (long) t.getValue();
    }
    if (indexValue instanceof Measure m) {
      if (!m.getUnit().equals(unit)) throw new IllegalArgumentException("Array indexed by " + m + ". Expected " + getExpectedUnitErrorMessage());
      return m.getValue();
    }
    if (tag != null || unit != null) throw new IllegalArgumentException("Array indexed by untyped " + indexValue + ". Expected " + getExpectedUnitErrorMessage());
    return (long) indexValue;
  }

  private String getExpectedUnitErrorMessage() {
    if (tag != null) return "tag " + tag;
    if (unit != null) return "unit " + unit;
    return "untyped number";
  }

  @Override
  public RangeGenerator.Bounds resolveBounds(Value lower, Value upper, Object it, Scope scope) {
    resolvedKeyword = false;
    Object lowerValue = lower.getResults(it, scope);
    Object upperValue = upper.getResults(it, scope);
    if (resolvedKeyword) {
      if (lowerValue instanceof Long) {
        if (upperValue instanceof Measure m)
          upperValue = m.getValue();
        else if (upperValue instanceof TaggedIdentifier t)
          upperValue = t.getValue();
      } else if (upperValue instanceof Long) {
        if (lowerValue instanceof Measure m)
          lowerValue = m.getValue();
        else if (lowerValue instanceof TaggedIdentifier t)
          lowerValue = t.getValue();
      }
    }
    return new RangeGenerator.Bounds(lowerValue, upperValue);
  }

  @Override
  public Long resolveLowerRangeLimit(long index) {
    if (!allowNegative && index < offset) index = offset;
    if (index >= dimensionSize + offset) return null;
    return index;
  }

  @Override
  public Long resolveUpperRangeLimit(long index) {
    if (!allowNegative && index < offset) return null;
    if (index >= dimensionSize + offset) return dimensionSize + offset - 1;
    return index;
  }
}
