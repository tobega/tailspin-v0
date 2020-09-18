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
  public Memo nibble(String s, Memo memo) {
    key = null;
    Memo original = memo;
    memo = keyComposer.nibble(s, memo);
    if (!keyComposer.isSatisfied()) {
      return original;
    }
    key = (String) Value.oneValue(keyComposer.getValues());
    memo = valueComposer.nibble(s, memo);
    if (!valueComposer.isSatisfied()) {
      return original;
    }
    return memo;
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    memo = valueComposer.backtrack(s, memo);
    while (!valueComposer.isSatisfied()) {
      memo = keyComposer.backtrack(s, memo);
      if (!keyComposer.isSatisfied()) {
        key = null;
        return memo;
      }
      memo = valueComposer.nibble(s, memo);
    }
    return memo;
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
