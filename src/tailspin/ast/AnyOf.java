package tailspin.ast;

import java.util.List;
import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class AnyOf implements Criterion {

  private final boolean invert;
  private final List<Criterion> alternativeCriteria;

  public AnyOf(boolean invert, List<Criterion> alternativeCriteria) {
    this.invert = invert;
    this.alternativeCriteria = alternativeCriteria;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    for (Criterion criterion : alternativeCriteria) {
      if (criterion.isMet(toMatch, it, scope)) {
        return !invert;
      }
    }
    return invert;
  }
}
