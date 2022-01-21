package tailspin.interpreter;

import java.nio.file.Path;
import java.util.List;
import tailspin.control.Value;

public class ModuleModifier extends ModuleImport {
  private final ProgramModification modifier;

  public ModuleModifier(String prefix, List<DefinitionStatement> statements,
      Value includePath, List<ModuleProvider> providedDependencies) {
    super(prefix, includePath, providedDependencies);
    modifier = new ProgramModification(statements);
  }

  @Override
  Module getProgram(Path depPath) {
    Module module = super.getProgram(depPath);
    return new Module(modifier.overrideDefinitions(module.definitions), module.includedFiles);
  }
}
