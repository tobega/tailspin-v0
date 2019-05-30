package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Pattern;
import tailspin.ast.Bound;
import tailspin.ast.Matcher;
import tailspin.ast.RangeMatch;
import tailspin.ast.Reference;
import tailspin.ast.SuchThatMatch;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParser.ArrayMatchContext;
import tailspin.parser.TailspinParser.MatcherContext;
import tailspin.parser.TailspinParser.SuchThatContext;

public class RunTemplateBlock extends RunMain {
  private final Templates templates;
  public Object toMatch = null;

  RunTemplateBlock(Templates templates, Scope scope) {
    super(scope);
    this.templates = templates;
  }

  @Override
  public Matcher visitMatcher(MatcherContext ctx) {
    return new Matcher(ctx.condition());
  }

  @Override
  public Boolean visitCondition(TailspinParser.ConditionContext ctx) {
    if (ctx.typeMatch() != null) {
      if (!(Boolean) visit(ctx.typeMatch())) return false;
    }
    if (ctx.suchThat() != null) {
      for (SuchThatContext suchThat : ctx.suchThat()) {
        SuchThatMatch suchThatMatch = visitSuchThat(suchThat);
        if (!suchThatMatch.resolveValue(this)) return false;
      }
    }
    return true;
  }

  @Override
  public SuchThatMatch visitSuchThat(SuchThatContext ctx) {
    return new SuchThatMatch(ctx.valueChain(), visitMatcher(ctx.matcher()));
  }

  @Override
  public Boolean visitObjectEquals(TailspinParser.ObjectEqualsContext ctx) {
    Object expected = visitDereferenceValue(ctx.dereferenceValue());
    return expected.equals(toMatch);
  }

  @Override
  public Boolean visitIntegerEquals(TailspinParser.IntegerEqualsContext ctx) {
    Integer expected = visitArithmeticExpression(ctx.arithmeticExpression());
    return expected.equals(toMatch);
  }

  @Override
  public Boolean visitRangeMatch(TailspinParser.RangeMatchContext ctx) {
    if (!(toMatch instanceof Comparable)) return false;
    @SuppressWarnings("unchecked")
    Comparable<Object> it = (Comparable<Object>) toMatch;
    Bound lowerBound = ctx.lowerBound() != null ? visitLowerBound(ctx.lowerBound()) : null;
    Bound upperBound = ctx.upperBound() != null ? visitUpperBound(ctx.upperBound()) : null;
    return new RangeMatch(lowerBound, upperBound).contains(it);
  }

  @Override
  public Boolean visitRegexpMatch(TailspinParser.RegexpMatchContext ctx) {
    if (!(toMatch instanceof String)) return false;
    String it = (String) toMatch;
    String pattern = visitStringLiteral(ctx.stringLiteral());
    // TODO: this could be good to save in compiled form
    Pattern compiled =
        Pattern.compile(
            "\\A" + pattern + "\\z", Pattern.UNICODE_CHARACTER_CLASS + Pattern.CANON_EQ);
    return compiled.matcher(it).matches();
  }

  @Override
  public Boolean visitStructureMatch(TailspinParser.StructureMatchContext ctx) {
    Queue<Object> originalIt = scope.getIt();
    if (originalIt.size() != 1) {
      throw new AssertionError("Matcher called with several values");
    }
    if (!(toMatch instanceof Map)) return false;
    if (ctx.Key().isEmpty()) {
      return true;
    }
    boolean stillPossible = true;
    @SuppressWarnings("unchecked")
    Map<String, Object> it = (Map<String, Object>) toMatch;
    for (int i = 0; i < ctx.Key().size(); i++) {
      String key = ctx.Key(i).getText().replace(":", "");
      if (!it.containsKey(key)) {
        stillPossible = false;
        break;
      }
      Object value = it.get(key);
      scope.setIt(queueOf(value));
      TailspinParser.MatcherContext matcherCtx = ctx.matcher(i);
      Matcher matcher = visitMatcher(matcherCtx);
      if (!matcher.matches(value, this)) {
        stillPossible = false;
        break;
      }
    }
    scope.setIt(originalIt);
    return stillPossible;
  }

    @Override
    public Boolean visitInvertMatch(TailspinParser.InvertMatchContext ctx) {
        return ! ((Boolean) visit(ctx.condition()));
    }

  @Override
  public Boolean visitArrayMatch(ArrayMatchContext ctx) {
    if (!(toMatch instanceof List)) return false;
    List<?> it = (List<?>) toMatch;
    if (ctx.Range() != null) {
      int rangeTokenIndex = ctx.Range().getSymbol().getTokenIndex();
      if (ctx.arithmeticExpression(0) != null && ctx.arithmeticExpression(0).start.getTokenIndex() < rangeTokenIndex) {
        int lowerBound = visitArithmeticExpression(ctx.arithmeticExpression(0));
        if (it.size() < lowerBound) return false;
      }
      if (ctx.arithmeticExpression(1) != null) {
        int upperBound = visitArithmeticExpression(ctx.arithmeticExpression(1));
        return it.size() <= upperBound;
      } else if (ctx.arithmeticExpression(0) != null && ctx.arithmeticExpression(0).start.getTokenIndex() > rangeTokenIndex) {
        int upperBound = visitArithmeticExpression(ctx.arithmeticExpression(0));
        return it.size() <= upperBound;
      }
    } else if (ctx.arithmeticExpression(0) != null) {
      return visitArithmeticExpression(ctx.arithmeticExpression(0)) == it.size();
    }
    return true;
  }

  @Override
  public Queue<Object> visitBlock(TailspinParser.BlockContext ctx) {
    Queue<Object> results = new ArrayDeque<>();
    Queue<Object> it = scope.getIt();
    for (TailspinParser.BlockExpressionContext exp : ctx.blockExpression()) {
      Object result = visit(exp);
      if (result != null) {
        if (result instanceof Queue) {
          results.addAll((Collection<?>) result);
        } else {
          results.add(result);
        }
      }
      // reset $it for next chain
      scope.setIt(it);
    }
    return results;
  }

  @Override
  public Queue<Object> visitSendToTemplates(TailspinParser.SendToTemplatesContext ctx) {
    Queue<Object> qIt = visitValueChain(ctx.valueChain());
    Queue<Object> result = new ArrayDeque<>();
    qIt.forEach(it -> result.addAll(templates.matchTemplates(createMatcherBlockRunner(queueOf(it)))));
    return result;
  }

  RunMatcherBlock createMatcherBlockRunner(Queue<Object> it) {
    Scope matcherScope = newMatcherScope();
    matcherScope.setIt(it);
    return new RunMatcherBlock(templates, matcherScope);
  }

  Scope newMatcherScope() {
    return new NestedScope(scope);
  }

  class RunMatcherBlock extends RunTemplateBlock {
    RunMatcherBlock(Templates templates, Scope scope) {
      super(templates, scope);
    }

    @Override
    Scope newMatcherScope() {
      return new NestedScope(scope.getParentScope());
    }
  }

  @Override
  public Object visitStateAssignment(TailspinParser.StateAssignmentContext ctx) {
    String stateContext = ctx.NamedAt() == null ? "" : ctx.NamedAt().getText().substring(1);
    Reference reference = resolveReference(ctx.reference(), Reference.state(stateContext));
    Queue<Object> value = visitValueChain(ctx.valueChain());
    if (ctx.Deconstructor() != null) {
      collect(value, reference.getValue(scope));
    } else {
      reference.setValue(value, scope);
      if (!value.isEmpty()) {
        throw new IllegalStateException("Too many values at "
            + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine()
            + " " + ctx.getText());
      }
    }
    return null;
  }

  @Override
  public Object visitResultValue(TailspinParser.ResultValueContext ctx) {
    return visitValueChain(ctx.valueChain());
  }
}
