package tailspin.interpreter;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

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
    SymbolLibrary inheritedModule = inheritedModules.stream().filter(s -> Objects.equals(s.prefix, inheritedModulePrefix)).findFirst().orElse(null);
    return new SymbolLibrary(prefix, new Installer(prefix, basePath, resolvedModules), inheritedModule);
  }
}
