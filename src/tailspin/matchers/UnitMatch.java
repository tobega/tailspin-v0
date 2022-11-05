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
  public Object permeate(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
    if (toMatch instanceof Measure m && unit.equals(m.getUnit())) return toMatch;
    return null;
  }

  @Override
  public String toString() {
    return unit.equals(Unit.SCALAR) ? "\"1\"" : unit.toString();
  }
}
