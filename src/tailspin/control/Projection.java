package tailspin.control;

import java.util.Iterator;
import java.util.Set;
import tailspin.interpreter.Scope;
import tailspin.types.TailspinArray;

public class Projection implements DimensionReference {

  private final Set<String> keys;

  public Projection(Set<String> keys) {
    this.keys = keys;
  }

  @Override
  public Object resolveDimensionDereference(boolean forMutation,
      Iterator<DimensionReference> lowerDimensions, TailspinArray array,
      ArrayReference.ArrayOperation bottomOperation, Object it, Scope scope) {
    return null;
  }

  @Override
  public Object get(Iterator<DimensionReference> lowerDimensions, TailspinArray array, Object it,
      Scope scope) {
    return null;
  }

  @Override
  public void set(Iterator<DimensionReference> lowerDimensions, TailspinArray array, Object it,
      Scope scope, ResultIterator ri) {
  }

  @Override
  public Object delete(Iterator<DimensionReference> lowerDimensions, TailspinArray array, Object it,
      Scope scope) {
    return null;
  }

  @Override
  public void merge(Iterator<DimensionReference> lowerDimensions, TailspinArray array, Object it,
      Scope scope, ResultIterator ri) {
  }
}
