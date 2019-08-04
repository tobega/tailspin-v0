package tailspin.interpreter;

import java.util.Queue;
import tailspin.ast.Expression;
import tailspin.ast.StateAssignment;

public class StateAssignmentSubComposer implements SubComposer {
  private final SubComposer value;
  private final StateAssignment stateAssignment;
  private final Scope scope;

  public StateAssignmentSubComposer(SubComposer value, StateAssignment stateAssignment,
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
  public Queue<Object> getValues() {
    if (value == null) {
      stateAssignment.run(null, scope);
    } else {
      value.getValues().forEach(it -> stateAssignment.run(it, scope));
    }
    return Expression.EMPTY_RESULT;
  }

  @Override
  public boolean isSatisfied() {
    return value == null || value.isSatisfied();
  }
}
