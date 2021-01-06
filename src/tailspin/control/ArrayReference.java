package tailspin.control;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import tailspin.interpreter.Scope;
import tailspin.types.Freezable;
import tailspin.types.TailspinArray;

class ArrayReference extends Reference {

  private final Reference parent;
  private final List<DimensionReference> dimensions;

  ArrayReference(Reference parent, List<DimensionReference> dimensions) {
    this.parent = parent;
    this.dimensions = dimensions;
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
    Iterator<DimensionReference> lowerDimensions = dimensions.iterator();
    return lowerDimensions.next().resolveDimensionDereference(false, lowerDimensions, array, TailspinArray::get, it, scope);
  }

  private byte[] createByteSlice(byte[] parentValue, Object it, Scope scope) {
    if (dimensions.size() != 1) {
      throw new UnsupportedOperationException("Cannot resolve more than one dimension of bytes");
    }
    ByteArrayOutputStream result = new ByteArrayOutputStream();
    DimensionContextKeywordResolver resolver = new DimensionContextKeywordResolver(parentValue.length,
        true);
    scope.pushArithmeticContextKeywordResolver(resolver);
    try {
      Object idx = ((ArrayDimensionReference) dimensions.get(0)).getIndices(resolver, it, scope);
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
    } finally{
      scope.popArithmeticContextKeywordResolver();
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
    Iterator<DimensionReference> lowerDimensions = dimensions.iterator();
    Object result = lowerDimensions.next().resolveDimensionDereference(true, lowerDimensions, array, remover, it, scope);
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
    Iterator<DimensionReference> lowerDimensions = dimensions.iterator();
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
      lowerDimensions.next().resolveDimensionDereference(true, lowerDimensions, array, merger, it, scope);
      merger.resolveSingleElementMergeMany();
    } else {
      lowerDimensions.next().resolveDimensionDereference(true, lowerDimensions, array,
          (a, i) -> a.set(i, Objects.requireNonNull(ri.getNextResult())), it, scope);
    }
  }

  @Override
  public String toString() {
    return parent.toString() + "(" + dimensions.stream().map(Object::toString)
        .collect(Collectors.joining(";")) + ")";
  }

  public interface ArrayOperation {
    Object invoke(TailspinArray array, int index);
  }

  public static TailspinArray getThawed(TailspinArray array, int index) {
    TailspinArray next = (TailspinArray) array.get(index);
    if (!next.isThawed()) {
      next = next.thawedCopy();
      array.set(index, next);
    }
    return next;
  }
}
