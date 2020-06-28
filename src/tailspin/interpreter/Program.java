package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

import tailspin.control.Definition;
import tailspin.control.ResultIterator;

public class Program {
    private final List<TopLevelStatement> statements;
    private final List<TopLevelStatement> tests;
    private final List<ProgramDependency> dependencies;

    public Program(List<TopLevelStatement> statements, List<TopLevelStatement> tests, List<ProgramDependency> dependencies) {
        this.statements = statements;
        this.tests = tests;
        this.dependencies = dependencies;
    }

    public void run(BasicScope scope) {
        Set<String> externalSymbols = statements.stream()
        .flatMap(t -> t.requiredDefinitions.stream().filter(s -> s.contains("/")))
        .collect(Collectors.toSet());
        for (ProgramDependency dependency : dependencies) {
            externalSymbols = dependency.installSymbols(externalSymbols, scope);
        }
        statements.forEach(t -> {
            t.statement.getResults(null, scope);
        });
    }

    public String runTests(BasicScope scope) {
        return tests.stream().map(t -> {
            installSymbols(t.requiredDefinitions, scope);
            return t.statement.getResults(null, scope);
        }).flatMap(ri -> ResultIterator.toQueue(ResultIterator.flat(ri)).stream()).map(Object::toString)
                .collect(Collectors.joining("\n"));
    }

    void installSymbols(Set<String> requiredDefinitions, BasicScope scope) {
        Map<String,Set<String>> defDeps = statements.stream()
            .filter(t -> t.statement instanceof Definition)
            .collect(Collectors.toMap(t -> ((Definition) t.statement).getIdentifier(), t -> t.requiredDefinitions));
        Queue<String> neededDefinitions = new ArrayDeque<>(requiredDefinitions);
        Set<String> transientDefinitions = new HashSet<>();
        while (!neededDefinitions.isEmpty()) {
            String def = neededDefinitions.poll();
            if (scope.definitions.keySet().contains(def)) {
                continue;
            }
            if (!defDeps.keySet().contains(def)) {
                throw new IllegalStateException("No definition provided for " + def);
            }
            if (transientDefinitions.add(def)) {
                neededDefinitions.addAll(defDeps.get(def));
            }
        }
        statements.stream()
            .filter(t -> t.statement instanceof Definition)
            .filter(t -> transientDefinitions.contains(((Definition) t.statement).getIdentifier()))
            .forEach(t -> t.statement.getResults(null, scope));
    }
}