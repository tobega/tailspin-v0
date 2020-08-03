package tailspin.matchers.composer;

class ConstantSubComposer implements SubComposer {
  private final String value;
  private boolean satisfied;

  ConstantSubComposer(String value) {
    this.value = value;
  }

  @Override
  public Memo nibble(Memo s) {
    satisfied = true;
    return s;
  }

  @Override
  public Memo backtrack(Memo memo) {
    satisfied = false; // Need to keep going back
    return memo;
  }

  @Override
  public Object getValues() {
    return value;
  }

  @Override
  public boolean isSatisfied() {
    return satisfied;
  }
}
