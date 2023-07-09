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
    public boolean matches(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
      Object baseValue = toMatch;
      if (baseValue instanceof Measure m) baseValue = m.getValue();
      else if (baseValue instanceof TaggedIdentifier t) baseValue = t.getValue();
      return (baseValue instanceof Long);
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
  public boolean matches(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
    boolean result = false;
    if (typeBound != null) {
      toMatch = typeBound.inContext(toMatch);
    }
    if (typeBound != null && typeBound.outOfBound(toMatch, null, scope)) {
      throw new TypeError("Value " + DataDictionary.formatErrorValue(toMatch) + " is not in expected type bound " + typeBound);
    }
    if (typeBound != null && toMatch instanceof TaggedIdentifier t && t.getTag().equals(typeBound.contextTag())) {
      toMatch = t.getValue();
    }
    if (lowerBound != null) {
      Object low = lowerBound.value.getResults(it, scope);
      if (typeBound == null) {
        typeBound = TypeBound.of(DataDictionary.getDefaultTypeCriterion(low, scope.getLocalDictionary()));
        if (typeBound != null && typeBound.outOfBound(toMatch, null, scope)) {
          throw new TypeError("Value " + DataDictionary.formatErrorValue(toMatch) + " is not in expected type bound " + typeBound);
        }
      } else {
        low = typeBound.inContext(low);
        if (typeBound.outOfBound(low, null, scope)) {
          throw new TypeError("Lower bound in " + this + " is not in expected type bound " + typeBound);
        }
      }
      if (typeBound != null && low instanceof TaggedIdentifier t && t.getTag().equals(typeBound.contextTag())) {
        low = t.getValue();
      }
      result = compare(toMatch, lowerBound.inclusive ? Comparison.GREATER_OR_EQUAL : Comparison.GREATER, low);
      if (!result) return false;
    }
    if (upperBound != null) {
      Object high = upperBound.value.getResults(it, scope);
      if (typeBound == null) {
        typeBound = TypeBound.of(DataDictionary.getDefaultTypeCriterion(high, scope.getLocalDictionary()));
        if (typeBound != null && typeBound.outOfBound(toMatch, null, scope)) {
          throw new TypeError("Value " + DataDictionary.formatErrorValue(toMatch) + " is not in expected type bound " + typeBound);
        }
      } else {
        high = typeBound.inContext(high);
        if (typeBound.outOfBound(high, null, scope)) {
          throw new TypeError("Upper bound in " + this + " is not in expected type bound " + typeBound);
        }
      }
      if (typeBound != null && high instanceof TaggedIdentifier t && t.getTag().equals(typeBound.contextTag())) {
        high = t.getValue();
      }
      result = compare(toMatch, upperBound.inclusive ? Comparison.LESS_OR_EQUAL : Comparison.LESS, high);
    }
    return result;
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

  public static boolean compare(Object toMatch, Comparison comparison, Object rhs) {
    Object lhs = toMatch;
    if (lhs instanceof TaggedIdentifier l && rhs instanceof TaggedIdentifier r) {
      if (l.getTag().equals(r.getTag())) {
        lhs = l.getValue();
        rhs = r.getValue();
      } else {
        return false;
      }
    }
    else if (lhs instanceof TaggedIdentifier || rhs instanceof TaggedIdentifier) {
      return false;
    }
    else if (lhs instanceof Measure l && rhs instanceof Measure r) {
      if (l.getUnit().equals(r.getUnit())) {
        lhs = l.getValue();
        rhs = r.getValue();
      } else {
        return false;
      }
    }
    else if (lhs instanceof Measure) {
      return false;
    }
    else if (rhs instanceof Measure) {
      return false;
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
    return matches;
  }
}
