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
    String caughtLeftRecursion = null;
    for (choice++; choice < optionComposers.size(); choice++) {
      SubComposer subComposer = optionComposers.get(choice);
      try {
        memo = subComposer.nibble(s, memo);
      } catch (LeftRecursionException l) {
        if (l.getRecursedRuleName().equals(memo.namedRulesStack.get(memo.namedRulesStack.size()-1))) {
          caughtLeftRecursion = l.getRecursedRuleName();
          continue;
        }
        memo.namedRulesStack.remove(memo.namedRulesStack.size()-1);
        throw l;
      }
      if (subComposer.isSatisfied()) {
        value = subComposer.getValues();
        break;
      }
    }
    if (caughtLeftRecursion != null) {
      memo.caughtLeftRecursion = caughtLeftRecursion;
    }
    return memo;
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    String caughtLeftRecursion = memo.caughtLeftRecursion;
    SubComposer subComposer = optionComposers.get(choice);
    memo = subComposer.backtrack(s, memo);
    if (subComposer.isSatisfied()) {
      value = subComposer.getValues();
    } else {
      choice = optionComposers.size();
      caughtLeftRecursion = null;
    }
    memo.caughtLeftRecursion = caughtLeftRecursion;
    return memo;
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
