package tailspin.transform;

import java.util.List;
import tailspin.control.Block;
import tailspin.control.DataDefinition;
import tailspin.interpreter.Scope;

public class Operator extends Templates {

  private final String[] operandNames;

  public Operator(String name, Scope definingScope, List<DataDefinition> localDatatypes, Block block,
      List<MatchTemplate> matchTemplates, String[] operandNames) {
    super(name, definingScope, localDatatypes, block, matchTemplates);
    this.operandNames = operandNames;
  }

  @Override
  public String[] getOperandNames() {
    return operandNames;
  }
}
