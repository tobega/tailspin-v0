package tailspin.matchers.composer;

import java.util.List;

public class ChoiceSubComposer implements SubComposer {
  private final List<SubComposer> optionComposers;

  private Object value;
  private int choice = -1;

  ChoiceSubComposer(List<SubComposer> optionComposers) {
    this.optionComposers = optionComposers;
  }

  @Override
  public Memo nibble(Memo s) {
    choice = -1;
    return tryNext(s);
  }

  private Memo tryNext(Memo s) {
    for (choice++; choice < optionComposers.size(); choice++) {
      SubComposer subComposer = optionComposers.get(choice);
      s = subComposer.nibble(s);
      if (subComposer.isSatisfied()) {
        value = subComposer.getValues();
        break;
      }
    }
    return s;
  }

  @Override
  public Memo backtrack(Memo memo) {
    SubComposer subComposer = optionComposers.get(choice);
    memo = subComposer.backtrack(memo);
    if (subComposer.isSatisfied()) {
      value = subComposer.getValues();
      return memo;
    }
    return tryNext(memo);
  }

  @Override
  public Object getValues() {
    return value;
  }

  @Override
  public boolean isSatisfied() {
    return  choice >= 0 && choice < optionComposers.size();
  }
}
