package tailspin.matchers.composer;

import tailspin.control.Value;
import tailspin.types.KeyValue;

class KeyValueSubComposer implements SubComposer {
  private final SubComposer keyComposer;
  private final SequenceSubComposer valueComposer;

  KeyValueSubComposer(SubComposer keyComposer, SequenceSubComposer valueComposer) {
    this.keyComposer = keyComposer;
    this.valueComposer = valueComposer;
  }

  @Override
  public Memo nibble(Memo s) {
    Memo original = s;
    s = keyComposer.nibble(s);
    if (!keyComposer.isSatisfied()) {
      return original;
    }
    s = valueComposer.nibble(s);
    if (!valueComposer.isSatisfied()) {
      keyComposer.getValues(); // Do we need to flush here?
      return original;
    }
    return s;
  }

  @Override
  public KeyValue getValues() {
    String key = (String) Value.oneValue(keyComposer.getValues());
    Object value = Value.oneValue(valueComposer.getValues());
    return new KeyValue(key, value);
  }

  @Override
  public boolean isSatisfied() {
    return  keyComposer.isSatisfied() && valueComposer.isSatisfied();
  }
}
