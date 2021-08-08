package tailspin.control;

import java.util.List;
import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.matchers.DefinedCriterion;
import tailspin.types.Criterion;

public class DataDefinition implements Expression {
  private final List<Map.Entry<String, Criterion>> definitions;

  public DataDefinition(List<Map.Entry<String, Criterion>> definitions) {
    this.definitions = definitions;
  }

  public Object getResults(Object it, Scope blockScope) {
    for (Map.Entry<String, Criterion> definition : definitions) {
      blockScope.createDataDefinition(
          definition.getKey(), new DefinedCriterion(definition.getValue(), blockScope));
    }
    return null;
  }
}
