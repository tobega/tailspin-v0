package tailspin.interpreter;

import static tailspin.ast.Value.oneValue;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import tailspin.ast.Bound;
import tailspin.ast.Equality;
import tailspin.ast.Matcher;
import tailspin.ast.RangeMatch;
import tailspin.ast.RegexpMatch;
import tailspin.ast.SuchThatMatch;
import tailspin.ast.Value;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParser.ArrayMatchContext;
import tailspin.parser.TailspinParser.MatcherContext;
import tailspin.parser.TailspinParser.SuchThatContext;

public class RunTemplateBlock extends RunMain {
  public Object toMatch = null;

  public RunTemplateBlock(Scope scope) {
    super(scope);
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
    return new SuchThatMatch(Value.of(visitValueChain(ctx.valueChain())), visitMatcher(ctx.matcher()));
  }

  @Override
  public Boolean visitObjectEquals(TailspinParser.ObjectEqualsContext ctx) {
    return new Equality(Value.of(visitDereferenceValue(ctx.dereferenceValue()))).matches(toMatch, oneValue(scope.getIt()), scope);
  }

  @Override
  public Boolean visitIntegerEquals(TailspinParser.IntegerEqualsContext ctx) {
    return new Equality(visitArithmeticExpression(ctx.arithmeticExpression())).matches(toMatch, oneValue(scope.getIt()), scope);
  }

  @Override
  public Boolean visitRangeMatch(TailspinParser.RangeMatchContext ctx) {
    Bound lowerBound = ctx.lowerBound() != null ? visitLowerBound(ctx.lowerBound()) : null;
    Bound upperBound = ctx.upperBound() != null ? visitUpperBound(ctx.upperBound()) : null;
    return new RangeMatch(lowerBound, upperBound).matches(toMatch, oneValue(scope.getIt()), scope);
  }

  @Override
  public Boolean visitRegexpMatch(TailspinParser.RegexpMatchContext ctx) {
    return new RegexpMatch(visitStringLiteral(ctx.stringLiteral())).matches(toMatch, oneValue(scope.getIt()), scope);
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
        int lowerBound = ((Number) visitArithmeticExpression(ctx.arithmeticExpression(0)).evaluate(
            oneValue(scope.getIt()), scope)).intValue();
        if (it.size() < lowerBound) return false;
      }
      if (ctx.arithmeticExpression(1) != null) {
        int upperBound = ((Number) visitArithmeticExpression(ctx.arithmeticExpression(1)).evaluate(
            oneValue(scope.getIt()), scope)).intValue();
        return it.size() <= upperBound;
      } else if (ctx.arithmeticExpression(0) != null && ctx.arithmeticExpression(0).start.getTokenIndex() > rangeTokenIndex) {
        int upperBound = ((Number) visitArithmeticExpression(ctx.arithmeticExpression(0)).evaluate(
            oneValue(scope.getIt()), scope)).intValue();
        return it.size() <= upperBound;
      }
    } else if (ctx.arithmeticExpression(0) != null) {
      return ((Number) visitArithmeticExpression(ctx.arithmeticExpression(0)).evaluate(oneValue(scope.getIt()), scope)).intValue() == it.size();
    }
    return true;
  }

  public RunMatcherBlock createMatcherBlockRunner(Queue<Object> it) {
    Scope matcherScope = newMatcherScope();
    matcherScope.setIt(it);
    return new RunMatcherBlock(matcherScope);
  }

  Scope newMatcherScope() {
    return new NestedScope(scope);
  }

  class RunMatcherBlock extends RunTemplateBlock {
    RunMatcherBlock(Scope scope) {
      super(scope);
    }

    @Override
    Scope newMatcherScope() {
      return new NestedScope(scope.getParentScope());
    }
  }
}
