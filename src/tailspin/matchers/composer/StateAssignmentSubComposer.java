package tailspin.matchers.composer;

import tailspin.control.Expression;
import tailspin.control.Reference;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;

public class StateAssignmentSubComposer implements SubComposer {
  private final SubComposer value;
  private final Expression stateAssignment;
  private final Reference reference; // for backtracking
  private final Scope scope;

  StateAssignmentSubComposer(SubComposer value, Expression stateAssignment,
      Reference reference, Scope scope) {
    this.value = value;
    this.stateAssignment = stateAssignment;
    this.reference = reference;
    this.scope = scope;
  }

  @Override
  public Memo nibble(Memo s) {
    s = value == null ? s : value.nibble(s);
    return new Memo(s.s, reference.getValue(null, scope), s);
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
