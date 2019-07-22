package tailspin.ast;

import java.util.Map;
import java.util.Queue;
import tailspin.interpreter.Scope;
import tailspin.interpreter.Transform;

public class TemplatesCall implements Expression {
  private final TemplatesReference templatesReference;

  public TemplatesCall(TemplatesReference templatesReference) {
    this.templatesReference = templatesReference;
  }

  @Override
  public Queue<Object> run(Object it, Scope blockScope) {
    Transform transform = templatesReference.evaluate(it, blockScope);
    return transform.run(it, Map.of());
  }
}
