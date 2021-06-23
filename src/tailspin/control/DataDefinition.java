package tailspin.control;

import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class DataDefinition implements Expression {
  private final String identifier;
  private final Value value;

  public DataDefinition(String identifier, Value value) {
    this.identifier = identifier;
    this.value = value;
  }

  public Object getResults(Object it, Scope blockScope) {
    blockScope.createDataDefinition(identifier, (Criterion) value.getResults(it, blockScope));
    return null;
  }
}
