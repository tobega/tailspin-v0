package tailspin.interpreter.lang;

import tailspin.types.Relation;

public class MinusOperator extends BuiltInOperator {
  @Override
  Object doOperation(Object left, Object right) {
    return ((Relation) left).minus((Relation) right);
  }
}
