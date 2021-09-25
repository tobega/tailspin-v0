package tailspin.types;

import java.util.Map;

public interface Transform {
  Object getResults(Object it, Map<String, Object> parameters,
      DataDictionary callingDictionary);

  default String[] getOperandNames() {
    throw new UnsupportedOperationException("Not an operator");
  }
}
