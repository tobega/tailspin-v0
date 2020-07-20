package tailspin.interpreter;

import tailspin.control.Definition;

import java.util.*;
import java.util.stream.Collectors;

public class ModuleProvider implements DependencyProvider {
    private final List<TopLevelStatement> statements;

    public ModuleProvider(List<TopLevelStatement> statements) {
        this.statements = statements;
    }

    @Override
    public Set<String> installSymbols(Set<String> requiredSymbols, Scope scope, List<DependencyProvider> providedModules) {
        Map<String,Set<String>> defDeps = statements.stream()
                .filter(t -> t.statement instanceof Definition)
                .collect(Collectors.toMap(t -> ((Definition) t.statement).getIdentifier(), t -> t.requiredDefinitions));
        Queue<String> neededSymbols = new ArrayDeque<>(requiredSymbols);
        Set<String> internalDefinitions = new HashSet<>();
        Set<String> externalDefinitions = new HashSet<>();
        while (!neededSymbols.isEmpty()) {
            String def = neededSymbols.poll();
            if (!defDeps.containsKey(def)) {
                externalDefinitions.add(def);
                continue;
            }
            if (internalDefinitions.add(def)) {
                neededSymbols.addAll(defDeps.get(def));
            }
        }
        for (DependencyProvider module : providedModules) {
            externalDefinitions = module.installSymbols(externalDefinitions, scope,
                    providedModules.subList(1, providedModules.size()));
        }
        statements.stream()
                .filter(t -> t.statement instanceof Definition)
                .filter(t -> internalDefinitions.contains(((Definition) t.statement).getIdentifier()))
                .forEach(t -> t.statement.getResults(null, scope));
        return externalDefinitions;
    }
}
