package tailspin.transform.lens;

import java.util.List;
import tailspin.control.Reference;
import tailspin.control.ResultIterator;
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
    Structure structure = (Structure) parent;
    if (!lowerDimensions.isEmpty()) {
      Freezable<?> child = (Freezable<?>) structure.get(key);
      if (!child.isThawed()) {
        child = child.thawedCopy();
        structure.put(key, child);
      }
      LensDimension next = lowerDimensions.get(0);
      try {
        next.set(lowerDimensions.subList(1, lowerDimensions.size()), child, it, scope, ri);
        return;
      } catch (EmptyLensAtBottomException e) {
        // fall through
      }
    }
    Object value = ri.getNextResult();
    value = scope.getLocalDictionary().checkDataDefinition(key, value, scope);
    structure.put(key, value);
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
    if (!lowerDimensions.isEmpty()) {
      Freezable<?> child = (Freezable<?>) structure.get(key);
      if (!child.isThawed()) {
        child = child.thawedCopy();
        structure.put(key, child);
      }
      LensDimension next = lowerDimensions.get(0);
      try {
        return next.delete(lowerDimensions.subList(1, lowerDimensions.size()), child, it, scope);
      } catch (EmptyLensAtBottomException e) {
        // fall through
      }
    }
    return structure.remove(key);
  }

  @Override
  public void merge(Reference.Merge method, List<LensDimension> lowerDimensions, Object parent, Object it,
      Scope scope, ResultIterator ri) {
    Structure structure = (Structure) parent;
    Freezable<?> collector = (Freezable<?>) structure.get(key);
    if (!collector.isThawed()) {
      collector = collector.thawedCopy();
      structure.put(key, collector);
    }
    if (!lowerDimensions.isEmpty()) {
      LensDimension next = lowerDimensions.get(0);
      try {
        next.merge(method, lowerDimensions.subList(1, lowerDimensions.size()), collector, it, scope, ri);
        return;
      } catch (EmptyLensAtBottomException e) {
        // fall through
      }
    }
    Reference.collect(ri, collector, method);
  }
}
