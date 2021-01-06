package tailspin.control;

import java.util.Iterator;
import tailspin.interpreter.Scope;
import tailspin.types.TailspinArray;

public interface DimensionReference {

  Object resolveDimensionDereference(boolean forMutation,
      Iterator<DimensionReference> lowerDimensions,
      TailspinArray array, ArrayReference.ArrayOperation bottomOperation, Object it, Scope scope);

  void set(Iterator<DimensionReference> lowerDimensions, TailspinArray array, Object it, Scope scope,
      ResultIterator ri);

  Object get(Iterator<DimensionReference> lowerDimensions, TailspinArray array, Object it,
      Scope scope);

  Object delete(Iterator<DimensionReference> lowerDimensions, TailspinArray array, Object it,
      Scope scope);

  void merge(Iterator<DimensionReference> lowerDimensions, TailspinArray array, Object it,
      Scope scope,
      ResultIterator ri);
}
