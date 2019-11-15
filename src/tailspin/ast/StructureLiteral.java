package tailspin.ast;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import tailspin.interpreter.KeyValue;
import tailspin.interpreter.Scope;

public class StructureLiteral implements Value {
  private final List<Expression> keyValues;

  public StructureLiteral(List<Expression> keyValues) {
    this.keyValues = keyValues;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    Map<String, Object> structure = new TreeMap<>();
    keyValues.stream().flatMap(e -> e.run(it, scope).stream()).map(KeyValue.class::cast)
        .forEach(kv -> structure.put(kv.getKey(), kv.getValue()));
    return structure;
  }
}
