package tailspin.transform.lens;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import tailspin.control.DimensionContextKeywordResolver;
import tailspin.control.Reference;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.types.Freezable;
import tailspin.types.TailspinArray;

public abstract class ArrayLens implements LensDimension {

  public static Freezable<?> getThawed(TailspinArray array, int index) {
    Freezable<?> next = (Freezable<?>) array.get(index);
    if (!next.isThawed()) {
      next = next.thawedCopy();
      array.set(index, next);
    }
    return next;
  }

  /* Returns a stream of ints resolved according to resolveIndex */
  public abstract Object getIndices(DimensionContextKeywordResolver dimension, Object it, Scope scope);

  private interface ArrayOperation {
    Object invoke(TailspinArray array, int index);
  }

  private Object resolveResult(Object dimensionResult) {
    if (dimensionResult instanceof Stream) {
      return TailspinArray.value(((Stream<?>) dimensionResult).collect(Collectors.toList()));
    } else {
      return dimensionResult;
    }
  }

  private Object projectArray(TailspinArray array, Object it, Scope scope, ArrayOperation operation) {
    DimensionContextKeywordResolver resolver = new DimensionContextKeywordResolver(array.length(),
        false);
    scope.pushArithmeticContextKeywordResolver(resolver);
    try {
      Object idx = getIndices(resolver, it, scope);
      if (idx instanceof Number) {
        return operation.invoke(array, ((Number) idx).intValue());
      } else if (idx instanceof IntStream) {
        return
            ((IntStream) idx).mapToObj(i -> operation.invoke(array, ((Number) i).intValue()));
      } else {
        throw new UnsupportedOperationException(
            "Unable to dereference array by "
                + (idx == null ? "index out of bounds" : " " + idx.getClass().getName()));
      }
    } finally{ // This should probably come after all streams are resolved
      scope.popArithmeticContextKeywordResolver();
    }
  }

  @FunctionalInterface
  interface LensOperation {
    Object invoke(Object value);
  }

  private Object retrieve(LensOperation operation, Object dimensionResult) {
    if (dimensionResult instanceof Stream) {
      @SuppressWarnings("unchecked")
      Stream<Object> results = (Stream<Object>) dimensionResult;
      return TailspinArray.value(results
          .map(operation::invoke)
          .collect(Collectors.toList()));
    } else {
      return operation.invoke(dimensionResult);
    }
  }

  @FunctionalInterface
  interface LensMutation {
    void invoke(Object value);
  }

  private void mutate(LensMutation mutation, Object dimensionResult) {
    if (dimensionResult instanceof Stream) {
      @SuppressWarnings("unchecked")
      Stream<TailspinArray> results = (Stream<TailspinArray>) dimensionResult;
      results.forEach(mutation::invoke);
    } else {
      mutation.invoke(dimensionResult);
    }
  }

  @Override
  public Object get(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope) {
    Object dimensionResult = projectArray((TailspinArray) parent, it, scope, TailspinArray::get);
    if (lowerDimensions.isEmpty()) {
      return resolveResult(dimensionResult);
    }
    LensDimension next = lowerDimensions.get(0);
    return retrieve(
        a -> next.get(lowerDimensions.subList(1, lowerDimensions.size()), a, it, scope),
        dimensionResult);
  }

  @Override
  public void set(List<LensDimension> lowerDimensions, Object parent, Object it, Scope scope,
      ResultIterator ri) {
    if (!lowerDimensions.isEmpty()) {
      Object dimensionResult = projectArray((TailspinArray) parent, it, scope, ArrayLens::getThawed);
      LensDimension next = lowerDimensions.get(0);
      AtomicBoolean succeeded = new AtomicBoolean(true);
      mutate(a -> {
        try {
          next.set(lowerDimensions.subList(1, lowerDimensions.size()), a, it, scope, ri);
        } catch (EmptyLensAtBottomException e) {
          succeeded.set(false);
        }
      }, dimensionResult);
      if (succeeded.get()) return; // else fall through and update this
    }
    Object dimensionResult = projectArray((TailspinArray) parent, it, scope, (a, i) -> a.set(i, Objects.requireNonNull(ri.getNextResult())));
    if (dimensionResult != null) ((Stream<?>) dimensionResult).forEach(foo -> {});
  }

  @Override
  public Object delete(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope) {
    if (!lowerDimensions.isEmpty()) {
      Object dimensionResult =
          projectArray((TailspinArray) parent, it, scope, ArrayLens::getThawed);
      LensDimension next = lowerDimensions.get(0);
      AtomicBoolean succeeded = new AtomicBoolean(true);
      Object result = retrieve(
          a -> {
            try {
              return next.delete(lowerDimensions.subList(1, lowerDimensions.size()), a, it, scope);
            } catch (EmptyLensAtBottomException e) {
              succeeded.set(false);
              return null;
            }
          },
          dimensionResult);
      if (succeeded.get()) return result;
    }
    ElementRemover remover = new ElementRemover();
    Object result = resolveResult(projectArray((TailspinArray) parent, it, scope, remover));
    remover.doRemovals();
    return result;
  }

  private static class ElementRemover implements ArrayOperation {
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


  @Override
  public void merge(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope,
      ResultIterator ri) {
    if (!lowerDimensions.isEmpty()) {
      Object dimensionResult = projectArray((TailspinArray) parent, it, scope, ArrayLens::getThawed);
      LensDimension next = lowerDimensions.get(0);
      AtomicBoolean succeeded = new AtomicBoolean(true);
      mutate(
          a -> {
            try {
              next.merge(lowerDimensions.subList(1, lowerDimensions.size()), a, it, scope, ri);
            } catch (EmptyLensAtBottomException e) {
              succeeded.set(false);
            }
          },
          dimensionResult);
      if (succeeded.get()) return;
    }
    Merger merger = new Merger(ri);
    Object dimensionResult = projectArray((TailspinArray) parent, it, scope, merger);
    if (dimensionResult != null) ((Stream<?>) dimensionResult).forEach(foo -> {});
    merger.resolveSingleElementMergeMany();
  }

  private static class Merger implements ArrayOperation {

    private final ResultIterator ri;
    int invocations = 0;
    TailspinArray lastArray;
    int lastIndex;

    public Merger(ResultIterator ri) {
      this.ri = ri;
    }

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
}
