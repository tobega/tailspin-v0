package tailspin.interpreter;

import java.nio.file.Path;
import java.util.Map;
import java.util.Set;
import tailspin.interpreter.SymbolLibrary.Installer;
import tailspin.java.JavaClass;

public class JavaSymbolLibrary implements SymbolLibrary.Installer {

  private final String javaPackage;
  private final String prefix;

  private JavaSymbolLibrary(String javaPackage, String prefix) {
    this.javaPackage = javaPackage;
    this.prefix = prefix;
  }

  @Override
  public Set<String> resolveSymbols(Set<String> providedSymbols, BasicScope scope,
      Map<Path, Installer> includedFileInstallers) {
    for (String symbol : providedSymbols) {
      try {
        Class<?> c = Class.forName(javaPackage + "." + symbol);
        scope.defineValue(prefix + symbol, new JavaClass(c));
      } catch (ClassNotFoundException e) {
        throw new IllegalStateException(e);
      }
    }
    return Set.of();
  }

  @Override
  public Installer newInstance() {
    return this;
  }

  public static SymbolLibrary create(String javaPackage) {
    String prefix = javaPackage.substring(javaPackage.lastIndexOf(".") + 1) + "/";
    return new SymbolLibrary(prefix,
        new JavaSymbolLibrary(javaPackage, prefix), null);
  }
}
