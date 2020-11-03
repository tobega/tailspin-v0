package tailspin.control;

import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.types.Transform;

public class OperatorApplication implements Expression {

  private final Value left;
  private final Reference operator;
  private final Value right;

  public OperatorApplication(Value left, Reference operator, Value right) {
    this.left = left;
    this.operator = operator;
    this.right = right;
  }

  @Override
  public Object getResults(Object it, Scope blockScope) {
    Transform transform = (Transform) operator.getValue(it, blockScope);
    if (transform == null) {
      throw new IllegalStateException("Unknown operator " + operator);
    }
    String[] operandNames = transform.getOperandNames();
    return transform.getResults(it, Map.of(operandNames[0], left.getResults(it, blockScope),
        operandNames[1], right.getResults(it, blockScope)));
  }
}
