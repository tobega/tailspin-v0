package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Criterion;
import tailspin.types.Membrane;

public class DefinedMembrane implements Membrane {
  private final Criterion matcher;
  private final Object contextValue;
  private final Scope definingScope;

  public DefinedMembrane(Criterion matcher, Object contextValue,
      Scope definingScope) {
    this.matcher = matcher;
    this.contextValue = contextValue;
    this.definingScope = definingScope;
  }

  @Override
  public Object permeate(Object candidate) {
    return matcher.isMet(candidate, contextValue, definingScope) ? candidate : null;
  }
}
