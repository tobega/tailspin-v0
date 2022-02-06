package tailspin.control;

import tailspin.interpreter.Scope;

public class Definition implements Expression {
  private final String identifier;
  private final Value value;

  public Definition(String identifier, Value value) {
    this.identifier = identifier;
    this.value = value;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    blockScope.defineValue(identifier, value.getResults(it, blockScope));
    return null;
  }

  public String getIdentifier() {
    return identifier;
  }

  public Definition rename(String newIdentifier) {
    return new Definition(newIdentifier, value);
  }
}
