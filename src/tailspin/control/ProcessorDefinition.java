package tailspin.control;

import java.util.List;
import tailspin.interpreter.Scope;
import tailspin.transform.ExpectedParameter;
import tailspin.transform.ProcessorConstructor;

public class ProcessorDefinition {

  private final String name;
  private final List<DataDefinition> localDatatypes;
  private final Block block;
  private final List<ExpectedParameter> expectedParameters;
  private final List<TypestateDefinition> typestates;

  public ProcessorDefinition(String name, List<DataDefinition> localDatatypes,
      Block block,
      List<ExpectedParameter> expectedParameters,
      List<TypestateDefinition> typestates) {
    this.name = name;
    this.localDatatypes = localDatatypes;
    this.block = block;
    this.expectedParameters = expectedParameters;
    this.typestates = typestates;
  }

  public ProcessorConstructor define(Scope definingScope) {
    ProcessorConstructor processorConstructor = new ProcessorConstructor(name, definingScope, localDatatypes, block, typestates);
    processorConstructor.expectParameters(expectedParameters);
    return processorConstructor;
  }
}
