package tailspin.matchers.composer;

import tailspin.control.Expression;
import tailspin.interpreter.Scope;

class DereferenceSubComposer implements SubComposer {
  private final Expression source;
  private final Scope scope;
  private boolean satisfied;

  DereferenceSubComposer(Expression source, Scope scope) {
    this.source = source;
    this.scope = scope;
  }

  @Override
  public Memo nibble(Memo s) {
    satisfied = true;
    return s;
  }

  @Override
  public Memo backtrack(Memo memo) {
    satisfied = false; // Need to keep going back
    return memo;
  }

  @Override
  public Object getValues() {
    return source.getResults(null, scope);
  }

  @Override
  public boolean isSatisfied() {
    return satisfied;
  }
}
