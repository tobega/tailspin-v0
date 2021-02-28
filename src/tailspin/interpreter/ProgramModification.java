package tailspin.interpreter;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgramModification {

  private final List<DefinitionStatement> definitions;

  public ProgramModification(List<DefinitionStatement> definitions) {
    this.definitions = definitions;
  }

  public List<DefinitionStatement> overrideDefinitions(List<DefinitionStatement> programDefinitions) {
    Map<String, DefinitionStatement> indexedDefinitions = definitions.stream()
        .collect(Collectors.toMap(d -> d.statement.getIdentifier(), Function.identity()));
    return programDefinitions.stream().map(d -> {
      if (indexedDefinitions.containsKey(d.statement.getIdentifier())) {
        return indexedDefinitions.get(d.statement.getIdentifier());
      } else {
        return d;
      }
    }).collect(Collectors.toList());
  }
}
