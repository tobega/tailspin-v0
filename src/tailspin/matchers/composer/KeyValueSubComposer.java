package tailspin.matchers.composer;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.KeyValue;

class KeyValueSubComposer implements SubComposer {
  private final SubComposer keyComposer;
  private final SequenceSubComposer valueComposer;
  private final Scope scope;
  String key;

  KeyValueSubComposer(SubComposer keyComposer, SequenceSubComposer valueComposer,
      Scope scope) {
    this.keyComposer = keyComposer;
    this.valueComposer = valueComposer;
    this.scope = scope;
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
    value = scope.checkDataDefinition(key, value);
    return new KeyValue(key, value);
  }

  @Override
  public boolean isSatisfied() {
    return  key != null && valueComposer.isSatisfied();
  }
}
