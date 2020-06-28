package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

import tailspin.control.Definition;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.testing.Test;

public class Program {
    private List<Expression> statements;
    private List<Test> tests;

    public Program(List<Expression> statements, List<Test> tests) {
        this.statements = statements;
        this.tests = tests;
    }

    public void run(BasicScope scope) {
        statements.forEach(s -> {
            s.getResults(null, scope);
        });
    }

    public String runTests(BasicScope scope) {
        return tests.stream().map(t -> {
            installSymbols(t.getRequiredDefinitions(), scope);
            return t.getResults(null, scope);
        }).flatMap(ri -> ResultIterator.toQueue(ResultIterator.flat(ri)).stream()).map(Object::toString)
                .collect(Collectors.joining("\n"));
    }

    private void installSymbols(Set<String> requiredDefinitions, BasicScope scope) {
        Map<String,Set<String>> defDeps = statements.stream()
            .filter(Definition.class::isInstance).map(Definition.class::cast)
            .collect(Collectors.toMap(d -> d.getIdentifier(), d -> d.getRequiredDefinitions()));
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
            .filter(Definition.class::isInstance).map(Definition.class::cast)
            .filter(d -> transientDefinitions.contains(d.getIdentifier()))
            .forEach(d -> d.getResults(null, scope));
    }
}