package tailspin.transform.composer;

import static tailspin.ast.Expression.queueOf;

import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import tailspin.types.KeyValue;

class StructureSubComposer implements SubComposer {
  private final SequenceSubComposer keyValues;

  StructureSubComposer(SequenceSubComposer keyValues) {
    this.keyValues = keyValues;
  }

  @Override
  public String nibble(String s) {
    return keyValues.nibble(s);
  }

  @Override
  public Queue<Object> getValues() {
    Map<String, Object> value = new TreeMap<>();
    keyValues.getValues().forEach(kv -> {
      KeyValue keyValue = (KeyValue) kv;
      value.put(keyValue.getKey(), keyValue.getValue());
    });
    return queueOf(value);
  }

  @Override
  public boolean isSatisfied() {
    return  keyValues.isSatisfied();
  }
}
