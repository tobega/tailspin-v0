package tailspin.control;

import java.util.stream.IntStream;
import tailspin.interpreter.Scope;

public class RangeArrayLens extends ArrayLens {

  private final RangeGenerator rangeGenerator;

  public RangeArrayLens(RangeGenerator rangeGenerator) {
    this.rangeGenerator = rangeGenerator;
  }

  @Override
  public IntStream getIndices(DimensionContextKeywordResolver context, Object it, Scope scope) {
    RangeGenerator.RangeIterator rangeIterator =
        rangeGenerator.resultIterator(
            i -> context.resolveLowerRangeLimit(i.intValue()),
            i -> context.resolveUpperRangeLimit(i.intValue()),
            it, scope);
    return rangeIterator == null
        ? IntStream.empty()
        : rangeIterator.stream().mapToInt(l -> (int) l);
  }
}
