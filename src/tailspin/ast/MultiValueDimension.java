package tailspin.ast;

import java.util.List;
import tailspin.interpreter.Scope;

public class MultiValueDimension implements DimensionReference {
  private final List<DimensionReference> values;

  public MultiValueDimension(List<DimensionReference> values) {
    this.values = values;
  }

  @Override
  public Object getIndices(int size, Object it, Scope scope) {
    Object result = null;
    for (DimensionReference value : values) {
      Object index = value.getIndices(size, it, scope);
      result = ResultIterator.resolveResult(result, index);
    }
    return result;
  }
}
