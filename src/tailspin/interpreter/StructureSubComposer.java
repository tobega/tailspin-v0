package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class StructureSubComposer implements SubComposer {
  private final List<SubComposer> subComposers;
  private final ComposerTransform composerTransform;

  private Map<String, Object> value;
  private boolean satisfied = false;

  StructureSubComposer(List<SubComposer> subComposers, ComposerTransform composerTransform) {
    this.subComposers = subComposers;
    this.composerTransform = composerTransform;
  }

  @Override
  public String nibble(String s) {
    value = new TreeMap<>();
    satisfied = true;
    for (SubComposer subComposer : subComposers) {
      s = subComposer.nibble(s);
      satisfied &= subComposer.isSatisfied();
      if (subComposer.isSatisfied() && (subComposer instanceof KeyValueSubComposer)) {
        KeyValue keyValue = (KeyValue) subComposer.getValues().peek();
        value.put(keyValue.getKey(), keyValue.getValue());
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
    return composerTransform.convert(result);
  }

  @Override
  public boolean isSatisfied() {
    return  satisfied;
  }
}
