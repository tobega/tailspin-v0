package tailspin.interpreter;

public class TransformScope extends NestedScope {
  final String scopeContext;
  private Object state;
  private Templates templates;

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

  public void setTemplates(Templates templates) {
    this.templates = templates;
  }

  public Templates getTemplates() {
    return templates;
  }
}
