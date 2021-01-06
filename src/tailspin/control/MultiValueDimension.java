package tailspin.control;

import java.util.List;
import java.util.stream.IntStream;
import tailspin.interpreter.Scope;

public class MultiValueDimension extends ArrayDimensionReference {
  private final List<ArrayDimensionReference> dimensionReferences;

  public MultiValueDimension(List<ArrayDimensionReference> dimensionReferences) {
    this.dimensionReferences = dimensionReferences;
  }

  @Override
  public Object getIndices(DimensionContextKeywordResolver dimension, Object it, Scope scope) {
    IntStream result = IntStream.empty();
    for (ArrayDimensionReference dimensionReference : dimensionReferences) {
      Object index = dimensionReference.getIndices(dimension, it, scope);
      if (!(index instanceof IntStream)) {
        index = IntStream.of(((Number) index).intValue());
      }
      result = IntStream.concat(result, (IntStream) index);
    }
    return result;
  }
}
