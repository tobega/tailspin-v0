package tailspin.ast;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
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
      if (result == null) {
        continue;
      }
      if (result instanceof ResultIterator) {
        ResultIterator.apply(kv -> structure.put(((KeyValue) kv).getKey(), ((KeyValue) kv).getValue()),
            (ResultIterator) result);
      } else {
        structure.put(((KeyValue) result).getKey(), ((KeyValue) result).getValue());
      }
    }
    return structure;
  }
}
