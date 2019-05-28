package tailspin.ast;

import java.util.Queue;
import tailspin.interpreter.Scope;

public abstract class Reference {
  public abstract Object getValue(Scope scope);

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
  }
}
