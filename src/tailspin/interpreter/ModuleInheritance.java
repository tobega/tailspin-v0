package tailspin.interpreter;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tailspin.interpreter.SymbolLibrary.Installer;

public class ModuleInheritance implements ModuleProvider {

  private final String prefix;
  private final String inheritedModulePrefix;

  public ModuleInheritance(String prefix, String inheritedModulePrefix) {
    this.prefix = prefix;
    this.inheritedModulePrefix = inheritedModulePrefix;
  }

  @Override
  public SymbolLibrary installDependencies(List<SymbolLibrary> inheritedModules, Path basePath) {
    return new SymbolLibrary(prefix, inheritedModulePrefix, new SymbolLibrary.Installer() {
      @Override
      public Set<String> resolveSymbols(Set<String> providedSymbols, BasicScope scope,
          Map<Path, Installer> includedFileInstallers) {
        return providedSymbols;
      }
    }, inheritedModules);
  }
}
