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
  public Object permeate(Object toMatch, Object it, Scope scope) {
    Object result = baseType.permeate(toMatch, null, definingScope);
    if (toMatch instanceof TaggedIdentifier t) {
      if (result instanceof TaggedIdentifier) {
        return result;
      }
      if (!tag.equals(t.getTag()))
        return null;
      if (result == null && baseType.permeate(t.getValue(), null, definingScope) == null)
        return null;
      return toMatch;
    }
    if (result instanceof String || result instanceof Long) {
      result = new TaggedIdentifier(tag, result);
    }
    return result;
  }

  @Override
  public String toString() {
    return tag + ":" + baseType.toString();
  }
}
