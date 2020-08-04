package tailspin.matchers.composer;

import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.matchers.RangeMatch;

public class MultiplierSubComposer implements SubComposer {

  private final SubComposer subComposer;
  private final RangeMatch multiplier;
  private final Scope scope;
  private Object values;
  private int repetitions;

  MultiplierSubComposer(SubComposer subComposer, RangeMatch multiplier, Scope scope) {
    this.subComposer = subComposer;
    this.multiplier = multiplier;
    this.scope = scope;
  }

  @Override
  public Memo nibble(Memo s) {
    Memo original = s;
    repetitions = 0;
    while (!multiplier.isMet(repetitions, null, scope)) {
      s = subComposer.nibble(s);
      if (subComposer.isSatisfied()) {
        repetitions++;
        values = ResultIterator.appendResultValue(values, subComposer.getValues());
      } else {
        return original;
      }
    }
    while (multiplier.isMet(repetitions+1, null, scope)) {
      s = subComposer.nibble(s);
      if (subComposer.isSatisfied()) {
        repetitions++;
        values = ResultIterator.appendResultValue(values, subComposer.getValues());
      } else {
        break;
      }
    }
    return new Memo(s.s, repetitions, s);
  }

  @Override
  public Memo backtrack(Memo memo) {
    repetitions = (int) memo.backtrackNote;
    memo = memo.previous;
    while (repetitions > 0) {
      // TODO: figure out how to backtrack repetitions
      do {
        memo = subComposer.backtrack(memo);
      } while (subComposer.isSatisfied());
      repetitions--;
    }
    repetitions--; // Just to not be satisfied and keep backtracking
    return memo;
  }

  @Override
  public Object getValues() {
    Object result = values;
    values = null;
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return multiplier.isMet(repetitions, null, scope);
  }
}
