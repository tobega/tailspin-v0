package tailspin.interpreter;

import java.nio.file.Path;
import java.util.List;

public class ModuleInheritance implements ModuleProvider {

  private final String prefix;
  private final String inheritedModulePrefix;

  public ModuleInheritance(String prefix, String inheritedModulePrefix) {
    this.prefix = prefix;
    this.inheritedModulePrefix = inheritedModulePrefix;
  }

  @Override
  public SymbolLibrary installDependencies(List<SymbolLibrary> inheritedModules, Path basePath) {
    BasicScope depScope = new BasicScope(basePath);
    return new SymbolLibrary(prefix, inheritedModulePrefix, depScope, inheritedModules);
  }
}
