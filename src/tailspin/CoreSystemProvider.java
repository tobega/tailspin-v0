package tailspin;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.List;
import java.util.Set;
import tailspin.interpreter.BasicScope;
import tailspin.interpreter.SymbolLibrary;
import tailspin.system.StdinProcessor;
import tailspin.system.StdoutProcessor;
import tailspin.system.SystemProcessor;

public class CoreSystemProvider implements SymbolLibrary {
    private final List<String> args;
    private final BufferedReader input;
    private final OutputStream output;

    public CoreSystemProvider(List<String> args, InputStream input, OutputStream output) {
        this.args = args;
        this.input = new BufferedReader(new InputStreamReader(input));
        this.output = output;
    }

    @Override
    public Set<String> installSymbols(Set<String> requiredSymbols, BasicScope scope, List<SymbolLibrary> providedModules) {
        if (!providedModules.isEmpty()) {
            throw new IllegalStateException("Core system provided with dependencies");
        }
        for (String symbol : requiredSymbols) {
            switch (symbol) {
                case "ARGS": scope.defineValue("ARGS", args); break;
                case "SYS": scope.defineValue("SYS", new SystemProcessor()); break;
                case "IN": scope.defineValue("IN", new StdinProcessor(input)); break;
                case "OUT": scope.defineValue("OUT", new StdoutProcessor(output)); break;
            }
        }
        return Set.of();
    }
}
