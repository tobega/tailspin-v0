package tailspin.types;

import java.util.Map;

public interface Transform {
  Object getResults(Object it, Map<String, Object> parameters,
      DataDictionary callingDictionary);
}
