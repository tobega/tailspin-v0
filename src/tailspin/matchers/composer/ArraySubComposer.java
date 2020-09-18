package tailspin.matchers.composer;

import java.util.ArrayList;
import tailspin.control.ResultIterator;

public class ArraySubComposer implements SubComposer {
  private final SequenceSubComposer items;

  ArraySubComposer(SequenceSubComposer items) {
    this.items = items;
  }

  @Override
  public Memo nibble(String s, Memo memo) {
    return items.nibble(s, memo);
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    return items.backtrack(s, memo);
  }

  @Override
  public ArrayList<Object> getValues() {
    ArrayList<Object> result = new ArrayList<>();
    ResultIterator.forEach(items.getValues(), result::add);
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return  items.isSatisfied();
  }
}
