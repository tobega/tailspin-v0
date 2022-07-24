package tailspin.matchers.composer;

import java.util.ArrayList;
import tailspin.control.ResultIterator;
import tailspin.types.TailspinArray;

public class ArraySubComposer implements SubComposer {
  private final SequenceSubComposer items;
  private TailspinArray result;

  ArraySubComposer(SequenceSubComposer items) {
    this.items = items;
  }

  @Override
  public Memo nibble(String s, Memo memo) {
    result = null;
    return items.nibble(s, memo);
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    result = null;
    return items.backtrack(s, memo);
  }

  @Override
  public TailspinArray getValues() {
    if (result == null) {
      result = TailspinArray.value(new ArrayList<>(), 1);
      ResultIterator.forEach(items.getValues(), result::append);
    }
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return  items.isSatisfied();
  }
}
