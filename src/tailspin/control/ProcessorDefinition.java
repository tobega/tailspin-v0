package tailspin.control;

import java.util.List;
import tailspin.transform.ExpectedParameter;
import tailspin.transform.ProcessorConstructor;
import tailspin.interpreter.Scope;

public class ProcessorDefinition {

  private final String name;
  private final Block block;
  private final List<ExpectedParameter> expectedParameters;
  private final List<TypestateDefinition> typestates;

  public ProcessorDefinition(String name, Block block,
      List<ExpectedParameter> expectedParameters,
      List<TypestateDefinition> typestates) {
    this.name = name;
    this.block = block;
    this.expectedParameters = expectedParameters;
    this.typestates = typestates;
  }

  public ProcessorConstructor define(Scope definingScope) {
    ProcessorConstructor processorConstructor = new ProcessorConstructor(name, definingScope, block, typestates);
    processorConstructor.expectParameters(expectedParameters);
    return processorConstructor;
  }
}
