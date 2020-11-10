package tailspin.control;

import tailspin.interpreter.Scope;

class StateReference extends Reference {

  private final String stateContext;

  StateReference(String stateContext) {
    this.stateContext = stateContext;
  }

  @Override
  public Object getValue(Object it, Scope scope) {
    return scope.getState(stateContext);
  }

  @Override
  public Object deleteValue(Object it, Scope scope) {
    Object state = scope.getState(stateContext);
    scope.setState(stateContext, null);
    return state;
  }

  @Override
  public boolean isMutable() {
    return true;
  }

  @Override
  public void setValue(boolean merge, Object value, Object it, Scope scope) {
    if (merge) {
      collect(value, scope.getState(stateContext));
    } else {
      scope.setState(stateContext, copy(value));
    }
  }

  @Override
  public String toString() {
    return "@" + stateContext;
  }
}
