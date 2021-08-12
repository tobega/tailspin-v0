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

  private static final Membrane stringMatch = new Membrane() {
    @Override
    public Object permeate(Object toMatch, Object it, Scope scope) {
      return (toMatch instanceof String) ? toMatch : null;
    }

    @Override
    public String toString() {
      return "a string";
    }
  };

  private static final Membrane numberMatch = new Membrane() {
    @Override
    public Object permeate(Object toMatch, Object it, Scope scope) {
      return (toMatch instanceof Long) ? toMatch : null;
    }

    @Override
    public String toString() {
      return "a number";
    }
  };

  private static class AutotypedArray extends ArrayMatch {
    private static class DiscoveredContent implements CollectionSegmentCriterion {

      private final Scope definingScope;
      private Membrane contentMembrane;

      public DiscoveredContent(Scope definingScope) {
        this.definingScope = definingScope;
      }

      @Override
      public int isMetAt(TailspinArray.Tail toMatch, Object it, Scope scope) {
        // This should never be called if Tail is empty
        if (contentMembrane == null) {
          contentMembrane = getDefaultTypeCriterion(null, toMatch.get(1), definingScope);
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

      public AllTheSameContent(Scope definingScope) {
        discoveredContent = new DiscoveredContent(definingScope);
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

    public AutotypedArray(Scope definingScope) {
      super(null, List.of(new AllTheSameContent(definingScope)), true);
    }
  }

  private static final Membrane exists = new AnyOf(false, List.of());

  public final Map<String, Membrane> dataDefinitions = new HashMap<>();

  public DataDictionary() {
  }

  private static Membrane getDefaultTypeCriterion(String tag, Object data, Scope scope) {
    if (data instanceof String) {
      return tag == null ? stringMatch : new DefinedTag(tag, stringMatch, null);
    }
    if (data instanceof Long) {
      return tag == null ? numberMatch : new DefinedTag(tag, numberMatch, null);
    }
    if (data instanceof TailspinArray) {
      return new AutotypedArray(scope);
    }
    if (data instanceof Structure s) {
      return new StructureMatch(s.keySet().stream().collect(Collectors.toMap(Function.identity(), (k) -> exists)), false);
    }
    if (data instanceof Measure m) {
      return new UnitMatch(m.getUnit());
    }
    if (data instanceof TaggedIdentifier t) {
      return scope.getDataDefinition(t.getTag());
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
    return dataDefinitions.get(identifier);
  }

  public Object checkDataDefinition(String key, Object data, Scope scope) {
    Membrane def = dataDefinitions.get(key);
    if (def == null) {
      def = getDefaultTypeCriterion(key, data, scope);
      dataDefinitions.put(key, def);
      if (def == null) return data; // TODO: remove this fallback for non-autotyped values
    }
    data = def.permeate(data, null, null);
    if (data == null) {
      throw new IllegalArgumentException("Tried to set " + key + " to incompatible data. Expected " + def + "\ngot " + data);
    }
    return data;
  }

  public boolean owns(String identifier) {
    return dataDefinitions.containsKey(identifier);
  }
}