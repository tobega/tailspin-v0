package tailspin.ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import tailspin.interpreter.Scope;

public abstract class Reference implements Value {
  public abstract Object getValue(Object it, Scope scope);
  public abstract Object deleteValue(Object it, Scope scope);
  public abstract boolean isMutable();
  public abstract void setValue(boolean merge, Object value, Object it, Scope scope);

  @Override
  public Object getResults(Object it, Scope scope) {
    return getValue(it, scope);
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
        throw new IllegalStateException("Cannot reference $it, doesn't exist");
      }
      return it;
    }

    @Override
    public Object deleteValue(Object it, Scope scope) {
      throw new UnsupportedOperationException("'it' is not deletable");
    }

    @Override
    public boolean isMutable() {
      return false;
    }

    @Override
    public void setValue(boolean merge, Object value, Object it, Scope scope) {
      throw new UnsupportedOperationException("'it' is not mutable");
    }

    @Override
    public String toString() {
      return "$it";
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

  private static class StateReference extends Reference {
    private final String stateContext;

    private StateReference(String stateContext) {
      this.stateContext = stateContext;
    }

    @Override
    public Object getValue(Object it, Scope scope) {
      return scope.getState(stateContext);
    }

    @Override
    public Object deleteValue(Object it, Scope scope) {
      Object state = scope.getState(stateContext);
      scope.setState(stateContext, null);
      return state;
    }

    @Override
    public boolean isMutable() {
      return true;
    }

    @Override
    public void setValue(boolean merge, Object value, Object it, Scope scope) {
      if (merge) {
        collect(value, scope.getState(stateContext));
      } else {
        Object v = value;
        if (v instanceof ResultIterator) {
          v = ((ResultIterator) v).getNextResult();
          if (v == null) {
            // TODO: supply better debug info
            throw new IllegalArgumentException("Too few values");
          }
        }
        scope.setState(stateContext, copy(v));
      }
    }

    @Override
    public String toString() {
      return "@" + stateContext;
    }
  }

  public static Object copy(Object value) {
    if (value instanceof Map) {
      @SuppressWarnings("unchecked")
      Map<String, Object> mapValue = (Map<String, Object>) value;
      Map<String, Object> result = new TreeMap<>();
      for (Map.Entry<String, Object> entry : mapValue.entrySet()) {
        result.put(entry.getKey(), copy(entry.getValue()));
      }
      return result;
    }
    if (value instanceof List) {
      @SuppressWarnings("unchecked")
      List<Object> arrayValue = (List<Object>) value;
      List<Object> result = new ArrayList<>();
      for (Object member : arrayValue) {
        result.add(copy(member));
      }
      return result;
    }
    return value;
  }

  private static class FieldReference extends Reference {
    private final Reference parent;
    private final String fieldIdentifier;

    private FieldReference(Reference parent, String fieldIdentifier) {
      this.parent = parent;
      this.fieldIdentifier = fieldIdentifier;
    }

    @Override
    public Object getValue(Object it, Scope scope) {
      @SuppressWarnings("unchecked")
      Map<String, Object> structure = (Map<String, Object>) parent.getValue(it, scope);
      return structure.get(fieldIdentifier);
    }

    @Override
    public Object deleteValue(Object it, Scope scope) {
      if (!isMutable()) {
        throw new UnsupportedOperationException("Not deletable");
      }
      @SuppressWarnings("unchecked")
      Map<String, Object> structure = (Map<String, Object>) parent.getValue(it, scope);
      return structure.remove(fieldIdentifier);
    }

    @Override
    public boolean isMutable() {
      return parent.isMutable();
    }

    @Override
    public void setValue(boolean merge, Object value, Object it, Scope scope) {
      if (!isMutable()) {
        throw new UnsupportedOperationException("Not mutable");
      }
      if (merge) {
        collect(value, getValue(it, scope));
      } else {
        @SuppressWarnings("unchecked")
        Map<String, Object> structure = (Map<String, Object>) parent.getValue(it, scope);
        Object v = value;
        if (v instanceof ResultIterator) {
          v = ((ResultIterator) v).getNextResult();
          if (v == null) {
            // TODO: supply better debug info
            throw new IllegalArgumentException("Too few values");
          }
        }
        structure.put(fieldIdentifier, Reference.copy(v));
      }
    }

    @Override
    public String toString() {
      return parent.toString() + "." + fieldIdentifier;
    }
  }

  private static class ArrayReference extends Reference {
    private final Reference parent;
    private final List<DimensionReference> dimensions;

    private ArrayReference(Reference parent, List<DimensionReference> dimensions) {
      this.parent = parent;
      this.dimensions = dimensions;
    }

    @Override
    public Object getValue(Object it, Scope scope) {
      @SuppressWarnings("unchecked")
      List<Object> array = (List<Object>) parent.getValue(it, scope);
      return resolveDimensionDereference(0, array, List::get, it, scope);
    }

    @Override
    public Object deleteValue(Object it, Scope scope) {
      if (!isMutable()) {
        throw new UnsupportedOperationException("Not deletable");
      }
      @SuppressWarnings("unchecked")
      List<Object> array = (List<Object>) parent.getValue(it, scope);
      return resolveDimensionDereference(0, array, List::remove, it, scope);
    }

    @Override
    public boolean isMutable() {
      return parent.isMutable();
    }

    @Override
    public void setValue(boolean merge, final Object value, Object it, Scope scope) {
      if (!isMutable()) {
        throw new UnsupportedOperationException("Not mutable");
      }
      @SuppressWarnings("unchecked")
      List<Object> array = (List<Object>) parent.getValue(it, scope);
      if (merge) {
        class Merger implements ArrayOperation {
          int invocations = 0;
          List<Object> lastArray;
          int lastIndex;
          Object valueToMerge = value;

          @Override
          public Object invoke(List<Object> array, int index) {
            invocations++;
            lastArray = array;
            lastIndex = index;
            Object v = valueToMerge;
            if (v instanceof ResultIterator) {
              v = ((ResultIterator) v).getNextResult();
            } else {
              valueToMerge = null; // Only use it once
            }
            if (v == null) {
              // TODO: supply better debug info
              throw new IllegalArgumentException("Too few values");
            }
            collect(v, array.get(index));
            return null;
          }

          void resolveSingleArrayElementThatCanMergeMany() {
            if (invocations == 1) {
              collect(value, lastArray.get(lastIndex));
            }
          }
        }
        Merger merger = new Merger();
        resolveDimensionDereference(0, array, merger, it, scope);
        merger.resolveSingleArrayElementThatCanMergeMany();
      } else {
        AtomicReference<Object> valueToMerge = new AtomicReference<>(value);
        resolveDimensionDereference(0, array, (a, i) -> {
          Object v = valueToMerge.get();
          if (v instanceof ResultIterator) {
            v = ((ResultIterator) v).getNextResult();
          } else {
            valueToMerge.set(null);
          }
          if (v == null) {
            // TODO: supply better debug message
            throw new IllegalArgumentException("Too few values");
          }
          return a.set(i, copy(v));
        }, it, scope);
      }
    }

    @Override
    public String toString() {
      return parent.toString() + "(" + dimensions.stream().map(Object::toString).collect(Collectors.joining(";")) + ")";
    }

    private interface ArrayOperation {
      Object invoke(List<Object> array, int index);
    }

    private Object resolveDimensionDereference(int currentDereference, List<Object> array,
        ArrayOperation bottomOperation, Object it, Scope scope) {
      ArrayOperation operation = currentDereference == dimensions.size() - 1 ? bottomOperation : List::get;
      DimensionReference dimensionReference = dimensions.get(currentDereference);
      Object idx = dimensionReference.getIndices(array.size(), it, scope);
      Object dimensionResult;
      if (idx instanceof Number) {
        dimensionResult = operation.invoke(array, ((Number) idx).intValue());
      } else if (idx instanceof Stream) {
        dimensionResult = ((Stream<?>) idx)
            .map(i -> operation.invoke(array, ((Number) i).intValue()));
      } else {
          throw new UnsupportedOperationException(
              "Unable to dereference array by "
                  + idx.getClass().getName());
      }
      if (currentDereference == dimensions.size() - 1) {
        if (dimensionResult instanceof Stream) {
          return ((Stream<?>) dimensionResult).collect(Collectors.toList());
        } else {
          return dimensionResult;
        }
      }
      if (dimensionResult instanceof Stream) {
        @SuppressWarnings("unchecked")
        Stream<List<Object>> results = (Stream<List<Object>>) dimensionResult;
        return results
            .map(a -> resolveDimensionDereference(currentDereference + 1, a, bottomOperation, it, scope))
            .collect(Collectors.toList());
      } else {
        @SuppressWarnings("unchecked")
        List<Object> previousDimension = (List<Object>) dimensionResult;
        return resolveDimensionDereference(currentDereference + 1, previousDimension, bottomOperation, it, scope);
      }
    }
  }

  void collect(Object its, Object collector) {
    Object it = its;
    do {
      if (its instanceof ResultIterator) {
        it = ((ResultIterator) its).getNextResult();
        if (it == null) break;
      }
      if (collector instanceof Map) {
        @SuppressWarnings("unchecked")
        Map<String, Object> collectorMap = (Map<String, Object>) collector;
        if (it instanceof Map) {
            @SuppressWarnings("unchecked")
            Map<String, Object> itMap = (Map<String, Object>) it;
            itMap.entrySet().forEach(itEntry -> collectorMap.put(itEntry.getKey(), copy(itEntry.getValue())));
          } else {
            @SuppressWarnings("unchecked")
            Map.Entry<String, Object> itEntry = (Map.Entry<String, Object>) it;
            collectorMap.put(itEntry.getKey(), copy(itEntry.getValue()));
          }
      } else if (collector instanceof List) {
        @SuppressWarnings("unchecked")
        List<Object> collectorList = (List<Object>) collector;
        collectorList.add(copy(it));
      } else {
        throw new UnsupportedOperationException("Cannot collect in " + collector.getClass());
      }
    } while (its instanceof ResultIterator);
  }
}
