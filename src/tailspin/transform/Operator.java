package tailspin.transform;

import java.util.List;
import tailspin.control.Block;
import tailspin.interpreter.Scope;

public class Operator extends Templates {

  private final String[] operandNames;

  public Operator(Scope definingScope, Block block,
      List<MatchTemplate> matchTemplates, String[] operandNames) {
    super(definingScope, block, matchTemplates);
    this.operandNames = operandNames;
  }

  @Override
  public String[] getOperandNames() {
    return operandNames;
  }
}
