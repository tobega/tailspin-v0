package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.EnumSymbol;
import tailspin.types.Membrane;
import tailspin.types.TaggedIdentifier;

import java.util.List;
import java.util.Map;

public class DefinedEnumeration implements Membrane {

  private final String tag;
  private final Membrane baseType;
  private final Map<String, EnumSymbol> symbols;
  private final List<Object> values;
  private final Scope definingScope;

  public DefinedEnumeration(String tag, Membrane baseType, Map<String, EnumSymbol> symbols, List<Object> values, Scope definingScope) {
    this.tag = tag;
    this.baseType = baseType;
    this.symbols = symbols;
    this.values = values;
    this.definingScope = definingScope;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
    if (toMatch instanceof String || toMatch instanceof Long) {
      if (typeBound == null || !tag.equals(typeBound.contextTag())) return false;
    } else if (toMatch instanceof TaggedIdentifier t && t.getTag().equals(tag)) {
      toMatch = t.getValue();
    }
    return baseType.matches(toMatch, null, definingScope, typeBound);
  }

  @Override
  public String toString() {
    return tag + ":" + baseType.toString();
  }

  public Object getValue(String value) {
    return symbols.get(value);
  }
}
