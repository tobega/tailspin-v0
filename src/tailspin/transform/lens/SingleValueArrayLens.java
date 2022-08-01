package tailspin.transform.lens;

import tailspin.control.DimensionContextKeywordResolver;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.TailspinArray;

public class SingleValueArrayLens extends ArrayLens {
  private final Value simpleValue;

  public SingleValueArrayLens(Value simpleValue) {
    this.simpleValue = simpleValue;
  }

  @Override
  public Object getNativeIndices(DimensionContextKeywordResolver context, Object it, Scope scope) {
    Object value = simpleValue.getResults(it, scope);
    if (value instanceof TailspinArray) {
      return ((TailspinArray) value)
          .stream()
              .mapToInt(
                  context::resolveNativeIndex);
    }
    return context.resolveNativeIndex(value);
  }
}
