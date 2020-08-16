package tailspin.interpreter;

import java.util.List;

public class ModuleInheritance implements ModuleProvider {

  private final String prefix;

  public ModuleInheritance(String prefix) {
    this.prefix = prefix;
  }

  @Override
  public SymbolLibrary installDependencies(List<SymbolLibrary> inheritedModules, BasicScope scope) {
    BasicScope depScope = new BasicScope(scope.basePath());
    return new SymbolLibrary(prefix, depScope, inheritedModules);
  }
}
