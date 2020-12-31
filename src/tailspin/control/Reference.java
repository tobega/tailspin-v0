package tailspin.control;

import java.util.List;
import tailspin.interpreter.Scope;
import tailspin.types.Freezable;
import tailspin.types.KeyValue;
import tailspin.types.Processor;
import tailspin.types.Structure;
import tailspin.types.TailspinArray;

public abstract class Reference implements Value {
  public abstract Object getValue(Object it, Scope scope);
  public abstract Object deleteValue(Object it, Scope scope);
  public abstract boolean isMutable();
  public abstract void setValue(boolean merge, Object value, Object it, Scope scope);

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

  public Reference array(List<DimensionReference> dimensions) {
    return new ArrayReference(this, dimensions);
  }

  public static Reference it() {
    return itReference;
  }

  private static Reference itReference = new Reference() {
    @Override
    public Object getValue(Object it, Scope scope) {
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
    public void setValue(boolean merge, Object value, Object it, Scope scope) {
      throw new UnsupportedOperationException("$ is not mutable");
    }

    @Override
    public String toString() {
      return "$";
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
    public void setValue(boolean merge, Object value, Object it, Scope scope) {
      throw new UnsupportedOperationException(identifier + " is not mutable");
    }

    @Override
    public String toString() {
      return "$" + identifier;
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
    if (value instanceof String || value instanceof Number || value instanceof Processor || value instanceof byte[]) {
      return value;
    }
    throw new IllegalArgumentException("Unknown value type " + value.getClass().getName());
  }

  void collect(Object it, Object collector) {
    if (collector instanceof Structure) {
      Structure collectorMap = (Structure) collector;
      ResultIterator.forEach(it,
          m -> {
            if (m instanceof Structure) {
              Structure itMap = (Structure) m;
              ResultIterator.forEach(itMap.deconstruct(), member -> {
                KeyValue entry = (KeyValue) member;
                collectorMap.put(entry.getKey(), entry.getValue());
              });
            } else {
              KeyValue itEntry = (KeyValue) m;
              collectorMap.put(itEntry.getKey(), itEntry.getValue());
            }
          });
    } else if (collector instanceof TailspinArray) {
      TailspinArray collectorList = (TailspinArray) collector;
      ResultIterator.forEach(it, collectorList::append);
    } else {
      throw new UnsupportedOperationException("Cannot collect in " + collector.getClass());
    }
  }
}
