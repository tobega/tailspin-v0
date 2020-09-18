package tailspin.matchers.composer;

public class SkipSubComposer implements SubComposer {
  private final SequenceSubComposer subComposer;

  SkipSubComposer(SequenceSubComposer subComposer) {
    this.subComposer = subComposer;
  }

  @Override
  public Memo nibble(String s, Memo memo) {
    return subComposer.nibble(s, memo);
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    return subComposer.backtrack(s, memo);
  }

  @Override
  public Object getValues() {
    return null;
  }

  @Override
  public boolean isSatisfied() {
    return  subComposer.isSatisfied();
  }
}
