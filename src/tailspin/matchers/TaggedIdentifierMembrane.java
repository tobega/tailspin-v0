package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Criterion;
import tailspin.types.Membrane;
import tailspin.types.TaggedIdentifier;

public class TaggedIdentifierMembrane implements Membrane {

  private final String tag;
  private final Criterion baseType;
  private final Scope definingScope;

  public TaggedIdentifierMembrane(String tag, Criterion baseType,
      Scope definingScope) {
    // Hackish :-/
    if (baseType instanceof AnyOf a
        && !a.invert && a.alternativeCriteria.size() == 1
        && a.alternativeCriteria.get(0) instanceof ValueMatcher v
        && v.basicCriterion instanceof StereotypeMatch s) {
      tag = s.identifier;
    }
    this.tag = tag;
    this.baseType = baseType;
    this.definingScope = definingScope;
  }

  @Override
  public Object permeate(Object candidate) {
    if (candidate instanceof TaggedIdentifier t) {
      if (t.getTag().equals(tag) && baseType.isMet(t.getValue(), null, definingScope)) {
        return t;
      }
    } else if (baseType.isMet(candidate, null, definingScope)) {
      if (candidate instanceof String || candidate instanceof Long) {
        return new TaggedIdentifier(tag, candidate);
      }
      return candidate;
    }
    return null;
  }
}
