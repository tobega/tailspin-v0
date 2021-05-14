package tailspin.types;

public class Measure {

  private final long value;
  private final String unit;

  public Measure(long value, String unit) {
    this.value = value;
    this.unit = unit;
  }

  @Override
  public String toString() {
    return value + "\"" + unit + "\"";
  }
}
