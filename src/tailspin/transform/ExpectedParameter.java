package tailspin.transform;

import java.util.List;
import java.util.Map;
import tailspin.interpreter.Scope;

public class ExpectedParameter {
  final String name;

  public ExpectedParameter(String name) {
    this.name = name;
  }

  static void resolveParameters(
      List<ExpectedParameter> expectedParameters, Map<String, Object> parameters, Scope scope, String scopeContext) {
    int foundParameters = 0;
    for (ExpectedParameter expectedParameter : expectedParameters) {
      if (parameters.containsKey(expectedParameter.name)) {
        foundParameters++;
        if (!scope.getLocalDictionary().hasDataDefinition(expectedParameter.name)) {
          // make the definition local
          scope.getLocalDictionary().createDataDefinition(expectedParameter.name, null);
        }
        Object checkedValue = scope.getLocalDictionary()
            .checkDataDefinition(expectedParameter.name, parameters.get(expectedParameter.name),
                scope);
        scope.defineValue(expectedParameter.name, checkedValue);
      } else {
        throw new IllegalArgumentException("Missing parameter " + expectedParameter.name + " to " + scopeContext);
      }
    }
    if (foundParameters != parameters.size()) {
      throw new IllegalArgumentException("Too many parameters for " + scopeContext + ":\n" + parameters);
    }
  }
}
