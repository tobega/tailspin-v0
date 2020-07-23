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
        return tests.stream().map(t -> {
            BasicScope scope = new BasicScope(basePath);
            Set<String> externalDefinitions = t.installOverrides(scope);
            installSymbols(externalDefinitions, scope, List.of(coreSystemProvider));
            return t.test.getResults(null, scope);
        }).flatMap(ri -> ResultIterator.toQueue(ResultIterator.flat(ri)).stream()).map(Object::toString)
                .collect(Collectors.joining("\n"));
    }

    @Override
    public Set<String> installSymbols(Set<String> requestedSymbols, Scope scope, List<SymbolLibrary> systemDeps) {
        Map<String,Set<String>> definedSymbols = statements.stream()
            .filter(t -> t.statement instanceof Definition)
            .collect(Collectors.toMap(t -> ((Definition) t.statement).getIdentifier(), t -> t.requiredDefinitions));
        Queue<String> neededDefinitions = new ArrayDeque<>();
        Set<String> unprovidedSymbols = new HashSet<>();
        for (String symbol : requestedSymbols) {
            if (definedSymbols.containsKey(symbol)) {
                neededDefinitions.add(symbol);
            } else {
                unprovidedSymbols.add(symbol);
            }
        }
        Set<String> transientDefinitions = new HashSet<>();
        Set<String> externalDefinitions = new HashSet<>();
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
        return unprovidedSymbols;
    }
}