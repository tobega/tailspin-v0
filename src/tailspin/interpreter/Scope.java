package tailspin.interpreter;

import java.nio.file.Path;

public interface Scope {
  Object resolveValue(String identifier);

  void defineValue(String identifier, Object value);

  Path basePath();

  void setState(String stateContext, Object value);

  Object getState(String stateContext);

  Scope getParentScope();

  boolean hasDefinition(String def);
}
