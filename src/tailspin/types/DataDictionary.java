package tailspin.types;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.matchers.AnyOf;
import tailspin.matchers.ArrayMatch;
import tailspin.matchers.StructureMatch;
import tailspin.matchers.UnitMatch;

public class DataDictionary {

  private static final Criterion stringMatch = new Criterion() {
    @Override
    public boolean isMet(Object toMatch, Object it, Scope scope) {
      return (toMatch instanceof String);
    }
  };

  private static final Criterion numberMatch = new Criterion() {
    @Override
    public boolean isMet(Object toMatch, Object it, Scope scope) {
      return (toMatch instanceof Long);
    }
  };

  private static final Criterion arrayMatch = new ArrayMatch((t, i, s) -> true, List.of(), false);
  private static final Criterion exists = new AnyOf(false, List.of());

  public final Map<String, Criterion> dataDefinitions = new HashMap<>();

  public DataDictionary() {
  }

  private static Criterion getDefaultTypeCriterion(Object data) {
    if (data instanceof String) {
      return stringMatch;
    }
    if (data instanceof Long) {
      return numberMatch;
    }
    if (data instanceof TailspinArray) {
      return arrayMatch;
    }
    if (data instanceof Structure s) {
      return new StructureMatch(s.keySet().stream().collect(Collectors.toMap(Function.identity(), (k) -> exists)), false);
    }
    if (data instanceof Measure m) {
      return new UnitMatch(m.getUnit());
    }
    return null;
  }

  public void createDataDefinition(String identifier, Criterion def) {
    dataDefinitions.put(identifier, def);
  }

  public Criterion getDataDefinition(String identifier) {
    return dataDefinitions.get(identifier);
  }

  public Object checkDataDefinition(String key, Object data) {
    Criterion def = dataDefinitions.get(key);
    if (def == null) {
      def = getDefaultTypeCriterion(data);
      dataDefinitions.put(key, def);
      if (def == null) return data; // TODO: remove this fallback for non-autotyped values
    }
    if (!def.isMet(data, null, null)) {
      throw new IllegalArgumentException("Tried to set " + key + " to incompatible data " + data);
    }
    return data;
  }

  public boolean owns(String identifier) {
    return dataDefinitions.containsKey(identifier);
  }
}