package tailspin.types;

import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;

public class Measure implements Processor {

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
      return (it, params) -> ((Number) hashCode()).longValue();
    } else if (message.equals("raw")) {
      return (it, params) -> value;
    } else if (message.equals("asBytes") && unit.equals(Unit.SCALAR)) {
      return (it, params) -> BigInteger.valueOf(value).toByteArray();
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
}
