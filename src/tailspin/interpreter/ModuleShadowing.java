package tailspin.interpreter;

import java.util.List;

public class ModuleShadowing extends Module implements ModuleProvider {
  private final String prefix;
  private final String inheritedModulePrefix;
  private final List<ModuleProvider> providedDependencies;

  public ModuleShadowing(String prefix, String inheritedModulePrefix,
      List<DefinitionStatement> statements,
      List<ModuleProvider> providedDependencies) {
    super(statements, List.of());
    this.prefix = prefix;
    this.inheritedModulePrefix = inheritedModulePrefix;
    this.providedDependencies = providedDependencies;
  }

  @Override
  public SymbolLibrary installDependencies(List<SymbolLibrary> inheritedModules, BasicScope scope) {
    BasicScope depScope = new BasicScope(scope.basePath());
    resolveAll(depScope, getModules(providedDependencies, inheritedModules, scope));
    return new SymbolLibrary(prefix, inheritedModulePrefix, depScope, inheritedModules);
  }
}
