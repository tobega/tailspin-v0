package tailspin.interpreter.lang;

import java.util.Map;

import tailspin.types.Transform;

public abstract class BuiltInOperator implements Transform {
  @Override
  public Object getResults(Object it, Map<String, Object> parameters) {
    Object[] operands = (Object[]) it;
    return doOperation(operands[0], operands[1]);
  }

  abstract Object doOperation(Object left, Object right);
}
