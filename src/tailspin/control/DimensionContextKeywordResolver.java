package tailspin.control;

import tailspin.arithmetic.ArithmeticContextKeywordResolver;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;
import tailspin.types.TaggedIdentifier;

public class DimensionContextKeywordResolver implements ArithmeticContextKeywordResolver,
    RangeGenerator.BoundsResolver {

  private final long offset;
  private final Integer dimensionSize;
  private final boolean allowNegative;

  private boolean resolvedKeyword;

  public DimensionContextKeywordResolver(long offset, Integer dimensionSize, boolean allowNegative) {
    this.offset = offset;
    this.dimensionSize = dimensionSize;
    this.allowNegative = allowNegative;
  }

  @Override
  public long getValue(String name) {
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
      return (long) t.getValue();
    }
    if (indexValue instanceof Measure m) {
      return m.getValue();
    }
    return (long) indexValue;
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
