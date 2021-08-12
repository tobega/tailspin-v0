package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Membrane;

public class DefinedCriterion implements Membrane {
  private final Membrane baseType;
  private final Scope definingScope;

  public DefinedCriterion(Membrane baseType, Scope definingScope) {
    this.baseType = baseType;
    this.definingScope = definingScope;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope) {
    return baseType.permeate(toMatch, null, definingScope);
  }

  @Override
  public String toString() {
    return baseType.toString();
  }
}
