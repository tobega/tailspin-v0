package tailspin.interpreter;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Queue;

interface Scope {
  Object resolveValue(String identifier);

  void defineValue(String identifier, Object value);

  InputStream getInput();

  OutputStream getOutput();

  void setState(String stateContext, Object value);

  Object getState(String stateContext);

  void setIt(Queue<Object> it);

  Queue<Object> getIt();
}
