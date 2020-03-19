package tailspin.ast;

import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.types.Transform;

public class TemplatesCall implements Expression {
  private final Reference templatesReference;

  public TemplatesCall(Reference templatesReference) {
    this.templatesReference = templatesReference;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    Transform transform = (Transform) templatesReference.getValue(it, blockScope);
    return transform.getResults(it, Map.of());
  }
}
