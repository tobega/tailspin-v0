package tailspin.matchers.composer;

import tailspin.control.Expression;
import tailspin.interpreter.Scope;

class DereferenceSubComposer implements SubComposer {
  private final Expression source;
  private final Scope scope;

  DereferenceSubComposer(Expression source, Scope scope) {
    this.source = source;
    this.scope = scope;
  }

  @Override
  public Memo nibble(Memo s) {
    return s;
  }

  @Override
  public Object getValues() {
    return source.getResults(null, scope);
  }

  @Override
  public boolean isSatisfied() {
    return true;
  }
}
