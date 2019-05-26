package tailspin.ast;

public class Bound {
  Object value;
  boolean inclusive;
  public Bound(Object value, boolean inclusive) {
    this.value = value;
    this.inclusive = inclusive;
  }
}
