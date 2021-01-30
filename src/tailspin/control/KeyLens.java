package tailspin.control;

import java.util.Iterator;
import tailspin.interpreter.Scope;
import tailspin.types.Structure;

public class KeyLens implements LensDimension {

  private final String key;

  public KeyLens(String key) {
    this.key = key;
  }

  @Override
  public void set(Iterator<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope, ResultIterator ri) {
    throw new UnsupportedOperationException("Not yet implemented set on KeyReference");
  }

  @Override
  public Object get(Iterator<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope) {
    if (lowerDimensions.hasNext()) {
      throw new UnsupportedOperationException("Not yet implemented digging into key reference");
    } else {
      return ((Structure) parent).get(key);
    }
  }

  @Override
  public Object delete(Iterator<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope) {
    throw new UnsupportedOperationException("Not yet implemented delete on KeyReference");
  }

  @Override
  public void merge(Iterator<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope, ResultIterator ri) {
    throw new UnsupportedOperationException("Not yet implemented merge on KeyReference");
  }
}
