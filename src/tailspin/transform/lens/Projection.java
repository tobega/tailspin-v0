package tailspin.transform.lens;

import java.util.List;
import java.util.stream.Collectors;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.literals.KeyValueExpression;
import tailspin.types.Relation;
import tailspin.types.Structure;
import tailspin.types.TailspinArray;

public class Projection implements LensDimension {

  private final List<KeyValueExpression> projections;

  public Projection(List<KeyValueExpression> projections) {
    this.projections = projections;
  }

  @Override
  public Object get(List<LensDimension> lowerDimensions, Object parent, Object it, Scope scope) {
    if (!lowerDimensions.isEmpty())
      throw new UnsupportedOperationException("Projection cannot extend to lower dimensions");
    if (parent instanceof Relation) {
      Relation relation = (Relation) parent;
      return relation.project(projections, it, scope);
    } else if (parent instanceof TailspinArray) {
      TailspinArray array = (TailspinArray) parent;
      return TailspinArray.value(array.stream().map(s -> get(lowerDimensions, s, it, scope)).collect(
          Collectors.toList()));
    } else {
      Structure structure = (Structure) parent;
      return structure.project(projections, it, scope);
    }
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
