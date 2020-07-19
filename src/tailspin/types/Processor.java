package tailspin.types;

import java.util.Map;

public interface Processor {
    Transform resolveMessage(String message, Map<String, Object> parameters);
}
