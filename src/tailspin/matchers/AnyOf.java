package tailspin.matchers;

import java.util.List;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class AnyOf implements Criterion {

  final boolean invert;
  final List<Criterion> alternativeCriteria;

  public AnyOf(boolean invert, List<Criterion> alternativeCriteria) {
    this.invert = invert;
    this.alternativeCriteria = alternativeCriteria;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    if (alternativeCriteria.isEmpty()) return true;
    for (Criterion criterion : alternativeCriteria) {
      if (criterion.isMet(toMatch, it, scope)) {
        return !invert;
      }
    }
    return invert;
  }
}
