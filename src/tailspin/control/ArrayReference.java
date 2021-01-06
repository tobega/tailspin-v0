package tailspin.control;

import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import tailspin.interpreter.Scope;
import tailspin.types.Freezable;
import tailspin.types.TailspinArray;

class ArrayReference extends Reference {

  private final Reference parent;
  private final List<DimensionReference> dimensions;

  ArrayReference(Reference parent, List<DimensionReference> dimensions) {
    this.parent = parent;
    this.dimensions = dimensions;
  }

  @Override
  public Object getValue(Object it, Scope scope) {
    Object parentValue = parent.getValue(it, scope);
    if (parentValue == null) {
      throw new IllegalStateException("Unknown value " + parent);
    }
    if (parentValue instanceof byte[]) {
      return createByteSlice((byte[]) parentValue, it, scope);
    }
    Iterator<DimensionReference> lowerDimensions = dimensions.iterator();
    return lowerDimensions.next().get(lowerDimensions, parentValue, it, scope);
  }

  private byte[] createByteSlice(byte[] parentValue, Object it, Scope scope) {
    if (dimensions.size() != 1) {
      throw new UnsupportedOperationException("Cannot resolve more than one dimension of bytes");
    }
    ByteArrayOutputStream result = new ByteArrayOutputStream();
    DimensionContextKeywordResolver resolver = new DimensionContextKeywordResolver(parentValue.length,
        true);
    scope.pushArithmeticContextKeywordResolver(resolver);
    try {
      Object idx = ((ArrayDimensionReference) dimensions.get(0)).getIndices(resolver, it, scope);
      if (idx instanceof Number) {
        result.write(getExtended(parentValue, ((Number) idx).intValue()));
      } else if (idx instanceof IntStream) {
        ((IntStream) idx).forEach(
            i -> result.write(getExtended(parentValue, ((Number) i).intValue())));
      } else {
        throw new UnsupportedOperationException(
            "Unable to slice bytes by "
                + (idx == null ? "index out of bounds" : " " + idx.getClass().getName()));
      }
    } finally{
      scope.popArithmeticContextKeywordResolver();
    }
    return result.toByteArray();
  }

  private byte getExtended(byte[] a, int i) {
    if (i > 0) {
      return a[i-1];
    }
    if ((a[0] & 0x80) == 0) {
      return 0;
    }
    return (byte) 0xff;
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
    Iterator<DimensionReference> lowerDimensions = dimensions.iterator();
    return lowerDimensions.next().delete(lowerDimensions, array, it, scope);
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
    Iterator<DimensionReference> lowerDimensions = dimensions.iterator();
    if (merge) {
      lowerDimensions.next().merge(lowerDimensions, array, it, scope, ri);
    } else {
      lowerDimensions.next().set(lowerDimensions, array, it, scope, ri);
    }
  }

  @Override
  public String toString() {
    return parent.toString() + "(" + dimensions.stream().map(Object::toString)
        .collect(Collectors.joining(";")) + ")";
  }

  public static TailspinArray getThawed(TailspinArray array, int index) {
    TailspinArray next = (TailspinArray) array.get(index);
    if (!next.isThawed()) {
      next = next.thawedCopy();
      array.set(index, next);
    }
    return next;
  }
}
