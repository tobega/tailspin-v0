package tailspin.matchers.composer;

import tailspin.interpreter.Scope;

public interface CompositionSpec {
  interface Resolver {
    SubComposer resolveSpec(CompositionSpec spec, Scope scope);
  }
}
