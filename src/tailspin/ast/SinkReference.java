package tailspin.ast;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.interpreter.Transform;

public class SinkReference implements Expression {
  private final Reference reference;
  private final Map<String, Value> parameters;

  public SinkReference(Reference reference, Map<String, Value> parameters) {
    this.reference = reference;
    this.parameters = parameters;
  }

  @Override
  public Queue<Object> run(Object it, Scope scope) {
    Transform transform = (Transform) reference.getValue(it, scope);
    if (transform == null) {
      throw new NullPointerException("No sink defined for " + reference);
    }
    Map<String, Object> resolvedParameters = parameters.entrySet().stream()
    .map(e -> new AbstractMap.SimpleEntry<>(e.getKey(), e.getValue().evaluate(it, scope)))
    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    Queue<Object> sunk = transform.run(it, resolvedParameters);
    if (!sunk.isEmpty()) {
      throw new IllegalStateException("Sink " + reference + " emitted values");
    }
    return EMPTY_RESULT;
  }
}
