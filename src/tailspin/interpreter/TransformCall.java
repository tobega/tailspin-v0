package tailspin.interpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

class TransformCall implements Transform {
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

  @Override
  public Queue<Object> run(TransformScope scope, Map<String, Object> parameters) {
    Map<String, Object> params = new HashMap<>();
    params.putAll(this.parameters);
    for (Map.Entry<String, Object> p : parameters.entrySet()) {
      if (params.put(p.getKey(), p.getValue()) != null) {
        throw new IllegalStateException("Attempt to redefine parameter " + p.getKey());
      }
    }
    params.putAll(parameters);
    return transform.run(scope, params);
  }
}
