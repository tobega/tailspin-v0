package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Criterion;
import tailspin.types.Measure;

public class UnitMatch implements Criterion {
  private final String unit;

  public UnitMatch(String unit) {
    this.unit = unit;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    return toMatch instanceof Measure m && unit.equals(m.getUnit());
  }
}
