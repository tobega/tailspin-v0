package tailspin.interpreter.lang;

import java.util.Map;
import tailspin.types.DataDictionary;
import tailspin.types.Transform;

public abstract class BuiltInOperator implements Transform {
  @Override
  public Object getResults(Object it, Map<String, Object> parameters,
      DataDictionary callingDictionary) {
    Object[] operands = (Object[]) it;
    return doOperation(operands[0], operands[1]);
  }

  abstract Object doOperation(Object left, Object right);
}
