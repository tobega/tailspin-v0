package tailspin.interpreter;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import tailspin.control.Definition;

public class ProgramModification {

  private final List<DefinitionStatement> definitions;

  public ProgramModification(List<DefinitionStatement> definitions) {
    this.definitions = definitions;
  }

  public List<DefinitionStatement> overrideDefinitions(List<DefinitionStatement> programDefinitions) {
    Map<String, DefinitionStatement> indexedDefinitions = definitions.stream()
        .filter(d -> d.statement instanceof Definition)
        .collect(Collectors.toMap(d -> ((Definition) d.statement).getIdentifier(), Function.identity()));
    return programDefinitions.stream().map(d -> {
      if ((d.statement instanceof Definition def) && indexedDefinitions.containsKey(def.getIdentifier())) {
        return indexedDefinitions.get(def.getIdentifier());
      } else {
        return d;
      }
    }).collect(Collectors.toList());
  }
}
