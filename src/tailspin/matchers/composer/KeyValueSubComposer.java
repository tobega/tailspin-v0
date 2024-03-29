package tailspin.matchers.composer;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.KeyValue;

class KeyValueSubComposer implements SubComposer {
  private final SubComposer keyComposer;
  private final SequenceSubComposer valueComposer;
  private final Scope scope;
  String key;

  Object value;

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
    trySetValue();
    if (value == null) {
      return original;
    }
    return memo;
  }
  private void trySetValue() {
    if (valueComposer.isSatisfied()) {
      Object parsed = valueComposer.getValues();
      value = scope.getLocalDictionary().checkDataDefinition(key, parsed, scope);
    }
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    value = null;
    memo = valueComposer.backtrack(s, memo);
    trySetValue();
    while (value == null) {
      memo = keyComposer.backtrack(s, memo);
      if (!keyComposer.isSatisfied()) {
        key = null;
        return memo;
      }
      memo = valueComposer.nibble(s, memo);
      trySetValue();
    }
    return memo;
  }

  @Override
  public KeyValue getValues() {
    if (!isSatisfied()) throw new AssertionError("Not satisfied");
    return new KeyValue(key, value);
  }

  @Override
  public boolean isSatisfied() {
    return  key != null && value != null;
  }
}
