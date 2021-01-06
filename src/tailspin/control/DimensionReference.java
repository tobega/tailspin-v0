package tailspin.control;

import java.util.Iterator;
import tailspin.interpreter.Scope;

public interface DimensionReference {

  void set(Iterator<DimensionReference> lowerDimensions, Object parent, Object it, Scope scope,
      ResultIterator ri);

  Object get(Iterator<DimensionReference> lowerDimensions, Object parent, Object it,
      Scope scope);

  Object delete(Iterator<DimensionReference> lowerDimensions, Object parent, Object it,
      Scope scope);

  void merge(Iterator<DimensionReference> lowerDimensions, Object parent, Object it,
      Scope scope,
      ResultIterator ri);
}
