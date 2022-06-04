package tailspin.matchers.composer;

import tailspin.control.Value;
import tailspin.types.DataDictionary;
import tailspin.types.KeyValue;

class KeyValueSubComposer implements SubComposer {
  private final SubComposer keyComposer;
  private final SequenceSubComposer valueComposer;
  private final DataDictionary dictionary;
  String key;

  Object value;

  KeyValueSubComposer(SubComposer keyComposer, SequenceSubComposer valueComposer,
      DataDictionary dictionary) {
    this.keyComposer = keyComposer;
    this.valueComposer = valueComposer;
    this.dictionary = dictionary;
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
      try {
        Object parsed = valueComposer.getValues();
        value = dictionary.checkDataDefinition(key, parsed);
      } catch (IllegalArgumentException e) {
        // Ignore
      }
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
