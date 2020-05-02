package tailspin.matchers.composer;

import static tailspin.control.Expression.queueOf;

import java.util.ArrayList;
import java.util.Queue;

public class ArraySubComposer implements SubComposer {
  private final SequenceSubComposer items;

  ArraySubComposer(SequenceSubComposer items) {
    this.items = items;
  }

  @Override
  public String nibble(String s) {
    return items.nibble(s);
  }

  @Override
  public Queue<Object> getValues() {
    return queueOf(new ArrayList<>(items.getValues()));
  }

  @Override
  public boolean isSatisfied() {
    return  items.isSatisfied();
  }
}
