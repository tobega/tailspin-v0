package tailspin.control;

import tailspin.arithmetic.ArithmeticContextKeywordResolver;

public class DimensionContextKeywordResolver implements ArithmeticContextKeywordResolver {
  private final Integer dimensionSize;
  private final boolean allowNegative;

  public DimensionContextKeywordResolver(Integer dimensionSize, boolean allowNegative) {
    this.dimensionSize = dimensionSize;
    this.allowNegative = allowNegative;
  }

  @Override
  public long getValue(String name) {
    if (name.equals("last")) {
      return dimensionSize;
    } else if (name.equals("first")) {
      return 1;
    } else {
      throw new UnsupportedOperationException("Unknown dimension context keyword " + name);
    }
  }
  public Long resolveIndex(int index) {
    if ((!allowNegative && index <= 0) || index > dimensionSize) return null;
    return (long) (index);
  }

  public Long resolveLowerRangeLimit(int index) {
    if (!allowNegative && index <= 0) return 1L;
    if (index > dimensionSize) return null;
    return (long) (index);
  }

  public Long resolveUpperRangeLimit(int index) {
    if (!allowNegative && index <= 0) return null;
    if (index > dimensionSize) return Long.valueOf(dimensionSize);
    return (long) (index);
  }
}
