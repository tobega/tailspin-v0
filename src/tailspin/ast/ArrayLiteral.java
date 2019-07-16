package tailspin.ast;

import static tailspin.ast.Expression.queueOf;

import tailspin.interpreter.RunMain;
import tailspin.interpreter.Scope;
import tailspin.parser.TailspinParser;

public class ArrayLiteral implements Value {

  private final TailspinParser.ArrayLiteralContext arrayLiteral;

  public ArrayLiteral(TailspinParser.ArrayLiteralContext arrayLiteral) {
    this.arrayLiteral = arrayLiteral;
  }

  @Override
  public Object evaluate(Object it, Scope scope) {
    scope.setIt(queueOf(it));
    return new RunMain(scope).visitArrayLiteral(arrayLiteral);
  }
}
