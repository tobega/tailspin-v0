package tailspin.interpreter;

import java.io.BufferedReader;
import java.io.OutputStream;
import java.util.Queue;

interface Scope {
  /** In sub-matchers we need to be able to dereference the old it */
  Object resolveValue(String identifier, boolean allowIt);

  void defineValue(String identifier, Object value, boolean allowIt);

  BufferedReader getInput();

  OutputStream getOutput();

  void setState(String stateContext, Object value);

  Object getState(String stateContext);

  void setIt(Queue<Object> it);

  Queue<Object> getIt();
}
