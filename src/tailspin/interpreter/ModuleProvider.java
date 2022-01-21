package tailspin.interpreter;

import java.nio.file.Path;
import java.util.List;

public interface ModuleProvider {
  SymbolLibrary installDependencies(List<SymbolLibrary> inheritedModules, Path basePath);
}
