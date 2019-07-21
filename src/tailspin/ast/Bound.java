package tailspin.ast;

public class Bound {
  Value value;
  boolean inclusive;
  public Bound(Value value, boolean inclusive) {
    this.value = value;
    this.inclusive = inclusive;
  }
}
