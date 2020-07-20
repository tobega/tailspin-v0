package tailspin.interpreter;

import java.util.List;
import java.util.Set;

public interface DependencyProvider {
    /**
     * Installs the symbols matching the prefix of this provider.
     * @throws IllegalStateException if an expected symbol is not provided
     */
    Set<String> installSymbols(Set<String> requiredSymbols, Scope scope, List<DependencyProvider> providedModules);
}