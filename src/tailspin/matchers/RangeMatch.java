package tailspin.matchers;

import tailspin.TypeError;
import tailspin.arithmetic.IntegerConstant;
import tailspin.control.Bound;
import tailspin.interpreter.Scope;
import tailspin.java.JavaObject;
import tailspin.types.DataDictionary;
import tailspin.types.Measure;
import tailspin.types.Membrane;
import tailspin.types.TaggedIdentifier;

public class RangeMatch implements Membrane {

  public static final Membrane numberType = new Membrane() {
    @Override
    public Object permeate(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
      Object baseValue = toMatch;
      if (baseValue instanceof Measure m) baseValue = m.getValue();
      else if (baseValue instanceof TaggedIdentifier t) baseValue = t.getValue();
      return (baseValue instanceof Long) ? toMatch : null;
    }

    @Override
    public String toString() {
      return "numeric type";
    }
  };

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
  public Object permeate(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
    if (typeBound != null && !typeBound.isInBound(toMatch, null, scope)) {
      throw new TypeError("Value " + DataDictionary.formatErrorValue(toMatch) + " is not in expected type bound " + typeBound);
    }
    if (lowerBound != null) {
      Object low = lowerBound.value.getResults(it, scope);
      if (typeBound == null) {
        typeBound = TypeBound.of(DataDictionary.getDefaultTypeCriterion(null, low, scope.getLocalDictionary()));
        if (typeBound != null && !typeBound.isInBound(toMatch, null, scope)) {
          throw new TypeError("Value " + DataDictionary.formatErrorValue(toMatch) + " is not in expected type bound " + typeBound);
        }
      } else if (!typeBound.isInBound(low, null, scope)) {
        throw new TypeError("Lower bound in " + this + " is not in expected type bound " + typeBound);
      }
      toMatch = compare(toMatch, lowerBound.inclusive ? Comparison.GREATER_OR_EQUAL : Comparison.GREATER, low);
      if (toMatch == null) return null;
    }
    if (upperBound != null) {
      Object high = upperBound.value.getResults(it, scope);
      if (typeBound == null) {
        typeBound = TypeBound.of(DataDictionary.getDefaultTypeCriterion(null, high, scope.getLocalDictionary()));
        if (typeBound != null && !typeBound.isInBound(toMatch, null, scope)) {
          throw new TypeError("Value " + DataDictionary.formatErrorValue(toMatch) + " is not in expected type bound " + typeBound);
        }
      } else if (!typeBound.isInBound(high, null, scope)) {
        throw new TypeError("Upper bound in " + this + " is not in expected type bound " + typeBound);
      }
      toMatch = compare(toMatch, upperBound.inclusive ? Comparison.LESS_OR_EQUAL : Comparison.LESS, high);
    }
    return toMatch;
  }

  @Override
  public String toString() {
    return (lowerBound == null ? "" : lowerBound.value + (lowerBound.inclusive ? "" : "~")) + ".."
        + (upperBound == null ? "" : (upperBound.inclusive ? "" : "~") + upperBound.value);
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
        return null;
      }
    }
    else if (lhs instanceof TaggedIdentifier l) {
      toMatch = l.getValue();
      lhs = toMatch;
    }
    else if (rhs instanceof TaggedIdentifier) {
      return null;
    }
    else if (lhs instanceof Measure l && rhs instanceof Measure r) {
      if (l.getUnit().equals(r.getUnit())) {
        lhs = l.getValue();
        rhs = r.getValue();
      } else {
        return null;
      }
    }
    else if (lhs instanceof Measure) {
      return null;
    }
    else if (rhs instanceof Measure) {
      return null;
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
