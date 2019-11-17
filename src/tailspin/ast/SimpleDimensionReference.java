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
      ResultIterator.QueueResult result = new ResultIterator.QueueResult();
      result.append(Deconstructor.INSTANCE.getDeconstructedStream(value));
      for (int i = 1; i < deconstructorCount; i++) {
        ResultIterator ri = result;
        ResultIterator.QueueResult qr = new ResultIterator.QueueResult();
        ResultIterator.apply(v -> qr.append(Deconstructor.INSTANCE.getDeconstructedStream(v)), ri);
        result = qr;
      }
      return new ResultIterator.Decorated(result,
          i -> DimensionReference.resolveIndex(((Number) i).intValue(), size));
    } else if (autoDeconstructArray && value instanceof List) {
      return new ResultIterator.Decorated(ResultIterator.ofIterator(((List<?>) value).iterator()),
        i -> DimensionReference.resolveIndex(((Number) i).intValue(), size));
    }
    return DimensionReference.resolveIndex(((Number) value).intValue(), size);
  }
}
