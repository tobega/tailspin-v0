package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ArraySubComposer implements SubComposer {
  private final List<SubComposer> itemComposers;

  private List<Object> value;
  private boolean satisfied = false;

  ArraySubComposer(List<SubComposer> itemComposers) {
    this.itemComposers = itemComposers;
  }

  @Override
  public String nibble(String s) {
    value = new ArrayList<>();
    satisfied = true;
    for (SubComposer subComposer : itemComposers) {
      s = subComposer.nibble(s);
      satisfied &= subComposer.isSatisfied();
      if (subComposer.isSatisfied()) {
        value.addAll(subComposer.getValues());
      }
    }
    return s;
  }

  @Override
  public Queue<Object> getValues() {
    Queue<Object> result = new ArrayDeque<>();
    result.add(value);
    value = null;
    satisfied = false;
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
