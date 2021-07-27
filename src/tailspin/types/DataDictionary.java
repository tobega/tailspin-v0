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
import tailspin.matchers.MultipliedCollectionCriterion;
import tailspin.matchers.RangeMatch;
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

  private static class AutotypedArray extends ArrayMatch {
    private static class DiscoveredContent implements CollectionSegmentCriterion {
      private Criterion contentCriterion;
      @Override
      public int isMetAt(TailspinArray.Tail toMatch, Object it, Scope scope) {
        // This should never be called if Tail is empty
        if (contentCriterion == null) {
          contentCriterion = getDefaultTypeCriterion(toMatch.get(1));
          return 1;
        } else if (contentCriterion.isMet(toMatch.get(1), null, null)) {
          return 1;
        }
        return 0;
      }
    }

    private static class AllTheSameContent implements CollectionCriterionFactory {
      DiscoveredContent discoveredContent = new DiscoveredContent();
      @Override
      public CollectionCriterion newCriterion() {
        return new MultipliedCollectionCriterion(discoveredContent, RangeMatch.ANY_AMOUNT);
      }
    }

    public AutotypedArray() {
      super(null, List.of(new AllTheSameContent()), true);
    }
  }

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
      return new AutotypedArray();
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