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
    if (toMatch instanceof TaggedIdentifier t) {
      if (!tag.equals(t.getTag())
          || baseType.permeate(t.getValue(), null, definingScope) == null)
        return null;
      return toMatch;
    }
    Object result = baseType.permeate(toMatch, null, definingScope);
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
