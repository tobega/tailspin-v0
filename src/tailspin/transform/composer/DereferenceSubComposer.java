package tailspin.transform.composer;

import java.util.Queue;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;

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
    return ResultIterator.toQueue(ResultIterator.flat(source.getResults(null, scope)));
  }

  @Override
  public boolean isSatisfied() {
    return true;
  }
}
