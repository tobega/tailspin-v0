package tailspin.interpreter;

import static tailspin.ast.Expression.queueOf;

import java.util.Queue;
import tailspin.types.KeyValue;

class KeyValueSubComposer implements SubComposer {
  private final SubComposer keyComposer;
  private final SequenceSubComposer valueComposer;

  KeyValueSubComposer(SubComposer keyComposer, SequenceSubComposer valueComposer) {
    this.keyComposer = keyComposer;
    this.valueComposer = valueComposer;
  }

  @Override
  public String nibble(String s) {
    String originalS = s;
    s = keyComposer.nibble(s);
    if (!keyComposer.isSatisfied()) {
      return originalS;
    }
    s = valueComposer.nibble(s);
    if (!valueComposer.isSatisfied()) {
      keyComposer.getValues(); // Do we need to flush here?
      return originalS;
    }
    return s;
  }

  @Override
  public Queue<Object> getValues() {
    Queue<Object> keys = keyComposer.getValues();
    if (keys.size() != 1) {
      throw new IllegalArgumentException("Only one key allowed for a keyed value, not " + keys);
    }
    String key = (String) keys.peek();
    Queue<Object> values = valueComposer.getValues();
    if (values.size() != 1) {
      throw new IllegalArgumentException("A keyed value can only have one value, not " + values);
    }
    Object value = values.peek();
    return queueOf(new KeyValue(key, value));
  }

  @Override
  public boolean isSatisfied() {
    return  keyComposer.isSatisfied() && valueComposer.isSatisfied();
  }
}
