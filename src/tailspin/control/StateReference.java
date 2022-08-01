package tailspin.control;

import tailspin.interpreter.Scope;
import tailspin.types.Freezable;

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
  public void setValue(Merge merge, Object value, Object it, Scope scope) {
    if (merge != Merge.NONE) {
      Freezable<?> state = (Freezable<?>) scope.getState(stateContext);
      if (!state.isThawed()) {
        state = state.thawedCopy();
        scope.setState(stateContext, state);
      }
      collect(value, state, merge);
    } else {
      scope.setState(stateContext, value);
    }
  }

  @Override
  public String toString() {
    return "@" + stateContext;
  }
}
