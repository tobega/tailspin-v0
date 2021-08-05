package tailspin.control;

import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class DataDefinition implements Expression {
  private final Map<String, Value> definitions;

  public DataDefinition(Map<String, Value> definitions) {
    this.definitions = definitions;
  }

  public Object getResults(Object it, Scope blockScope) {
    for (Map.Entry<String, Value> definition : definitions.entrySet()) {
      blockScope.createDataDefinition(definition.getKey(),
          (Criterion) definition.getValue().getResults(it, blockScope));
    }
    return null;
  }
}
