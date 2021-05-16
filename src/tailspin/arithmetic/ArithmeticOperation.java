package tailspin.arithmetic;

import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Measure;

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
    Add(true) {
      @Override
      public long apply(long left, long right) {
        return left + right;
      }

      @Override
      public String toString() {
        return "+";
      }
    },
    Subtract(true) {
      @Override
      public long apply(long left, long right) {
        return left - right;
      }

      @Override
      public String toString() {
        return "-";
      }
    },
    Multiply(false) {
      @Override
      public long apply(long left, long right) {
        return left * right;
      }

      @Override
      public String toString() {
        return "*";
      }
    },
    DivideTruncate(false) {
      @Override
      public long apply(long left, long right) {
        return left / right;
      }

      @Override
      public String toString() {
        return "~/";
      }
    },
    Modulo(false) {
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

    Op(boolean worksOnSameUnit) {
      this.worksOnSameUnit = worksOnSameUnit;
    }

    public abstract long apply(long left, long right);

    public Object apply(Object left, Object right) {
      long lvalue;
      long rvalue;
      String unit = null;
      if (left instanceof Measure m) {
        lvalue = m.getValue();
        unit = m.getUnit();
      } else {
        lvalue = (long) left;
      }
      if (right instanceof Measure m) {
        rvalue = m.getValue();
        unit = (unit == null || (worksOnSameUnit && unit.equals(m.getUnit()))) ? m.getUnit() : "";
      } else {
        rvalue = (long) right;
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
