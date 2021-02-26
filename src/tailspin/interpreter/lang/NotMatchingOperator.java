package tailspin.interpreter.lang;

import tailspin.types.Relation;

public class NotMatchingOperator extends BuiltInOperator {
  @Override
  Object doOperation(Object left, Object right) {
    return ((Relation) left).notMatching((Relation) right);
  }
}
