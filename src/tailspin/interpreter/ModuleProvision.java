package tailspin.interpreter;

import java.nio.file.Path;
import java.util.List;

public interface ModuleProvision {
    SymbolLibrary resolveDefinitions(Path basePath, List<SymbolLibrary> providedLibraries);
}
