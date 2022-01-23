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
    Map<String, Integer> indexedDefinitions = new HashMap<>();
    for (int i = 0; i < definitions.size(); i++) {
      if (definitions.get(i).statement instanceof Definition d) {
        indexedDefinitions.put(d.getIdentifier(), i);
      }
    }
    List<DefinitionStatement> result = new ArrayList<>();
    int addedTo = 0;
    for (DefinitionStatement d : programDefinitions) {
      if ((d.statement instanceof Definition def) && indexedDefinitions.containsKey(def.getIdentifier())) {
        int addUntil = indexedDefinitions.get(def.getIdentifier());
        if (addUntil >= addedTo) {
          result.addAll(definitions.subList(addedTo, addUntil+1));
          addedTo = addUntil+1;
        }
      } else {
        result.add(d);
      }
    }
    if (definitions.size() > addedTo) {
      result.addAll(definitions.subList(addedTo, definitions.size()));
    }
    return result;
  }
}
