package tailspin;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.List;
import tailspin.interpreter.BasicScope;
import tailspin.interpreter.SymbolLibrary;
import tailspin.system.StdinProcessor;
import tailspin.system.StdoutProcessor;
import tailspin.system.SystemProcessor;

public class CoreSystemProvider {
    private CoreSystemProvider() {}

    public static SymbolLibrary of(List<String> args, InputStream input, OutputStream output) {
        BasicScope scope = new BasicScope(Path.of("not-to-be-used"));
        scope.defineValue("ARGS", args);
        scope.defineValue("SYS", new SystemProcessor());
        scope.defineValue("IN", new StdinProcessor(new BufferedReader(new InputStreamReader(input))));
        scope.defineValue("OUT", new StdoutProcessor(output));
        return new SymbolLibrary("", "", scope, List.of());
    }
}
