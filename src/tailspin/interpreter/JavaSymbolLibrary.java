package tailspin.interpreter;

import java.util.List;
import java.util.Set;
import tailspin.java.JavaClass;

public class JavaSymbolLibrary implements SymbolLibrary.Installer {

  private final String javaPackage;
  private final String prefix;

  private JavaSymbolLibrary(String javaPackage, String prefix) {
    this.javaPackage = javaPackage;
    this.prefix = prefix;
  }

  @Override
  public Set<String> resolveSymbols(Set<String> providedSymbols, BasicScope scope) {
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

  public static SymbolLibrary create(String javaPackage) {
    String prefix = javaPackage.substring(javaPackage.lastIndexOf(".") + 1) + "/";
    return new SymbolLibrary(prefix, null,
        new JavaSymbolLibrary(javaPackage, prefix), List.of());
  }
}
