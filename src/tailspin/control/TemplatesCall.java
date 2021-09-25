package tailspin.control;

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
    if (transform == null) {
      throw new IllegalStateException("Unknown templates " + templatesReference);
    }
    return transform.getResults(it, Map.of(), blockScope.getLocalDictionary());
  }
}
