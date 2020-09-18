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
    for (subComposer.nibble(sIn, new Memo(sIn.length() - s.length(), null));
        !s.isEmpty() && !subComposer.isSatisfied();
        subComposer.nibble(sIn, new Memo(sIn.length() - s.length(), null))) {
      result.append(s.charAt(0));
      s = s.substring(1);
    }
    if (result.length() > 0) {
      return new Memo(sIn.length() - s.length(), memo);
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
