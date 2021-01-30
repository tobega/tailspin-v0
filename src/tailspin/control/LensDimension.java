package tailspin.control;

import java.util.Iterator;
import tailspin.interpreter.Scope;

public interface LensDimension {

  void set(Iterator<LensDimension> lowerDimensions, Object parent, Object it, Scope scope,
      ResultIterator ri);

  Object get(Iterator<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope);

  Object delete(Iterator<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope);

  void merge(Iterator<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope,
      ResultIterator ri);
}
