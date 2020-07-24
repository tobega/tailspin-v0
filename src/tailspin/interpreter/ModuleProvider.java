package tailspin.interpreter;

import java.nio.file.Path;
import java.util.*;

public class ModuleProvider implements ModuleProvision {
  private final List<TopLevelStatement> statements;

  public ModuleProvider(List<TopLevelStatement> statements) {
    this.statements = statements;
  }

  @Override
  public SymbolLibrary resolveDefinitions(Path basePath, List<SymbolLibrary> providedLibraries) {
    BasicScope scope = new BasicScope(basePath);
    statements.stream().forEach(t -> t.statement.getResults(null, scope));
    return new ResolvedSymbolLibrary(scope);
  }
}
