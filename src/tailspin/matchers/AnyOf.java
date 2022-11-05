package tailspin.matchers;

import java.util.List;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.types.Membrane;

public class AnyOf implements Membrane {

  final boolean invert;
  private final TypeBound bound;
  final List<Membrane> alternativeCriteria;

  public AnyOf(boolean invert, TypeBound bound, List<Membrane> alternativeCriteria) {
    this.invert = invert;
    this.bound = bound;
    this.alternativeCriteria = alternativeCriteria;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope, TypeBound contextBound) {
    if (alternativeCriteria.isEmpty()) return toMatch;
    for (Membrane membrane : alternativeCriteria) {
      Object alternativeResult = membrane.permeate(toMatch, it, scope, bound == null ? contextBound : bound);
      if (null != alternativeResult) {
        return invert ? null : alternativeResult;
      }
    }
    return invert ? toMatch : null;
  }

  @Override
  public String toString() {
    return "<" + (invert ? "~" : "") + alternativeCriteria.stream().map(Object::toString).collect(
        Collectors.joining("|")) + ">";
  }
}
