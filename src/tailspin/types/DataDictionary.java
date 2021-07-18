package tailspin.types;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tailspin.interpreter.Scope;
import tailspin.matchers.ArrayMatch;
import tailspin.matchers.StructureMatch;
import tailspin.matchers.TaggedIdentifierMembrane;
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

  private static final Membrane arrayMatch = new DefinedMembrane(new ArrayMatch((t, i, s) -> true, List.of(), false),
      null);
  private static final Membrane structureMatch = new DefinedMembrane(new StructureMatch(Map.of(), true),
      null);

  public final Map<String, Membrane> dataDefinitions = new HashMap<>();

  public DataDictionary() {
  }

  private static Membrane getDefaultTypeMembrane(String key, Object data) {
    if (data instanceof TaggedIdentifier t && t.getValue() instanceof String) {
      return new TaggedIdentifierMembrane(t.getTag(), stringMatch, null);
    }
    if (data instanceof TaggedIdentifier t && t.getValue() instanceof Long) {
      return new TaggedIdentifierMembrane(t.getTag(), numberMatch, null);
    }
    if (data instanceof String) {
      return new TaggedIdentifierMembrane(key, stringMatch, null);
    }
    if (data instanceof Long) {
      return new TaggedIdentifierMembrane(key, numberMatch, null);
    }
    if (data instanceof TailspinArray) {
      return arrayMatch;
    }
    if (data instanceof Structure) {
      return structureMatch;
    }
    if (data instanceof Measure m) {
      return new DefinedMembrane(new UnitMatch(m.getUnit()), null);
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
      def = getDefaultTypeMembrane(key, data);
      dataDefinitions.put(key, def);
      if (def == null) return data; // TODO: remove this fallback for non-autotyped values
    }
    Object permeated = def.permeate(data);
    if (permeated == null) {
      throw new IllegalArgumentException("Tried to set " + key + " to incompatible data "
          + (data instanceof TaggedIdentifier t ? t.getTag() + ":" : "") + data);
    }
    return permeated;
  }

  public boolean owns(String identifier) {
    return dataDefinitions.containsKey(identifier);
  }

  private static class DefinedMembrane implements Membrane {
    private final Criterion matcher;
    private final Scope definingScope;

    public DefinedMembrane(Criterion matcher, Scope definingScope) {
      this.matcher = matcher;
      this.definingScope = definingScope;
    }

    @Override
    public Object permeate(Object candidate) {
      return matcher.isMet(candidate, null, definingScope) ? candidate : null;
    }
  }
}