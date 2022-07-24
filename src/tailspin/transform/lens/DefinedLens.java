package tailspin.transform.lens;

import java.util.List;
import tailspin.control.Reference;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.transform.Lens;
import tailspin.types.Freezable;

public class DefinedLens implements LensDimension {
  private final String identifier;

  public DefinedLens(String identifier) {
    this.identifier = identifier;
  }

  @Override
  public void set(List<LensDimension> lowerDimensions, Object parent, Object it, Scope scope,
      ResultIterator ri) throws EmptyLensAtBottomException {
    Lens.ScopedLens lens = (Lens.ScopedLens) scope.resolveValue(identifier);
    lens.set(lowerDimensions, (Freezable<?>) parent, ri);
  }

  @Override
  public Object get(List<LensDimension> lowerDimensions, Object parent, Object it, Scope scope) {
    Lens.ScopedLens lens = (Lens.ScopedLens) scope.resolveValue(identifier);
    return lens.get(lowerDimensions, parent);
  }

  @Override
  public Object delete(List<LensDimension> lowerDimensions, Object parent, Object it, Scope scope)
      throws EmptyLensAtBottomException {
    Lens.ScopedLens lens = (Lens.ScopedLens) scope.resolveValue(identifier);
    return lens.delete(lowerDimensions, (Freezable<?>) parent);
  }

  @Override
  public void merge(Reference.Merge method, List<LensDimension> lowerDimensions, Object parent, Object it, Scope scope,
      ResultIterator ri) throws EmptyLensAtBottomException {
    Lens.ScopedLens lens = (Lens.ScopedLens) scope.resolveValue(identifier);
    lens.merge(method, lowerDimensions, (Freezable<?>) parent, ri);
  }
}
