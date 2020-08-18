package tailspin.interpreter;

import java.util.List;
import tailspin.control.Value;

public class ModuleModifier extends ModuleImport {
  private final Module modifier;

  public ModuleModifier(String prefix, List<DefinitionStatement> statements,
      Value includePath, List<ModuleProvider> providedDependencies) {
    super(prefix, includePath, providedDependencies);
    modifier = new Module(statements, List.of());
  }

  @Override
  List<SymbolLibrary> getModulesAndPrepScope(List<SymbolLibrary> inheritedModules,
      BasicScope depScope) {
    List<SymbolLibrary> providedModules = Module.getModules(providedDependencies, inheritedModules, depScope);
    modifier.resolveAll(depScope, providedModules);
    return providedModules;
  }
}
