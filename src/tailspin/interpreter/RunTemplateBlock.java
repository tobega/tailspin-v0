package tailspin.interpreter;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Pattern;
import tailspin.ast.Bound;
import tailspin.ast.Matcher;
import tailspin.ast.RangeMatch;
import tailspin.ast.SuchThatMatch;
import tailspin.ast.Value;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParser.ArrayMatchContext;
import tailspin.parser.TailspinParser.MatcherContext;
import tailspin.parser.TailspinParser.SuchThatContext;

public class RunTemplateBlock extends RunMain {
  private final Templates templates;
  public Object toMatch = null;

  public RunTemplateBlock(Templates templates, Scope scope) {
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
    return new SuchThatMatch(Value.of(visitValueChain(ctx.valueChain())), visitMatcher(ctx.matcher()));
  }

  @Override
  public Boolean visitObjectEquals(TailspinParser.ObjectEqualsContext ctx) {
    Object expected = Value.oneValue(visitDereferenceValue(ctx.dereferenceValue())
        .run(Value.oneValue(scope.getIt()), scope));
    return expected.equals(toMatch);
  }

  @Override
  public Boolean visitIntegerEquals(TailspinParser.IntegerEqualsContext ctx) {
    Long expected = (Long) visitArithmeticExpression(ctx.arithmeticExpression()).evaluate(Value.oneValue(scope.getIt()), scope);
    return expected.equals(toMatch);
  }

  @Override
  public Boolean visitRangeMatch(TailspinParser.RangeMatchContext ctx) {
    if (!(toMatch instanceof Comparable)) return false;
    @SuppressWarnings("unchecked")
    Comparable<Object> it = (Comparable<Object>) toMatch;
    Bound lowerBound = ctx.lowerBound() != null ? visitLowerBound(ctx.lowerBound()) : null;
    Bound upperBound = ctx.upperBound() != null ? visitUpperBound(ctx.upperBound()) : null;
    return new RangeMatch(lowerBound, upperBound).evaluate(it, scope);
  }

  @Override
  public Boolean visitRegexpMatch(TailspinParser.RegexpMatchContext ctx) {
    if (!(toMatch instanceof String)) return false;
    String it = (String) toMatch;
    String pattern = visitStringLiteral(ctx.stringLiteral());
    // TODO: this could be good to save in compiled form
    Pattern compiled =
        Pattern.compile(
            "\\A" + pattern + "\\z", Pattern.UNICODE_CHARACTER_CLASS + Pattern.CANON_EQ + Pattern.DOTALL);
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
        int lowerBound = ((Number) visitArithmeticExpression(ctx.arithmeticExpression(0)).evaluate(Value.oneValue(scope.getIt()), scope)).intValue();
        if (it.size() < lowerBound) return false;
      }
      if (ctx.arithmeticExpression(1) != null) {
        int upperBound = ((Number) visitArithmeticExpression(ctx.arithmeticExpression(1)).evaluate(Value.oneValue(scope.getIt()), scope)).intValue();
        return it.size() <= upperBound;
      } else if (ctx.arithmeticExpression(0) != null && ctx.arithmeticExpression(0).start.getTokenIndex() > rangeTokenIndex) {
        int upperBound = ((Number) visitArithmeticExpression(ctx.arithmeticExpression(0)).evaluate(Value.oneValue(scope.getIt()), scope)).intValue();
        return it.size() <= upperBound;
      }
    } else if (ctx.arithmeticExpression(0) != null) {
      return ((Number) visitArithmeticExpression(ctx.arithmeticExpression(0)).evaluate(Value.oneValue(scope.getIt()), scope)).intValue() == it.size();
    }
    return true;
  }

  public RunMatcherBlock createMatcherBlockRunner(Queue<Object> it) {
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
}
