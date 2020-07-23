package tailspin.interpreter;

import tailspin.Tailspin;
import tailspin.control.Value;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ProgramDependency {
    final Value specifier;

    ProgramDependency(Value specifier) {
        this.specifier = specifier;
    }

    private Program getProgram(Path depPath) {
        try {
          Tailspin dep = Tailspin.parse(Files.newInputStream(depPath));
            return new RunMain().visitProgram(dep.programDefinition);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }    
    }

    Set<String> installSymbols(Set<String> requiredSymbols, Scope scope, List<SymbolLibrary> inheritedProviders) {
        String dependency = (String) specifier.getResults(null, scope);
        String dependencyPrefix = dependency.substring(dependency.lastIndexOf('/') + 1) + "/";
        Path depPath = scope.basePath().resolve(dependency + ".tt");
        Set<String> providedSymbols = new HashSet<>();
        Set<String> unresolvedSymbols = new HashSet<>();
        requiredSymbols.forEach(s -> {
            if (s.startsWith(dependencyPrefix)) {
                providedSymbols.add(s.substring(dependencyPrefix.length()));
            } else {
                unresolvedSymbols.add(s);
            }
        });
        Program program = getProgram(depPath);
        BasicScope depScope = new BasicScope(depPath.getParent());
        program.installSymbols(providedSymbols, depScope, inheritedProviders);
        providedSymbols.forEach(s -> scope.defineValue(dependencyPrefix + s, depScope.resolveValue(s)));
        return unresolvedSymbols;
    }
}