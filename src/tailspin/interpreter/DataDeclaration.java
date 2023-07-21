package tailspin.interpreter;

import java.util.List;
import tailspin.control.DataDefinition;
import tailspin.control.Expression;

public class DataDeclaration implements Expression {

  private final List<DataDefinition> definitions;

  public DataDeclaration(List<DataDefinition> definitions) {
    this.definitions = definitions;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    definitions.forEach(def -> def.getResults(it, scope));
    return null;
  }
}
