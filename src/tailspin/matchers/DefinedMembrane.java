package tailspin.matchers;

import tailspin.types.Criterion;
import tailspin.types.Membrane;

public class DefinedMembrane implements Membrane {
  private final Criterion matcher;

  public DefinedMembrane(Criterion matcher) {
    this.matcher = matcher;
  }

  @Override
  public Object permeate(Object candidate) {
    return matcher.isMet(candidate, null, null) ? candidate : null;
  }
}
