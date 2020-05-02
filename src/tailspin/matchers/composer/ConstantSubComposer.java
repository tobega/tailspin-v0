package tailspin.matchers.composer;

import java.util.ArrayDeque;
import java.util.Queue;

class ConstantSubComposer implements SubComposer {
  private final String value;

  ConstantSubComposer(String value) {
    this.value = value;
  }

  @Override
  public String nibble(String s) {
    return s;
  }

  @Override
  public Queue<Object> getValues() {
    Queue<Object> result = new ArrayDeque<>();
    result.add(value);
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return true;
  }
}
