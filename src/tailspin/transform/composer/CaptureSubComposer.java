package tailspin.transform.composer;

import java.util.ArrayDeque;
import java.util.Queue;
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
      Queue<Object> result = subComposer.getValues();
      if (result.size() != 1) {
        throw new IllegalArgumentException(
            "Attempt to define symbol " + identifier + " with " + result.size() + " values");
      }
      scope.defineValue(identifier, result.peek());
    }
    return s;
  }

  @Override
  public Queue<Object> getValues() {
    satisfied = false;
    return new ArrayDeque<>();
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
