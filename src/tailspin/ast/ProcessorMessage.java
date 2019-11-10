package tailspin.ast;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;
import tailspin.interpreter.KeyValue;
import tailspin.interpreter.Scope;
import tailspin.interpreter.Transform;
import tailspin.types.ProcessorInstance;

public class ProcessorMessage extends Reference {
  private final Reference reference;
  private final String message;
  private final Map<String, Value> parameters;

  public ProcessorMessage(Reference reference, String message, Map<String, Value> parameters) {
    this.reference = reference;
    this.message = message;
    this.parameters = parameters;
  }

  @Override
  public Transform getValue(Object it, Scope scope) {
    Map<String, Object> resolvedParams = parameters.entrySet().stream()
        .map(e -> new AbstractMap.SimpleEntry<>(e.getKey(), e.getValue().evaluate(it, scope)))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    Object receiver = reference.getValue(it, scope);
    return resolveMessage(receiver, resolvedParams);
  }

  private Transform resolveMessage(Object receiver, Map<String, Object> resolvedParams) {
    if (receiver instanceof ProcessorInstance) {
      return  ((ProcessorInstance) receiver).resolveMessage(message, resolvedParams);
    } else if (message.equals("hashCode")) {
      return (it, params) -> Expression.queueOf(((Number) receiver.hashCode()).longValue());
    } else if (receiver instanceof List) {
      if (message.equals("length")) {
        return (it, params) -> Expression.queueOf(((Number)((List<?>) receiver).size()).longValue());
      } else {
        throw new UnsupportedOperationException("Unknown array message " + message);
      }
    } else if (receiver instanceof KeyValue) {
      if (message.equals("key")) {
        return (it, params) -> Expression.queueOf(((KeyValue) receiver).getKey());
      } else if (message.equals("value")) {
        return (it, params) -> Expression.queueOf(((KeyValue) receiver).getValue());
      } else {
        throw new UnsupportedOperationException("Unknown array message " + message);
      }
    } else {
      throw new UnsupportedOperationException("Unimplemented processor type " + receiver.getClass().getSimpleName());
    }
  }

  @Override
  public Object deleteValue(Object it, Scope scope) {
    throw new IllegalStateException();
  }

  @Override
  public boolean isMutable() {
    return false;
  }

  @Override
  public void setValue(boolean merge, Queue<Object> value, Object it, Scope scope) {
    throw new IllegalStateException();
  }
}
