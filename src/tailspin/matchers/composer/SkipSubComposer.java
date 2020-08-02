package tailspin.matchers.composer;

import java.util.List;

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
  public Object getValues() {
    satisfied = false;
    return null;
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
