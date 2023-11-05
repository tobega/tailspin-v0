package tailspin.transform;

import java.util.List;
import java.util.Map;
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
  public Object getResults(Object it, Map<String, Object> parameters) {
    Object[] operands = (Object[]) it;
    TransformScope scope = createTransformScope(parameters);
    scope.defineValue(operandNames[0], operands[0]);
    scope.defineValue(operandNames[1], operands[1]);
    return runInScope(null, scope);
  }
}
