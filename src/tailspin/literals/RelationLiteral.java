package tailspin.literals;

import java.util.ArrayList;
import java.util.List;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.types.Relation;
import tailspin.types.Structure;

public class RelationLiteral implements Value {

  private final List<Expression> structures;

  public RelationLiteral(List<Expression> structures) {
    this.structures = structures;
  }

  @Override
  public Relation getResults(Object it, Scope scope) {
    List<Structure> lines = new ArrayList<>();
    for (Expression expression : structures) {
      Object result = expression.getResults(it, scope);
      ResultIterator.forEach(result, s -> lines.add((Structure) s));
    }
    return new Relation(lines);
  }
}
