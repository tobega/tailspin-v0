package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.Queue;

public class OptionalSubComposer implements SubComposer {

  private final SubComposer subComposer;

  public OptionalSubComposer(SubComposer subComposer) {
    this.subComposer = subComposer;
  }

  @Override
  public String nibble(String s) {
    return subComposer.nibble(s);
  }

  @Override
  public Queue<Object> getValues() {
    Queue<Object> result = new ArrayDeque<>();
    if (subComposer.isSatisfied()) {
      result.addAll(subComposer.getValues());
    }
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return true;
  }
}
