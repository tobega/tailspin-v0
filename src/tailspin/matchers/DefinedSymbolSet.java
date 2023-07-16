package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Symbol;
import tailspin.types.Membrane;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefinedSymbolSet implements Membrane {

  private final String tag;
  private final Map<String, Symbol> symbols;

  public DefinedSymbolSet(String tag, List<String> values) {
    this.tag = tag;
    this.symbols = new HashMap<>();
    values.forEach(v -> symbols.put(v, new Symbol(tag, v)));
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope, Membrane typeBound) {
    return (toMatch instanceof Symbol e && tag.equals(e.set()) && symbols.containsKey(e.value()));
  }

  @Override
  public String toString() {
    return tag + ":" + symbols.keySet();
  }

  public Object getValue(String value) {
    return symbols.get(value);
  }

  public String getTag() {
    return tag;
  }
}
