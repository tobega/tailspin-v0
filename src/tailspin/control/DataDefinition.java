package tailspin.control;

import java.util.List;
import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class DataDefinition implements Expression {
  private final List<Map.Entry<String, Value>> definitions;

  public DataDefinition(List<Map.Entry<String, Value>> definitions) {
    this.definitions = definitions;
  }

  public Object getResults(Object it, Scope blockScope) {
    for (Map.Entry<String, Value> definition : definitions) {
      blockScope.createDataDefinition(definition.getKey(),
          (Criterion) definition.getValue().getResults(it, blockScope));
    }
    return null;
  }
}
