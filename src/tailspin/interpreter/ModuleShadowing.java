package tailspin.interpreter;

import java.util.List;

public class ModuleShadowing extends Module implements ModuleProvider {
  private final String dependencyPrefix;
  private final List<ModuleProvider> providedDependencies;

  public ModuleShadowing(String dependencyPrefix, List<DefinitionStatement> statements,
      List<ModuleProvider> providedDependencies) {
    super(statements, List.of());
    this.dependencyPrefix = dependencyPrefix;
    this.providedDependencies = providedDependencies;
  }

  @Override
  public SymbolLibrary installDependencies(List<SymbolLibrary> inheritedModules, BasicScope scope) {
    BasicScope depScope = new BasicScope(scope.basePath());
    resolveAll(depScope, getModules(providedDependencies, inheritedModules, scope));
    return new SymbolLibrary(dependencyPrefix, depScope, inheritedModules);
  }
}
