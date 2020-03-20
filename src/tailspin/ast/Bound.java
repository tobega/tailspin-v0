package tailspin.ast;

public class Bound {
  public Value value;
  public boolean inclusive;
  public Bound(Value value, boolean inclusive) {
    this.value = value;
    this.inclusive = inclusive;
  }
}
