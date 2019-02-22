package tailspin.interpreter;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

class NestedScope implements Scope {
  private final Scope parentScope;

  private final Map<String, Object> definitions = new HashMap<>();

  NestedScope(Scope parentScope) {
    this.parentScope = parentScope;
  }

  @Override
  public Object resolveValue(String identifier) {
    Object value = definitions.get(identifier);
    if (value == null) {
      return parentScope.resolveValue(identifier);
    }
    return value;
  }

  @Override
  public void defineValue(String identifier, Object value) {
    if (!"it".equals(identifier) && definitions.containsKey(identifier)) {
      throw new IllegalStateException("Attempt to redefine " + identifier);
    }
    definitions.put(identifier, value);
  }

  @Override
  public OutputStream getOutput() {
    return parentScope.getOutput();
  }

  @Override
  public void setState(String stateContext, Object value) {
    parentScope.setState(stateContext, value);
  }

  @Override
  public Object getState(String stateContext) {
    return parentScope.getState(stateContext);
  }
}
