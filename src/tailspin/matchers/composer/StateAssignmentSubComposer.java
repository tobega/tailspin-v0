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
  private boolean satisfied;

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
    satisfied = value == null || value.isSatisfied();
    return new Memo(s.s, reference.getValue(null, scope), s);
  }

  @Override
  public Memo backtrack(Memo memo) {
    satisfied = false;
    reference.setValue(false, memo.backtrackNote, null, scope);
    return memo.previous;
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
    return satisfied;
  }
}
