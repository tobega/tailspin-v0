package tailspin.types;

import java.util.Map;
import java.util.Queue;
import tailspin.interpreter.Scope;
import tailspin.interpreter.Transform;
import tailspin.interpreter.TransformCall;

public class ProcessorInstance {
  private final Scope scope;

  public ProcessorInstance(Scope scope) {
    this.scope = scope;
  }

  public Queue<Object> receiveMessage(String message, Queue<Object> it,
      Map<String, Object> parameters) {
    Transform transform = (Transform) scope.resolveValue(message);
    return new TransformCall(transform, parameters).run(it, Map.of());
  }
}
