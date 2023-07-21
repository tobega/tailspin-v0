package tailspin.control;

import tailspin.interpreter.Scope;
import tailspin.matchers.DefinedSymbolSet;
import tailspin.matchers.DefinedTag;
import tailspin.types.Membrane;

public class DataDefinition implements Expression {

  private final String identifier;
  private final Membrane membrane;

  public DataDefinition(String identifier, Membrane membrane) {
    this.identifier = identifier;
    this.membrane = membrane;
  }

  public Object getResults(Object it, Scope blockScope) {
    if (membrane instanceof DefinedSymbolSet e) {
      blockScope.getLocalDictionary().createDataDefinition(e.getTag(), e);
    } else {
      /* membrane can be null for a local data definition */
      Membrane def = membrane == null ? null : new DefinedTag(identifier, membrane, blockScope);
      blockScope.getLocalDictionary().createDataDefinition(identifier, def);
    }
    return null;
  }
}
