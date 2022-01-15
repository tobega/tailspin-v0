package tailspin.interpreter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import tailspin.Tailspin;
import tailspin.control.Value;

class ModuleImport implements ModuleProvider {
  // @Nullable
  final String prefix;
  final Value specifier;
  final List<ModuleProvider> providedDependencies;

  ModuleImport(/*@Nullable*/ String prefix, Value specifier,
      List<ModuleProvider> providedDependencies) {
    this.prefix = prefix;
    this.specifier = specifier;
    this.providedDependencies = providedDependencies;
  }

  private Module getProgram(Path depPath) {
    try {
      Tailspin dep = Tailspin.parse(Files.newInputStream(depPath));
      return new RunMain().visitProgram(dep.programDefinition).asModule();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public SymbolLibrary installDependencies(List<SymbolLibrary> inheritedModules, BasicScope scope) {
    String dependency = (String) specifier.getResults(null, scope);
    if (dependency.startsWith("java:")) {
      return new JavaSymbolLibrary(dependency.substring("java:".length()));
    }
    Path basePath = scope.basePath();
    if (dependency.startsWith("module:")) {
      dependency = dependency.substring("module:".length());
      String modulePath = System.getProperty("TAILSPIN_MODULES");
      if (modulePath == null) modulePath = System.getenv("TAILSPIN_MODULES");
      basePath = Path.of(modulePath);
    }
    String dependencyPrefix =
        prefix != null ? prefix : dependency.substring(dependency.lastIndexOf('/') + 1) + "/";
    Path depPath = basePath.resolve(dependency + ".tt");
    try {
      if (!depPath.toRealPath().startsWith(basePath.toRealPath())) {
        throw new IllegalArgumentException(
            "Attempt to include file " + depPath + " from outside hierarchy of " + basePath);
      }
    } catch (IOException e) {
      throw new IllegalArgumentException("Unable to resolve " + depPath);
    }
    Module module = getProgram(depPath);
    BasicScope depScope = new BasicScope(depPath.getParent());
    module.resolveAll(depScope, getModulesAndPrepScope(inheritedModules, depScope));
    return new SymbolLibrary(dependencyPrefix, null, depScope, List.of());
  }

  List<SymbolLibrary> getModulesAndPrepScope(List<SymbolLibrary> inheritedModules,
      BasicScope depScope) {
    return Module.getModules(providedDependencies, inheritedModules, depScope);
  }
}
