package tailspin.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tailspin.control.Definition;

public class ProgramModification {

  private final List<DefinitionStatement> definitions;

  public ProgramModification(List<DefinitionStatement> definitions) {
    this.definitions = definitions;
  }

  public List<DefinitionStatement> overrideDefinitions(List<DefinitionStatement> programDefinitions) {
    Map<String, DefinitionStatement> indexedDefinitions = new HashMap<>();
    definitions.stream()
        .filter(d -> d.statement instanceof Definition)
        .forEach(d -> indexedDefinitions.put(((Definition) d.statement).getIdentifier(), d));
    List<DefinitionStatement> result = new ArrayList<>();
    programDefinitions.forEach(d -> {
      if ((d.statement instanceof Definition def) && indexedDefinitions.containsKey(def.getIdentifier())) {
        result.add(indexedDefinitions.remove(def.getIdentifier()));
      } else {
        result.add(d);
      }
    });
    result.addAll(indexedDefinitions.values());
    return result;
  }
}
