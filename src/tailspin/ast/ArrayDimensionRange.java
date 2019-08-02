package tailspin.ast;

import tailspin.interpreter.Scope;

public class ArrayDimensionRange implements DimensionReference {

  private final RangeGenerator rangeGenerator;

  public ArrayDimensionRange(RangeGenerator rangeGenerator) {
    this.rangeGenerator = rangeGenerator;
  }

  @Override
  public Object getIndices(int size, Object it, Scope scope) {
    return  rangeGenerator
        .stream(i -> DimensionReference.resolveIndex(i.intValue(), size), it, scope);
  }
}
