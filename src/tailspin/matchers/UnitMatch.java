package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Criterion;
import tailspin.types.Measure;
import tailspin.types.Unit;

public class UnitMatch implements Criterion {
  private final Unit unit;

  public UnitMatch(Unit unit) {
    this.unit = unit;
  }

  @Override
  public boolean isMet(Object toMatch, Object it, Scope scope) {
    return toMatch instanceof Measure m && unit.equals(m.getUnit())
        || toMatch instanceof Number && unit.equals(Unit.SCALAR);
  }

  @Override
  public String toString() {
    return unit.toString();
  }
}
