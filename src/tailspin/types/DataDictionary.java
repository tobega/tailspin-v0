package tailspin.types;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.matchers.ArrayMatch;
import tailspin.matchers.StructureMatch;
import tailspin.matchers.UnitMatch;

public class DataDictionary {

  private static final Criterion stringMatch = new Criterion() {
    @Override
    public boolean isMet(Object toMatch, Object it, Scope scope) {
      return toMatch instanceof String;
    }
  };
  private static final Criterion arrayMatch = new ArrayMatch((t, i, s) -> true, List.of(), false);
  private static final Criterion structureMatch = new StructureMatch(Map.of(), true);

  public final Map<String, Criterion> dataDefinitions = new HashMap<>();

  public DataDictionary() {
  }

  public static Criterion getDefaultTypeCriterion(Object data) {
    if (data instanceof String) {
      return stringMatch;
    }
    if (data instanceof TailspinArray) {
      return arrayMatch;
    }
    if (data instanceof Structure) {
      return structureMatch;
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
      dataDefinitions.put(key, getDefaultTypeCriterion(data));
      return data;
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