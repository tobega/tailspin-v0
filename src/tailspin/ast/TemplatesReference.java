package tailspin.ast;

import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.interpreter.Transform;
import tailspin.interpreter.TransformCall;

public class TemplatesReference implements Value {
  private final String templatesName;
  private final Map<String, Value> parameters;

  public TemplatesReference(String templatesName,
      Map<String, Value> parameters) {
    this.templatesName = templatesName;
    this.parameters = parameters;
  }

  @Override
  public TransformCall evaluate(Object it, Scope scope) {
    Transform transform = (Transform) scope.resolveValue(templatesName);
    Map<String, Object> resolvedParameters = parameters.entrySet().stream()
        .map(e -> new AbstractMap.SimpleEntry<>(e.getKey(), e.getValue().evaluate(it, scope)))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    return new TransformCall(transform, resolvedParameters);
  }
}
