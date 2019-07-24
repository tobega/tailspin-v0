package tailspin.ast;

import java.util.Queue;
import tailspin.interpreter.Scope;

public class Definition implements Expression {
  private final String identifier;
  private final Value value;

  public Definition(String identifier, Value value) {
    this.identifier = identifier;
    this.value = value;
  }

  @Override
  public Queue<Object> run(Object it, Scope blockScope) {
    blockScope.defineValue(identifier, value.evaluate(it, blockScope));
    return EMPTY_RESULT;
  }
}
