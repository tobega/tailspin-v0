package tailspin.interpreter;

import java.io.BufferedReader;
import java.io.OutputStream;
import java.nio.file.Path;

public interface Scope {
  Object resolveValue(String identifier);

  void defineValue(String identifier, Object value);

  void clearValue(String identifier);

  BufferedReader getInput();

  OutputStream getOutput();

  Path basePath();

  void setState(String stateContext, Object value);

  Object getState(String stateContext);

  Scope getParentScope();
}
