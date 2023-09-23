package tailspin.interpreter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import tailspin.Tailspin;
import tailspin.control.Value;

class IncludedFile {
  final Value specifier;

  IncludedFile(Value specifier) {
    this.specifier = specifier;
  }

  private Module getProgram(Path depPath) {
    try {
      Tailspin dep = Tailspin.parse(Files.newInputStream(depPath));
      return new RunMain().visitProgram(dep.programDefinition).asModule();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public SymbolLibrary.Installer open(BasicScope scope, List<SymbolLibrary> providedDependencies) {
    String dependency = (String) specifier.getResults(null, scope);
    Path basePath = scope.basePath();
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
    return module.new Installer("", basePath, providedDependencies);
  }
}
