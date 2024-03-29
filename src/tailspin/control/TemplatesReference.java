package tailspin.control;

import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.transform.CurriedTemplates;
import tailspin.types.Transform;

public class TemplatesReference extends Reference {
  private final Reference reference;
  private final Map<String, Value> parameters;

  public TemplatesReference(Reference reference, Map<String, Value> parameters) {
    this.reference = reference;
    this.parameters = parameters;
  }

  @Override
  public CurriedTemplates getValue(Object it, Scope scope) {
    Transform transform = (Transform) reference.getValue(it, scope);
    if (transform == null) {
      throw new IllegalStateException("Unknown transform " + reference);
    }
    Map<String, Object> resolvedParameters = parameters.entrySet().stream()
        .map(e -> new AbstractMap.SimpleEntry<>(e.getKey(), e.getValue().getResults(it, scope)))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    return new CurriedTemplates(transform, resolvedParameters);
  }

  @Override
  public Object deleteValue(Object it, Scope scope) {
    throw new IllegalStateException();
  }

  @Override
  public boolean isMutable() {
    return false;
  }

  @Override
  public void setValue(Merge merge, Object value, Object it, Scope scope) {
    throw new IllegalStateException();
  }
}
