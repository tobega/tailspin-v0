package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import tailspin.control.Definition;

public class ModuleModifier implements SymbolLibrary {
  private final String dependencyPrefix;
  private final List<TopLevelStatement> statements;

  public ModuleModifier(String dependencyPrefix, List<TopLevelStatement> statements) {
    this.dependencyPrefix = dependencyPrefix;
    this.statements = statements;
  }

  @Override
  public Set<String> installSymbols(Set<String> requiredSymbols, BasicScope scope, List<SymbolLibrary> inheritedProviders) {
    Set<String> providedSymbols = new HashSet<>();
    Set<String> unresolvedSymbols = new HashSet<>();
    requiredSymbols.forEach(s -> {
      if (s.startsWith(dependencyPrefix)) {
        providedSymbols.add(s.substring(dependencyPrefix.length()));
      } else {
        unresolvedSymbols.add(s);
      }
    });
    BasicScope depScope = new BasicScope(scope.basePath());
    resolveSymbols(providedSymbols, depScope, inheritedProviders);
    providedSymbols.stream().filter(depScope::hasDefinition).forEach(s -> scope.defineValue(dependencyPrefix + s, depScope.resolveValue(s)));
    // inherit
    providedSymbols.stream().map(s -> dependencyPrefix + s).filter(s -> !scope.hasDefinition(s)).forEach(unresolvedSymbols::add);
    return unresolvedSymbols;
  }

  private void resolveSymbols(Set<String> internalSymbols, BasicScope scope, List<SymbolLibrary> systemDeps) {
    Map<String,Set<String>> definedSymbols = statements.stream()
        .filter(t -> t.statement instanceof Definition)
        .collect(Collectors.toMap(t -> ((Definition) t.statement).getIdentifier(), t -> t.requiredDefinitions));
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
    for (SymbolLibrary lib : systemDeps) {
      externalDefinitions = lib.installSymbols(externalDefinitions, scope, List.of());
    }
    statements.stream()
        .filter(t -> t.statement instanceof Definition)
        .filter(t -> transientDefinitions.contains(((Definition) t.statement).getIdentifier()))
        .forEach(t -> t.statement.getResults(null, scope));
  }
}
