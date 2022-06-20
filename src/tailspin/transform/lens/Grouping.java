package tailspin.transform.lens;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import tailspin.control.Deconstructor;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.types.Relation;
import tailspin.types.Structure;
import tailspin.types.TailspinArray;

public class Grouping implements LensDimension {

  private final Expression categories;
  private final List<CollectedValue> collectedValues;

  public Grouping(Expression categories, List<CollectedValue> collectedValues) {
    this.categories = categories;
    this.collectedValues = collectedValues;
  }

  @Override
  public void set(List<LensDimension> lowerDimensions, Object parent, Object it, Scope scope,
      ResultIterator ri) {
    throw new UnsupportedOperationException("Cannot set values on a grouping");
  }

  @Override
  public Object get(List<LensDimension> lowerDimensions, Object parent, Object it, Scope scope) {
    if (!lowerDimensions.isEmpty())
      throw new UnsupportedOperationException("Grouping cannot extend to lower dimensions");
    Map<Structure, List<CollectedValue.Accumulator>> accumulators = new HashMap<>();
    ResultIterator.forEach(Deconstructor.INSTANCE.getResults(categories.getResults(it, scope),scope),
        c -> accumulators.put((Structure) c, collectedValues.stream()
            .map(v -> v.newAccumulator(it, scope)).collect(Collectors.toList())));
    ResultIterator.forEach(Deconstructor.INSTANCE.getResults(parent, scope), s -> {
      for (Map.Entry<Structure, List<CollectedValue.Accumulator>> acc : accumulators.entrySet()) {
        if (((Structure) s).contains(acc.getKey())) {
          acc.getValue().forEach(a -> a.accumulate(s));
        }
      }
    });
    if (parent instanceof Relation) {
      return new Relation(
          accumulators.entrySet().stream()
              .map(
                  e -> {
                    Structure result = e.getKey().thawedCopy();
                    e.getValue().forEach(a -> result.put(a.key(), scope.getLocalDictionary().checkDataDefinition(a.key(), a.result(), scope)));
                    return result;
                  })
              .collect(Collectors.toList()));
    }
    if (parent instanceof TailspinArray) {
      return TailspinArray.value(
          accumulators.entrySet().stream()
              .map(
                  e -> {
                    Structure result = e.getKey().thawedCopy();
                    e.getValue().forEach(a -> result.put(a.key(), scope.getLocalDictionary().checkDataDefinition(a.key(), a.result(), scope)));
                    return result;
                  })
              .collect(Collectors.toList()));
    }
    throw new IllegalStateException("Cannot group " + parent);
  }

  @Override
  public Object delete(List<LensDimension> lowerDimensions, Object parent, Object it, Scope scope) {
    throw new UnsupportedOperationException("Cannot delete values on a grouping");
  }

  @Override
  public void merge(List<LensDimension> lowerDimensions, Object parent, Object it, Scope scope,
      ResultIterator ri) {
    throw new UnsupportedOperationException("Cannot merge values on a grouping");
  }
}
