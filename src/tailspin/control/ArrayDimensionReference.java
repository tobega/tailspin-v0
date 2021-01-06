package tailspin.control;

import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import tailspin.interpreter.Scope;
import tailspin.types.TailspinArray;

public abstract class ArrayDimensionReference implements DimensionReference {
  /* Returns a stream of ints resolved according to resolveIndex */
  public abstract Object getIndices(DimensionContextKeywordResolver dimension, Object it, Scope scope);

  @Override
  public Object resolveDimensionDereference(boolean forMutation,
      Iterator<DimensionReference> lowerDimensions,
      TailspinArray array, ArrayReference.ArrayOperation bottomOperation, Object it, Scope scope) {
    ArrayReference.ArrayOperation operation =
        lowerDimensions.hasNext() ? (forMutation ? ArrayReference::getThawed : TailspinArray::get) : bottomOperation;
    Object dimensionResult;
    DimensionContextKeywordResolver resolver = new DimensionContextKeywordResolver(array.length(),
        false);
    scope.pushArithmeticContextKeywordResolver(resolver);
    try {
      Object idx = getIndices(resolver, it, scope);
      if (idx instanceof Number) {
        dimensionResult = operation.invoke(array, ((Number) idx).intValue());
      } else if (idx instanceof IntStream) {
        dimensionResult =
            ((IntStream) idx).mapToObj(i -> operation.invoke(array, ((Number) i).intValue()));
      } else {
        throw new UnsupportedOperationException(
            "Unable to dereference array by "
                + (idx == null ? "index out of bounds" : " " + idx.getClass().getName()));
      }
    } finally{ // This should probably come after all streams are resolved
      scope.popArithmeticContextKeywordResolver();
    }
    if (!lowerDimensions.hasNext()) {
      if (dimensionResult instanceof Stream) {
        return TailspinArray.value(((Stream<?>) dimensionResult).collect(Collectors.toList()));
      } else {
        return dimensionResult;
      }
    }
    DimensionReference nextDimension = lowerDimensions.next();
    if (dimensionResult instanceof Stream) {
      @SuppressWarnings("unchecked")
      Stream<TailspinArray> results = (Stream<TailspinArray>) dimensionResult;
      return TailspinArray.value(results
          .map(a -> nextDimension.resolveDimensionDereference(forMutation, lowerDimensions, a, bottomOperation, it,
              scope))
          .collect(Collectors.toList()));
    } else {
      TailspinArray previousDimension = (TailspinArray) dimensionResult;
      return nextDimension.resolveDimensionDereference(forMutation, lowerDimensions, previousDimension, bottomOperation,
          it, scope);
    }
  }
}
