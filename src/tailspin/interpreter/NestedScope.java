package tailspin.interpreter;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class NestedScope implements Scope {
  private final Scope parentScope;

  private final Map<String, Object> definitions = new HashMap<>();

  public NestedScope(Scope parentScope) {
    this.parentScope = parentScope;
  }

  @Override
  public Object resolveValue(String identifier) {
    Object value =  definitions.get(identifier);
    if (value == null) {
      return parentScope.resolveValue(identifier);
    }
    return value;
  }

  @Override
  public void defineValue(String identifier, Object value) {
    definitions.put(identifier, value);
  }

  @Override
  public OutputStream getOutput() {
    return null;
  }
}