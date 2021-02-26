package tailspin.interpreter.lang;

import tailspin.types.Relation;

public class MatchingOperator extends BuiltInOperator {
  @Override
  Object doOperation(Object left, Object right) {
    return ((Relation) left).matching((Relation) right);
  }
}
