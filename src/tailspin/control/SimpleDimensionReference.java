package tailspin.control;

import tailspin.interpreter.Scope;
import tailspin.types.TailspinArray;

public class SimpleDimensionReference extends ArrayDimensionReference {
  private final Value simpleValue;

  public SimpleDimensionReference(Value simpleValue) {
    this.simpleValue = simpleValue;
  }

  @Override
  public Object getIndices(DimensionContextKeywordResolver context, Object it, Scope scope) {
    Object value = simpleValue.getResults(it, scope);
    if (value instanceof TailspinArray) {
      return ((TailspinArray) value)
          .stream()
              .mapToInt(
                  i ->
                      context.resolveIndex(((Number) i).intValue())
                          .intValue());
    }
    return context.resolveIndex(((Number) value).intValue());
  }
}
