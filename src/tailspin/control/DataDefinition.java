package tailspin.control;

import java.util.List;
import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.matchers.DefinedTag;
import tailspin.types.Membrane;

public class DataDefinition implements Expression {
  private final List<Map.Entry<String, Membrane>> definitions;

  public DataDefinition(List<Map.Entry<String, Membrane>> definitions) {
    this.definitions = definitions;
  }

  public Object getResults(Object it, Scope blockScope) {
    for (Map.Entry<String, Membrane> definition : definitions) {
      blockScope.getLocalDictionary().createDataDefinition(
          definition.getKey(), new DefinedTag(definition.getKey(), definition.getValue(), blockScope));
    }
    return null;
  }
}
