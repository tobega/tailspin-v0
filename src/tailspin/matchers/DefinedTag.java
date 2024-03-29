package tailspin.matchers;

import java.util.Objects;
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
  public boolean matches(Object toMatch, Object it, Scope scope, Membrane typeBound) {
    if (typeBound != null) {
      toMatch = typeBound.inContext(toMatch);
    }
    if (toMatch instanceof String || toMatch instanceof Long) {
      return false;
    } else if (toMatch instanceof TaggedIdentifier t && t.getTag().equals(tag)) {
      toMatch = t.getValue();
    }
    return baseType.matches(toMatch, null, definingScope, typeBound);
  }

  @Override
  public Object inContext(Object value) {
    if (value instanceof String || value instanceof Long) {
      return new TaggedIdentifier(tag, value);
    }
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefinedTag that = (DefinedTag) o;
    return Objects.equals(tag, that.tag) && Objects.equals(baseType,
        that.baseType) && Objects.equals(definingScope, that.definingScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, baseType, definingScope);
  }

  @Override
  public String toString() {
    return tag + ":" + baseType.toString();
  }
}
