package tailspin.interpreter;

import java.util.HashSet;
import java.util.Set;

class DependencyCounter {
    Set<String> localDefinitions = new HashSet<>();
    Set<String> requiredDefinitions = new HashSet<>();

    void reference(String ref) {
        if (!localDefinitions.contains(ref)) {
            requiredDefinitions.add(ref);
        }
    }

    void define(String def) {
        localDefinitions.add(def);
    }

    Set<String> getRequiredDefinitions() {
        return requiredDefinitions;
    }

    void requireAll(Set<String> req) {
        req.forEach(this::reference);
    }
}