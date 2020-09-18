package tailspin.matchers.composer;

public class Memo {
  public final int pos;
  public final Memo previous;

  public Memo(int pos, Memo previous) {
    this.pos = pos;
    this.previous = previous;
  }
}
