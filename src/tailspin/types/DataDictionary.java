package tailspin.types;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import tailspin.TypeError;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.matchers.AnyOf;
import tailspin.matchers.ArrayMatch;
import tailspin.matchers.CollectionCriterion;
import tailspin.matchers.CollectionCriterionFactory;
import tailspin.matchers.CollectionSegmentCriterion;
import tailspin.matchers.DefinedTag;
import tailspin.matchers.MultipliedCollectionCriterion;
import tailspin.matchers.OneElementMatch;
import tailspin.matchers.RangeMatch;
import tailspin.matchers.StructureMatch;
import tailspin.matchers.TypeBound;
import tailspin.matchers.UnitMatch;

public class DataDictionary {
  /* @Nullable */
  private final DataDictionary callingDictionary;
  /* @Nullable */
  private final DataDictionary moduleDictionary;

  private static final Membrane stringMatch = new Membrane() {
    @Override
    public Object permeate(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
      return (toMatch instanceof String) ? toMatch : null;
    }

    @Override
    public String toString() {
      return "untyped string";
    }
  };

  private static final Membrane numberMatch = new Membrane() {
    @Override
    public Object permeate(Object toMatch, Object it, Scope scope, TypeBound typeBound) {
      return (toMatch instanceof Long) ? toMatch : null;
    }

    @Override
    public String toString() {
      return "untyped number";
    }
  };

  public static String formatErrorValue(Object value) {
    if (value instanceof TaggedIdentifier t) {
      return t.getTag() + "´" + t.getValue();
    }
    if (value instanceof TailspinArray a) {
      return formatErrorValue(a.getOffset()) + ":[" + a.stream().map(DataDictionary::formatErrorValue).collect(Collectors.joining(", ")) + "]";
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
          contentMembrane = getDefaultTypeCriterion(null, toMatch.getNative(0), dictionary);
          return 1;
        } else if (null != contentMembrane.permeate(toMatch.getNative(0), null, scope, null)) {
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
      private final CollectionSegmentCriterion contentCriterion;

      public AllTheSameContent(CollectionSegmentCriterion contentCriterion) {
        this.contentCriterion = contentCriterion;
      }

      @Override
      public CollectionCriterion newCriterion() {
        return new MultipliedCollectionCriterion(contentCriterion, RangeMatch.ANY_AMOUNT);
      }

      @Override
      public String toString() {
        return "<" + contentCriterion + ">*";
      }
    }

    public AutotypedArray(Object offset, CollectionSegmentCriterion contentCriterion) {
      super(new Value() {
        @Override
        public Object getResults(Object it, Scope scope) {
          return offset;
        }

        @Override
        public String toString() {
          return formatErrorValue(offset);
        }
      }, null, List.of(new AllTheSameContent(contentCriterion)), true);
    }
  }

  private static final Membrane exists = new AnyOf(false, TypeBound.any(), List.of());

  public final Map<String, Membrane> dataDefinitions = new HashMap<>();

  public DataDictionary(/*@Nullable*/ DataDictionary callingDictionary,
      DataDictionary moduleDictionary) {
    this.callingDictionary = callingDictionary;
    this.moduleDictionary = moduleDictionary;
  }

  public static Membrane getDefaultTypeCriterion(String tag, Object data, DataDictionary dictionary) {
    if (data instanceof String) {
      return tag == null ? stringMatch : new DefinedTag(tag, stringMatch, null);
    }
    if (data instanceof Long) {
      return tag == null ? numberMatch : new DefinedTag(tag, numberMatch, null);
    }
    if (data instanceof TailspinArray a) {
      CollectionSegmentCriterion contentCriterion;
      if (a.length() > 0) {
        Membrane contentMatcher = getDefaultTypeCriterion(null, a.getNative(0), dictionary);
        // Some types not yet default typed, so may be null
        contentCriterion = new OneElementMatch(contentMatcher == null ? TypeBound.ANY_MATCH : contentMatcher);
      } else {
        contentCriterion = new AutotypedArray.DiscoveredContent(dictionary);
      }
      return new AutotypedArray(a.getOffset(), contentCriterion);
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
    // TODO: match remaining types
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

  public Object checkDataDefinition(String key, Object data, Scope scope) {
    if (callingDictionary != null && !isKeyDefined(key)) {
      return callingDictionary.checkDataDefinition(key, data, scope);
    }
    if (moduleDictionary != null && !dataDefinitions.containsKey(key)) {
      return moduleDictionary.checkDataDefinition(key, data, scope);
    }
    Membrane def = dataDefinitions.get(key);
    if (def == null) {
      def = getDefaultTypeCriterion(key, data, this);
      dataDefinitions.put(key, def);
      if (def == null) return data; // TODO: remove this fallback for non-autotyped values
    }
    Object result = def.permeate(data, null, scope, TypeBound.anyInContext(key));
    if (result == null) {
      throw new TypeError("Tried to set " + key + " to incompatible data. Expected " + def + "\ngot " + formatErrorValue(data));
    }
    if (data instanceof Long || data instanceof String) {
      data = new TaggedIdentifier(key, data);
    }
    return data;
  }

  private boolean isKeyDefined(String key) {
    if (dataDefinitions.containsKey(key)) return true;
    if (moduleDictionary != null) return moduleDictionary.isKeyDefined(key);
    return false;
  }
}