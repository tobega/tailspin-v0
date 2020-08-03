package tailspin.matchers.composer;

import java.util.List;
import java.util.ListIterator;

public class SkipSubComposer implements SubComposer {
  private final List<SubComposer> subComposers;
  private boolean satisfied = false;

  SkipSubComposer(List<SubComposer> subComposers) {
    this.subComposers = subComposers;
  }

  @Override
  public Memo nibble(Memo s) {
    for (SubComposer subComposer : subComposers) {
      satisfied = true;
      s = subComposer.nibble(s);
      satisfied &= subComposer.isSatisfied();
      if (subComposer.isSatisfied()) {
        subComposer.getValues(); // Skip values
      }
    }
    return s;
  }

  @Override
  public Memo backtrack(Memo memo) {
    // TODO: allow partial backtracking
    satisfied = false;
    for (ListIterator<SubComposer> it = subComposers.listIterator(subComposers.size()); it.hasPrevious();) {
      SubComposer subComposer = it.previous();
      do {
        memo = subComposer.backtrack(memo);
      } while (subComposer.isSatisfied());
    }
    return memo;
  }

  @Override
  public Object getValues() {
    satisfied = false;
    return null;
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
