package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Membrane;
import tailspin.types.TaggedIdentifier;

public class DefinedTag implements Membrane {

  private final String tag;
  private final Membrane baseType;
  private final Scope definingScope;

  public DefinedTag(String tag, Membrane baseType, Scope definingScope) {
    this.tag = tag;
    this.baseType = baseType;
    this.definingScope = definingScope;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
    if (toMatch instanceof String || toMatch instanceof Long) {
      if (typeBound == null || !tag.equals(typeBound.contextTag())) return null;
    } else if (toMatch instanceof TaggedIdentifier t && t.getTag().equals(tag)) {
      toMatch = t.getValue();
    }
    Object result = baseType.permeate(toMatch, null, definingScope, typeBound);
    return result == null ? null : toMatch;
  }

  @Override
  public String toString() {
    return tag + ":" + baseType.toString();
  }
}
