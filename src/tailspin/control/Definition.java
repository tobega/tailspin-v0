package tailspin.control;

import java.util.Set;

import tailspin.interpreter.Scope;

public class Definition implements Expression {
  private final String identifier;
  private final Set<String> requiredDefinitions;
  private final Value value;

  public Definition(String identifier, Set<String> requiredDefinitions, Value value) {
    this.identifier = identifier;
    this.requiredDefinitions = requiredDefinitions;
    this.value = value;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    blockScope.defineValue(identifier, value.getResults(it, blockScope));
    return null;
  }

  public Set<String> getRequiredDefinitions() {
    return requiredDefinitions;
  }

  public String getIdentifier() {
    return identifier;
  }
}
