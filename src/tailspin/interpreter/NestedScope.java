package tailspin.interpreter;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

class NestedScope implements Scope {
  private final Scope parentScope;

  private final Map<String, Object> definitions = new HashMap<>();

  private Queue<Object> it;

  NestedScope(Scope parentScope) {
    this.parentScope = parentScope;
  }

  @Override
  public Object resolveValue(String identifier) {
    if ("it".equals(identifier)) {
      throw new IllegalArgumentException("Attempt to get it as an identifier");
    }
    Object value = definitions.get(identifier);
    if (value == null) {
      return parentScope.resolveValue(identifier);
    }
    return value;
  }

  @Override
  public void defineValue(String identifier, Object value) {
    if ("it".equals(identifier)) {
      throw new IllegalArgumentException("Attempt to set it as an identifier");
    }
    if (definitions.containsKey(identifier)) {
      throw new IllegalStateException("Attempt to redefine " + identifier);
    }
    definitions.put(identifier, value);
  }

  @Override
  public InputStream getInput() {
    return parentScope.getInput();
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

  @Override
  public Queue<Object> getIt() {
    return it == null ? parentScope.getIt() : it;
  }

  @Override
  public void setIt(Queue<Object> it) {
    this.it = it;
  }
}
