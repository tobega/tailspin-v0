package tailspin.ast;

import java.util.ArrayList;
import java.util.List;
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
      if (result == null) {
        continue;
      }
      if (result instanceof ResultIterator) {
        ResultIterator.apply(array::add, (ResultIterator) result);
      } else {
        array.add(result);
      }
    }
    return array;
  }
}
