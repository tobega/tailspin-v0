package tailspin.ast;

import java.util.List;
import java.util.stream.IntStream;
import tailspin.interpreter.Scope;

public class MultiValueDimension implements DimensionReference {
  private final List<DimensionReference> dimensionReferences;

  public MultiValueDimension(List<DimensionReference> dimensionReferences) {
    this.dimensionReferences = dimensionReferences;
  }

  @Override
  public Object getIndices(int size, Object it, Scope scope) {
    IntStream result = IntStream.empty();
    for (DimensionReference dimensionReference : dimensionReferences) {
      Object index = dimensionReference.getIndices(size, it, scope);
      if (!(index instanceof IntStream)) {
        index = IntStream.of(((Number) index).intValue());
      }
      result = IntStream.concat(result, (IntStream) index);
    }
    return result;
  }
}
