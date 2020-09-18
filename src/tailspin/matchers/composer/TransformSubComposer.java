package tailspin.matchers.composer;

import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;

public class TransformSubComposer implements SubComposer {
  private final SubComposer subComposer;
  private final Expression transform;
  private final Scope scope;

  TransformSubComposer(SubComposer subComposer, Expression transform,
      Scope scope) {
    this.subComposer = subComposer;
    this.transform = transform;
    this.scope = scope;
  }

  private Object convert(Object matchResult) {
    if (transform == null || matchResult == null) {
      return matchResult;
    }
    if (!(matchResult instanceof ResultIterator)) {
      return ResultIterator.resolveSideEffects(transform.getResults(matchResult, scope));
    }
    ResultIterator ri = (ResultIterator) matchResult;
    Object result = null;
    Object it;
    while ((it = ri.getNextResult()) != null) {
      if (it instanceof ResultIterator) {
        ri = (ResultIterator) it;
        continue;
      }
      Object transformed = ResultIterator.resolveSideEffects(transform.getResults(it, scope));
      result = ResultIterator.appendResultValue(result, transformed);
    }
    return result;
  }

  @Override
  public Memo nibble(String s, Memo memo) {
    return subComposer.nibble(s, memo);
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    return subComposer.backtrack(s, memo);
  }

  @Override
  public Object getValues() {
    return convert(subComposer.getValues());
  }

  @Override
  public boolean isSatisfied() {
    return subComposer.isSatisfied();
  }
}
