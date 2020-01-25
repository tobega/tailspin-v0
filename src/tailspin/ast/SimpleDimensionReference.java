package tailspin.ast;

import java.util.List;
import tailspin.interpreter.Scope;

public class SimpleDimensionReference implements DimensionReference {
  private final Value simpleValue;
  private final DimensionContextKeywordResolver resolver;

  public SimpleDimensionReference(Value simpleValue,
      DimensionContextKeywordResolver resolver) {
    this.simpleValue = simpleValue;
    this.resolver = resolver;
  }

  @Override
  public Object getIndices(List<?> dimension, Object it, Scope scope) {
    try (DimensionContextKeywordResolver.Context context = resolver.with(dimension)) {
      Object value = simpleValue.getResults(it, scope);
      if (value instanceof List) {
        return ((List<?>) value)
            .stream()
                .mapToInt(
                    i ->
                        DimensionReference.resolveIndex(((Number) i).intValue(), dimension)
                            .intValue());
      }
      return DimensionReference.resolveIndex(((Number) value).intValue(), dimension);
    }
  }
}
