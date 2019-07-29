package tailspin.ast;

import static tailspin.ast.Value.oneValue;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;
import tailspin.interpreter.KeyValue;
import tailspin.interpreter.Scope;
import tailspin.types.ProcessorInstance;

public class ProcessorMessage implements Expression {
  private final boolean asTransform;
  private final DereferenceValue dereferenceValue;
  private final String message;
  private final Map<String, Value> parameters;

  public ProcessorMessage(boolean asTransform, DereferenceValue dereferenceValue, String message,
      Map<String, Value> parameters) {
    this.asTransform = asTransform;
    this.dereferenceValue = dereferenceValue;
    this.message = message;
    this.parameters = parameters;
  }

  @Override
  public Queue<Object> run(Object it, Scope scope) {
    Map<String, Object> resolvedParams = parameters.entrySet().stream()
        .map(e -> new AbstractMap.SimpleEntry<>(e.getKey(), e.getValue().evaluate(it, scope)))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    Object receiver = oneValue(dereferenceValue.run(it, scope));
    return sendMessage(receiver, resolvedParams, asTransform ? it : null);
  }

  private Queue<Object> sendMessage(Object receiver, Map<String, Object> resolvedParams, Object it) {
    if (receiver instanceof List) {
      if (message.equals("length")) {
        return Expression.queueOf(((List<?>) receiver).size());
      } else {
        throw new UnsupportedOperationException("Unknown array message " + message);
      }
    } else if (receiver instanceof KeyValue) {
      if (message.equals("key")) {
        return Expression.queueOf(((KeyValue) receiver).getKey());
      } else if (message.equals("value")) {
        return Expression.queueOf(((KeyValue) receiver).getValue());
      } else {
        throw new UnsupportedOperationException("Unknown array message " + message);
      }
    } else if (receiver instanceof ProcessorInstance) {
      return  ((ProcessorInstance) receiver).receiveMessage(message, it, resolvedParams);
    } else {
      throw new UnsupportedOperationException("Unimplemented processor type " + receiver.getClass().getSimpleName());
    }
  }
}
