package tailspin.interpreter;

public interface CompositionSpec {
  interface Resolver {
    SubComposer resolveSpec(CompositionSpec spec, Scope scope);
  }
}
