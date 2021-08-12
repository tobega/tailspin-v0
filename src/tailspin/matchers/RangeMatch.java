package tailspin.matchers;

import tailspin.arithmetic.IntegerConstant;
import tailspin.control.Bound;
import tailspin.interpreter.Scope;
import tailspin.java.JavaObject;
import tailspin.types.Membrane;
import tailspin.types.Measure;
import tailspin.types.TaggedIdentifier;
import tailspin.types.Unit;

public class RangeMatch implements Membrane {
  public static final RangeMatch AT_MOST_ONE = new RangeMatch(
      new Bound(new IntegerConstant(0, null), true),
      new Bound(new IntegerConstant(1, null), true));
  public static final RangeMatch AT_LEAST_ONE = new RangeMatch(
          new Bound(new IntegerConstant(1, null), true),
          null);
  public static final RangeMatch ANY_AMOUNT = new RangeMatch(
              new Bound(new IntegerConstant(0, null), true),
              null);

  private final Bound lowerBound;
  private final Bound upperBound;

  public RangeMatch(Bound lowerBound, Bound upperBound) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
  }

  @Override
  public Object permeate(Object toMatch, Object it, Scope scope) {
    Unit unit = null;
    if (lowerBound != null) {
      Object low = lowerBound.value.getResults(it, scope);
      if (low instanceof Measure m) unit = m.getUnit();
      toMatch = compare(toMatch, lowerBound.inclusive ? Comparison.GREATER_OR_EQUAL : Comparison.GREATER, low);
      if (toMatch == null) return null;
    }
    if (upperBound != null) {
      Object high = upperBound.value.getResults(it, scope);
      if (high instanceof Measure m && unit != null && !unit.equals(m.getUnit()))
        throw new IllegalArgumentException("Match lower bound unit " + unit + " incompatible with upper bound " + m);
      toMatch = compare(toMatch, upperBound.inclusive ? Comparison.LESS_OR_EQUAL : Comparison.LESS, high);
    }
    return toMatch;
  }

  @Override
  public String toString() {
    return (lowerBound == null ? "" : lowerBound.value + (lowerBound.inclusive ? "~" : "")) + ".."
        + (upperBound == null ? "" : (upperBound.inclusive ? "~" : "") + upperBound.value);
  }

  public enum Comparison {
    LESS {
      @Override
      public boolean isValid(int comparison) {
        return comparison < 0;
      }
    }, EQUAL {
      @Override
      public boolean isValid(int comparison) {
        return comparison == 0;
      }
    }, GREATER {
      @Override
      public boolean isValid(int comparison) {
        return comparison > 0;
      }
    }, GREATER_OR_EQUAL {
      @Override
      public boolean isValid(int comparison) {
        return GREATER.isValid(comparison) || EQUAL.isValid(comparison);
      }
    }, LESS_OR_EQUAL {
      @Override
      public boolean isValid(int comparison) {
        return LESS.isValid(comparison) || EQUAL.isValid(comparison);
      }
    };

    public abstract boolean isValid(int comparison);
  }

  public static Object compare(Object toMatch, Comparison comparison, Object rhs) {
    Object lhs = toMatch;
    if (lhs instanceof TaggedIdentifier l && rhs instanceof TaggedIdentifier r) {
      if (l.getTag().equals(r.getTag())) {
        lhs = l.getValue();
        rhs = r.getValue();
      } else {
        throw new IllegalArgumentException("Cannot compare " + lhs + " with " + rhs);
      }
    }
    else if (lhs instanceof TaggedIdentifier l) {
      if (rhs instanceof Measure) {
        throw new IllegalArgumentException("Cannot compare " + lhs + " with " + rhs);
      }
      lhs = l.getValue();
    }
    else if (rhs instanceof TaggedIdentifier r) {
      if (lhs instanceof Measure) {
        throw new IllegalArgumentException("Cannot compare " + lhs + " with " + rhs);
      }
      rhs = r.getValue();
      if (lhs instanceof Long || lhs instanceof String) {
        toMatch = new TaggedIdentifier(r.getTag(), lhs);
      }
    }
    else if (lhs instanceof Measure l && rhs instanceof Measure r) {
      if (l.getUnit().equals(r.getUnit())) {
        lhs = l.getValue();
        rhs = r.getValue();
      } else {
        throw new IllegalArgumentException("Cannot compare " + lhs + " with " + rhs);
      }
    }
    else if (lhs instanceof Measure m && rhs instanceof Number) {
      if (m.getUnit().equals(Unit.SCALAR))
        lhs = m.getValue();
      else
        throw new IllegalArgumentException("Cannot compare " + lhs + " with " + rhs);
    }
    else if (lhs instanceof Long ll && rhs instanceof Measure m) {
      if (m.getUnit().equals(Unit.SCALAR)) {
        rhs = m.getValue();
        toMatch = new Measure(ll, Unit.SCALAR);
      } else
        throw new IllegalArgumentException("Cannot compare " + lhs + " with " + rhs);
    }

    boolean matches = false;
    if ((lhs instanceof String ls) && (rhs instanceof String rs)) {
      matches = comparison.isValid(ls.compareTo(rs));
    } else if ((lhs instanceof Number ln) && (rhs instanceof Number rn)) {
      matches = comparison.isValid(Long.compare(ln.longValue(), rn.longValue()));
    } else if ((lhs instanceof JavaObject lj) && (rhs instanceof JavaObject rj)) {
      lhs = lj.getRealObject();
      rhs = rj.getRealObject();
      if ((lhs instanceof Comparable) && (rhs instanceof Comparable)) {
        @SuppressWarnings("unchecked")
        Comparable<Object> comparable = (Comparable<Object>) lhs;
        matches = comparison.isValid(comparable.compareTo(rhs));
      }
    }
    return matches ? toMatch : null;
  }
}
