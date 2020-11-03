package tailspin.types;

import java.util.Map;

public interface Transform {
  Object getResults(Object it, Map<String, Object> parameters);

  default String[] getOperandNames() {
    throw new UnsupportedOperationException("Not an operator");
  }
}
