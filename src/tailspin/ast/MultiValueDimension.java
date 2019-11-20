package tailspin.ast;

import java.util.List;
import java.util.stream.Stream;
import tailspin.interpreter.Scope;

public class MultiValueDimension implements DimensionReference {
  private final List<DimensionReference> values;

  public MultiValueDimension(List<DimensionReference> values) {
    this.values = values;
  }

  @Override
  public Object getIndices(int size, Object it, Scope scope) {
    Stream result = Stream.empty();
    for (DimensionReference value : values) {
      Object index = value.getIndices(size, it, scope);
      if (!(index instanceof Stream)) {
        index = Stream.of(index);
      }
      result = Stream.concat(result, (Stream) index);
    }
    return result;
  }
}
