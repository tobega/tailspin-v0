package tailspin.interpreter;

import java.util.List;
import java.util.Set;
import tailspin.java.JavaClass;

public class JavaSymbolLibrary extends SymbolLibrary {

  private final String javaPackage;

  public JavaSymbolLibrary(String javaPackage) {
    super(javaPackage.substring(javaPackage.lastIndexOf(".") + 1) + "/",
        null, null, List.of());
    this.javaPackage = javaPackage;
  }

  @Override
  Set<String> resolveSymbols(Set<String> providedSymbols, BasicScope scope) {
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
}
