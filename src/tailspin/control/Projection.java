package tailspin.control;

import java.util.Iterator;
import java.util.Set;
import tailspin.interpreter.Scope;
import tailspin.types.Relation;

public class Projection implements DimensionReference {

  private final Set<String> keys;

  public Projection(Set<String> keys) {
    this.keys = keys;
  }

  @Override
  public Object get(Iterator<DimensionReference> lowerDimensions, Object parent, Object it,
      Scope scope) {
    if (lowerDimensions.hasNext())
      throw new UnsupportedOperationException("Projection " + keys + " cannot extend to lower dimensions");
    Relation relation = (Relation) parent;
    return relation.project(keys);
  }

  @Override
  public void set(Iterator<DimensionReference> lowerDimensions, Object parent, Object it,
      Scope scope, ResultIterator ri) {
    throw new UnsupportedOperationException("Cannot set values on a projection (tried " + keys + ")");
  }

  @Override
  public Object delete(Iterator<DimensionReference> lowerDimensions, Object parent, Object it,
      Scope scope) {
    throw new UnsupportedOperationException("Cannot delete values on a projection (tried " + keys + ")");
  }

  @Override
  public void merge(Iterator<DimensionReference> lowerDimensions, Object parent, Object it,
      Scope scope, ResultIterator ri) {
    throw new UnsupportedOperationException("Cannot merge values on a projection (tried " + keys + ")");
  }
}
