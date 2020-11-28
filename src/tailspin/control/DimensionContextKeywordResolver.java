package tailspin.control;

import tailspin.arithmetic.ArithmeticContextKeywordResolver;

public class DimensionContextKeywordResolver implements ArithmeticContextKeywordResolver {
  private Integer dimensionSize;

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

  public Context with(Integer size, boolean allowNegative) {
    dimensionSize = size;
    return new Context(allowNegative);
  }

  public class Context implements AutoCloseable {

    private final boolean allowNegative;

    public Context(boolean allowNegative) {
      this.allowNegative = allowNegative;
    }

    @Override
    public void close() {
      dimensionSize = null;
    }

    public Long resolveIndex(int index) {
      if ((!allowNegative && index <= 0) || index > dimensionSize) return null;
      return (long) (index);
    }
  }
}
