package tailspin.interpreter;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import tailspin.interpreter.lang.Lang;

public class SymbolLibrary {
    public interface Installer {
        Set<String> resolveSymbols(Set<String> providedSymbols, BasicScope scope,
            Map<Path, Installer> includedFileInstallers);
        default void injectMocks(List<SymbolLibrary> mocks) {
            // Do nothing
        }
    }

    final String prefix;
    private final String inheritedModulePrefix;
    final Installer depScopeInstaller;
    private final Optional<SymbolLibrary> inheritedProvider;
    private final Map<Path, Installer> includedFiles = new HashMap<>();

    public SymbolLibrary(String prefix,
        String inheritedModulePrefix, Installer depScopeInstaller,
        List<SymbolLibrary> inheritedProviders) {
        this.prefix = prefix;
        this.inheritedModulePrefix = inheritedModulePrefix;
        this.depScopeInstaller = depScopeInstaller;
        this.inheritedProvider = inheritedProviders.stream()
            .filter(s -> s.prefix.equals(inheritedModulePrefix)).findFirst();
    }

    /** Allows to replace the provided dependencies in the installer */
    public void injectMocks(List<SymbolLibrary> mocks) {
        depScopeInstaller.injectMocks(mocks);
    }

    /**
     * Installs the symbols matching the prefix of this provider and returns the symbols that still need  resolving.
     * @throws IllegalStateException if an expected symbol is not provided
     */
    Set<String> installSymbols(Set<String> requiredSymbols, BasicScope scope) {
        Set<String> providedSymbols = getProvidedSymbols(requiredSymbols);
        Set<String> inheritedSymbols = depScopeInstaller.resolveSymbols(providedSymbols, scope, includedFiles);
        inheritSymbols(inheritedSymbols, scope);
        return getUnprovidedSymbols(requiredSymbols);
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
        Stream<String> symbolStream = requiredSymbols.stream();
        if (prefix.isEmpty()) {
            symbolStream = symbolStream.filter(s -> !s.contains("/"));
        } else {
            symbolStream = symbolStream.filter(s -> s.startsWith(prefix))
                .map(s -> s.substring(prefix.length()));
        }
        return symbolStream.filter(s -> !s.startsWith("*")).collect(Collectors.toSet());
    }

    private Set<String> getUnprovidedSymbols(Set<String> requiredSymbols) {
        if (prefix.isEmpty()) {
            return requiredSymbols.stream().filter(s -> s.contains("/")).collect(Collectors.toSet());
        }
        return requiredSymbols.stream().filter(s -> !s.startsWith(prefix)).collect(Collectors.toSet());
    }
}