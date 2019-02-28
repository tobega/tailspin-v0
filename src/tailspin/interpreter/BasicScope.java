package tailspin.interpreter;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class BasicScope implements Scope {
  private final InputStream input;
  private final OutputStream output;

  private final Map<String, Object> definitions = new HashMap<>();

  private Queue<Object> it;

  public BasicScope(InputStream input, OutputStream output) {
    this.input = input;
    this.output = output;
  }

  @Override
  public Object resolveValue(String identifier) {
    if ("it".equals(identifier)) {
      throw new IllegalArgumentException("Attempt to get it as an identifier");
    }
    return definitions.get(identifier);
  }

  @Override
  public void defineValue(String identifier, Object value) {
    if ("it".equals(identifier)) {
      throw new IllegalArgumentException("Attempt to set it as an identifier");
    }
    if (definitions.containsKey(identifier)) {
      throw new IllegalStateException("Attempt to redefine " + identifier);
    }
    definitions.put(identifier, value);
  }

  @Override
  public InputStream getInput() {
    return input;
  }

  @Override
  public OutputStream getOutput() {
    return output;
  }

  @Override
  public void setState(String stateContext, Object value) {
    throw new IllegalStateException("Cannot set state on base scope");
  }

  @Override
  public Object getState(String stateContext) {
    throw new IllegalStateException("Cannot get state from base scope");
  }

  @Override
  public Queue<Object> getIt() {
    return it;
  }

  @Override
  public void setIt(Queue<Object> it) {
    this.it = it;
  }
}
