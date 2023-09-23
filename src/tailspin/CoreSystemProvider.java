package tailspin;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import tailspin.interpreter.BasicScope;
import tailspin.interpreter.SymbolLibrary;
import tailspin.interpreter.SymbolLibrary.Installer;
import tailspin.system.StdinProcessor;
import tailspin.system.StdoutProcessor;
import tailspin.system.SystemProcessor;
import tailspin.types.TailspinArray;

public class CoreSystemProvider {
    private CoreSystemProvider() {}

    public static SymbolLibrary of(List<Object> args, InputStream input, OutputStream output) {
        BasicScope scope = new BasicScope(Path.of("not-to-be-used"));
        scope.defineValue("ARGS", TailspinArray.value(args, 1L));
        scope.defineValue("SYS", new SystemProcessor());
        scope.defineValue("IN", new StdinProcessor(new BufferedReader(new InputStreamReader(input))));
        scope.defineValue("OUT", new StdoutProcessor(output));
        return new SymbolLibrary("", "", new SymbolLibrary.Installer() {
            @Override
            public Set<String> resolveSymbols(Set<String> providedSymbols, BasicScope into,
                Map<Path, Installer> includedFileInstallers) {
                providedSymbols.stream()
                    .filter(scope::hasDefinition)
                    .forEach(s -> into.defineValue(s, scope.resolveValue(s)));
                return providedSymbols.stream()
                    .filter(s -> !scope.hasDefinition(s))
                    .collect(Collectors.toSet());
            }
        }, List.of());
    }
}
