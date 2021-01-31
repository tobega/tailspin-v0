package tailspin.control;

import java.util.List;
import tailspin.interpreter.Scope;
import tailspin.literals.KeyValueExpression;
import tailspin.types.Relation;

public class Projection implements LensDimension {

  private final List<KeyValueExpression> projections;

  public Projection(List<KeyValueExpression> projections) {
    this.projections = projections;
  }

  @Override
  public Object get(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope) {
    if (!lowerDimensions.isEmpty())
      throw new UnsupportedOperationException("Projection cannot extend to lower dimensions");
    Relation relation = (Relation) parent;
    return relation.project(projections, it, scope);
  }

  @Override
  public void set(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope, ResultIterator ri) {
    throw new UnsupportedOperationException("Cannot set values on a projection");
  }

  @Override
  public Object delete(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope) {
    throw new UnsupportedOperationException("Cannot delete values on a projection");
  }

  @Override
  public void merge(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope, ResultIterator ri) {
    throw new UnsupportedOperationException("Cannot merge values on a projection");
  }
}
