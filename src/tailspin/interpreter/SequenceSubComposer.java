package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class SequenceSubComposer implements SubComposer {

  private final List<SubComposer> subComposers;
  private Queue<Object> value;
  private boolean satisfied = false;

  SequenceSubComposer(List<SubComposer> subComposers) {
    this.subComposers = subComposers;
  }

  @Override
  public String nibble(String s) {
    String originalS = s;
    value = new ArrayDeque<>();
    satisfied = true;
    for (SubComposer subComposer : subComposers) {
      s = subComposer.nibble(s);
      satisfied &= subComposer.isSatisfied();
      if (subComposer.isSatisfied()) {
        value.addAll(subComposer.getValues());
      } else {
        return originalS;
      }
    }
    return s;
  }

  @Override
  public Queue<Object> getValues() {
    Queue<Object> result = value;
    value = null;
    satisfied = false;
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
