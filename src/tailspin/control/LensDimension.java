package tailspin.control;

import java.util.List;
import tailspin.interpreter.Scope;

public interface LensDimension {

  void set(List<LensDimension> lowerDimensions, Object parent, Object it, Scope scope,
      ResultIterator ri);

  Object get(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope);

  Object delete(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope);

  void merge(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope,
      ResultIterator ri);
}
