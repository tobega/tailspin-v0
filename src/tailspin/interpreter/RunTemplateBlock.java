package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Pattern;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParser.ArrayMatchContext;
import tailspin.parser.TailspinParser.ConditionContext;
import tailspin.parser.TailspinParser.MatcherContext;
import tailspin.parser.TailspinParser.SuchThatContext;

class RunTemplateBlock extends RunMain {
  private final Templates templates;

  RunTemplateBlock(Templates templates, Scope scope) {
    super(scope);
    this.templates = templates;
  }

  @Override
  public Boolean visitMatcher(MatcherContext ctx) {
    for (ConditionContext condition : ctx.condition()) {
      if (visitCondition(condition)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Boolean visitCondition(TailspinParser.ConditionContext ctx) {
    if (ctx.typeMatch() != null) {
      if (!(Boolean) visit(ctx.typeMatch())) return false;
    }
    if (ctx.suchThat() != null) {
      for (SuchThatContext suchThat : ctx.suchThat()) {
        if (!visitSuchThat(suchThat)) return false;
      }
    }
    return true;
  }

  @Override
  public Boolean visitSuchThat(SuchThatContext ctx) {
    // It has to be a single value here
    scope.defineValue("it", scope.getIt().peek(), true);
    try {
      scope.setIt(visitSource(ctx.source()));
      return visitMatcher(ctx.matcher());
    } finally{
      scope.setIt(queueOf(scope.resolveValue("it", true)));
    }
  }

  @Override
  public Boolean visitIntegerEquals(TailspinParser.IntegerEqualsContext ctx) {
    Integer expected = visitMatchArithmeticExpression(ctx.matchArithmeticExpression());
    Queue<Object> it = scope.getIt();
    if (it.size() != 1) {
      throw new AssertionError("Matcher called with several values");
    }
    return expected.equals(it.peek());
  }

  @Override
  public Integer visitMatchArithmeticExpression(TailspinParser.MatchArithmeticExpressionContext ctx) {
    if (ctx.MatchInteger() != null) {
      return Integer.valueOf(ctx.MatchInteger().getText());
    }
    if (ctx.matchDereferenceValue() != null) {
      return (Integer) visitMatchDereferenceValue(ctx.matchDereferenceValue());
    }
    throw new UnsupportedOperationException("Stumped at match arithmetic");
  }

  @Override
  public Object visitMatchDereferenceValue(TailspinParser.MatchDereferenceValueContext ctx) {
    String identifier = ctx.MatchDereference().getText().substring(1);
    Object value;
    if (identifier.startsWith(":")) {
      value = scope.getState(identifier.substring(1));
    } else {
      value = scope.resolveValue(identifier, true);
    }
    if (ctx.arrayDereference() != null) {
      value = resolveArrayDereference(ctx.arrayDereference(), (List<?>) value);
    }
    for (TailspinParser.MatchStructureDereferenceContext sdc : ctx.matchStructureDereference()) {
      value = resolveFieldDereferences(value, sdc.MatchFieldDereference());
      if (sdc.arrayDereference() != null) {
        value = resolveArrayDereference(sdc.arrayDereference(), (List<?>) value);
      }
    }
    return value;
  }

  @Override
  public Boolean visitRangeMatch(TailspinParser.RangeMatchContext ctx) {
    Queue<Object> qIt = scope.getIt();
    if (qIt.size() != 1) {
      throw new AssertionError("Matcher called with several values");
    }
    Object oIt = qIt.peek();
    if (!(oIt instanceof Integer)) return false;
    Integer it = (Integer) oIt;
    if (ctx.lowerBound() != null) {
      Bound lowerBound = visitLowerBound(ctx.lowerBound());
      if (it < lowerBound.value) return false;
      if (!lowerBound.inclusive && it == lowerBound.value) return false;
    }
    if (ctx.upperBound() != null) {
      Bound upperBound = visitUpperBound(ctx.upperBound());
      if (it > upperBound.value) return false;
      if (!upperBound.inclusive && it == upperBound.value) return false;
    }
    return true;
  }

  private static class Bound {
    int value;
    boolean inclusive;
    Bound(int value, boolean inclusive) {
      this.value = value;
      this.inclusive = inclusive;
    }
  }

  @Override
  public Bound visitLowerBound(TailspinParser.LowerBoundContext ctx) {
    return new Bound(visitMatchArithmeticExpression(ctx.matchArithmeticExpression()), ctx.InvertMatch() == null);
  }

  @Override
  public Bound visitUpperBound(TailspinParser.UpperBoundContext ctx) {
    return new Bound(visitMatchArithmeticExpression(ctx.matchArithmeticExpression()), ctx.InvertMatch() == null);
  }

  @Override
  public Boolean visitRegexpMatch(TailspinParser.RegexpMatchContext ctx) {
    Queue<Object> qIt = scope.getIt();
    if (qIt.size() != 1) {
      throw new AssertionError("Matcher called with several values");
    }
    Object oIt = qIt.peek();
    if (!(oIt instanceof String)) return false;
    String it = (String) oIt;
    String pattern = visitStringLiteral(ctx.stringLiteral());
    // TODO: this coud be good to save in compiled form
    Pattern compiled =
        Pattern.compile(
            "\\A" + pattern + "\\z", Pattern.UNICODE_CHARACTER_CLASS + Pattern.CANON_EQ);
    return compiled.matcher(it).matches();
  }

  @Override
  public Boolean visitStructureMatch(TailspinParser.StructureMatchContext ctx) {
    Queue<Object> qIt = scope.getIt();
    if (qIt.size() != 1) {
      throw new AssertionError("Matcher called with several values");
    }
    Object oIt = qIt.peek();
    if (!(oIt instanceof Map)) return false;
    if (ctx.StructureKey().isEmpty()) {
      return true;
    }
    boolean stillPossible = true;
    @SuppressWarnings("unchecked")
    Map<String, Object> it = (Map<String, Object>) oIt;
    for (int i = 0; i < ctx.StructureKey().size(); i++) {
      String key = ctx.StructureKey(i).getText().replace(":", "");
      if (!it.containsKey(key)) {
        stillPossible = false;
        break;
      }
      scope.setIt(queueOf(it.get(key)));
      TailspinParser.MatcherContext matcher = ctx.matcher(i);
      if (!visitMatcher(matcher)) {
        stillPossible = false;
        break;
      }
    }
    scope.setIt(qIt);
    return stillPossible;
  }

    @Override
    public Boolean visitInvertMatch(TailspinParser.InvertMatchContext ctx) {
        return ! ((Boolean) visit(ctx.condition()));
    }

  @Override
  public Boolean visitArrayMatch(ArrayMatchContext ctx) {
    Queue<Object> qIt = scope.getIt();
    if (qIt.size() != 1) {
      throw new AssertionError("Matcher called with several values");
    }
    Object oIt = qIt.peek();
    if (!(oIt instanceof List)) return false;
    List<?> it = (List<?>) oIt;
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
    qIt.forEach(it -> {
      Scope matcherScope = newMatcherScope();
      matcherScope.setIt(queueOf(it));
      result.addAll(templates.matchTemplates(new RunMatcherBlock(templates, matcherScope)));
    });
    return result;
  }

  Scope newMatcherScope() {
    return new NestedScope(scope);
  }

  private class RunMatcherBlock extends RunTemplateBlock {
    RunMatcherBlock(Templates templates, Scope scope) {
      super(templates, scope);
    }

    @Override
    Scope newMatcherScope() {
      return new NestedScope(RunTemplateBlock.this.scope);
    }
  }

  @Override
  public Object visitStateAssignment(TailspinParser.StateAssignmentContext ctx) {
    String stateContext = ctx.IDENTIFIER() == null ? "" : ctx.IDENTIFIER().getText();
    Queue<Object> value = visitValueChain(ctx.valueChain());
    if (value.size() != 1) {
      throw new IllegalArgumentException("Attempt to set state to multiple values " + value.size());
    }
    scope.setState(stateContext, value.peek());
    return null;
  }

  @Override
  public Object visitResultValue(TailspinParser.ResultValueContext ctx) {
    return visitValueChain(ctx.valueChain());
  }
}
