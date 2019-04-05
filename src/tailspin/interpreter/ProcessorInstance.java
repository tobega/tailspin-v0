package tailspin.interpreter;

import java.util.Queue;

class ProcessorInstance {
  private final Scope scope;

  ProcessorInstance(Scope scope) {
    this.scope = scope;
  }

  Queue<Object> receiveMessage(String message, Queue<Object> it) {
    Transform transform = (Transform) scope.resolveValue(message, false);
    TransformScope transformScope = new TransformScope(scope, message);
    transformScope.setIt(it);
    return transform.run(transformScope);
  }
}
