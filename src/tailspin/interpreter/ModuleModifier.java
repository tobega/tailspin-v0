package tailspin.interpreter;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ModuleModifier extends Module implements ModuleProvider {
  private final String dependencyPrefix;
  private final List<ModuleProvider> providedDependencies;

  public ModuleModifier(String dependencyPrefix, List<DefinitionStatement> statements,
      List<ModuleProvider> providedDependencies) {
    super(statements, List.of());
    this.dependencyPrefix = dependencyPrefix;
    this.providedDependencies = providedDependencies;
  }

  class Provided implements SymbolLibrary {

    private final List<SymbolLibrary> inheritedProviders;

    Provided(List<SymbolLibrary> inheritedProviders) {
      this.inheritedProviders = inheritedProviders;
    }

    @Override
    public Set<String> installSymbols(
        Set<String> requiredSymbols, BasicScope scope) {
      Set<String> providedSymbols = getProvidedSymbols(dependencyPrefix, requiredSymbols);
      BasicScope depScope = new BasicScope(scope.basePath());
      resolveSymbols(providedSymbols, depScope, inheritedProviders);
      providedSymbols.stream()
          .filter(depScope::hasDefinition)
          .forEach(s -> scope.defineValue(dependencyPrefix + s, depScope.resolveValue(s)));
      Set<String> inheritedSymbols = providedSymbols.stream()
          .map(s -> dependencyPrefix + s)
          .filter(s -> !scope.hasDefinition(s)).collect(Collectors.toSet());
      for (SymbolLibrary lib : inheritedProviders) {
        Set<String> remaining = lib.installSymbols(inheritedSymbols, scope);
        if (!remaining.isEmpty() && remaining.size() != inheritedSymbols.size()) {
          throw new IllegalStateException(
              "Some symbols not provided: " + remaining);
        }
        if (remaining.isEmpty()) break;
      }
      return getUnprovidedSymbols(dependencyPrefix, requiredSymbols);
    }
  }

  @Override
  public SymbolLibrary installDependencies(List<SymbolLibrary> providedDependencies) {
    return new Provided(providedDependencies);
  }
}
