package tailspin.control;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import tailspin.interpreter.Scope;
import tailspin.types.Freezable;
import tailspin.types.TailspinArray;

public abstract class ArrayLens implements LensDimension {
  /* Returns a stream of ints resolved according to resolveIndex */
  public abstract Object getIndices(DimensionContextKeywordResolver dimension, Object it, Scope scope);

  private interface ArrayOperation {
    Object invoke(TailspinArray array, int index);
  }

  private Object resolveDimensionDereference(boolean forMutation,
      Iterator<LensDimension> lowerDimensions,
      TailspinArray array, ArrayOperation bottomOperation, Object it, Scope scope) {
    ArrayOperation operation =
        lowerDimensions.hasNext() ? (forMutation ? LensReference::getThawed : TailspinArray::get) : bottomOperation;
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
    ArrayLens nextDimension = (ArrayLens) lowerDimensions.next();
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

  @Override
  public Object get(Iterator<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope) {
    return resolveDimensionDereference(false, lowerDimensions, (TailspinArray) parent, TailspinArray::get, it, scope);
  }

  @Override
  public void set(Iterator<LensDimension> lowerDimensions, Object parent, Object it, Scope scope,
      ResultIterator ri) {
    resolveDimensionDereference(true, lowerDimensions, (TailspinArray) parent,
        (a, i) -> a.set(i, Objects.requireNonNull(ri.getNextResult())), it, scope);
  }

  @Override
  public Object delete(Iterator<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope) {
    class ElementRemover implements ArrayOperation {
      final TreeSet<Integer> removed = new TreeSet<>();
      final List<TailspinArray> arrays = new ArrayList<>();
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
    Object result = resolveDimensionDereference(true, lowerDimensions, (TailspinArray) parent, remover, it, scope);
    remover.doRemovals();
    return result;
  }

  @Override
  public void merge(Iterator<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope,
      ResultIterator ri) {
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
        Reference.collect(Objects.requireNonNull(ri.getNextResult()), collector);
        return null;
      }

      void resolveSingleElementMergeMany() {
        if (invocations == 1) {
          Freezable<?> collector = (Freezable<?>) lastArray.get(lastIndex);
          if (!collector.isThawed()) {
            collector = collector.thawedCopy();
            lastArray.set(lastIndex, collector);
          }
          Reference.collect(ri, collector);
        }
      }
    }
    Merger merger = new Merger();
    resolveDimensionDereference(true, lowerDimensions, (TailspinArray) parent, merger, it, scope);
    merger.resolveSingleElementMergeMany();
  }
}
