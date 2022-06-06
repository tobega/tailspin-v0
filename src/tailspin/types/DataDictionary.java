package tailspin.types;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import tailspin.interpreter.Scope;
import tailspin.matchers.AnyOf;
import tailspin.matchers.ArrayMatch;
import tailspin.matchers.CollectionCriterion;
import tailspin.matchers.CollectionCriterionFactory;
import tailspin.matchers.CollectionSegmentCriterion;
import tailspin.matchers.DefinedTag;
import tailspin.matchers.MultipliedCollectionCriterion;
import tailspin.matchers.RangeMatch;
import tailspin.matchers.StructureMatch;
import tailspin.matchers.UnitMatch;

public class DataDictionary {
  /* @Nullable */
  private final DataDictionary callingDictionary;
  /* @Nullable */
  private final DataDictionary moduleDictionary;

  private static final Membrane stringMatch = new Membrane() {
    @Override
    public Object permeate(Object toMatch, Object it, Scope scope) {
      if (toMatch instanceof TaggedIdentifier t) toMatch = t.getValue();
      return (toMatch instanceof String) ? toMatch : null;
    }

    @Override
    public String toString() {
      return "raw string";
    }
  };

  private static final Membrane numberMatch = new Membrane() {
    @Override
    public Object permeate(Object toMatch, Object it, Scope scope) {
      if (toMatch instanceof TaggedIdentifier t) toMatch = t.getValue();
      return (toMatch instanceof Long) ? toMatch : null;
    }

    @Override
    public String toString() {
      return "untyped number";
    }
  };

  public static String formatErrorValue(Object value) {
    if (value instanceof TaggedIdentifier t) {
      return t.getTag() + ":" + t.getValue();
    }
    if (value instanceof Measure m && m.getUnit().equals(Unit.SCALAR)) {
      return m.getValue() + "\"1\"";
    }
    if (value instanceof TailspinArray a) {
      return "[" + a.stream().map(DataDictionary::formatErrorValue).collect(Collectors.joining(", ")) + "]";
    }
    return value.toString();
  }

  private static class AutotypedArray extends ArrayMatch {
    private static class DiscoveredContent implements CollectionSegmentCriterion {

      private final DataDictionary dictionary;
      private Membrane contentMembrane;

      public DiscoveredContent(DataDictionary dictionary) {
        this.dictionary = dictionary;
      }

      @Override
      public int isMetAt(TailspinArray.Tail toMatch, Object it, Scope scope) {
        // This should never be called if Tail is empty
        if (contentMembrane == null) {
          contentMembrane = getDefaultTypeCriterion(null, toMatch.get(1), dictionary);
          return 1;
        } else if (null != contentMembrane.permeate(toMatch.get(1), null, null)) {
          return 1;
        }
        return 0;
      }

      @Override
      public String toString() {
        return contentMembrane == null ? "??" : contentMembrane.toString();
      }
    }

    private static class AllTheSameContent implements CollectionCriterionFactory {
      private final DiscoveredContent discoveredContent;

      public AllTheSameContent(DataDictionary dictionary) {
        discoveredContent = new DiscoveredContent(dictionary);
      }

      @Override
      public CollectionCriterion newCriterion() {
        return new MultipliedCollectionCriterion(discoveredContent, RangeMatch.ANY_AMOUNT);
      }

      @Override
      public String toString() {
        return "<" + discoveredContent + ">*";
      }
    }

    public AutotypedArray(DataDictionary dictionary) {
      super(null, List.of(new AllTheSameContent(dictionary)), true);
    }
  }

  private static final Membrane exists = new AnyOf(false, List.of());

  public final Map<String, Membrane> dataDefinitions = new HashMap<>();

  public DataDictionary(/*@Nullable*/ DataDictionary callingDictionary,
      DataDictionary moduleDictionary) {
    this.callingDictionary = callingDictionary;
    this.moduleDictionary = moduleDictionary;
  }

  private static Membrane getDefaultTypeCriterion(String tag, Object data, DataDictionary dictionary) {
    if (data instanceof String) {
      return tag == null ? stringMatch : new DefinedTag(tag, stringMatch, null);
    }
    if (data instanceof Long) {
      return tag == null ? numberMatch : new DefinedTag(tag, numberMatch, null);
    }
    if (data instanceof TailspinArray) {
      return new AutotypedArray(dictionary);
    }
    if (data instanceof Structure s) {
      return new StructureMatch(s.keySet().stream().collect(Collectors.toMap(Function.identity(), (k) -> exists)), false);
    }
    if (data instanceof Measure m) {
      return new UnitMatch(m.getUnit());
    }
    if (data instanceof TaggedIdentifier t) {
      return dictionary.getDataDefinition(t.getTag());
    }
    return null;
  }

  public void createDataDefinition(String identifier, Membrane def) {
    Membrane existingDef = dataDefinitions.get(identifier);
    if (existingDef == null) {
      dataDefinitions.put(identifier, def);
    } else if (existingDef != def) {
      throw new IllegalStateException("Attempt to redefine " + identifier + " from " + existingDef + " to " + def);
    }
  }

  public Membrane getDataDefinition(String identifier) {
    if (callingDictionary != null && !isKeyDefined(identifier)) {
      return callingDictionary.getDataDefinition(identifier);
    }
    if (moduleDictionary != null && !dataDefinitions.containsKey(identifier)) {
      return moduleDictionary.getDataDefinition(identifier);
    }
    return dataDefinitions.get(identifier);
  }

  public Object checkDataDefinition(String key, Object data) {
    if (callingDictionary != null && !isKeyDefined(key)) {
      return callingDictionary.checkDataDefinition(key, data);
    }
    if (moduleDictionary != null && !dataDefinitions.containsKey(key)) {
      return moduleDictionary.checkDataDefinition(key, data);
    }
    Membrane def = dataDefinitions.get(key);
    if (def == null) {
      def = getDefaultTypeCriterion(key, data, this);
      dataDefinitions.put(key, def);
      if (def == null) return data; // TODO: remove this fallback for non-autotyped values
    }
    Object result = def.permeate(data, null, null);
    if (result == null) {
      throw new IllegalArgumentException("Tried to set " + key + " to incompatible data. Expected " + def + "\ngot " + formatErrorValue(data));
    }
    return result;
  }

  private boolean isKeyDefined(String key) {
    if (dataDefinitions.containsKey(key)) return true;
    if (moduleDictionary != null) return moduleDictionary.isKeyDefined(key);
    return false;
  }
}