package tailspin.types;

import java.util.Map;
import java.util.Objects;

public class Measure extends Number implements Processor {

  private final long value;
  private final Unit unit;

  public Measure(long value, Unit unit) {
    this.value = value;
    this.unit = Objects.requireNonNull(unit);
  }

  @Override
  public String toString() {
    return Long.toString(value) + unit;
  }

  public long getValue() {
    return value;
  }

  public Unit getUnit() {
    return unit;
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    if (message.equals("hashCode")) {
      return (it, params, callingDictionary) ->
          ((Number) (unit.equals(Unit.SCALAR) ? ((Long) value).hashCode() : hashCode())).longValue();
    } else if (message.equals("raw")) {
      return (it, params, callingDictionary) -> value;
    } else {
      throw new UnsupportedOperationException("Unknown measure message " + message);
    }
  }

  // This is for use in relations
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Measure measure = (Measure) o;
    return value == measure.value && unit.equals(measure.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  // Below is only for array indexing
  @Override
  public int intValue() {
    if (!unit.equals(Unit.SCALAR)) throw new IndexOutOfBoundsException("Cannot index by " + unit);
    return (int) value;
  }

  @Override
  public long longValue() {
    throw new UnsupportedOperationException();
  }

  @Override
  public float floatValue() {
    throw new UnsupportedOperationException();
  }

  @Override
  public double doubleValue() {
    throw new UnsupportedOperationException();
  }
}
