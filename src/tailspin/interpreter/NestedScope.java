package tailspin.interpreter;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import tailspin.types.Membrane;

public class NestedScope extends Scope {
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
    if (isLocallyDefined(identifier)) {
      throw new IllegalStateException("Attempt to redefine " + identifier);
    }
    definitions.put(identifier, value);
  }

  @Override
  public void undefineValue(String identifier) {
    if (!isLocallyDefined(identifier)) {
      throw new IllegalStateException("Attempt to undefine non-existent identifier " + identifier);
    }
    definitions.remove(identifier);
  }

  @Override
  public boolean hasDefinition(String def) {
    return isLocallyDefined(def) || parentScope.hasDefinition(def);
  }

  @Override
  public boolean isLocallyDefined(String def) {
    return definitions.containsKey(def);
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

  @Override
  public void createDataDefinition(String identifier, Membrane def) {
    parentScope.createDataDefinition(identifier, def);
  }

  @Override
  public Membrane getDataDefinition(String identifier) {
    return parentScope.getDataDefinition(identifier);
  }

  @Override
  public Object checkDataDefinition(String key, Object data) {
    return parentScope.checkDataDefinition(key, data);
  }
}
