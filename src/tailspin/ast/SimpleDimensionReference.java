package tailspin.ast;

import java.util.List;
import java.util.stream.Stream;
import tailspin.interpreter.Scope;

public class SimpleDimensionReference implements DimensionReference {
  private final Value simpleValue;
  private final boolean autoDeconstructArray;
  private final int deconstructorCount;

  public SimpleDimensionReference(Value simpleValue, boolean autoDeconstructArray,
      int deconstructorCount) {
    this.simpleValue = simpleValue;
    this.autoDeconstructArray = autoDeconstructArray;
    this.deconstructorCount = deconstructorCount;
  }

  @Override
  public Object getIndices(int size, Object it, Scope scope) {
    Object value = simpleValue.getResults(it, scope);
    if (deconstructorCount != 0) {
      // TODO: optimize to more direct result iterators
      Stream<?> result = Stream.of(value);
      for (int i = 0; i < deconstructorCount; i++) {
        result = result.flatMap(v -> Expression.queueOf(Deconstructor.INSTANCE.getDeconstructedStream(v)).stream());
      }
      return result.map(i -> DimensionReference.resolveIndex(((Number) i).intValue(), size));
    } else if (autoDeconstructArray && value instanceof List) {
      return ((List<?>) value).stream().map(i -> DimensionReference.resolveIndex(((Number) i).intValue(), size));
    }
    return DimensionReference.resolveIndex(((Number) value).intValue(), size);
  }
}