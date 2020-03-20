package tailspin.types;

import java.util.Map;
import tailspin.transform.CurriedTemplates;
import tailspin.interpreter.Scope;

public class ProcessorInstance {
  protected final Scope scope;

  public ProcessorInstance(Scope scope) {
    this.scope = scope;
  }

  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    Transform transform = (Transform) scope.resolveValue(message);
    if (transform == null) {
      throw new NullPointerException("Unknown message " + message);
    }
    return new CurriedTemplates(transform, parameters);
  }
}
