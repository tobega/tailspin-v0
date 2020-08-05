package tailspin.matchers.composer;

public class LiteralSubComposer implements SubComposer {

  private final String literal;
  private boolean matchedValue;

  public LiteralSubComposer(String literal) {
    this.literal = literal;
  }

  @Override
  public Memo nibble(Memo memo) {
    matchedValue = false;
    if (memo.s.startsWith(literal)) {
      matchedValue = true;
      memo = new Memo(memo.s.substring(literal.length()), null, memo);
    }
    return memo;
  }

  @Override
  public Memo backtrack(Memo memo) {
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
