package tailspin.transform.composer;

import java.util.ArrayDeque;
import java.util.Queue;

public class AnySubComposer implements SubComposer {

  private final SubComposer subComposer;
  private Queue<Object> values;

  AnySubComposer(SubComposer subComposer) {
    this.subComposer = subComposer;
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
    return true;
  }
}
