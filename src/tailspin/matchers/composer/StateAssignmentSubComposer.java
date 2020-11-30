package tailspin.matchers.composer;

import tailspin.control.Expression;
import tailspin.control.Reference;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;

public class StateAssignmentSubComposer implements SubComposer {
  private final SubComposer value;
  private final Expression stateAssignment;
  private final String stateContext; // for backtracking
  private final Scope scope;
  private boolean satisfied;
  private Object oldValue;

  StateAssignmentSubComposer(SubComposer value, Expression stateAssignment,
      String stateContext, Scope scope) {
    this.value = value;
    this.stateAssignment = stateAssignment;
    this.stateContext = stateContext;
    this.scope = scope;
  }

  @Override
  public Memo nibble(String s, Memo memo) {
    if (value == null) {
      satisfied = true;
    } else {
      memo = value.nibble(s, memo);
      satisfied = value.isSatisfied();
    }
    if (satisfied) assign();
    return memo;
  }

  private void assign() {
    oldValue = Reference.freeze(scope.getState(stateContext));
    if (value == null) {
      stateAssignment.getResults(null, scope);
    } else {
      ResultIterator.forEach(value.getValues(), it -> stateAssignment.getResults(it, scope));
    }
  }

  @Override
  public Memo backtrack(String s, Memo memo) {
    scope.setState(stateContext, oldValue);
    if (value == null) {
      satisfied = false;
    } else {
      memo = value.backtrack(s, memo);
      satisfied = value.isSatisfied();
    }
    if (satisfied) assign();
    return memo;
  }

  @Override
  public Object getValues() {
    return null;
  }

  @Override
  public boolean isSatisfied() {
    return satisfied;
  }
}
