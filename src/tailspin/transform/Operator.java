package tailspin.transform;

import java.util.List;
import java.util.Set;
import tailspin.control.Block;
import tailspin.interpreter.Scope;

public class Operator extends Templates {

  private final String[] operandNames;

  public Operator(String name, Scope definingScope, Set<String> localDatatypes, Block block,
      List<MatchTemplate> matchTemplates, String[] operandNames) {
    super(name, definingScope, localDatatypes, block, matchTemplates);
    this.operandNames = operandNames;
  }

  @Override
  public String[] getOperandNames() {
    return operandNames;
  }
}
