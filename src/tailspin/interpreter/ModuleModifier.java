package tailspin.interpreter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ModuleModifier extends Module implements SymbolLibrary {
  private final String dependencyPrefix;

  public ModuleModifier(String dependencyPrefix, List<DefinitionStatement> statements) {
    super(statements, List.of());
    this.dependencyPrefix = dependencyPrefix;
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

}
