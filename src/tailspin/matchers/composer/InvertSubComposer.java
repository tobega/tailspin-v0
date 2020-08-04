package tailspin.matchers.composer;

public class InvertSubComposer implements SubComposer {
  private final SubComposer subComposer;
  private StringBuilder result;

  public InvertSubComposer(SubComposer subComposer) {
    this.subComposer = subComposer;
  }

  @Override
  public Memo nibble(Memo memo) {
    String s = memo.s;
    result = new StringBuilder();
    for (subComposer.nibble(new Memo(s, null, null)); !s.isEmpty() && !subComposer.isSatisfied(); subComposer.nibble(new Memo(s, null, null))) {
      result.append(s.charAt(0));
      s = s.substring(1);
    }
    if (result.length() > 0) {
      return new Memo(s, null, memo);
    } else {
      return memo;
    }
  }

  @Override
  public Memo backtrack(Memo memo) {
    result = null;
    return memo.previous;
  }

  @Override
  public String getValues() {
    if (subComposer.isSatisfied()) {
      subComposer.getValues(); // flush
    }
    String value = result.toString();
    result = null;
    return value;
  }

  @Override
  public boolean isSatisfied() {
    return result != null && result.length() > 0;
  }
}
