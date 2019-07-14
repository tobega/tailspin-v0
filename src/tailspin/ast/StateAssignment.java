package tailspin.ast;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import tailspin.interpreter.Scope;

public class StateAssignment implements Expression {
  private final ValueChain valueChain;
  private final Reference stateReference;
  private final boolean merge;

  public StateAssignment(ValueChain valueChain, Reference stateReference, boolean merge) {
    this.valueChain = valueChain;
    this.stateReference = stateReference;
    this.merge = merge;
  }

  @Override
  public Queue<Object> run(Object it, Scope blockScope) {
    Queue<Object> values = valueChain.run(it, blockScope);
    if (merge) {
      collect(values, stateReference.getValue(blockScope));
    } else {
      stateReference.setValue(values, blockScope);
      if (!values.isEmpty()) {
        // TODO: add source reference
        throw new IllegalStateException("Too many values");
      }
    }
    return Expression.EMPTY_RESULT;
  }

  void collect(Queue<Object> it, Object collector) {
    if (collector instanceof Map) {
      @SuppressWarnings("unchecked")
      Map<String, Object> collectorMap = (Map<String, Object>) collector;
      it.forEach(
          m -> {
            if (m instanceof Map) {
              @SuppressWarnings("unchecked")
              Map<String, Object> itMap = (Map<String, Object>) m;
              collectorMap.putAll(itMap);
            } else {
              @SuppressWarnings("unchecked")
              Map.Entry<String, Object> itEntry = (Map.Entry<String, Object>) m;
              collectorMap.put(itEntry.getKey(), itEntry.getValue());
            }
          });
    } else if (collector instanceof StringBuilder) {
      // TODO: something is rotten in the state of Denmark
      StringBuilder sbCollector = (StringBuilder) collector;
      it.forEach(s -> sbCollector.append(s.toString()));
      collector = sbCollector.toString();
    } else if (collector instanceof List) {
      @SuppressWarnings("unchecked")
      List<Object> collectorList = (List<Object>) collector;
      collectorList.addAll(it);
    } else {
      throw new UnsupportedOperationException("Cannot collect in " + collector.getClass());
    }
  }
}
