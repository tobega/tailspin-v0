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
import tailspin.types.Freezable;
import tailspin.types.TailspinArray;

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
    TailspinArray array = (TailspinArray) parentValue;
    if (array == null) {
      throw new IllegalStateException("Unknown array " + parent);
    }
    return resolveDimensionDereference(false, 0, array, TailspinArray::get, it, scope);
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
    if (i > 0) {
      return a[i-1];
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
    TailspinArray array = (TailspinArray) parent.getValue(it, scope);
    if (array == null) {
      throw new IllegalStateException("Unknown array " + parent);
    }
    if (!array.isThawed()) {
      array = array.thawedCopy();
      parent.setValue(false, array, it, scope);
    }
    class ElementRemover implements ArrayOperation {
      TreeSet<Integer> removed = new TreeSet<>();
      List<TailspinArray> arrays = new ArrayList<>();
      TailspinArray currentArray = null;

      @Override
      public Object invoke(TailspinArray array, int index) {
        removed.add(index);
        if (array != currentArray) {
          currentArray = array;
          arrays.add(array);
        }
        return array.get(index);
      }

      public void doRemovals() {
        for (TailspinArray array : arrays) {
          for (int i : removed.descendingSet()) {
            array.remove(i);
          }
        }
      }
    }
    ElementRemover remover = new ElementRemover();
    Object result = resolveDimensionDereference(true, 0, array, remover, it, scope);
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
    TailspinArray array = (TailspinArray) parent.getValue(it, scope);
    if (array == null) {
      throw new IllegalStateException("Unknown array " + parent);
    }
    if (!array.isThawed()) {
      array = array.thawedCopy();
      parent.setValue(false, array, it, scope);
    }
    if (merge) {
      class Merger implements ArrayOperation {

        int invocations = 0;
        TailspinArray lastArray;
        int lastIndex;

        @Override
        public Object invoke(TailspinArray array, int index) {
          invocations++;
          lastArray = array;
          lastIndex = index;
          Freezable<?> collector = (Freezable<?>) array.get(index);
          if (!collector.isThawed()) {
            collector = collector.thawedCopy();
            array.set(index, collector);
          }
          collect(Objects.requireNonNull(ri.getNextResult()), collector);
          return null;
        }

        void resolveSingleElementMergeMany() {
          if (invocations == 1) {
            Freezable<?> collector = (Freezable<?>) lastArray.get(lastIndex);
            if (!collector.isThawed()) {
              collector = collector.thawedCopy();
              lastArray.set(lastIndex, collector);
            }
            collect(ri, collector);
          }
        }
      }
      Merger merger = new Merger();
      resolveDimensionDereference(true, 0, array, merger, it, scope);
      merger.resolveSingleElementMergeMany();
    } else {
      resolveDimensionDereference(true, 0, array,
          (a, i) -> a.set(i, Objects.requireNonNull(ri.getNextResult())), it, scope);
    }
  }

  @Override
  public String toString() {
    return parent.toString() + "(" + dimensions.stream().map(Object::toString)
        .collect(Collectors.joining(";")) + ")";
  }

  private interface ArrayOperation {
    Object invoke(TailspinArray array, int index);
  }

  private static TailspinArray getThawed(TailspinArray array, int index) {
    TailspinArray next = (TailspinArray) array.get(index);
    if (!next.isThawed()) {
      next = next.thawedCopy();
      array.set(index, next);
    }
    return next;
  }

  private Object resolveDimensionDereference(boolean forMutation, int currentDereference, TailspinArray array,
      ArrayOperation bottomOperation, Object it, Scope scope) {
    ArrayOperation operation =
        currentDereference == dimensions.size() - 1 ? bottomOperation
            : (forMutation ? ArrayReference::getThawed : TailspinArray::get);
    DimensionReference dimensionReference = dimensions.get(currentDereference);
    Object dimensionResult;
    try (DimensionContextKeywordResolver.Context ctx = resolver.with(array.length(), false)) {
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
          return TailspinArray.value(((Stream<?>) dimensionResult).collect(Collectors.toList()));
        } else {
          return dimensionResult;
        }
      }
    }
    if (dimensionResult instanceof Stream) {
      @SuppressWarnings("unchecked")
      Stream<TailspinArray> results = (Stream<TailspinArray>) dimensionResult;
      return results
          .map(a -> resolveDimensionDereference(forMutation, currentDereference + 1, a, bottomOperation, it,
              scope))
          .collect(Collectors.toList());
    } else {
      TailspinArray previousDimension = (TailspinArray) dimensionResult;
      return resolveDimensionDereference(forMutation, currentDereference + 1, previousDimension, bottomOperation,
          it, scope);
    }
  }
}
