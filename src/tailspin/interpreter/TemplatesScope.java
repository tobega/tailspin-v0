package tailspin.interpreter;

class TemplatesScope extends NestedScope {
  private final String scopeContext;
  private Object state;

  TemplatesScope(Scope parentScope, String scopeContext) {
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
}
