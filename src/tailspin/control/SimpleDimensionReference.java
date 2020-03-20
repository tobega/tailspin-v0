package tailspin.control;

import java.util.List;
import tailspin.interpreter.Scope;

public class SimpleDimensionReference implements DimensionReference {
  private final Value simpleValue;

  public SimpleDimensionReference(Value simpleValue) {
    this.simpleValue = simpleValue;
  }

  @Override
  public Object getIndices(DimensionContextKeywordResolver.Context context, Object it, Scope scope) {
    Object value = simpleValue.getResults(it, scope);
    if (value instanceof List) {
      return ((List<?>) value)
          .stream()
              .mapToInt(
                  i ->
                      context.resolveIndex(((Number) i).intValue())
                          .intValue());
    }
    return context.resolveIndex(((Number) value).intValue());
  }
}
