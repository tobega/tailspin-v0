package tailspin.interpreter.lang;

import java.util.Map;
import tailspin.types.DataDictionary;
import tailspin.types.Transform;

public abstract class BuiltInOperator implements Transform {
  private static String[] operandNames = new String[] {"left", "right"};

  @Override
  public Object getResults(Object it, Map<String, Object> parameters,
      DataDictionary callingDictionary) {
    return doOperation(parameters.get("left"), parameters.get("right"));
  }

  abstract Object doOperation(Object left, Object right);

  @Override
  public String[] getOperandNames() {
    return operandNames;
  }
}
