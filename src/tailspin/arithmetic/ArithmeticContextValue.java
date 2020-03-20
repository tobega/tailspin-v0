package tailspin.arithmetic;

import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class ArithmeticContextValue implements Value {

  private final String name;
  private final ArithmeticContextKeywordResolver resolver;

  public ArithmeticContextValue(String name, ArithmeticContextKeywordResolver resolver) {
    this.name = name;
    this.resolver = resolver;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    return resolver.getValue(name);
  }
}
