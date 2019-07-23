package tailspin.ast;

import tailspin.interpreter.Scope;

public class ArrayDimensionRange implements Value {

  private final RangeGenerator rangeGenerator;

  public ArrayDimensionRange(RangeGenerator rangeGenerator) {
    this.rangeGenerator = rangeGenerator;
  }

  @Override
  public Object evaluate(Object it, Scope scope) {
    return rangeGenerator;
  }
}
