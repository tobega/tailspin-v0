package tailspin.interpreter;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BasicScope extends Scope {
  private final Path basePath;

  final Map<String, Object> definitions = new HashMap<>();

  public BasicScope(Path basePath) {
    this.basePath = basePath;
  }

  @Override
  public Object resolveValue(String identifier) {
    Object value = definitions.get(identifier);
    if (value == null) {
      throw new NullPointerException(identifier + " is not defined");
    }
    return value;
  }

  @Override
  public void defineValue(String identifier, Object value) {
    if (value == null) {
      return;
    }
    if (definitions.containsKey(identifier)) {
      throw new IllegalStateException("Attempt to redefine " + identifier);
    }
    definitions.put(identifier, value);
  }

  @Override
  public void undefineValue(String identifier) {
    Objects.requireNonNull(definitions.remove(identifier), "Attempt to undefine undefined value " + identifier);
  }

  @Override
  public boolean hasDefinition(String def) {
    return definitions.containsKey(def);
  }

  @Override
  public Path basePath() {
    return basePath;
  }

  @Override
  public void setState(String stateContext, Object value) {
    throw new IllegalStateException("Cannot set state "  + stateContext + " on base scope");
  }

  @Override
  public Object getState(String stateContext) {
    throw new IllegalStateException("Cannot get state from base scope " + stateContext);
  }

  @Override
  public Scope getParentScope() {
    throw new UnsupportedOperationException("No parent scope");
  }

  public void copyDefinitions(Map<String, Object> to) {
    to.putAll(definitions);
  }
}
