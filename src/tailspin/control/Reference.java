package tailspin.control;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import tailspin.interpreter.Scope;
import tailspin.transform.Lens;
import tailspin.types.Freezable;
import tailspin.types.KeyValue;
import tailspin.types.Processor;
import tailspin.types.Structure;
import tailspin.types.Symbol;
import tailspin.types.TailspinArray;

public abstract class Reference implements Value {
  public enum Merge {NONE, APPEND, PREPEND}
  public abstract Object getValue(Object it, Scope scope);
  public abstract Object deleteValue(Object it, Scope scope);
  public abstract boolean isMutable();
  public abstract void setValue(Merge merge, Object value, Object it, Scope scope);

  @Override
  public Object getResults(Object it, Scope scope) {
    Object value = getValue(it, scope);
    if (value == null) {
      throw new IllegalStateException("Unknown value " + this);
    }
    return value;
  }

  public Reference field(String fieldIdentifier) {
    return new FieldReference(this, fieldIdentifier);
  }

  public Reference lens(Lens lens) {
    return new LensReference(this, lens);
  }

  private static class ReflexiveIt {
    final Object it;
    final Object reflexive;

    private ReflexiveIt(Object it, Object reflexive) {
      this.it = it;
      this.reflexive = reflexive;
    }
  }

  public static Object pairedReflexive(Object it, Object reflexive) {
    return new ReflexiveIt(it, reflexive);
  }

  public static Reference it() {
    return itReference;
  }

  private static final Reference itReference = new Reference() {
    @Override
    public Object getValue(Object it, Scope scope) {
      if (it instanceof ReflexiveIt) it = ((ReflexiveIt) it).it;
      if (it == null) {
        throw new IllegalStateException("Cannot reference $, doesn't exist");
      }
      return it;
    }

    @Override
    public Object deleteValue(Object it, Scope scope) {
      throw new UnsupportedOperationException("$ is not deletable");
    }

    @Override
    public boolean isMutable() {
      return false;
    }

    @Override
    public void setValue(Merge merge, Object value, Object it, Scope scope) {
      throw new UnsupportedOperationException("$ is not mutable");
    }

    @Override
    public String toString() {
      return "";
    }
  };

  public static Reference reflexive() {
    return reflexiveReference;
  }

  private static final Reference reflexiveReference = new Reference() {
    @Override
    public Object getValue(Object it, Scope scope) {
      if (!(it instanceof ReflexiveIt)) {
        throw new IllegalStateException("Cannot reference §, doesn't exist");
      }
      return ((ReflexiveIt) it).reflexive;
    }

    @Override
    public Object deleteValue(Object it, Scope scope) {
      throw new UnsupportedOperationException("§ is not deletable");
    }

    @Override
    public boolean isMutable() {
      return false;
    }

    @Override
    public void setValue(Merge merge, Object value, Object it, Scope scope) {
      throw new UnsupportedOperationException("§ is not mutable");
    }

    @Override
    public String toString() {
      return "§";
    }
  };

  public static Reference named(String identifier) {
    return new NamedReference(identifier);
  }

  public static Reference state(String stateContext) {
    return new StateReference(stateContext);
  }

  private static class NamedReference extends Reference {
    private final String identifier;

    private NamedReference(String identifier) {
      this.identifier = identifier;
    }

    @Override
    public Object getValue(Object it, Scope scope) {
      return scope.resolveValue(identifier);
    }

    @Override
    public Object deleteValue(Object it, Scope scope) {
      throw new UnsupportedOperationException(identifier + " is not deletable");
    }

    @Override
    public boolean isMutable() {
      return false;
    }

    @Override
    public void setValue(Merge merge, Object value, Object it, Scope scope) {
      throw new UnsupportedOperationException(identifier + " is not mutable");
    }

    @Override
    public String toString() {
      return identifier;
    }
  }

  public static Object freeze(Object value) {
    if (value == null) {
      return null;
    }
    if (value instanceof Freezable) {
      ((Freezable<?>) value).freeze();
      return value;
    }
    if (value instanceof String
        || value instanceof Number
        || value instanceof Processor
        || value instanceof byte[]
        || value instanceof KeyValue
        || value instanceof Symbol) {
      return value;
    }
    throw new IllegalArgumentException("Unknown value type " + value.getClass().getName());
  }

  public static void collect(Object it, Object destination, Merge method) {
    Consumer<Object> collector = getCollector(destination, method);
    ResultIterator.forEach(it, collector);
  }

  public static Consumer<Object> getCollector(Object destination, Merge method) {
    if (destination instanceof Structure collectorMap) {
      Consumer<KeyValue> keyValueCollector;
      if (method == Merge.APPEND) {
        keyValueCollector = entry -> collectorMap.put(entry.getKey(), entry.getValue());
      } else if (method == Merge.PREPEND) {
        Set<String> prependedKeys = new HashSet<>();
        keyValueCollector = entry -> {
          if (prependedKeys.contains(entry.getKey()) || !collectorMap.containsKey(entry.getKey())) {
            collectorMap.put(entry.getKey(), entry.getValue());
            prependedKeys.add(entry.getKey());
          }
        };
      } else {
        throw new UnsupportedOperationException("Cannot merge " + method);
      }
      return m -> {
            if (m instanceof Structure itMap) {
              ResultIterator.forEach(itMap.deconstruct(), kv -> keyValueCollector.accept((KeyValue) kv));
            } else {
              KeyValue itEntry = (KeyValue) m;
              keyValueCollector.accept(itEntry);
            }
          };
    } else if (destination instanceof TailspinArray collectorList) {
      if (method == Merge.APPEND) {
        return collectorList::append;
      } else if (method == Merge.PREPEND) {
        return collectorList.new Prepender();
      } else {
        throw new UnsupportedOperationException("Cannot merge " + method);
      }
    } else {
      throw new UnsupportedOperationException("Cannot collect in " + destination.getClass());
    }
  }
}
