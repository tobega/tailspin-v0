package tailspin.interpreter;

import java.io.BufferedReader;
import java.io.OutputStream;
import java.nio.file.Path;
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
    Object value = definitions.get(identifier);
    if (value == null) {
      return parentScope.resolveValue(identifier);
    }
    return value;
  }

  @Override
  public void defineValue(String identifier, Object value) {
    if (definitions.containsKey(identifier)) {
      throw new IllegalStateException("Attempt to redefine " + identifier);
    }
    definitions.put(identifier, value);
  }

  @Override
  public void clearValue(String identifier) {
    definitions.remove(identifier);
  }

  @Override
  public BufferedReader getInput() {
    return parentScope.getInput();
  }

  @Override
  public OutputStream getOutput() {
    return parentScope.getOutput();
  }

  @Override
  public Path basePath() {
    return parentScope.basePath();
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
  public Scope getParentScope() {
    return parentScope;
  }
}
