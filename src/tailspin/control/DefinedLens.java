package tailspin.control;

import java.util.List;
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
      ResultIterator ri) {
    Lens.ScopedLens lens = (Lens.ScopedLens) scope.resolveValue(identifier);
    lens.set(lowerDimensions, (Freezable<?>) parent, ri);
  }

  @Override
  public Object get(List<LensDimension> lowerDimensions, Object parent, Object it, Scope scope) {
    Lens.ScopedLens lens = (Lens.ScopedLens) scope.resolveValue(identifier);
    return lens.get(lowerDimensions, parent);
  }

  @Override
  public Object delete(List<LensDimension> lowerDimensions, Object parent, Object it, Scope scope) {
    Lens.ScopedLens lens = (Lens.ScopedLens) scope.resolveValue(identifier);
    return lens.delete(lowerDimensions, (Freezable<?>) parent);
  }

  @Override
  public void merge(List<LensDimension> lowerDimensions, Object parent, Object it, Scope scope,
      ResultIterator ri) {
    Lens.ScopedLens lens = (Lens.ScopedLens) scope.resolveValue(identifier);
    lens.merge(lowerDimensions, (Freezable<?>) parent, ri);
  }
}
