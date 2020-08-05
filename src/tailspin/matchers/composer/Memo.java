package tailspin.matchers.composer;

public class Memo {
  public final String s;
  public final Memo previous;

  public Memo(String s, Memo previous) {
    this.s = s;
    this.previous = previous;
  }
}
