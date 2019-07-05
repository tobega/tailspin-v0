package tailspin.types;

import java.util.Map;
import java.util.Queue;
import tailspin.interpreter.Scope;
import tailspin.interpreter.Transform;
import tailspin.interpreter.TransformCall;
import tailspin.interpreter.TransformScope;

public class ProcessorInstance {
  private final Scope scope;

  public ProcessorInstance(Scope scope) {
    this.scope = scope;
  }

  public Queue<Object> receiveMessage(String message, Queue<Object> it,
      Map<String, Object> parameters) {
    Transform transform = (Transform) scope.resolveValue(message);
    TransformScope transformScope = new TransformScope(scope, message);
    transformScope.setIt(it);
    return new TransformCall(message, transform, parameters).run(transformScope, Map.of());
  }
}
