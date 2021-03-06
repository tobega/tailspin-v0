package tailspin.control;

import tailspin.interpreter.Scope;

public class DeleteState implements Value {
  private final Reference reference;

  public DeleteState(Reference reference) {
    this.reference = reference;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    Object value = reference.deleteValue(it, scope);
    if (value == null) {
      throw new NullPointerException("Attempt to delete non-existent state " + reference);
    }
    return value;
  }
}
