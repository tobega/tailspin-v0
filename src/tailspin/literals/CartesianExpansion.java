package tailspin.literals;

import java.util.ArrayList;
import java.util.List;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.interpreter.Scope;

public class CartesianExpansion {

  private final boolean isMultiStructure;
  private final Expression expression;

  public CartesianExpansion(boolean isMultiStructure, Expression expression) {
    this.isMultiStructure = isMultiStructure;
    this.expression = expression;
  }

  public List<List<Object>> expand(List<List<Object>> seeds, Object it, Scope scope) {
    if (isMultiStructure) return expandMultiStructure(seeds, it, scope);
    Object result = expression.getResults(it, scope);
    ResultIterator.forEach(result,
        kv -> seeds.forEach(seed -> seed.add(kv)));
    return seeds;
  }

  private List<List<Object>> expandMultiStructure(List<List<Object>> seeds, Object it,
      Scope scope) {
    List<List<Object>> expansion = new ArrayList<>();
    Object result = expression.getResults(it, scope);
    ResultIterator.forEach(result,
        r -> seeds.forEach(seed -> {
          List<Object> expanded = new ArrayList<>(seed);
          expanded.add(r);
          expansion.add(expanded);
        }));
    return expansion;
  }

  @Override
  public String toString() {
    return (isMultiStructure ? "by " : "") + expression;
  }
}
