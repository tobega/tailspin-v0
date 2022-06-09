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
  public Object permeate(Object toMatch, Object it, Scope scope, String contextTag) {
    if (toMatch instanceof TaggedIdentifier t && t.getTag().equals(contextTag) && !tag.equals(contextTag)) {
      return null;
    }
    if (toMatch instanceof String || toMatch instanceof Long) {
      TaggedIdentifier taggedMatch = new TaggedIdentifier(tag, toMatch);
      Object result = permeate(taggedMatch, it, scope, tag);
      if (result != null) return taggedMatch;
    }
    Object result = baseType.permeate(toMatch, null, definingScope, tag);
    if (result instanceof String || result instanceof Long) {
      if (toMatch instanceof TaggedIdentifier t) return t.getTag().equals(tag) ? toMatch : null;
      throw new AssertionError("Something went wrong");
    }
    return result;
  }

  @Override
  public String toString() {
    return tag + ":" + baseType.toString();
  }
}
