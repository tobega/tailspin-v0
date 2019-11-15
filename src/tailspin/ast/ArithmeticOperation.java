package tailspin.ast;

import tailspin.interpreter.Scope;

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
    Add {
      @Override
      public long apply(long left, long right) {
        return left + right;
      }
    },
    Subtract {
      @Override
      public long apply(long left, long right) {
        return left - right;
      }
    },
    Multiply {
      @Override
      public long apply(long left, long right) {
        return left * right;
      }
    },
    DivideTruncate {
      @Override
      public long apply(long left, long right) {
        return left / right;
      }
    },
    Modulo {
      @Override
      public long apply(long left, long right) {
        long truncateRemainder = left % right;
        return truncateRemainder < 0 ? Math.abs(right) + truncateRemainder : truncateRemainder;
      }
    };

    public abstract long apply(long left, long right);
  }
  @Override
  public Object getResults(Object it, Scope scope) {
    return op.apply((long) left.getResults(it, scope), (long) right.getResults(it, scope));
  }
}
