package tailspin.interpreter.lang;

public class And extends BuiltInOperator {
  @Override
  Object doOperation(Object left, Object right) {
    byte[] a = (byte[]) left;
    byte[] b = (byte[]) right;
    int length = Math.max(a.length, b.length);
    byte[] result = new byte[length];
    for (int i = 0; i < length; i++) {
      byte x = i >= a.length ? extension(a) : a[a.length - i - 1];
      byte y = i >= b.length ? extension(b) : b[b.length - i - 1];
      result[length - i - 1] = (byte) (x & y);
    }
    return result;
  }

  private byte extension(byte[] a) {
    if ((a[0] & 0x80) == 0) {
      return 0;
    }
    return (byte) 0xff;
  }
}
