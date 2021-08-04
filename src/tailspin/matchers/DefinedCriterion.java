package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Criterion;

public class DefinedCriterion implements Criterion {
  private final Criterion baseType;
  private final Scope definingScope;

  public DefinedCriterion(Criterion baseType, Scope definingScope) {
    this.baseType = baseType;
    this.definingScope = definingScope;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    return baseType.isMet(toMatch, null, definingScope);
  }

  @Override
  public String toString() {
    return baseType.toString();
  }
}
