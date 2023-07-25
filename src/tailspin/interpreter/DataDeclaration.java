package tailspin.interpreter;

import java.util.List;
import tailspin.control.DataDefinition;

public class DataDeclaration {

  private final List<DataDefinition> definitions;

  public DataDeclaration(List<DataDefinition> definitions) {
    this.definitions = definitions;
  }

  public List<DataDefinition> getDefinitions() {
    return definitions;
  }
}
