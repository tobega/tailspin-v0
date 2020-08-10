package tailspin.interpreter;

import tailspin.control.Definition;
import tailspin.control.ResultIterator;

import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Program implements SymbolLibrary {
    private final List<TopLevelStatement> statements;
    private final List<TestStatement> tests;
    private final List<IncludedFile> includedFiles;

    public Program(List<TopLevelStatement> statements, List<TestStatement> tests, List<IncludedFile> includedFiles) {
        this.statements = statements;
        this.tests = tests;
        this.includedFiles = includedFiles;
    }

    public void run(Path basePath, SymbolLibrary coreSystemProvider) {
        BasicScope scope = new BasicScope(basePath);
        Set<String> requiredSymbols = statements.stream()
        .flatMap(t -> t.requiredDefinitions.stream())
        .collect(Collectors.toSet());
        for (IncludedFile dependency : includedFiles) {
            requiredSymbols = dependency.installSymbols(requiredSymbols, scope, List.of(coreSystemProvider));
        }
        coreSystemProvider.installSymbols(requiredSymbols, scope, List.of());
        statements.forEach(t -> t.statement.getResults(null, scope));
    }

    public String runTests(Path basePath, SymbolLibrary coreSystemProvider) {
        StringBuilder result = new StringBuilder();
        tests.stream().map(t -> t.executeTest(this, basePath, coreSystemProvider))
            .forEach(r -> ResultIterator.forEach(r, obj -> result.append(obj).append("\n")));
        return result.toString();
    }

    @Override
    public Set<String> installSymbols(Set<String> requestedSymbols, BasicScope scope, List<SymbolLibrary> systemDeps) {
        Set<String> providedSymbols = new HashSet<>();
        Set<String> unprovidedSymbols = new HashSet<>(requestedSymbols);
        statements.stream()
            .filter(t -> t.statement instanceof Definition)
            .map(t -> ((Definition) t.statement).getIdentifier())
            .filter(requestedSymbols::contains)
            .forEach(id -> {
                unprovidedSymbols.remove(id);
                providedSymbols.add(id);
            });
        installInternal(scope, systemDeps, providedSymbols);
        return unprovidedSymbols;
    }

    void installInternal(BasicScope scope, List<SymbolLibrary> systemDeps, Set<String> providedSymbols) {
        Map<String,Set<String>> definedSymbols = statements.stream()
            .filter(t -> t.statement instanceof Definition)
            .collect(Collectors.toMap(t -> ((Definition) t.statement).getIdentifier(), t -> t.requiredDefinitions));
        Set<String> transientDefinitions = new HashSet<>();
        Set<String> externalDefinitions = new HashSet<>();
        Queue<String> neededDefinitions = new ArrayDeque<>(providedSymbols);
        while (!neededDefinitions.isEmpty()) {
            String def = neededDefinitions.poll();
            if (scope.hasDefinition(def)) {
                continue;
            }
            if (!definedSymbols.containsKey(def)) {
                externalDefinitions.add(def);
                continue;
            }
            if (transientDefinitions.add(def)) {
                neededDefinitions.addAll(definedSymbols.get(def));
            }
        }
        for (SymbolLibrary lib : systemDeps) {
            externalDefinitions = lib.installSymbols(externalDefinitions, scope, List.of());
        }
        statements.stream()
            .filter(t -> t.statement instanceof Definition)
            .filter(t -> transientDefinitions.contains(((Definition) t.statement).getIdentifier()))
            .forEach(t -> t.statement.getResults(null, scope));
    }
}