package tailspin.interpreter;

import java.util.List;

public class ModuleInheritance implements ModuleProvider {

  private final String prefix;
  private final String inheritedModulePrefix;

  public ModuleInheritance(String prefix, String inheritedModulePrefix) {
    this.prefix = prefix;
    this.inheritedModulePrefix = inheritedModulePrefix;
  }

  @Override
  public SymbolLibrary installDependencies(List<SymbolLibrary> inheritedModules, BasicScope scope) {
    BasicScope depScope = new BasicScope(scope.basePath());
    return new SymbolLibrary(prefix, inheritedModulePrefix, depScope, inheritedModules);
  }
}
