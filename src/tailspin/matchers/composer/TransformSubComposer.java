package tailspin.matchers.composer;

import tailspin.control.ChainStage;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;

public class TransformSubComposer implements SubComposer {
  private final SubComposer subComposer;
  private final ChainStage transform;
  private final Scope scope;

  TransformSubComposer(SubComposer subComposer, ChainStage transform, Scope scope) {
    this.subComposer = subComposer;
    this.transform = transform;
    this.scope = scope;
  }

  private Object convert(Object matchResult) {
    if (transform == null || matchResult == null) {
      return matchResult;
    }
    if (!(matchResult instanceof ResultIterator)) {
      return ResultIterator.resolveSideEffects(transform.runOne(matchResult, scope));
    } else {
      return ResultIterator.resolveSideEffects(transform.runAll((ResultIterator.Flat) matchResult, scope));
    }
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
