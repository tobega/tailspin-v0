package tailspin.transform.lens;

import java.util.stream.IntStream;
import tailspin.control.DimensionContextKeywordResolver;
import tailspin.control.RangeGenerator;
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
            context,
            it, scope);
    return rangeIterator == null
        ? IntStream.empty()
        : rangeIterator.stream().mapToInt(l -> (int) l);
  }
}
