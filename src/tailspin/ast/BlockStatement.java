package tailspin.ast;

import java.util.Queue;
import tailspin.interpreter.RunMain;
import tailspin.interpreter.Scope;
import tailspin.parser.TailspinParser;

public class BlockStatement implements Expression {
  private final TailspinParser.StatementContext statement;

  public BlockStatement(TailspinParser.StatementContext statement) {
    this.statement = statement;
  }

  @Override
  public Queue<Object> run(Object it, Scope blockScope) {
    blockScope.setIt(Expression.queueOf(it));
    new RunMain(blockScope).visit(statement);
    return EMPTY_RESULT;
  }
}
