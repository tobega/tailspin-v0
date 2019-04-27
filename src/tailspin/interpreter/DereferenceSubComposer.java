package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.Queue;

class DereferenceSubComposer implements SubComposer {
  private final String identifier;
  private final Scope scope;

  DereferenceSubComposer(String identifier, Scope scope) {
    this.identifier = identifier;
    this.scope = scope;
  }

  @Override
  public String nibble(String s) {
    return s;
  }

  @Override
  public Queue<Object> getValues() {
    Queue<Object> result = new ArrayDeque<>();
    result.add(scope.resolveValue(identifier, false));
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return true;
  }
}
