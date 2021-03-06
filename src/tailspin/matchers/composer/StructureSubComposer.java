package tailspin.matchers.composer;

import java.util.Map;
import java.util.TreeMap;
import tailspin.control.ResultIterator;
import tailspin.types.KeyValue;
import tailspin.types.Structure;

class StructureSubComposer implements SubComposer {
  private final SequenceSubComposer keyValues;

  StructureSubComposer(SequenceSubComposer keyValues) {
    this.keyValues = keyValues;
  }

  @Override
  public Memo nibble(String s, Memo memo) {
    return keyValues.nibble(s, memo);
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    return keyValues.backtrack(s, memo);
  }

  @Override
  public Structure getValues() {
    Map<String, Object> value = new TreeMap<>();
    ResultIterator.forEach(keyValues.getValues(), kv -> {
      KeyValue keyValue = (KeyValue) kv;
      value.put(keyValue.getKey(), keyValue.getValue());
    });
    return Structure.value(value);
  }

  @Override
  public boolean isSatisfied() {
    return  keyValues.isSatisfied();
  }
}
