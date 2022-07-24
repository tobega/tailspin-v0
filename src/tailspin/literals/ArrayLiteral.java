package tailspin.literals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import tailspin.control.ResultIterator;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.TailspinArray;

public class ArrayLiteral implements Value {
  private final Value offset;
  private final List<CartesianExpansion> expansions;

  public ArrayLiteral(Value offset, List<CartesianExpansion> expansions) {
    this.offset = offset;
    this.expansions = expansions;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    Long startIndex = (Long) this.offset.getResults(it, scope);
    List<List<Object>> seeds = List.of(new ArrayList<>());
    for (CartesianExpansion expansion : expansions) {
      seeds = expansion.expand(seeds, it, scope);
    }
    Object result = null;
    for (List<Object> seed : seeds) {
      result = ResultIterator.appendResultValue(result, TailspinArray.value(seed, startIndex));
    }
    return result;
  }

  @Override
  public String toString() {
    return "[" + expansions.stream().map(Object::toString).collect(Collectors.joining(",")) + "]";
  }
}
