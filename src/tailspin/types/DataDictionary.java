package tailspin.types;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tailspin.matchers.ArrayMatch;
import tailspin.matchers.DefinedMembrane;
import tailspin.matchers.StructureMatch;
import tailspin.matchers.UnitMatch;

public class DataDictionary {

  private static final Membrane stringMatch = new Membrane() {
    @Override
    public Object permeate(Object toMatch) {
      return (toMatch instanceof String) ? toMatch : null;
    }
  };
  private static final Membrane arrayMatch = new DefinedMembrane(new ArrayMatch((t, i, s) -> true, List.of(), false), null, null);
  private static final Membrane structureMatch = new DefinedMembrane(new StructureMatch(Map.of(), true), null, null);

  public final Map<String, Membrane> dataDefinitions = new HashMap<>();

  public DataDictionary() {
  }

  public static Membrane getDefaultTypeMembrane(Object data) {
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
      return new DefinedMembrane(new UnitMatch(m.getUnit()), null, null);
    }
    return null;
  }

  public void createDataDefinition(String identifier, Membrane def) {
    dataDefinitions.put(identifier, def);
  }

  public Membrane getDataDefinition(String identifier) {
    return dataDefinitions.get(identifier);
  }

  public Object checkDataDefinition(String key, Object data) {
    Membrane def = dataDefinitions.get(key);
    if (def == null) {
      def = getDefaultTypeMembrane(data);
      dataDefinitions.put(key, def);
      if (def == null) return data; // TODO: remove this fallback for non-autotyped values
    }
    data = def.permeate(data);
    if (data == null) {
      throw new IllegalArgumentException("Tried to set " + key + " to incompatible data " + data);
    }
    return data;
  }

  public boolean owns(String identifier) {
    return dataDefinitions.containsKey(identifier);
  }
}