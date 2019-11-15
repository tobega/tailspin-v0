package tailspin.ast;

import java.util.List;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;

public class ArrayLiteral implements Value {
  private final List<Expression> valueProductions;

  public ArrayLiteral(List<Expression> valueProductions) {
    this.valueProductions = valueProductions;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    return valueProductions.stream()
        .flatMap(vp -> vp.run(it, scope).stream())
        .collect(Collectors.toList());
  }
}
