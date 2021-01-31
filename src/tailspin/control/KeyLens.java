package tailspin.control;

import java.util.List;
import tailspin.interpreter.Scope;
import tailspin.types.Structure;

public class KeyLens implements LensDimension {

  private final String key;

  public KeyLens(String key) {
    this.key = key;
  }

  @Override
  public void set(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope, ResultIterator ri) {
    throw new UnsupportedOperationException("Not yet implemented set on KeyReference");
  }

  @Override
  public Object get(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope) {
    Object value = ((Structure) parent).get(key);
    if (!lowerDimensions.isEmpty()) {
      LensDimension next = lowerDimensions.get(0);
      return next.get(lowerDimensions.subList(1, lowerDimensions.size()), value, it, scope);
    } else {
      return value;
    }
  }

  @Override
  public Object delete(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope) {
    throw new UnsupportedOperationException("Not yet implemented delete on KeyReference");
  }

  @Override
  public void merge(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope, ResultIterator ri) {
    throw new UnsupportedOperationException("Not yet implemented merge on KeyReference");
  }
}
