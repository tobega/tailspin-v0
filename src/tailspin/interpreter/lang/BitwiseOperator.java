package tailspin.interpreter.lang;

public abstract class BitwiseOperator extends BuiltInOperator {
  @Override
  Object doOperation(Object left, Object right) {
    byte[] a = (byte[]) left;
    byte[] b = (byte[]) right;
    int length = Math.max(a.length, b.length);
    byte[] result = new byte[length];
    for (int i = 0; i < length; i++) {
      result[length - i - 1] = getResultByte(getExtended(a, i), getExtended(b, i));
    }
    return result;
  }

  private byte getExtended(byte[] a, int i) {
    if (i < a.length) {
      return a[a.length - i - 1];
    }
    if ((a[0] & 0x80) == 0) {
      return 0;
    }
    return (byte) 0xff;
  }

  abstract byte getResultByte(byte left, byte right);

  public static class And extends BitwiseOperator {
    @Override
    byte getResultByte(byte left, byte right) {
      return (byte) (left & right);
    }
  }

  public static class Or extends BitwiseOperator {
    @Override
    byte getResultByte(byte left, byte right) {
      return (byte) (left | right);
    }
  }

  public static class Xor extends BitwiseOperator {
    @Override
    byte getResultByte(byte left, byte right) {
      return (byte) (left ^ right);
    }
  }
}
