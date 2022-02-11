package tailspin.matchers.composer;

public class InvertSubComposer implements SubComposer {
  private final SubComposer subComposer;
  private StringBuilder result;

  public InvertSubComposer(SubComposer subComposer) {
    this.subComposer = subComposer;
  }

  @Override
  public Memo nibble(String sIn, Memo memo) {
    String s = sIn.substring(memo.pos);
    result = new StringBuilder();
    for (subComposer.nibble(sIn, Memo.root(sIn.length() - s.length()));
        !s.isEmpty() && !subComposer.isSatisfied();
        subComposer.nibble(sIn, Memo.root(sIn.length() - s.length()))) {
      result.append(s.charAt(0));
      s = s.substring(1);
    }
    if (result.length() > 0) {
      return memo.next(sIn.length() - s.length());
    } else {
      return memo;
    }
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    result = null;
    return memo.previous;
  }

  @Override
  public String getValues() {
    return result.toString();
  }

  @Override
  public boolean isSatisfied() {
    return result != null && result.length() > 0;
  }
}
