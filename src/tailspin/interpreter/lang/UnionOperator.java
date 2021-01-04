package tailspin.interpreter.lang;

import tailspin.types.Relation;

public class UnionOperator extends BuiltInOperator {
  @Override
  Object doOperation(Object left, Object right) {
    return ((Relation) left).union((Relation) right);
  }
}
