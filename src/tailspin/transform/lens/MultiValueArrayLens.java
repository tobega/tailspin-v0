package tailspin.transform.lens;

import java.util.List;
import java.util.stream.IntStream;
import tailspin.control.DimensionContextKeywordResolver;
import tailspin.interpreter.Scope;

public class MultiValueArrayLens extends ArrayLens {
  private final List<ArrayLens> dimensionReferences;

  public MultiValueArrayLens(List<ArrayLens> dimensionReferences) {
    this.dimensionReferences = dimensionReferences;
  }

  @Override
  public Object getNativeIndices(DimensionContextKeywordResolver dimension, Object it, Scope scope) {
    IntStream result = IntStream.empty();
    for (ArrayLens dimensionReference : dimensionReferences) {
      Object index = dimensionReference.getNativeIndices(dimension, it, scope);
      if (!(index instanceof IntStream)) {
        index = IntStream.of((Integer) index);
      }
      result = IntStream.concat(result, (IntStream) index);
    }
    return result;
  }
}
