package tailspin.ast;

import java.util.List;

public class DimensionContextKeywordResolver implements ArithmeticContextKeywordResolver {
  private List<?> dimension;

  @Override
  public long getValue(String name) {
    if (name.equals("last")) {
      return dimension.size();
    } else if (name.equals("first")) {
      return 1;
    } else {
      throw new UnsupportedOperationException("Unknown dimension context keyword " + name);
    }
  }

  public Context with(List<?> context) {
    dimension = context;
    return new Context();
  }

  public class Context implements AutoCloseable {
    @Override
    public void close() {
      dimension = null;
    }

    public Long resolveIndex(int index) {
      if (index <= 0 || index > dimension.size()) return null;
      return (long) (index - 1);
    }
  }
}
