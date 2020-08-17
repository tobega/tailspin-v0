package tailspin.interpreter;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class SymbolLibrary {

    private final String prefix;
    private final BasicScope depScope;
    private final Optional<SymbolLibrary> inheritedProvider;

    public SymbolLibrary(String prefix,
        BasicScope depScope, List<SymbolLibrary> inheritedProviders) {
        this.prefix = prefix;
        this.depScope = depScope;
        this.inheritedProvider = inheritedProviders.stream().filter(s -> prefix.equals(s.prefix)).findFirst();
    }

    /**
     * Installs the symbols matching the prefix of this provider and returns the symbols that still need  resolving.
     * @throws IllegalStateException if an expected symbol is not provided
     */
    Set<String> installSymbols(Set<String> requiredSymbols, BasicScope scope) {
        Set<String> providedSymbols = getProvidedSymbols(requiredSymbols);
        Set<String> inheritedSymbols = resolveSymbols(providedSymbols, scope);
        inheritSymbols(inheritedSymbols, scope);
        return getUnprovidedSymbols(requiredSymbols);
    }

    /**
     * Resolves the symbols provided by this module, returning any which are to be installed
     * from inherited modules.
     */
    private Set<String> resolveSymbols(Set<String> providedSymbols,
        BasicScope scope) {
        providedSymbols.stream()
            .filter(depScope::hasDefinition)
            .forEach(s -> scope.defineValue(prefix + s, depScope.resolveValue(s)));
        return providedSymbols.stream()
            .map(s -> prefix + s)
            .filter(s -> !scope.hasDefinition(s)).collect(Collectors.toSet());
    }

    private void inheritSymbols(Set<String> inheritedSymbols, BasicScope scope) {
        inheritedProvider.ifPresentOrElse(lib -> {
            Set<String> remaining = lib.installSymbols(inheritedSymbols, scope);
            if (!remaining.isEmpty() && remaining.size() != inheritedSymbols.size()) {
                throw new IllegalStateException(
                    "Some symbols not provided: " + remaining);
            }
        }, () -> {if (!inheritedSymbols.isEmpty()) throw new IllegalStateException(
            "Some symbols not provided:\n" + inheritedSymbols);});
    }

    private Set<String> getProvidedSymbols(Set<String> requiredSymbols) {
        if (prefix.isEmpty()) {
            return requiredSymbols.stream().filter(s -> !s.contains("/")).collect(Collectors.toSet());
        }
        return requiredSymbols.stream().filter(s -> s.startsWith(prefix))
            .map(s -> s.substring(prefix.length())).collect(Collectors.toSet());
    }

    private Set<String> getUnprovidedSymbols(Set<String> requiredSymbols) {
        if (prefix.isEmpty()) {
            return requiredSymbols.stream().filter(s -> s.contains("/")).collect(Collectors.toSet());
        }
        return requiredSymbols.stream().filter(s -> !s.startsWith(prefix)).collect(Collectors.toSet());
    }
}