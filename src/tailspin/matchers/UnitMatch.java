package tailspin.matchers;

import tailspin.interpreter.Scope;
import tailspin.types.Membrane;
import tailspin.types.Measure;
import tailspin.types.Unit;

public class UnitMatch implements Membrane {
  private final Unit unit;

  public UnitMatch(Unit unit) {
    this.unit = unit;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope) {
    if (toMatch instanceof Measure m && unit.equals(m.getUnit())) return toMatch;
    if (toMatch instanceof Long n && unit.equals(Unit.SCALAR)) return new Measure(n, Unit.SCALAR);
    return null;
  }

  @Override
  public String toString() {
    return unit.toString();
  }
}
