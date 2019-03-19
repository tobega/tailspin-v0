package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class SkipSubComposer implements SubComposer {
  private final List<SubComposer> subComposers;

  public SkipSubComposer(List<SubComposer> subComposers) {
    this.subComposers = subComposers;
  }

  @Override
  public String nibble(String s) {
    for (SubComposer subComposer : subComposers) {
      s = subComposer.nibble(s);
      subComposer.getValues(); // Skip values
    }
    return s;
  }

  @Override
  public Queue<Object> getValues() {
    return new ArrayDeque<>();
  }

  @Override
  public boolean isSatisfied() {
    return  subComposers.stream().allMatch(SubComposer::isSatisfied);
  }
}
