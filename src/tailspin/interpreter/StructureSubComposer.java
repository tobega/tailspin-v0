package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class StructureSubComposer implements SubComposer {
  private final List<SubComposer> subComposers;

  private Map<String, Object> value;
  private boolean satisfied = false;

  StructureSubComposer(List<SubComposer> subComposers) {
    this.subComposers = subComposers;
  }

  @Override
  public String nibble(String s) {
    value = new TreeMap<>();
    satisfied = true;
    for (SubComposer subComposer : subComposers) {
      s = subComposer.nibble(s);
      satisfied &= subComposer.isSatisfied();
      if (subComposer.isSatisfied()) {
        subComposer.getValues().forEach(kv -> {
          KeyValue keyValue = (KeyValue) kv;
          value.put(keyValue.getKey(), keyValue.getValue());
        });
      }
    }
    return s;
  }

  @Override
  public Queue<Object> getValues() {
    Queue<Object> result = new ArrayDeque<>();
    result.add(value);
    value = null;
    satisfied = false;
    return result;
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
