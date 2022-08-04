package tailspin.control;

import tailspin.arithmetic.ArithmeticContextKeywordResolver;
import tailspin.types.Measure;
import tailspin.types.TaggedIdentifier;
import tailspin.types.Unit;

public class DimensionContextKeywordResolver implements ArithmeticContextKeywordResolver,
    RangeGenerator.BoundsResolver {

  private final long offset;
  private final String tag;
  private final Unit unit;
  private final Integer dimensionSize;
  private final boolean infiniteLowerBound;

  public DimensionContextKeywordResolver(Object offset, Integer dimensionSize, boolean infiniteLowerBound) {
    tag = (offset instanceof TaggedIdentifier t) ? t.getTag() : null;
    unit = (offset instanceof Measure m) ? m.getUnit() : null;
    this.offset = decodeObject(offset);
    this.dimensionSize = dimensionSize;
    this.infiniteLowerBound = infiniteLowerBound;
  }

  @Override
  public Object getValue(String name) {
    if (name.equals("last")) {
      return encodeObject(dimensionSize + offset - 1);
    } else if (name.equals("first")) {
      return encodeObject(offset);
    } else {
      throw new UnsupportedOperationException("Unknown dimension context keyword " + name);
    }
  }

  private Object encodeObject(long i) {
    if (tag != null) return new TaggedIdentifier(tag, i);
    if (unit != null) return new Measure(i, unit);
    return i;
  }

  public Integer resolveNativeIndex(Object indexValue) {
    long index = decodeObject(indexValue);
    if ((!infiniteLowerBound && index < offset) || index >= dimensionSize + offset) return null;
    return (int) (index - offset);
  }

  private long decodeObject(Object indexValue) {
    if (indexValue instanceof TaggedIdentifier t) {
      if (!t.getTag().equals(tag)) throw new IllegalArgumentException("Array indexed by " + t + ". Expected " + getExpectedUnitErrorMessage());
      return (long) t.getValue();
    }
    if (indexValue instanceof Measure m) {
      if (!m.getUnit().equals(unit)) throw new IllegalArgumentException("Array indexed by " + m + ". Expected " + getExpectedUnitErrorMessage());
      return m.getValue();
    }
    if (tag != null || unit != null) throw new IllegalArgumentException("Array indexed by untyped " + indexValue + ". Expected " + getExpectedUnitErrorMessage());
    return (long) indexValue;
  }

  private String getExpectedUnitErrorMessage() {
    if (tag != null) return "tag " + tag;
    if (unit != null) return "unit " + unit;
    return "untyped number";
  }

  @Override
  public Long resolveLowerRangeLimit(long index) {
    if (!infiniteLowerBound && index < offset) index = offset;
    if (index >= dimensionSize + offset) return null;
    return index;
  }

  @Override
  public Long resolveUpperRangeLimit(long index) {
    if (!infiniteLowerBound && index < offset) return null;
    if (index >= dimensionSize + offset) return dimensionSize + offset - 1;
    return index;
  }
}
