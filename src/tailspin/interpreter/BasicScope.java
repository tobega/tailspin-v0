package tailspin.interpreter;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class BasicScope implements Scope {
  private final BufferedReader input;
  private final OutputStream output;

  private final Map<String, Object> definitions = new HashMap<>();

  private Queue<Object> it;

  public BasicScope(InputStream input, OutputStream output) {
    this.input = new BufferedReader(new InputStreamReader(input));
    this.output = output;
  }

  @Override
  public Object resolveValue(String identifier, boolean allowIt) {
    if ("it".equals(identifier)) {
      throw new IllegalArgumentException("Attempt to get it as an identifier");
    }
    Object value = definitions.get(identifier);
    if (value == null) {
      throw new NullPointerException(identifier + " is not defined");
    }
    return value;
  }

  @Override
  public void defineValue(String identifier, Object value, boolean allowIt) {
    if ("it".equals(identifier)) {
      throw new IllegalArgumentException("Attempt to set it as an identifier");
    }
    if (definitions.containsKey(identifier)) {
      throw new IllegalStateException("Attempt to redefine " + identifier);
    }
    definitions.put(identifier, value);
  }

  @Override
  public void clearValue(String identifier) {
    definitions.remove(identifier);
  }

  @Override
  public BufferedReader getInput() {
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

  @Override
  public Scope getParentScope() {
    throw new UnsupportedOperationException("No parent scope");
  }
}
