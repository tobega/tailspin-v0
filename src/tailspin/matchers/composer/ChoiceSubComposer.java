package tailspin.matchers.composer;

import java.util.List;
import java.util.Queue;

public class ChoiceSubComposer implements SubComposer {
  private final List<SubComposer> optionComposers;

  private Queue<Object> value;
  private boolean satisfied = false;

  ChoiceSubComposer(List<SubComposer> optionComposers) {
    this.optionComposers = optionComposers;
  }

  @Override
  public String nibble(String s) {
    satisfied = false;
    for (SubComposer subComposer : optionComposers) {
      s = subComposer.nibble(s);
      if (subComposer.isSatisfied()) {
        satisfied = true;
        value = subComposer.getValues();
        break;
      }
    }
    return s;
  }

  @Override
  public Queue<Object> getValues() {
    Queue<Object> result = value;
    value = null;
    satisfied = false;
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
