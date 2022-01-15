package tailspin.interpreter;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import tailspin.interpreter.lang.Lang;

public class SymbolLibrary {

    final String prefix;
    private final String inheritedModulePrefix;
    final Supplier<BasicScope> depScopeSupplier;
    private final Optional<SymbolLibrary> inheritedProvider;

    public SymbolLibrary(String prefix,
        String inheritedModulePrefix, Supplier<BasicScope> depScopeSupplier,
        List<SymbolLibrary> inheritedProviders) {
        this.prefix = prefix;
        this.inheritedModulePrefix = inheritedModulePrefix;
        this.depScopeSupplier = depScopeSupplier;
        this.inheritedProvider = inheritedProviders.stream()
            .filter(s -> inheritedModulePrefix.equals(s.prefix)).findFirst();
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
    Set<String> resolveSymbols(Set<String> providedSymbols, BasicScope scope) {
        providedSymbols.stream()
            .filter(s -> depScopeSupplier.get().hasDefinition(s))
            .forEach(s -> scope.defineValue(prefix + s, depScopeSupplier.get().resolveValue(s)));
        return providedSymbols.stream()
            .filter(s -> !depScopeSupplier.get().hasDefinition(s))
            .collect(Collectors.toSet());
    }

    private void inheritSymbols(Set<String> inheritedSymbols, BasicScope scope) {
        inheritedProvider.ifPresentOrElse(lib -> {
            BasicScope inheritedScope = new BasicScope(scope.basePath());
            lib.installSymbols(
                inheritedSymbols.stream().map(s -> inheritedModulePrefix + s).collect(Collectors.toSet()),
                inheritedScope);
            inheritedSymbols.forEach(s -> scope.defineValue(prefix + s, inheritedScope.resolveValue(inheritedModulePrefix + s)));
        }, () -> Lang.installBuiltins(inheritedSymbols, scope));
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