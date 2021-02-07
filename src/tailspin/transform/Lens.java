package tailspin.transform;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import tailspin.control.ArrayLens;
import tailspin.control.DimensionContextKeywordResolver;
import tailspin.control.LensDimension;
import tailspin.control.ResultIterator;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Freezable;

public class Lens implements Value {

  private final List<LensDimension> dimensions;

  public Lens(List<LensDimension> dimensions) {
    this.dimensions = dimensions;
  }

  public Object get(Object parentValue, Object it, Scope scope) {
    return dimensions.get(0).get(dimensions.subList(1, dimensions.size()), parentValue, it, scope);
  }

  public byte[] createByteSlice(byte[] parentValue, Object it, Scope scope) {
    if (dimensions.size() != 1) {
      throw new UnsupportedOperationException("Cannot resolve more than one dimension of bytes");
    }
    ByteArrayOutputStream result = new ByteArrayOutputStream();
    DimensionContextKeywordResolver resolver = new DimensionContextKeywordResolver(parentValue.length,
        true);
    scope.pushArithmeticContextKeywordResolver(resolver);
    try {
      Object idx = ((ArrayLens) dimensions.get(0)).getIndices(resolver, it, scope);
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

  public Object delete(Freezable<?> array, Object it, Scope scope) throws LensDimension.EmptyLensAtBottomException {
    return dimensions.get(0).delete(dimensions.subList(1, dimensions.size()), array, it, scope);
  }

  public void merge(Freezable<?> array, Object it, Scope scope, ResultIterator ri)
      throws LensDimension.EmptyLensAtBottomException {
    dimensions.get(0).merge(dimensions.subList(1, dimensions.size()), array, it, scope, ri);
  }

  public void set(Freezable<?> array, Object it, Scope scope, ResultIterator ri)
      throws LensDimension.EmptyLensAtBottomException {
    dimensions.get(0).set(dimensions.subList(1, dimensions.size()), array, it, scope, ri);
  }

  @Override
  public String toString() {
    return "(" + dimensions.stream().map(Object::toString)
        .collect(Collectors.joining(";")) + ")";
  }

  @Override
  public ScopedLens getResults(Object it, Scope scope) {
    // This is only used when the lens is a parameter. We have to resolve references in
    // the calling scope.
    return new ScopedLens(it, scope, dimensions);
  }

  public static class ScopedLens {
    private final Object it;
    private final Scope scope;
    private final List<LensDimension> dimensions;

    public ScopedLens(Object it, Scope scope, List<LensDimension> dimensions) {
      this.it = it;
      this.scope = scope;
      this.dimensions = dimensions;
    }

    public void set(List<LensDimension> lowerDimensions, Freezable<?> parent, ResultIterator ri) throws LensDimension.EmptyLensAtBottomException {
      List<LensDimension> dimensions = new ArrayList<>(this.dimensions);
      dimensions.addAll(lowerDimensions);
      if (dimensions.isEmpty()) throw new LensDimension.EmptyLensAtBottomException();
      dimensions.get(0).set(dimensions.subList(1, dimensions.size()), parent, it, scope, ri);
    }

    public Object get(List<LensDimension> lowerDimensions, Object parent) {
      List<LensDimension> dimensions = new ArrayList<>(this.dimensions);
      dimensions.addAll(lowerDimensions);
      if (dimensions.isEmpty()) return parent; // identity lens
      return dimensions.get(0).get(dimensions.subList(1, dimensions.size()), parent, it, scope);
    }

    public Object delete(List<LensDimension> lowerDimensions, Freezable<?> parent) throws LensDimension.EmptyLensAtBottomException {
      List<LensDimension> dimensions = new ArrayList<>(this.dimensions);
      dimensions.addAll(lowerDimensions);
      if (dimensions.isEmpty()) throw new LensDimension.EmptyLensAtBottomException();
      return dimensions.get(0).delete(dimensions.subList(1, dimensions.size()), parent, it, scope);
    }

    public void merge(List<LensDimension> lowerDimensions, Freezable<?> parent, ResultIterator ri) throws LensDimension.EmptyLensAtBottomException {
      List<LensDimension> dimensions = new ArrayList<>(this.dimensions);
      dimensions.addAll(lowerDimensions);
      if (dimensions.isEmpty()) throw new LensDimension.EmptyLensAtBottomException();
      dimensions.get(0).merge(dimensions.subList(1, dimensions.size()), parent, it, scope, ri);
    }
  }
}
