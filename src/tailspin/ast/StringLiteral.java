package tailspin.ast;

import static tailspin.ast.Expression.queueOf;

import tailspin.interpreter.RunMain;
import tailspin.interpreter.Scope;
import tailspin.parser.TailspinParser;

public class StringLiteral implements Value {
  final TailspinParser.StringLiteralContext stringLiteral;

  public StringLiteral(TailspinParser.StringLiteralContext stringLiteral) {
    this.stringLiteral = stringLiteral;
  }

  @Override
  public Object evaluate(Object it, Scope scope) {
    scope.setIt(queueOf(it));
    return new RunMain(scope).visitStringLiteral(stringLiteral);
  }
}
