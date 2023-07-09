package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Membrane;

import java.util.List;
import java.util.stream.Collectors;

public class AnyOf implements Membrane {

  final boolean invert;
  private final Membrane bound;
  final List<Membrane> alternativeCriteria;

  public AnyOf(boolean invert, Membrane bound, List<Membrane> alternativeCriteria) {
    this.invert = invert;
    this.bound = bound;
    this.alternativeCriteria = alternativeCriteria;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope, Membrane contextBound) {
    if (alternativeCriteria.isEmpty()) return true;
    for (Membrane membrane : alternativeCriteria) {
      boolean alternativeResult = membrane.matches(toMatch, it, scope, bound == null ? contextBound : bound);
      if (alternativeResult) {
        return !invert;
      }
    }
    return invert;
  }

  @Override
  public String toString() {
    return "<" + (invert ? "~" : "") + alternativeCriteria.stream().map(Object::toString).collect(
        Collectors.joining("|")) + ">";
  }
}
