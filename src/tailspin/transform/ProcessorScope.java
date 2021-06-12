package tailspin.transform;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.types.Transform;

public class ProcessorScope extends Scope {

  private final Scope parentScope;
  private String currentTypestate;
  private Object state;
  private final Map<String, Scope> typestates = new HashMap<>();

  public ProcessorScope(Scope parentScope, String processorName) {
    this.parentScope = parentScope;
    currentTypestate = processorName;
  }

  public void addTypestate(String name, Scope stateScope) {
    typestates.put(name, stateScope);
  }

  @Override
  public void setState(String stateContext, Object value) {
    if (stateContext.isEmpty() || stateContext.equals(currentTypestate)) {
      state = value;
    } else if (typestates.containsKey(stateContext)) {
      currentTypestate = stateContext;
      state = value;
    } else {
      parentScope.setState(stateContext, value);
    }
  }

  @Override
  public Object getState(String stateContext) {
    if (stateContext.isEmpty() || stateContext.equals(currentTypestate)) {
      return state;
    } else {
      return parentScope.getState(stateContext);
    }
  }

  @Override
  public Object resolveValue(String identifier) {
    return parentScope.resolveValue(identifier);
  }

  @Override
  public void defineValue(String identifier, Object value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Path basePath() {
    return parentScope.basePath();
  }

  @Override
  public Scope getParentScope() {
    return parentScope;
  }

  @Override
  public boolean hasDefinition(String def) {
    return parentScope.hasDefinition(def);
  }

  @Override
  public boolean isLocallyDefined(String def) {
    return false;
  }

  @Override
  public void undefineValue(String identifier) {
    throw new UnsupportedOperationException();
  }

  public Transform resolveMessage(String message) {
    Scope typestateScope = typestates.get(currentTypestate);
    return typestateScope.isLocallyDefined(message) ? (Transform) typestateScope.resolveValue(message) : null;
  }
}
