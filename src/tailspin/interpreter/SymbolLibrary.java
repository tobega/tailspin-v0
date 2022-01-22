package tailspin.interpreter;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import tailspin.interpreter.lang.Lang;

public class SymbolLibrary {
    public interface Installer {
        BasicScope get();
        default Set<String> install(Set<String> registeredSymbols){
            return registeredSymbols;
        }
    }

    final String prefix;
    private final String inheritedModulePrefix;
    final Installer depScopeInstaller;
    private final Optional<SymbolLibrary> inheritedProvider;

    public SymbolLibrary(String prefix,
        String inheritedModulePrefix, Installer depScopeInstaller,
        List<SymbolLibrary> inheritedProviders) {
        this.prefix = prefix;
        this.inheritedModulePrefix = inheritedModulePrefix;
        this.depScopeInstaller = depScopeInstaller;
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
     * Registers the symbols matching the prefix of this provider for resolution and returns the
     * symbols that will need to be resolved by another module.
     * @throws IllegalStateException if an expected symbol is not provided
     */
    Set<String> registerSymbols(Set<String> requiredSymbols) {
        Set<String> providedSymbols = getProvidedSymbols(requiredSymbols);
        Set<String> inheritedSymbols = depScopeInstaller == null ? Set.of() : depScopeInstaller.install(providedSymbols);
        inheritedProvider.ifPresent(lib -> lib.registerSymbols(inheritedSymbols.stream().map(s -> inheritedModulePrefix + s).collect(Collectors.toSet())));
        return getUnprovidedSymbols(requiredSymbols);
    }

    /**
     * Resolves the symbols provided by this module, returning any which are to be installed
     * from inherited modules.
     */
    Set<String> resolveSymbols(Set<String> providedSymbols, BasicScope scope) {
        providedSymbols.stream()
            .filter(s -> depScopeInstaller.get().hasDefinition(s))
            .forEach(s -> scope.defineValue(prefix + s, depScopeInstaller.get().resolveValue(s)));
        return providedSymbols.stream()
            .filter(s -> !depScopeInstaller.get().hasDefinition(s))
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