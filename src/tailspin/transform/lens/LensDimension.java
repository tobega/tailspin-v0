package tailspin.transform.lens;

import java.util.List;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;

public interface LensDimension {
  class EmptyLensAtBottomException extends Exception {}

  void set(List<LensDimension> lowerDimensions, Object parent, Object it, Scope scope,
      ResultIterator ri) throws EmptyLensAtBottomException;

  Object get(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope);

  Object delete(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope) throws EmptyLensAtBottomException;

  void merge(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope, ResultIterator ri) throws EmptyLensAtBottomException;
}
