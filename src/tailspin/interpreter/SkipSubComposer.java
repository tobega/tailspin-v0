package tailspin.interpreter;

import java.util.List;

public class SkipSubComposer implements SubComposer {
  private final List<SubComposer> subComposers;

  public SkipSubComposer(List<SubComposer> subComposers) {
    this.subComposers = subComposers;
  }

  @Override
  public String accept(String s) {
    for (SubComposer subComposer : subComposers) {
      for (s = subComposer.accept(s); subComposer.hasNewValue(); s = subComposer.accept(s)) {
        subComposer.getValue(); // Skip value
      }
    }
    return s;
  }

  @Override
  public boolean hasNewValue() {
    return false;
  }

  @Override
  public Object getValue() {
    throw new AssertionError("Should never get value from " + this.getClass().getSimpleName());
  }
}
