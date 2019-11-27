package tailspin.interpreter;

import java.util.Queue;
import tailspin.ast.Expression;

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
  public Queue<Object> getValues() {
    if (value == null) {
      stateAssignment.getResults(null, scope);
    } else {
      value.getValues().forEach(it -> stateAssignment.getResults(it, scope));
    }
    return Expression.EMPTY_RESULT;
  }

  @Override
  public boolean isSatisfied() {
    return value == null || value.isSatisfied();
  }
}
