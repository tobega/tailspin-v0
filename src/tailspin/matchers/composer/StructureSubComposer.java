package tailspin.matchers.composer;

import java.util.Map;
import java.util.TreeMap;
import tailspin.control.ResultIterator;
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
  public Map<String, Object> getValues() {
    Map<String, Object> value = new TreeMap<>();
    ResultIterator.forEach(keyValues.getValues(), kv -> {
      KeyValue keyValue = (KeyValue) kv;
      value.put(keyValue.getKey(), keyValue.getValue());
    });
    return value;
  }

  @Override
  public boolean isSatisfied() {
    return  keyValues.isSatisfied();
  }
}
