package tailspin.types;

import java.util.Objects;

public class Measure {

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
