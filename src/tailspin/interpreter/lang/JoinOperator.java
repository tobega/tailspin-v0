package tailspin.interpreter.lang;

import tailspin.types.Relation;

public class JoinOperator extends BuiltInOperator {
  @Override
  Object doOperation(Object left, Object right) {
    return ((Relation) left).join((Relation) right);
  }
}
