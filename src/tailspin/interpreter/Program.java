package tailspin.interpreter;

import tailspin.control.Definition;
import tailspin.control.ResultIterator;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    private final List<TopLevelStatement> statements;
    private final List<TestStatement> tests;
    private final List<ProgramDependency> dependencies;

    public Program(List<TopLevelStatement> statements, List<TestStatement> tests, List<ProgramDependency> dependencies) {
        this.statements = statements;
        this.tests = tests;
        this.dependencies = dependencies;
    }

    public void run(BasicScope scope, DependencyProvider coreSystemProvider) {
        Set<String> requiredSymbols = statements.stream()
        .flatMap(t -> t.requiredDefinitions.stream())
        .collect(Collectors.toSet());
        for (ProgramDependency dependency : dependencies) {
            requiredSymbols = dependency.installSymbols(requiredSymbols, scope, coreSystemProvider);
        }
        coreSystemProvider.installSymbols(requiredSymbols, scope);
        statements.forEach(t -> t.statement.getResults(null, scope));
    }

    public String runTests(BasicScope scope, DependencyProvider coreSystemProvider) {
        return tests.stream().map(t -> {
            Set<String> externalDefinitions = t.installOverrides(scope);
            installSymbols(externalDefinitions, scope, coreSystemProvider);
            return t.test.getResults(null, scope);
        }).flatMap(ri -> ResultIterator.toQueue(ResultIterator.flat(ri)).stream()).map(Object::toString)
                .collect(Collectors.joining("\n"));
    }

    void installSymbols(Set<String> requiredDefinitions, BasicScope scope, DependencyProvider systemDeps) {
        Map<String,Set<String>> defDeps = statements.stream()
            .filter(t -> t.statement instanceof Definition)
            .collect(Collectors.toMap(t -> ((Definition) t.statement).getIdentifier(), t -> t.requiredDefinitions));
        Queue<String> neededDefinitions = new ArrayDeque<>(requiredDefinitions);
        Set<String> transientDefinitions = new HashSet<>();
        Set<String> externalDefinitions = new HashSet<>();
        while (!neededDefinitions.isEmpty()) {
            String def = neededDefinitions.poll();
            if (scope.definitions.containsKey(def)) {
                continue;
            }
            if (!defDeps.containsKey(def)) {
                externalDefinitions.add(def);
                continue;
            }
            if (transientDefinitions.add(def)) {
                neededDefinitions.addAll(defDeps.get(def));
            }
        }
        systemDeps.installSymbols(externalDefinitions, scope);
        statements.stream()
            .filter(t -> t.statement instanceof Definition)
            .filter(t -> transientDefinitions.contains(((Definition) t.statement).getIdentifier()))
            .forEach(t -> t.statement.getResults(null, scope));
    }
}