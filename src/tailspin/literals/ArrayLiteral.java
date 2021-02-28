package tailspin.literals;

import java.util.ArrayList;
import java.util.List;
import tailspin.control.ResultIterator;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.TailspinArray;

public class ArrayLiteral implements Value {
  private final List<CartesianExpansion> expansions;

  public ArrayLiteral(List<CartesianExpansion> expansions) {
    this.expansions = expansions;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    List<List<Object>> seeds = List.of(new ArrayList<>());
    for (CartesianExpansion expansion : expansions) {
      seeds = expansion.expand(seeds, it, scope);
    }
    Object result = null;
    for (List<Object> seed : seeds) {
      result = ResultIterator.appendResultValue(result, TailspinArray.value(seed));
    }
    return result;
  }
}
