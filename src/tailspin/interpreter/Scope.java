package tailspin.interpreter;

import java.io.OutputStream;

interface Scope {
  Object resolveValue(String identifier);
  void defineValue(String identifier, Object value);

  OutputStream getOutput();

  void setState(String stateContext, Object value);
  Object getState(String stateContext);
}
