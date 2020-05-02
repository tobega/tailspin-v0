package tailspin.matchers.composer;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class SkipSubComposer implements SubComposer {
  private final List<SubComposer> subComposers;
  private boolean satisfied = false;

  SkipSubComposer(List<SubComposer> subComposers) {
    this.subComposers = subComposers;
  }

  @Override
  public String nibble(String s) {
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
  public Queue<Object> getValues() {
    satisfied = false;
    return new ArrayDeque<>();
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
