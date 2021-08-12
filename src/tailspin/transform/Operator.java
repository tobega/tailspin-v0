package tailspin.transform;

import java.util.List;
import java.util.Map;
import tailspin.control.Block;
import tailspin.interpreter.Scope;
import tailspin.types.Membrane;

public class Operator extends Templates {

  private final String[] operandNames;

  public Operator(String name, Scope definingScope, List<Map.Entry<String, Membrane>> localDatatypes, Block block,
      List<MatchTemplate> matchTemplates, String[] operandNames) {
    super(name, definingScope, localDatatypes, block, matchTemplates);
    this.operandNames = operandNames;
  }

  @Override
  public String[] getOperandNames() {
    return operandNames;
  }
}
