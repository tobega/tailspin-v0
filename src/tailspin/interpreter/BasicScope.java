package tailspin.interpreter;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class BasicScope implements Scope {
  private final InputStream input;
  private final OutputStream output;

  private final Map<String, Object> definitions = new HashMap<>();

  public BasicScope(InputStream input, OutputStream output) {
    this.input = input;
    this.output = output;
  }

  @Override
  public Object resolveValue(String identifier) {
    return definitions.get(identifier);
  }

  @Override
  public void defineValue(String identifier, Object value) {
    definitions.put(identifier, value);
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
}
