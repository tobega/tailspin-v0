package tailspin.control;

import java.util.List;
import tailspin.transform.ExpectedParameter;
import tailspin.transform.ProcessorConstructor;
import tailspin.interpreter.Scope;

public class ProcessorDefinition {
  private final Block block;
  private final List<ExpectedParameter> expectedParameters;

  public ProcessorDefinition(Block block,
      List<ExpectedParameter> expectedParameters) {
    this.block = block;
    this.expectedParameters = expectedParameters;
  }

  public ProcessorConstructor define(Scope definingScope) {
    ProcessorConstructor processorConstructor = new ProcessorConstructor(definingScope, block);
    processorConstructor.expectParameters(expectedParameters);
    return processorConstructor;
  }

  public void expectParameters(List<ExpectedParameter> parameters) {
    expectedParameters.addAll(parameters);
  }
}
