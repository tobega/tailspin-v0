package tailspin.ast;

import java.util.List;
import tailspin.interpreter.Scope;

public class SimpleDimensionReference implements DimensionReference {
  private final Value simpleValue;

  public SimpleDimensionReference(Value simpleValue) {
    this.simpleValue = simpleValue;
  }

  @Override
  public Object getIndices(List<?> dimension, Object it, Scope scope) {
    Object value = simpleValue.getResults(it, scope);
    if (value instanceof List) {
      return ((List<?>) value).stream().mapToInt(i -> DimensionReference.resolveIndex(((Number) i).intValue(), dimension).intValue());
    }
    return DimensionReference.resolveIndex(((Number) value).intValue(), dimension);
  }
}
