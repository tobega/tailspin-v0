package tailspin.arithmetic;

import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class ArithmeticContextValue implements Value {

  private final String name;

  public ArithmeticContextValue(String name) {
    this.name = name;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    ArithmeticContextKeywordResolver resolver = scope.getArithmeticContextKeywordResolver();
    return resolver.getValue(name);
  }
}
