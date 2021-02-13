package tailspin.literals;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.types.Structure;

public class StructureLiteral implements Expression {
  private final List<StructureExpansion> expansions;

  public StructureLiteral(List<StructureExpansion> expansions) {
    this.expansions = expansions;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    List<Map<String, Object>> seeds = List.of(new TreeMap<>());
    for (StructureExpansion expansion : expansions) {
      seeds = expansion.expand(seeds, it, scope);
    }
    Object result = null;
    for (Map<String, Object> seed : seeds) {
      result = ResultIterator.appendResultValue(result, Structure.value(seed));
    }
    return result;
  }
}
