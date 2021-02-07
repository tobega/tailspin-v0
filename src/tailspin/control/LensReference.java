package tailspin.control;

import tailspin.interpreter.Scope;
import tailspin.transform.Lens;
import tailspin.types.Freezable;
import tailspin.types.TailspinArray;

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
      throw new UnsupportedOperationException(toString() + " is not deletable");
    }
    Freezable<?> array = (Freezable<?>) parent.getValue(it, scope);
    if (array == null) {
      throw new IllegalStateException("Unknown value " + parent);
    }
    if (!array.isThawed()) {
      array = array.thawedCopy();
      parent.setValue(false, array, it, scope);
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
  public void setValue(boolean merge, Object value, Object it, Scope scope) {
    if (!isMutable()) {
      throw new UnsupportedOperationException(toString() + " is not mutable");
    }
    ResultIterator ri = ResultIterator.wrap(value);
    Freezable<?> array = (Freezable<?>) parent.getValue(it, scope);
    if (array == null) {
      throw new IllegalStateException("Unknown value " + parent);
    }
    if (!array.isThawed()) {
      array = array.thawedCopy();
      parent.setValue(false, array, it, scope);
    }
    try {
      if (merge) {
        lens.merge(array, it, scope, ri);
      } else {
        lens.set(array, it, scope, ri);
      }
    } catch (LensDimension.EmptyLensAtBottomException e) {
      parent.setValue(merge, value, it, scope);
    }
  }

  @Override
  public String toString() {
    return parent.toString() + lens.toString();
  }

  public static Freezable<?> getThawed(TailspinArray array, int index) {
    Freezable<?> next = (Freezable<?>) array.get(index);
    if (!next.isThawed()) {
      next = next.thawedCopy();
      array.set(index, next);
    }
    return next;
  }
}
