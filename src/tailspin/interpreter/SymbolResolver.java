package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import tailspin.interpreter.lang.Lang;

public abstract class SymbolResolver {

  private final List<IncludedFile> includedFiles;
  private List<SymbolLibrary> openedIncludedFiles;

  public SymbolResolver(List<IncludedFile> includedFiles) {
    this.includedFiles = includedFiles;
  }

  public abstract List<DefinitionStatement> getDefinitions();

  public List<IncludedFile> getIncludedFiles() {
    return includedFiles;
  }

  Set<String> resolveSymbolDependencies(
      Set<String> symbolsToInstall, BasicScope scope, List<SymbolLibrary> providedDependencies) {
    Map<String, Set<String>> definedSymbols = new HashMap<>();
    for (DefinitionStatement s : getDefinitions()) {
      if (s.getDefinedSymbol() != null) {
        definedSymbols.put(s.getDefinedSymbol(), s.getRequiredDefinitions());
      }
    }
    Queue<String> neededDefinitions = new ArrayDeque<>(symbolsToInstall);
    Set<String> internalDefinitions = new HashSet<>();
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
      if (internalDefinitions.add(def)) {
        neededDefinitions.addAll(definedSymbols.get(def));
      }
    }
    for (SymbolLibrary dependency : openIncludedFiles(scope, providedDependencies)) {
      externalDefinitions = dependency.installSymbols(externalDefinitions, scope);
    }
    for (SymbolLibrary lib : providedDependencies) {
      externalDefinitions = lib.installSymbols(externalDefinitions, scope);
    }
    if (!externalDefinitions.isEmpty()) Lang.installBuiltins(externalDefinitions, scope);
    return internalDefinitions;
  }

  List<SymbolLibrary> openIncludedFiles(
      BasicScope scope, List<SymbolLibrary> providedDependencies) {
    if (openedIncludedFiles == null) {
      openedIncludedFiles =
          includedFiles.stream()
              .map(i -> i.open(scope, providedDependencies))
              .collect(Collectors.toList());
    }
    return openedIncludedFiles;
  }
}
