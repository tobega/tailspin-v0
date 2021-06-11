package tailspin.transform;

import java.util.List;
import tailspin.control.Block;
import tailspin.interpreter.Scope;

public class Operator extends Templates {

  private final String[] operandNames;

  public Operator(String name, Scope definingScope, Block block,
      List<MatchTemplate> matchTemplates, String[] operandNames) {
    super(name, definingScope, block, matchTemplates);
    this.operandNames = operandNames;
  }

  @Override
  public String[] getOperandNames() {
    return operandNames;
  }
}
