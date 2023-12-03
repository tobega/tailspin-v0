package tailspin.matchers.composer;

import tailspin.control.ChainStage;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;

public class TransformSubComposer implements SubComposer {
  private final SubComposer subComposer;
  private final ChainStage transform;
  private final Scope scope;
  private Object transformedValues;

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
    Memo result = subComposer.nibble(s, memo);
    if (subComposer.isSatisfied()) {
      transformedValues = convert(subComposer.getValues());
    } else {
      transformedValues = null;
    }
    return result;
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    Memo result = subComposer.backtrack(s, memo);
    if (subComposer.isSatisfied()) {
      transformedValues = convert(subComposer.getValues());
    } else {
      transformedValues = null;
    }
    return result;
  }

  @Override
  public Object getValues() {
    return transformedValues;
  }

  @Override
  public boolean isSatisfied() {
    return subComposer.isSatisfied();
  }
}
