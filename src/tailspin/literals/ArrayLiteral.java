package tailspin.literals;

import java.util.ArrayList;
import java.util.List;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.control.Value;
import tailspin.interpreter.Scope;

public class ArrayLiteral implements Value {
  private final List<Expression> valueProductions;

  public ArrayLiteral(List<Expression> valueProductions) {
    this.valueProductions = valueProductions;
  }

  @Override
  public Object getResults(Object it, Scope scope) {
    ArrayList<Object> array = new ArrayList<>();
    for (Expression vp : valueProductions) {
      Object result = vp.getResults(it, scope);
      ResultIterator.forEach(result, array::add);
    }
    return array;
  }
}
