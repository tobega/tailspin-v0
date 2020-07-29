package tailspin.matchers.composer;

import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;

public class StateAssignmentSubComposer implements SubComposer {
  private final SubComposer value;
  private final Expression stateAssignment;
  private final Scope scope;

  StateAssignmentSubComposer(SubComposer value, Expression stateAssignment,
      Scope scope) {
    this.value = value;
    this.stateAssignment = stateAssignment;
    this.scope = scope;
  }

  @Override
  public String nibble(String s) {
    return value == null ? s : value.nibble(s);
  }

  @Override
  public Object getValues() {
    if (value == null) {
      stateAssignment.getResults(null, scope);
    } else {
      ResultIterator.forEach(value.getValues(), it -> stateAssignment.getResults(it, scope));
    }
    return null;
  }

  @Override
  public boolean isSatisfied() {
    return value == null || value.isSatisfied();
  }
}
