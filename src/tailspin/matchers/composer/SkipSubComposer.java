package tailspin.matchers.composer;

public class SkipSubComposer implements SubComposer {
  private final SequenceSubComposer subComposer;

  SkipSubComposer(SequenceSubComposer subComposer) {
    this.subComposer = subComposer;
  }

  @Override
  public Memo nibble(Memo s) {
    return subComposer.nibble(s);
  }

  @Override
  public Memo backtrack(Memo memo) {
    return subComposer.backtrack(memo);
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
