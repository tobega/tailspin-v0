package tailspin.control;

import tailspin.interpreter.Scope;
import tailspin.transform.Lens;
import tailspin.transform.lens.LensDimension;
import tailspin.types.Freezable;

class LensReference extends Reference {

  private final Reference parent;
  private final Lens lens;

  LensReference(Reference parent, Lens lens) {
    this.parent = parent;
    this.lens = lens;
  }

  @Override
  public Object getValue(Object it, Scope scope) {
    Object parentValue = parent.getValue(it, scope);
    if (parentValue == null) {
      throw new IllegalStateException("Unknown value " + parent);
    }
    if (parentValue instanceof byte[]) {
      return lens.createByteSlice((byte[]) parentValue, it, scope);
    }
    return lens.get(parentValue, it, scope);
  }

  @Override
  public Object deleteValue(Object it, Scope scope) {
    if (!isMutable()) {
      throw new UnsupportedOperationException(this + " is not deletable");
    }
    Freezable<?> array = (Freezable<?>) parent.getValue(it, scope);
    if (array == null) {
      throw new IllegalStateException("Unknown value " + parent);
    }
    if (!array.isThawed()) {
      array = array.thawedCopy();
      parent.setValue(Merge.NONE, array, it, scope);
    }
    try {
      return lens.delete(array, it, scope);
    } catch (LensDimension.EmptyLensAtBottomException e) {
      return parent.deleteValue(it, scope);
    }
  }

  @Override
  public boolean isMutable() {
    return parent.isMutable();
  }

  @Override
  public void setValue(Merge merge, Object value, Object it, Scope scope) {
    if (!isMutable()) {
      throw new UnsupportedOperationException(this + " is not mutable");
    }
    ResultIterator ri = ResultIterator.wrap(value);
    Freezable<?> array = (Freezable<?>) parent.getValue(it, scope);
    if (array == null) {
      throw new IllegalStateException("Unknown value " + parent);
    }
    if (!array.isThawed()) {
      array = array.thawedCopy();
      parent.setValue(Merge.NONE, array, it, scope);
    }
    try {
      if (merge == Merge.NONE) {
        lens.set(array, it, scope, ri);
      } else {
        lens.merge(merge, array, it, scope, ri);
      }
    } catch (LensDimension.EmptyLensAtBottomException e) {
      parent.setValue(merge, value, it, scope);
    }
  }

  @Override
  public String toString() {
    return parent.toString() + lens.toString();
  }
}
