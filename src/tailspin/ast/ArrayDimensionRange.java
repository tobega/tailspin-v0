package tailspin.ast;

import static tailspin.ast.Expression.queueOf;

import tailspin.interpreter.RunMain;
import tailspin.interpreter.Scope;
import tailspin.parser.TailspinParser;

public class ArrayDimensionRange implements Value {

  private final TailspinParser.RangeLiteralContext rangeLiteral;

  public ArrayDimensionRange(TailspinParser.RangeLiteralContext rangeLiteral) {
    this.rangeLiteral = rangeLiteral;
  }

  @Override
  public Object evaluate(Object it, Scope scope) {
    scope.setIt(queueOf(it));
    return new RunMain(scope).visitRangeLiteral(rangeLiteral);
  }
}
