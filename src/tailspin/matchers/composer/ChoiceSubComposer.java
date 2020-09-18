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
  public Memo nibble(String s, Memo memo) {
    choice = -1;
    return tryNext(s, memo);
  }

  private Memo tryNext(String s, Memo memo) {
    for (choice++; choice < optionComposers.size(); choice++) {
      SubComposer subComposer = optionComposers.get(choice);
      memo = subComposer.nibble(s, memo);
      if (subComposer.isSatisfied()) {
        value = subComposer.getValues();
        break;
      }
    }
    return memo;
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    SubComposer subComposer = optionComposers.get(choice);
    memo = subComposer.backtrack(s, memo);
    if (subComposer.isSatisfied()) {
      value = subComposer.getValues();
      return memo;
    }
    return tryNext(s, memo);
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
