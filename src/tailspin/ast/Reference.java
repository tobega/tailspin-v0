package tailspin.ast;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import tailspin.interpreter.Scope;

public abstract class Reference {
  public abstract Object getValue(Scope scope);
  abstract boolean isMutable();
  public abstract void setValue(Object value, Scope scope);

  public Reference field(String fieldIdentifier) {
    return new FieldReference(this, fieldIdentifier);
  }

  public Reference array(List<Object> dimensions) {
    return new ArrayReference(this, dimensions);
  }

  public static Reference it() {
    return itReference;
  }

  private static Reference itReference = new Reference() {
    @Override
    public Object getValue(Scope scope) {
      Queue<Object> itQ = scope.getIt();
      if (itQ.size() != 1) {
        throw new AssertionError("Invalid it dereference " + itQ.size());
      }
      return itQ.peek();
    }

    @Override
    boolean isMutable() {
      return false;
    }

    @Override
    public void setValue(Object value, Scope scope) {
      throw new UnsupportedOperationException("'it' is not mutable");
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
    public Object getValue(Scope scope) {
      return scope.resolveValue(identifier);
    }

    @Override
    boolean isMutable() {
      return false;
    }

    @Override
    public void setValue(Object value, Scope scope) {
      throw new UnsupportedOperationException(identifier + " is not mutable");
    }
  }

  private static class StateReference extends Reference {
    private final String stateContext;

    private StateReference(String stateContext) {
      this.stateContext = stateContext;
    }

    @Override
    public Object getValue(Scope scope) {
      return scope.getState(stateContext);
    }

    @Override
    boolean isMutable() {
      return true;
    }

    @Override
    public void setValue(Object value, Scope scope) {
      scope.setState(stateContext, value);
    }
  }

  private static class FieldReference extends Reference {
    private final Reference parent;
    private final String fieldIdentifier;

    private FieldReference(Reference parent, String fieldIdentifier) {
      this.parent = parent;
      this.fieldIdentifier = fieldIdentifier;
    }

    @Override
    public Object getValue(Scope scope) {
      @SuppressWarnings("unchecked")
      Map<String, Object> structure = (Map<String, Object>) parent.getValue(scope);
      return structure.get(fieldIdentifier);
    }

    @Override
    boolean isMutable() {
      return parent.isMutable();
    }

    @Override
    public void setValue(Object value, Scope scope) {
      if (!isMutable()) {
        throw new UnsupportedOperationException("Not mutable");
      }
      @SuppressWarnings("unchecked")
      Map<String, Object> structure = (Map<String, Object>) parent.getValue(scope);
      structure.put(fieldIdentifier, value);
    }
  }

  private static class ArrayReference extends Reference {
    private final Reference parent;
    private final List<Object> dimensions;

    private ArrayReference(Reference parent, List<Object> dimensions) {
      this.parent = parent;
      this.dimensions = dimensions;
    }

    @Override
    public Object getValue(Scope scope) {
      List<?> array = (List<?>) parent.getValue(scope);
      return resolveDimensionDereference(0, array);
    }

    @Override
    boolean isMutable() {
      return parent.isMutable();
    }

    @Override
    public void setValue(Object value, Scope scope) {
      throw new UnsupportedOperationException("Not implemented yet");
    }

    private Object resolveDimensionDereference(int currentDereference, List<?> array) {
      Object idx = dimensions.get(currentDereference);
      Object dimensionResult;
      if (idx instanceof Integer) {
        int index = javaizeArrayIndex((Integer) idx, array.size());
        dimensionResult = array.get(index);
      } else if (idx instanceof RangeGenerator) {
        dimensionResult = resolveArrayRangeDereference((RangeGenerator) idx, array);
      } else if (idx instanceof List) {
        @SuppressWarnings("unchecked")
        List<Integer> permutation = (List<Integer>) idx;
        dimensionResult =
            permutation.stream().map(i -> javaizeArrayIndex(i, array.size())).map(array::get);
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
            .map(a -> resolveDimensionDereference(currentDereference + 1, a))
            .collect(Collectors.toList());
      } else {
        return resolveDimensionDereference(currentDereference + 1, (List<?>) dimensionResult);
      }
    }

    private int javaizeArrayIndex(int index, int size) {
      if (index < 0) {
        return index + size;
      } else {
        return index - 1;
      }
    }

    private Stream<Object> resolveArrayRangeDereference(RangeGenerator range, List<?> array) {
      return range.stream((Integer i) -> javaizeArrayIndex(i, array.size()))
          .map(array::get);
    }
  }
}
