package tailspin.transform;

import java.util.HashMap;
import java.util.Map;
import tailspin.interpreter.NestedScope;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class TransformScope extends NestedScope {
  final String scopeContext;
  private Object state;
  private Templates templates;
  final Map<String, Criterion> dataDefinitions = new HashMap<>();

  public TransformScope(Scope parentScope, String scopeContext) {
    super(parentScope);
    this.scopeContext = scopeContext;
  }

  @Override
  public void setState(String stateContext, Object value) {
    if (stateContext.isEmpty() || stateContext.equals(scopeContext)) {
      state = value;
    } else {
      super.setState(stateContext, value);
    }
  }

  @Override
  public Object getState(String stateContext) {
    if (stateContext.isEmpty() || stateContext.equals(scopeContext)) {
      return state;
    } else {
      return super.getState(stateContext);
    }
  }

  @Override
  public void createDataDefinition(String identifier, Criterion def) {
    dataDefinitions.put(identifier, def);
  }

  @Override
  public Criterion getDataDefinition(String identifier) {
    Criterion def = dataDefinitions.get(identifier);
    if (def == null) return super.getDataDefinition(identifier);
    return def;
  }

  @Override
  public void checkDataDefinition(String key, Object data) {
    Criterion def = getDataDefinition(key);
    if (def == null) {
      dataDefinitions.put(key, getDefaultTypeCriterion(data));
      return;
    }
    if (!def.isMet(data, null, this))
      throw new IllegalArgumentException("Tried to set " + key + " to incompatible data " + data);
  }

  public void setTemplates(Templates templates) {
    this.templates = templates;
  }

  public Templates getTemplates() {
    return templates;
  }
}
