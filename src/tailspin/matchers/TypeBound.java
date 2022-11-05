package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Membrane;
import tailspin.types.TaggedIdentifier;

public class TypeBound {

  public static final TypeBound ANY = new TypeBound(null, (Object toMatch, Object it, Scope scope, TypeBound bound) -> toMatch);
  private final String tag;
  private final Membrane bound;

  private TypeBound(String tag, Membrane bound) {
    this.tag = tag;
    this.bound = bound;
  }

  public boolean isInBound(Object toMatch, Object it, Scope scope) {
    if (tag != null && (toMatch instanceof String || toMatch instanceof Long)) {
      toMatch = new TaggedIdentifier(tag, toMatch);
    }
    Object result = bound.permeate(toMatch, it, scope, ANY);
    // For autotyping to work, a tag can match "raw"
    return result != null;
  }

  @Override
  public String toString() {
    return bound.toString();
  }

  public static TypeBound inContext(String tag, Membrane bound) {
    return bound == null ? null : new TypeBound(tag, bound);
  }

  public static TypeBound of(Membrane bound) {
    return bound == null ? null : new TypeBound(null, bound);
  }
}
