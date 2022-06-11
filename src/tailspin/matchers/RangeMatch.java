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

  public static final Membrane numberType = new Membrane() {
    @Override
    public Object permeate(Object toMatch, Object it, Scope scope, String contextTag) {
      if (toMatch instanceof Measure m) toMatch = m.getValue();
      if (toMatch instanceof TaggedIdentifier t) toMatch = t.getValue();
      return (toMatch instanceof Long) ? toMatch : null;
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
  public Object permeate(Object toMatch, Object it, Scope scope, String contextTag) {
    Unit unit = null;
    String tag = null;
    if (lowerBound != null) {
      Object low = lowerBound.value.getResults(it, scope);
      if (low instanceof Measure m) unit = m.getUnit();
      if (low instanceof TaggedIdentifier t) tag = t.getTag();
      toMatch = compare(toMatch, lowerBound.inclusive ? Comparison.GREATER_OR_EQUAL : Comparison.GREATER, low,
          contextTag);
      if (toMatch == null) return null;
    }
    if (upperBound != null) {
      Object high = upperBound.value.getResults(it, scope);
      if (high instanceof Measure m && lowerBound != null) {
        if (!m.getUnit().equals(unit))
          throw new IllegalArgumentException("Match lower bound unit " + unit + " incompatible with upper bound " + m);
      } else if (unit != null)
        throw new IllegalArgumentException("Match lower bound unit " + unit + " incompatible with upper bound " + high);
      if (high instanceof TaggedIdentifier t && lowerBound != null) {
        if (!t.getTag().equals(tag))
          throw new IllegalArgumentException("Match lower bound tag " + tag + " incompatible with upper bound " + t.getTag() + ":" + t.getValue());
      } else if (tag != null)
        throw new IllegalArgumentException("Match lower bound tag " + tag + " incompatible with upper bound " + high);
      toMatch = compare(toMatch, upperBound.inclusive ? Comparison.LESS_OR_EQUAL : Comparison.LESS, high,
          contextTag);
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

  public static Object compare(Object toMatch, Comparison comparison, Object rhs, String contextTag) {
    Object lhs = toMatch;
    if (lhs instanceof TaggedIdentifier l && rhs instanceof TaggedIdentifier r) {
      if (l.getTag().equals(r.getTag())) {
        lhs = l.getValue();
        rhs = r.getValue();
      } else {
        throw new IllegalArgumentException("Cannot compare (" + l.getTag() + ") " + l.getValue() + " with (" + r.getTag() + ") " + r.getValue());
      }
    }
    else if (lhs instanceof TaggedIdentifier l) {
      if (!l.getTag().equals(contextTag) || rhs instanceof Measure)
        throw new IllegalArgumentException("Cannot compare (" + l.getTag() + ") " + l.getValue() + " with " + rhs);
      lhs = l.getValue();
    }
    else if (rhs instanceof TaggedIdentifier r) {
      throw new IllegalArgumentException("Cannot compare " + lhs + " with (" + r.getTag() + ") " + r.getValue());
    }
    else if (lhs instanceof Measure l && rhs instanceof Measure r) {
      if (l.getUnit().equals(r.getUnit())) {
        lhs = l.getValue();
        rhs = r.getValue();
      } else {
        throw new IllegalArgumentException("Cannot compare " + lhs + " with " + rhs);
      }
    }
    else if (lhs instanceof Measure && rhs instanceof Long) {
      throw new IllegalArgumentException("Cannot compare " + lhs + " with " + rhs);
    }
    else if (lhs instanceof Long && rhs instanceof Measure) {
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
