package tailspin.interpreter;

import java.util.List;
import java.util.Queue;

public class ChoiceSubComposer implements SubComposer {
  private final List<SubComposer> optionComposers;
  private final ComposerTransform composerTransform;

  private Queue<Object> value;
  private boolean satisfied = false;

  ChoiceSubComposer(List<SubComposer> optionComposers,
      ComposerTransform composerTransform) {
    this.optionComposers = optionComposers;
    this.composerTransform = composerTransform;
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
    return composerTransform.convert(result);
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
