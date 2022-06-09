package tailspin.matchers;

import java.util.List;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.types.Membrane;

public class AnyOf implements Membrane {

  final boolean invert;
  final List<Membrane> alternativeCriteria;

  public AnyOf(boolean invert, List<Membrane> alternativeCriteria) {
    this.invert = invert;
    this.alternativeCriteria = alternativeCriteria;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope, String contextTag) {
    if (alternativeCriteria.isEmpty()) return toMatch;
    for (Membrane membrane : alternativeCriteria) {
      Object alternativeResult = membrane.permeate(toMatch, it, scope, contextTag);
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
