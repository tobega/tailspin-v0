package tailspin.types;

import java.util.Map;
import tailspin.transform.CurriedTemplates;
import tailspin.transform.ProcessorScope;

public class ProcessorInstance implements Processor {
  protected final ProcessorScope scope;

  public ProcessorInstance(ProcessorScope scope) {
    this.scope = scope;
  }

  @Override
  public Transform resolveMessage(String message, Map<String, Object> parameters) {
    Transform transform = scope.resolveMessage(message);
    if (transform == null) {
      throw new NullPointerException("Unknown message " + message);
    }
    return new CurriedTemplates(transform, parameters);
  }
}
