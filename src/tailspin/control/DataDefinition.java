package tailspin.control;

import tailspin.interpreter.Scope;
import tailspin.matchers.DefinedTag;
import tailspin.matchers.EnumValues;
import tailspin.types.Membrane;

import java.util.List;
import java.util.Map;

public class DataDefinition implements Expression {
  private final List<Map.Entry<String, Membrane>> definitions;

  public DataDefinition(List<Map.Entry<String, Membrane>> definitions) {
    this.definitions = definitions;
  }

  public Object getResults(Object it, Scope blockScope) {
    for (Map.Entry<String, Membrane> definition : definitions) {
      Membrane def;
      if (definition.getValue() instanceof EnumValues e) {
        def = e.defineValues(it, blockScope);
      } else {
        def = new DefinedTag(definition.getKey(), definition.getValue(), blockScope);
      }
      blockScope.getLocalDictionary().createDataDefinition(definition.getKey(), def);
    }
    return null;
  }
}
