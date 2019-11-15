package tailspin.interpreter;

import java.util.Map;

public interface Transform {
  Object getResults(Object it, Map<String, Object> parameters);
}
