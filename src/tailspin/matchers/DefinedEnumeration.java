package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.EnumSymbol;
import tailspin.types.Membrane;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefinedEnumeration implements Membrane {

  private final String tag;
  private final Map<String, EnumSymbol> symbols;

  public DefinedEnumeration(String tag, List<String> values) {
    this.tag = tag;
    this.symbols = new HashMap<>();
    for (int i = 0; i < values.size(); i ++) {
      String v = values.get(i);
      symbols.put(v, new EnumSymbol(tag, v, i));
    }
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope, Membrane typeBound) {
    return (toMatch instanceof EnumSymbol e && tag.equals(e.enumeration()) && symbols.containsKey(e.value()));
  }

  @Override
  public String toString() {
    return tag + ":" + symbols.keySet();
  }

  public Object getValue(String value) {
    return symbols.get(value);
  }
}
