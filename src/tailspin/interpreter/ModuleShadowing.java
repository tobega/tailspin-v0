package tailspin.interpreter;

import java.nio.file.Path;
import java.util.List;
import java.util.function.Supplier;

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
  public SymbolLibrary installDependencies(List<SymbolLibrary> inheritedModules, Path basePath) {
    List<SymbolLibrary> resolvedModules = getModules(providedDependencies, inheritedModules, basePath);
    return new SymbolLibrary(prefix, inheritedModulePrefix, new Supplier<>() {
      BasicScope depScope;
      @Override
      public BasicScope get() {
        if (depScope == null) {
          depScope = new BasicScope(basePath);
          resolveAll(depScope, resolvedModules);
        }
        return depScope;
      }
    }, inheritedModules);
  }
}
