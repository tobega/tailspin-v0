package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.Queue;

public class CountSubComposer implements SubComposer {

  private final SubComposer subComposer;
  private final Integer count;
  private Queue<Object> values;

  public CountSubComposer(SubComposer subComposer, Integer count) {
    this.subComposer = subComposer;
    this.count = count;
  }

  @Override
  public String nibble(String s) {
    values = new ArrayDeque<>();
    while (!s.isEmpty()) {
      s = subComposer.nibble(s);
      if (subComposer.isSatisfied()) {
        values.addAll(subComposer.getValues());
      } else {
        break;
      }
    }
    return s;
  }

  @Override
  public Queue<Object> getValues() {
    Queue<Object> result = values;
    values = null;
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return values.size() == count;
  }
}
