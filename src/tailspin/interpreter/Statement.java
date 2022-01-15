package tailspin.interpreter;

import java.util.Set;

public interface Statement {
  Set<String> getRequiredDefinitions();

  void getResults(BasicScope scope);
}
