package tailspin.control;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import tailspin.interpreter.Scope;

class ArrayReference extends Reference {

  private final Reference parent;
  private final List<DimensionReference> dimensions;
  private final DimensionContextKeywordResolver resolver;

  ArrayReference(Reference parent, List<DimensionReference> dimensions,
      DimensionContextKeywordResolver resolver) {
    this.parent = parent;
    this.dimensions = dimensions;
    this.resolver = resolver;
  }

  @Override
  public Object getValue(Object it, Scope scope) {
    Object parentValue = parent.getValue(it, scope);
    if (parentValue instanceof byte[]) {
      return createByteSlice((byte[]) parentValue, it, scope);
    }
    @SuppressWarnings("unchecked")
    List<Object> array = (List<Object>) parentValue;
    if (array == null) {
      throw new IllegalStateException("Unknown array " + parent);
    }
    return resolveDimensionDereference(0, array, List::get, it, scope);
  }

  private byte[] createByteSlice(byte[] parentValue, Object it, Scope scope) {
    if (dimensions.size() != 1) {
      throw new UnsupportedOperationException("Cannot resolve more than one dimension of bytes");
    }
    ByteArrayOutputStream result = new ByteArrayOutputStream();
    try (DimensionContextKeywordResolver.Context ctx = resolver.with(parentValue.length, true)) {
      Object idx = dimensions.get(0).getIndices(ctx, it, scope);
      if (idx instanceof Number) {
        result.write(getExtended(parentValue, ((Number) idx).intValue()));
      } else if (idx instanceof IntStream) {
        ((IntStream) idx).forEach(
            i -> result.write(getExtended(parentValue, ((Number) i).intValue())));
      } else {
        throw new UnsupportedOperationException(
            "Unable to slice bytes by "
                + (idx == null ? "index out of bounds" : " " + idx.getClass().getName()));
      }
    }
    return result.toByteArray();
  }

  private byte getExtended(byte[] a, int i) {
    if (i >= 0) {
      return a[i];
    }
    if ((a[0] & 0x80) == 0) {
      return 0;
    }
    return (byte) 0xff;
  }

  @Override
  public Object deleteValue(Object it, Scope scope) {
    if (!isMutable()) {
      throw new UnsupportedOperationException("Not deletable");
    }
    @SuppressWarnings("unchecked")
    List<Object> array = (List<Object>) parent.getValue(it, scope);
    if (array == null) {
      throw new IllegalStateException("Unknown array " + parent);
    }
    class ElementRemover implements ArrayOperation {
      TreeSet<Integer> removed = new TreeSet<>();
      List<List<Object>> arrays = new ArrayList<>();
      List<Object> currentArray = null;

      @Override
      public Object invoke(List<Object> array, int index) {
        removed.add(index);
        if (array != currentArray) {
          currentArray = array;
          arrays.add(array);
        }
        return array.get(index);
      }

      public void doRemovals() {
        for (List<Object> array : arrays) {
          for (int i : removed.descendingSet()) {
            array.remove(i);
          }
        }
      }
    }
    ElementRemover remover = new ElementRemover();
    Object result = resolveDimensionDereference(0, array, remover, it, scope);
    remover.doRemovals();
    return result;
  }

  @Override
  public boolean isMutable() {
    return parent.isMutable();
  }

  @Override
  public void setValue(boolean merge, Object value, Object it, Scope scope) {
    if (!isMutable()) {
      throw new UnsupportedOperationException("Not mutable");
    }
    ResultIterator ri = ResultIterator.wrap(value);
    @SuppressWarnings("unchecked")
    List<Object> array = (List<Object>) parent.getValue(it, scope);
    if (array == null) {
      throw new IllegalStateException("Unknown array " + parent);
    }
    if (merge) {
      class Merger implements ArrayOperation {

        int invocations = 0;
        List<Object> lastArray;
        int lastIndex;

        @Override
        public Object invoke(List<Object> array, int index) {
          invocations++;
          lastArray = array;
          lastIndex = index;
          collect(Objects.requireNonNull(ri.getNextResult()), array.get(index));
          return null;
        }

        void resolveSingleElementMergeMany() {
          if (invocations == 1) {
            collect(ri, lastArray.get(lastIndex));
          }
        }
      }
      Merger merger = new Merger();
      resolveDimensionDereference(0, array, merger, it, scope);
      merger.resolveSingleElementMergeMany();
    } else {
      resolveDimensionDereference(0, array,
          (a, i) -> a.set(i, copy(Objects.requireNonNull(ri.getNextResult()))), it, scope);
    }
  }

  @Override
  public String toString() {
    return parent.toString() + "(" + dimensions.stream().map(Object::toString)
        .collect(Collectors.joining(";")) + ")";
  }

  private interface ArrayOperation {

    Object invoke(List<Object> array, int index);
  }

  private Object resolveDimensionDereference(int currentDereference, List<Object> array,
      ArrayOperation bottomOperation, Object it, Scope scope) {
    ArrayOperation operation =
        currentDereference == dimensions.size() - 1 ? bottomOperation : List::get;
    DimensionReference dimensionReference = dimensions.get(currentDereference);
    Object dimensionResult;
    try (DimensionContextKeywordResolver.Context ctx = resolver.with(array.size(), false)) {
      Object idx = dimensionReference.getIndices(ctx, it, scope);
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
      if (currentDereference == dimensions.size() - 1) {
        if (dimensionResult instanceof Stream) {
          return ((Stream<?>) dimensionResult).collect(Collectors.toList());
        } else {
          return dimensionResult;
        }
      }
    }
    if (dimensionResult instanceof Stream) {
      @SuppressWarnings("unchecked")
      Stream<List<Object>> results = (Stream<List<Object>>) dimensionResult;
      return results
          .map(a -> resolveDimensionDereference(currentDereference + 1, a, bottomOperation, it,
              scope))
          .collect(Collectors.toList());
    } else {
      @SuppressWarnings("unchecked")
      List<Object> previousDimension = (List<Object>) dimensionResult;
      return resolveDimensionDereference(currentDereference + 1, previousDimension, bottomOperation,
          it, scope);
    }
  }
}
