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
  private Object oldValue;

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
    if (value != null && !value.isSatisfied()) {
      satisfied = false;
      return s;
    }
    satisfied = true;
    oldValue = reference.getValue(null, scope);
    if (value == null) {
      stateAssignment.getResults(null, scope);
    } else {
      ResultIterator.forEach(value.getValues(), it -> stateAssignment.getResults(it, scope));
    }
    return s;
  }

  @Override
  public Memo backtrack(Memo memo) {
    reference.setValue(false, oldValue, null, scope);
    oldValue = null;
    satisfied = false;
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
