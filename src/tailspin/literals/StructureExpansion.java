package tailspin.literals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;
import tailspin.types.KeyValue;
import tailspin.types.Structure;

public class StructureExpansion {

  private final boolean isMultiStructure;
  private final Expression expression;

  public StructureExpansion(boolean isMultiStructure, Expression expression) {
    this.isMultiStructure = isMultiStructure;
    this.expression = expression;
  }

  public List<Map<String, Object>> expand(List<Map<String, Object>> seeds, Object it, Scope scope) {
    if (isMultiStructure) return expandMultiStructure(seeds, it, scope);
    Object result = expression.getResults(it, scope);
    ResultIterator.forEach(result,
        kv -> seeds.forEach(seed -> seed.put(((KeyValue) kv).getKey(), ((KeyValue) kv).getValue())));
    return seeds;
  }

  private List<Map<String, Object>> expandMultiStructure(List<Map<String, Object>> seeds, Object it,
      Scope scope) {
    List<Map<String, Object>> expansion = new ArrayList<>();
    Object result = expression.getResults(it, scope);
    ResultIterator.forEach(result,
        r -> seeds.forEach(seed -> {
          Map<String, Object> expanded = new TreeMap<>(seed);
          if (r instanceof Structure) {
            Structure structure = (Structure) r;
            for (String k : structure.keySet()) {
              expanded.put(k, structure.get(k));
            }
          } else {
            KeyValue kv = (KeyValue) r;
            expanded.put(kv.getKey(), kv.getValue());
          }
          expansion.add(expanded);
        }));
    return expansion;
  }
}
