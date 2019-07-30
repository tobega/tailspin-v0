package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.Queue;
import tailspin.ast.Expression;

class DereferenceSubComposer implements SubComposer {
  private final Expression source;
  private final Scope scope;

  DereferenceSubComposer(Expression source, Scope scope) {
    this.source = source;
    this.scope = scope;
  }

  @Override
  public String nibble(String s) {
    return s;
  }

  @Override
  public Queue<Object> getValues() {
    return new ArrayDeque<>(source.run(null, scope));
  }

  @Override
  public boolean isSatisfied() {
    return true;
  }
}
