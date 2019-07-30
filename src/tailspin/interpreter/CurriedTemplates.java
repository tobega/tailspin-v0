package tailspin.interpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class CurriedTemplates implements Transform {
  private final Transform transform;
  private final Map<String, Object> parameters;

  public CurriedTemplates(Transform transform, Map<String, Object> parameters) {
    this.transform = transform;
    this.parameters = parameters;
  }

  @Override
  public Queue<Object> run(Object it, Map<String, Object> parameters) {
    Map<String, Object> params = new HashMap<>(this.parameters);
    for (Map.Entry<String, Object> p : parameters.entrySet()) {
      if (params.put(p.getKey(), p.getValue()) != null) {
        throw new IllegalStateException("Attempt to redefine parameter " + p.getKey());
      }
    }
    return transform.run(it, params);
  }
}
