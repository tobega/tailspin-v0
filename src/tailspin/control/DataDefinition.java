package tailspin.control;

import tailspin.interpreter.Scope;
import tailspin.matchers.DefinedSymbolSet;
import tailspin.matchers.DefinedTag;
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
      if (definition.getValue() instanceof DefinedSymbolSet e) {
        blockScope.getLocalDictionary().createDataDefinition(e.getTag(), e);
      } else {
        Membrane def = new DefinedTag(definition.getKey(), definition.getValue(), blockScope);
        blockScope.getLocalDictionary().createDataDefinition(definition.getKey(), def);
      }
    }
    return null;
  }
}
