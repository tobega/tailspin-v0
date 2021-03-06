package tailspin.matchers.composer;

import java.util.ArrayList;
import tailspin.control.ResultIterator;
import tailspin.types.TailspinArray;

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
  public TailspinArray getValues() {
    TailspinArray result = TailspinArray.value(new ArrayList<>());
    ResultIterator.forEach(items.getValues(), result::append);
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return  items.isSatisfied();
  }
}
