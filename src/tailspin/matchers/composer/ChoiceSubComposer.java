package tailspin.matchers.composer;

import java.util.List;

public class ChoiceSubComposer implements SubComposer {
  private final List<SubComposer> optionComposers;

  private Object value;
  private boolean satisfied = false;

  ChoiceSubComposer(List<SubComposer> optionComposers) {
    this.optionComposers = optionComposers;
  }

  @Override
  public Memo nibble(Memo s) {
    satisfied = false;
    for (int i = 0; i < optionComposers.size(); i++) {
      SubComposer subComposer = optionComposers.get(i);
      s = subComposer.nibble(s);
      if (subComposer.isSatisfied()) {
        satisfied = true;
        value = subComposer.getValues();
        s = new Memo(s.s, i, s);
        break;
      }
    }
    return s;
  }

  @Override
  public Object getValues() {
    Object result = value;
    value = null;
    satisfied = false;
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
