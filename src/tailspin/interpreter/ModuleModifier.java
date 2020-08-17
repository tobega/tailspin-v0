package tailspin.interpreter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import tailspin.Tailspin;
import tailspin.control.Value;

public class ModuleModifier extends Module implements ModuleProvider {
  private final String prefix;
  private final Value includePath;
  private final List<ModuleProvider> providedDependencies;

  public ModuleModifier(String prefix, List<DefinitionStatement> statements,
      Value includePath, List<ModuleProvider> providedDependencies) {
    super(statements, List.of());
    this.prefix = prefix;
    this.includePath = includePath;
    this.providedDependencies = providedDependencies;
  }

  @Override
  public SymbolLibrary installDependencies(List<SymbolLibrary> inheritedModules, BasicScope scope) {
    BasicScope depScope = new BasicScope(scope.basePath());
    List<SymbolLibrary> providedModules = getModules(providedDependencies, inheritedModules, depScope);
    resolveAll(depScope, providedModules);
    String dependency = (String) includePath.getResults(null, scope);
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
    module.resolveAll(depScope, providedModules);
    return new SymbolLibrary(dependencyPrefix, null, depScope, List.of());
  }

  private Program getProgram(Path depPath) {
    try {
      Tailspin dep = Tailspin.parse(Files.newInputStream(depPath));
      return new RunMain().visitProgram(dep.programDefinition);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
