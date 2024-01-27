package tailspin.literals;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import tailspin.control.Expression;
import tailspin.control.Reference;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Transform;

public class StringTemplate implements Expression {
  private final List<Value> stringLiteral;

  public StringTemplate(List<Value> stringLiteral) {
    this.stringLiteral = stringLiteral;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    return new Closure(it, scope);
  }

  private class Closure implements Transform {
    private final Object it;
    private final Scope scope;

    private Closure(Object it, Scope scope) {
      this.it = it;
      this.scope = scope;
    }

    @Override
    public Object getResults(Object reflexive, Map<String, Object> parameters) {
      return stringLiteral.stream()
          .map(v -> v.getResults(Reference.pairedReflexive(it, reflexive), scope))
          .map(Object::toString)
          .collect(Collectors.joining());
    }
  }
}
