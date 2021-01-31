package tailspin.control;

import java.util.List;
import tailspin.interpreter.Scope;
import tailspin.types.Freezable;
import tailspin.types.Structure;

public class KeyLens implements LensDimension {

  private final String key;

  public KeyLens(String key) {
    this.key = key;
  }

  @Override
  public void set(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope, ResultIterator ri) {
    if (lowerDimensions.isEmpty()) {
      Structure structure = (Structure) parent;
      structure.put(key, ri.getNextResult());
    } else {
      throw new UnsupportedOperationException("Not yet implemented deep set on KeyLens");
    }
  }

  @Override
  public Object get(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope) {
    Object value = ((Structure) parent).get(key);
    if (lowerDimensions.isEmpty()) {
      return value;
    }
    LensDimension next = lowerDimensions.get(0);
    return next.get(lowerDimensions.subList(1, lowerDimensions.size()), value, it, scope);
  }

  @Override
  public Object delete(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope) {
    Structure structure = (Structure) parent;
    if (lowerDimensions.isEmpty()) {
      return structure.remove(key);
    }
    Freezable<?> child = (Freezable<?>) structure.get(key);
    if (!child.isThawed()) {
      child = child.thawedCopy();
      structure.put(key, child);
    }
    LensDimension next = lowerDimensions.get(0);
    return next.delete(lowerDimensions.subList(1, lowerDimensions.size()), child, it, scope);
  }

  @Override
  public void merge(List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope, ResultIterator ri) {
    throw new UnsupportedOperationException("Not yet implemented merge on KeyReference");
  }
}
