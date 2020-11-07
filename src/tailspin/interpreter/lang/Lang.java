package tailspin.interpreter.lang;

import java.util.HashMap;
import java.util.Map;

public class Lang {
  public static final Map<String, Object> builtIns = new HashMap<>();
  static {
    builtIns.put("and", new BitwiseOperator.And());
    builtIns.put("or", new BitwiseOperator.Or());
    builtIns.put("xor", new BitwiseOperator.Xor());
  }
  private Lang() {}
}
