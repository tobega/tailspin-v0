package tailspin.transform;

import tailspin.interpreter.NestedScope;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;
import tailspin.types.DataDictionary;

public class TransformScope extends NestedScope {
  final String scopeContext;
  private Object state;
  private Templates templates;
  final DataDictionary localDictionary = new DataDictionary();

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
    if (localDictionary.owns(identifier)) {
      localDictionary.createDataDefinition(identifier, def);
    } else {
      super.createDataDefinition(identifier, def);
    }
  }

  @Override
  public Criterion getDataDefinition(String identifier) {
    if (localDictionary.owns(identifier)) {
      return localDictionary.getDataDefinition(identifier);
    } else {
      return super.getDataDefinition(identifier);
    }
  }

  @Override
  public Object checkDataDefinition(String key, Object data) {
    if (localDictionary.owns(key)) {
      return localDictionary.checkDataDefinition(key, data);
    } else {
      return super.checkDataDefinition(key, data);
    }
  }

  public void setTemplates(Templates templates) {
    this.templates = templates;
  }

  public Templates getTemplates() {
    return templates;
  }
}
