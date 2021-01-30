package tailspin.control;

import java.util.List;
import java.util.stream.IntStream;
import tailspin.interpreter.Scope;

public class MultiValueArrayLens extends ArrayLens {
  private final List<ArrayLens> dimensionReferences;

  public MultiValueArrayLens(List<ArrayLens> dimensionReferences) {
    this.dimensionReferences = dimensionReferences;
  }

  @Override
  public Object getIndices(DimensionContextKeywordResolver dimension, Object it, Scope scope) {
    IntStream result = IntStream.empty();
    for (ArrayLens dimensionReference : dimensionReferences) {
      Object index = dimensionReference.getIndices(dimension, it, scope);
      if (!(index instanceof IntStream)) {
        index = IntStream.of(((Number) index).intValue());
      }
      result = IntStream.concat(result, (IntStream) index);
    }
    return result;
  }
}
