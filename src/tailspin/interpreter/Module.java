package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class Module {

  protected final List<DefinitionStatement> definitions;
  private final List<IncludedFile> includedFiles;

  public Module(
      List<DefinitionStatement> definitions,
      List<IncludedFile> includedFiles) {
    this.definitions = definitions;
    this.includedFiles = includedFiles;
  }

  void resolveSymbols(Set<String> internalSymbols, BasicScope scope,
      List<SymbolLibrary> providedDependencies) {
    Map<String, Set<String>> definedSymbols = definitions.stream()
        .collect(Collectors
            .toMap(d -> d.statement.getIdentifier(), d -> d.requiredDefinitions));
    Queue<String> neededDefinitions = new ArrayDeque<>(internalSymbols);
    Set<String> transientDefinitions = new HashSet<>();
    Set<String> externalDefinitions = new HashSet<>();
    while (!neededDefinitions.isEmpty()) {
      String def = neededDefinitions.poll();
      if (scope.hasDefinition(def)) {
        continue;
      }
      if (!definedSymbols.containsKey(def)) {
        externalDefinitions.add(def);
        continue;
      }
      if (transientDefinitions.add(def)) {
        neededDefinitions.addAll(definedSymbols.get(def));
      }
    }
    for (IncludedFile dependency : includedFiles) {
      externalDefinitions = dependency.installSymbols(externalDefinitions, scope, providedDependencies);
    }
    for (SymbolLibrary lib : providedDependencies) {
      externalDefinitions = lib.installSymbols(externalDefinitions, scope);
    }
    definitions.stream()
        .filter(d -> transientDefinitions.contains(d.statement.getIdentifier()))
        .forEach(d -> d.statement.getResults(null, scope));
  }

  void resolveAll(BasicScope scope, List<SymbolLibrary> providedDependencies) {
    resolveSymbols(
        definitions.stream().map(d -> d.statement.getIdentifier()).collect(Collectors.toSet()),
        scope, providedDependencies);
  }
}
