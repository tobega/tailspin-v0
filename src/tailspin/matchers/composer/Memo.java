package tailspin.matchers.composer;

public class Memo {
  public final String s;
  public final Object backtrackNote;
  public final Memo previous;

  public Memo(String s, Object backtrackNote, Memo previous) {
    this.s = s;
    this.backtrackNote = backtrackNote;
    this.previous = previous;
  }
}
