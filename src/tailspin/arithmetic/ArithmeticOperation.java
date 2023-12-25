package tailspin.arithmetic;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;
import tailspin.types.Unit;

public class ArithmeticOperation implements Value {

  private final Value left;
  private final Op op;
  private final Value right;

  public ArithmeticOperation(Value left, Op op, Value right) {
    this.left = left;
    this.op = op;
    this.right = right;
  }

  public enum Op {
    Add(false, false) {
      @Override
      public long apply(long left, long right) {
        return Math.addExact(left, right);
      }

      @Override
      public String toString() {
        return "+";
      }
    },
    Subtract(false, false) {
      @Override
      public long apply(long left, long right) {
        return Math.subtractExact(left, right);
      }

      @Override
      public String toString() {
        return "-";
      }
    },
    Multiply(true, true) {
      @Override
      public long apply(long left, long right) {
        return Math.multiplyExact(left, right);
      }

      @Override
      public String toString() {
        return "*";
      }
    },
    DivideTruncate(false, true) {
      @Override
      public long apply(long left, long right) {
        return left / right;
      }

      @Override
      public String toString() {
        return "~/";
      }
    },
    Modulo(false, true) {
      @Override
      public long apply(long left, long right) {
        long truncateRemainder = left % right;
        return truncateRemainder < 0 ? Math.abs(right) + truncateRemainder : truncateRemainder;
      }

      @Override
      public String toString() {
        return "mod";
      }
    };

    private final boolean worksOnSameUnit;
    private final boolean leftCanBeScalar;
    private final boolean rightCanBeScalar;

    Op(boolean leftCanBeScalar, boolean rightCanBeScalar) {
      this.leftCanBeScalar = leftCanBeScalar;
      this.rightCanBeScalar = rightCanBeScalar;
      this.worksOnSameUnit = !leftCanBeScalar && !rightCanBeScalar;
    }

    public abstract long apply(long left, long right);

    public Object apply(Object left, Object right) {
      long lvalue;
      long rvalue;
      Unit unit = null;
      if (left instanceof Measure m) {
        lvalue = m.getValue();
        unit = m.getUnit();
      } else {
        lvalue = (long) left;
      }
      if (right instanceof Measure m) {
        rvalue = m.getValue();
        if (unit == null) {
          if (!leftCanBeScalar) unit = Unit.UNKNOWN;
          else unit = m.getUnit();
        }
        else if (worksOnSameUnit && unit.equals(m.getUnit())
            || (leftCanBeScalar && unit.equals(Unit.SCALAR))
        ) {
          unit = m.getUnit();
        } else if (!rightCanBeScalar || !m.getUnit().equals(Unit.SCALAR)) {
          unit = Unit.UNKNOWN;
        }
      } else {
        rvalue = (long) right;
        if (unit != null && !rightCanBeScalar) unit = Unit.UNKNOWN;
      }
      long result = apply(lvalue, rvalue);
      return unit == null ? result : new Measure(result, unit);
    }
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    return op.apply(left.getResults(it, scope), right.getResults(it, scope));
  }

  @Override
  public String toString() {
    return left + " " + op + " " + right;
  }
}
