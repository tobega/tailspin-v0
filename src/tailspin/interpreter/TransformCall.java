package tailspin.interpreter;

import java.util.Map;
import java.util.Queue;

class TransformCall {
  private final String name;
  private final Transform transform;
  private final Map<String, Object> parameters;

  TransformCall(String name, Transform transform, Map<String, Object> parameters) {
    this.name = name;
    this.transform = transform;
    this.parameters = parameters;
  }

  Queue<Object> execute(Scope outerScope) {
    return transform.run(new TransformScope(outerScope, name), parameters);
  }
}
