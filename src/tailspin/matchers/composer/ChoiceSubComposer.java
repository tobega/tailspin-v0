package tailspin.matchers.composer;

import java.util.List;

public class ChoiceSubComposer implements SubComposer {
  private final List<SubComposer> optionComposers;

  private Object value;
  private boolean satisfied = false;

  ChoiceSubComposer(List<SubComposer> optionComposers) {
    this.optionComposers = optionComposers;
  }

  @Override
  public Memo nibble(Memo s) {
    return tryFrom(s, 0);
  }

  private Memo tryFrom(Memo s, int n) {
    satisfied = false;
    for (int i = n; i < optionComposers.size(); i++) {
      SubComposer subComposer = optionComposers.get(i);
      s = subComposer.nibble(s);
      if (subComposer.isSatisfied()) {
        satisfied = true;
        value = subComposer.getValues();
        s = new Memo(s.s, i, s);
        break;
      }
    }
    return s;
  }

  @Override
  public Memo backtrack(Memo memo) {
    satisfied = false;
    int i = (int) memo.backtrackNote;
    SubComposer subComposer = optionComposers.get(i);
    memo = subComposer.backtrack(memo.previous);
    if (subComposer.isSatisfied()) {
      satisfied = true;
      value = subComposer.getValues();
      return new Memo(memo.s, i, memo);
    }
    return tryFrom(memo, ++i);
  }

  @Override
  public Object getValues() {
    return value;
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
