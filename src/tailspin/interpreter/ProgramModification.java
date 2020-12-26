package tailspin.interpreter;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ProgramModification {

  private final List<DefinitionStatement> definitions;

  public ProgramModification(List<DefinitionStatement> definitions) {
    this.definitions = definitions;
  }

  public Set<String> install(BasicScope scope) {
    definitions.forEach(d -> d.statement.getResults(null, scope));
    return definitions.stream()
        .flatMap(d -> d.requiredDefinitions.stream()).collect(Collectors.toSet());
  }
}
