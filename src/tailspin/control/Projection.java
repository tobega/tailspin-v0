package tailspin.control;

import java.util.Iterator;
import java.util.Set;
import tailspin.interpreter.Scope;

public class Projection implements DimensionReference {

  private final Set<String> keys;

  public Projection(Set<String> keys) {
    this.keys = keys;
  }

  @Override
  public Object get(Iterator<DimensionReference> lowerDimensions, Object parent, Object it,
      Scope scope) {
    return null;
  }

  @Override
  public void set(Iterator<DimensionReference> lowerDimensions, Object parent, Object it,
      Scope scope, ResultIterator ri) {
  }

  @Override
  public Object delete(Iterator<DimensionReference> lowerDimensions, Object parent, Object it,
      Scope scope) {
    return null;
  }

  @Override
  public void merge(Iterator<DimensionReference> lowerDimensions, Object parent, Object it,
      Scope scope, ResultIterator ri) {
  }
}
