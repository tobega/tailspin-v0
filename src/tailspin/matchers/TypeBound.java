package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Membrane;
import tailspin.types.TaggedIdentifier;

public class TypeBound {

  public static final Membrane ANY_MATCH = (Object toMatch, Object it, Scope scope, TypeBound bound) -> true;

  private final String tag;
  private final Membrane bound;

  private TypeBound(String tag, Membrane bound) {
    this.tag = tag;
    this.bound = bound;
  }

  public boolean outOfBound(Object toMatch, Object it, Scope scope) {
    if (tag != null && (toMatch instanceof String || toMatch instanceof Long)) {
      toMatch = new TaggedIdentifier(tag, toMatch);
    }
    return !bound.matches(toMatch, it, scope, any());
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

  public static TypeBound any() {
    return new TypeBound(null, ANY_MATCH);
  }

  public static TypeBound anyInContext(String tag) {
    return new TypeBound(tag, ANY_MATCH);
  }

  public String contextTag() {
    return tag;
  }
}
