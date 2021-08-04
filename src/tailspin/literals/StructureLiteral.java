package tailspin.literals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.types.KeyValue;
import tailspin.types.Structure;

public class StructureLiteral implements Expression {
  private final List<CartesianExpansion> expansions;

  public StructureLiteral(List<CartesianExpansion> expansions) {
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
      Object contents = null;
      for (Object part : seed) {
        if (part instanceof KeyValue) {
          contents = ResultIterator.appendResultValue(contents, part);
        } else {
          contents = ResultIterator.appendResultValue(contents, ((Structure) part).deconstruct());
        }
      }
      result = ResultIterator.appendResultValue(result, Structure.value(ResultIterator.wrap(contents)));
    }
    return result;
  }

  @Override
  public String toString() {
    return "{" + expansions.stream().map(Object::toString).collect(Collectors.joining(",")) + "}";
  }
}
