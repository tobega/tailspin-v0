package tailspin.interpreter;

import java.util.List;

public interface ModuleProvider {
  SymbolLibrary installDependencies(List<SymbolLibrary> inheritedModules, BasicScope scope);
}
