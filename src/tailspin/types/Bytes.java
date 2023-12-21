package tailspin.types;

public class Bytes {
  private Bytes(){}

  public static byte[] fromString(String hex) {
    if (hex.length() % 2 != 0) hex = "0" + hex;
    byte[] bytes = new byte[hex.length()/2];
    for (int i = 0; i < hex.length(); i += 2) {
      bytes[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
          + Character.digit(hex.charAt(i+1), 16));
    }
    return bytes;
  }
}
