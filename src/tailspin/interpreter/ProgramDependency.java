package tailspin.interpreter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import tailspin.Tailspin;
import tailspin.control.Value;
import tailspin.system.StdinProcessor;
import tailspin.system.StdoutProcessor;
import tailspin.system.SystemProcessor;

class ProgramDependency {
    final Value specifier;

    ProgramDependency(Value specifier) {
        this.specifier = specifier;
    }

    private Program getProgram(Path depPath) {
        try {
          Tailspin dep = Tailspin.parse(Files.newInputStream(depPath));
          Program program = new RunMain().visitProgram(dep.programDefinition);
          return program;
        } catch (IOException e) {
          throw new RuntimeException(e);
        }    
    }

    Set<String> installSymbols(Set<String> requiredSymbols, Scope scope) {
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
        @SuppressWarnings("unchecked")
        List<String> args = (List<String>) scope.resolveValue("ARGS");
        // deps should not read from input
        ByteArrayInputStream emptyInput = new ByteArrayInputStream(new byte[0]);
        BasicScope depScope = new BasicScope(emptyInput, scope.getOutput(), depPath.getParent());
        depScope.defineValue("ARGS", args);
        depScope.defineValue("SYS", new SystemProcessor(depScope));
        depScope.defineValue("IN", new StdinProcessor(depScope));
        depScope.defineValue("OUT", new StdoutProcessor(depScope));
        program.installSymbols(providedSymbols, depScope);
        providedSymbols.forEach(s -> scope.defineValue(dependencyPrefix + s, depScope.resolveValue(s)));
        return unresolvedSymbols;
    }
}