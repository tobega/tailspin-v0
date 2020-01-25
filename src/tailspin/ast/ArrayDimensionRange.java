package tailspin.ast;

import java.util.List;
import java.util.stream.IntStream;
import tailspin.interpreter.Scope;

public class ArrayDimensionRange implements DimensionReference {

  private final RangeGenerator rangeGenerator;
  private final DimensionContextKeywordResolver resolver;

  public ArrayDimensionRange(RangeGenerator rangeGenerator,
      DimensionContextKeywordResolver resolver) {
    this.rangeGenerator = rangeGenerator;
    this.resolver = resolver;
  }

  @Override
  public IntStream getIndices(List<?> dimension, Object it, Scope scope) {
    try (DimensionContextKeywordResolver.Context context = resolver.with(dimension) ) {
      RangeGenerator.RangeIterator rangeIterator =
          rangeGenerator.resultIterator(
              i -> DimensionReference.resolveIndex(i.intValue(), dimension), it, scope);
      return rangeIterator == null
          ? IntStream.empty()
          : rangeIterator.stream().mapToInt(l -> (int) l);
    }
  }
}
