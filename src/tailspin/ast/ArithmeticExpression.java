package tailspin.ast;

import static tailspin.ast.Expression.queueOf;

import tailspin.interpreter.RunMain;
import tailspin.interpreter.Scope;
import tailspin.parser.TailspinParser;

public class ArithmeticExpression implements Value {

  private final TailspinParser.ArithmeticExpressionContext arithmeticExpression;

  public ArithmeticExpression(TailspinParser.ArithmeticExpressionContext arithmeticExpression) {
    this.arithmeticExpression = arithmeticExpression;
  }

  @Override
  public Object evaluate(Object it, Scope scope) {
    scope.setIt(queueOf(it));
    return new RunMain(scope).visitArithmeticExpression(arithmeticExpression);
  }
}
