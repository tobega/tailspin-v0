package tailspin.ast;

import java.util.stream.Stream;
import tailspin.interpreter.Scope;

public class ArrayDimensionRange implements DimensionReference {

  private final RangeGenerator rangeGenerator;

  public ArrayDimensionRange(RangeGenerator rangeGenerator) {
    this.rangeGenerator = rangeGenerator;
  }

  @Override
  public Object getIndices(int size, Object it, Scope scope) {
    RangeGenerator.RangeIterator rangeIterator = rangeGenerator
        .resultIterator(i -> DimensionReference.resolveIndex(i.intValue(), size), it, scope);
    return rangeIterator == null ? Stream.empty() : rangeIterator.stream();
  }
}
