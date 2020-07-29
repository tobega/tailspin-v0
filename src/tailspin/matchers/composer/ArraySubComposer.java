package tailspin.matchers.composer;

import java.util.ArrayList;
import tailspin.control.ResultIterator;

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
