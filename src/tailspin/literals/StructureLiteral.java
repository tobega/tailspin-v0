package tailspin.literals;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.control.Value;
import tailspin.types.KeyValue;
import tailspin.interpreter.Scope;

public class StructureLiteral implements Value {
  private final List<Expression> keyValues;

  public StructureLiteral(List<Expression> keyValues) {
    this.keyValues = keyValues;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    Map<String, Object> structure = new TreeMap<>();
    for (Expression expression : keyValues) {
      Object result = expression.getResults(it, scope);
      ResultIterator.forEach(result,
          kv -> structure.put(((KeyValue) kv).getKey(), ((KeyValue) kv).getValue()));
    }
    return structure;
  }
}
