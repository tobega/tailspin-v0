package tailspin.matchers.composer;

public class LiteralSubComposer implements SubComposer {

  private final String literal;
  private boolean matchedValue;

  public LiteralSubComposer(String literal) {
    this.literal = literal;
  }

  @Override
  public Memo nibble(String s, Memo memo) {
    matchedValue = false;
    if (s.substring(memo.pos).startsWith(literal)) {
      matchedValue = true;
      memo = memo.next(memo.pos + literal.length());
    }
    return memo;
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    matchedValue = false;
    return memo.previous;
  }

  @Override
  public String getValues() {
    if (matchedValue) {
      return literal;
    }
    return null;
  }

  @Override
  public boolean isSatisfied() {
    return matchedValue;
  }
}
