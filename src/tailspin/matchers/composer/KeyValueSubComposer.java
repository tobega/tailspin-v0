package tailspin.matchers.composer;

import tailspin.control.Value;
import tailspin.types.KeyValue;

class KeyValueSubComposer implements SubComposer {
  private final SubComposer keyComposer;
  private final SequenceSubComposer valueComposer;
  String key;

  KeyValueSubComposer(SubComposer keyComposer, SequenceSubComposer valueComposer) {
    this.keyComposer = keyComposer;
    this.valueComposer = valueComposer;
  }

  @Override
  public Memo nibble(Memo s) {
    key = null;
    Memo original = s;
    s = keyComposer.nibble(s);
    if (!keyComposer.isSatisfied()) {
      return original;
    }
    key = (String) Value.oneValue(keyComposer.getValues());
    s = valueComposer.nibble(s);
    if (!valueComposer.isSatisfied()) {
      return original;
    }
    return new Memo(s.s, key, s);
  }

  @Override
  public Memo backtrack(Memo memo) {
    key = (String) memo.backtrackNote;
    memo = valueComposer.backtrack(memo.previous);
    while (!valueComposer.isSatisfied()) {
      memo = keyComposer.backtrack(memo);
      if (!keyComposer.isSatisfied()) {
        key = null;
        return memo;
      }
      memo = valueComposer.nibble(memo);
    }
    return new Memo(memo.s, key, memo);
  }

  @Override
  public KeyValue getValues() {
    Object value = Value.oneValue(valueComposer.getValues());
    return new KeyValue(key, value);
  }

  @Override
  public boolean isSatisfied() {
    return  key != null && valueComposer.isSatisfied();
  }
}
