package tailspin.control;

import tailspin.arithmetic.ArithmeticContextKeywordResolver;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;
import tailspin.types.TaggedIdentifier;

public class DimensionContextKeywordResolver implements ArithmeticContextKeywordResolver,
    RangeGenerator.BoundsResolver {
  private final Integer dimensionSize;
  private final boolean allowNegative;

  private boolean resolvedKeyword;

  public DimensionContextKeywordResolver(Integer dimensionSize, boolean allowNegative) {
    this.dimensionSize = dimensionSize;
    this.allowNegative = allowNegative;
  }

  @Override
  public long getValue(String name) {
    resolvedKeyword = true;
    if (name.equals("last")) {
      return dimensionSize;
    } else if (name.equals("first")) {
      return 1;
    } else {
      throw new UnsupportedOperationException("Unknown dimension context keyword " + name);
    }
  }

  public Long resolveIndex(Object indexValue) {
    int index = decodeObject(indexValue);
    if ((!allowNegative && index <= 0) || index > dimensionSize) return null;
    return (long) (index);
  }

  private int decodeObject(Object indexValue) {
    if (indexValue instanceof TaggedIdentifier t) {
      return ((Long) t.getValue()).intValue();
    }
    if (indexValue instanceof Measure m) {
      return (int) m.getValue();
    }
    return ((Long) indexValue).intValue();
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
    if (!allowNegative && index <= 0) index = 1;
    if (index > dimensionSize) return null;
    return index;
  }

  @Override
  public Long resolveUpperRangeLimit(long index) {
    if (!allowNegative && index <= 0) return null;
    if (index > dimensionSize) return Long.valueOf(dimensionSize);
    return index;
  }
}
