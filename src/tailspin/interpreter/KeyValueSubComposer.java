package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

class KeyValueSubComposer implements SubComposer {
  private final SubComposer keyComposer;
  private final List<SubComposer> valueSubComposers;
  private String key;
  private Object value;
  private boolean satisfied = false;

  KeyValueSubComposer(SubComposer keyComposer, List<SubComposer> valueSubComposers) {
    this.keyComposer = keyComposer;
    this.valueSubComposers = valueSubComposers;
  }

  @Override
  public String nibble(String s) {
    s = keyComposer.nibble(s);
    if (!keyComposer.isSatisfied()) {
      return s;
    }
    Queue<Object> keys = keyComposer.getValues();
    if (keys.size() != 1) {
      throw new IllegalArgumentException("Only one key allowed for a keyed value, not " + keys);
    }
    key = (String) keys.peek();
    satisfied = true;
    for (SubComposer subComposer : valueSubComposers) {
      s = subComposer.nibble(s);
      satisfied &= subComposer.isSatisfied();
      if (subComposer.isSatisfied()) {
        Queue<Object> values = subComposer.getValues();
        if (values.size() > 1) {
          throw new IllegalStateException("A keyed value can only have one value, not " + values);
        }
        if (values.size() == 1) {
          if (value != null) {
            throw new IllegalStateException("A keyed value can only have one value, not " + value + " and " + values.peek());
          }
          value = values.peek();
        }
      }
    }
    return s;
  }

  @Override
  public Queue<Object> getValues() {
    Queue<Object> result = new ArrayDeque<>();
    result.add(new KeyValue(key, value));
    value = null;
    satisfied = false;
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
