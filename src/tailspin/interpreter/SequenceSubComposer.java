package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class SequenceSubComposer implements SubComposer {

  private final List<SubComposer> subComposers;
  private Queue<Object> value;

  public SequenceSubComposer(List<SubComposer> subComposers) {
    this.subComposers = subComposers;
  }

  @Override
  public String nibble(String s) {
    value = new ArrayDeque<>();
    for (SubComposer subComposer : subComposers) {
      s = subComposer.nibble(s);
      value.addAll(subComposer.getValues());
    }
    return s;

  }

  @Override
  public Queue<Object> getValues() {
    Queue<Object> result = value;
    value = null;
    return result;
  }
}
