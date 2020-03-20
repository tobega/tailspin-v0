package tailspin.transform.composer;

import tailspin.interpreter.Scope;

public interface CompositionSpec {
  interface Resolver {
    SubComposer resolveSpec(CompositionSpec spec, Scope scope);
  }
}
