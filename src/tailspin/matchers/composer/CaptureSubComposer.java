package tailspin.matchers.composer;

import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class CaptureSubComposer implements SubComposer {
  private final String identifier;
  private final Scope scope;
  private final SubComposer subComposer;
  private boolean satisfied = false;

  CaptureSubComposer(String identifier, Scope scope, SubComposer subComposer) {
    this.identifier = identifier;
    this.scope = scope;
    this.subComposer = subComposer;
  }

  @Override
  public String nibble(String s) {
    s = subComposer.nibble(s);
    satisfied = subComposer.isSatisfied();
    if (subComposer.isSatisfied()) {
      Object result = Value.oneValue(subComposer.getValues());
      scope.defineValue(identifier, result);
    }
    return s;
  }

  @Override
  public Object getValues() {
    satisfied = false;
    return null;
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
