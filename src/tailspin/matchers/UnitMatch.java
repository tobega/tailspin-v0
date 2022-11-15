package tailspin.matchers;

import tailspin.TypeError;
import tailspin.interpreter.Scope;
import tailspin.types.DataDictionary;
import tailspin.types.Membrane;
import tailspin.types.Measure;
import tailspin.types.Unit;

public class UnitMatch implements Membrane {
  public static final Membrane ANY_MEASURE = new Membrane() {
    @Override
    public boolean matches(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
      return toMatch instanceof Measure;
    }

    @Override
    public String toString() {
      return "any measure";
    }
  };

  private final Unit unit;

  public UnitMatch(Unit unit) {
    this.unit = unit;
  }

  @Override
  public boolean matches(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
    if (typeBound == null) {
      typeBound = TypeBound.of(ANY_MEASURE);
    }
    if (typeBound.outOfBound(toMatch, it, scope)) {
      throw new TypeError("Value " + DataDictionary.formatErrorValue(toMatch) + " not in expected type bound " + typeBound + " in " + this);
    }
    return toMatch instanceof Measure m && unit.equals(m.getUnit());
  }

  @Override
  public String toString() {
    return unit.equals(Unit.SCALAR) ? "\"1\"" : unit.toString();
  }
}
