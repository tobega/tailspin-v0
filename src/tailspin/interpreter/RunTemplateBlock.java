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
    Object outerIt = scope.getIt().peek();
    scope.defineValue("it", outerIt, true);
    try {
      scope.setIt(visitValueChain(ctx.valueChain()));
      return visitMatcher(ctx.matcher());
    } finally{
      scope.setIt(queueOf(outerIt));
      scope.clearValue("it");
    }
  }

  @Override
  public Boolean visitObjectEquals(TailspinParser.ObjectEqualsContext ctx) {
    Object expected = visitDereferenceValue(ctx.dereferenceValue());
    Queue<Object> it = scope.getIt();
    if (it.size() != 1) {
      throw new AssertionError("Matcher called with several values");
    }
    return expected.equals(it.peek());
  }

  @Override
  public Boolean visitIntegerEquals(TailspinParser.IntegerEqualsContext ctx) {
    Integer expected = visitArithmeticExpression(ctx.arithmeticExpression());
    Queue<Object> it = scope.getIt();
    if (it.size() != 1) {
      throw new AssertionError("Matcher called with several values");
    }
    return expected.equals(it.peek());
  }

  @Override
  public Boolean visitRangeMatch(TailspinParser.RangeMatchContext ctx) {
    Queue<Object> qIt = scope.getIt();
    if (qIt.size() != 1) {
      throw new AssertionError("Matcher called with several values");
    }
    Object oIt = qIt.peek();
    if (!(oIt instanceof Comparable)) return false;
    @SuppressWarnings("unchecked")
    Comparable<Object> it = (Comparable<Object>) oIt;
    if (ctx.lowerBound() != null) {
      Bound lowerBound = visitLowerBound(ctx.lowerBound());
      if (it.compareTo(lowerBound.value) < 0) return false;
      if (!lowerBound.inclusive && it.compareTo(lowerBound.value) == 0) return false;
    }
    if (ctx.upperBound() != null) {
      Bound upperBound = visitUpperBound(ctx.upperBound());
      if (it.compareTo(upperBound.value) > 0) return false;
      if (!upperBound.inclusive && it.compareTo(upperBound.value) == 0) return false;
    }
    return true;
  }

  private static class Bound {
    Object value;
    boolean inclusive;
    Bound(Object value, boolean inclusive) {
      this.value = value;
      this.inclusive = inclusive;
    }
  }

  @Override
  public Bound visitLowerBound(TailspinParser.LowerBoundContext ctx) {
    Object bound;
    if (ctx.dereferenceValue() != null) {
      bound = visitDereferenceValue(ctx.dereferenceValue());
    } else if (ctx.arithmeticExpression() != null) {
      bound = visitArithmeticExpression(ctx.arithmeticExpression());
    } else if (ctx.stringLiteral() != null) {
      bound = visitStringLiteral(ctx.stringLiteral());
    } else {
      throw new UnsupportedOperationException(
          "Cannot extract comparison object at " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
    }
    if (bound instanceof Queue) {
      if (((Queue)bound).size() != 1) {
        throw new AssertionError("Lower bound with several values");
      }
      bound = ((Queue)bound).peek();
    }
    return new Bound(bound, ctx.Invert() == null);
  }

  @Override
  public Bound visitUpperBound(TailspinParser.UpperBoundContext ctx) {
    Object bound;
    if (ctx.dereferenceValue() != null) {
      bound = visitDereferenceValue(ctx.dereferenceValue());
    } else if (ctx.arithmeticExpression() != null) {
      bound = visitArithmeticExpression(ctx.arithmeticExpression());
    } else if (ctx.stringLiteral() != null) {
      bound = visitStringLiteral(ctx.stringLiteral());
    } else {
      throw new UnsupportedOperationException(
          "Cannot extract comparison object at " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
    }
    if (bound instanceof Queue) {
      if (((Queue)bound).size() != 1) {
        throw new AssertionError("Upper bound with several values");
      }
      bound = ((Queue)bound).peek();
    }
    return new Bound(bound, ctx.Invert() == null);
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
    // TODO: this could be good to save in compiled form
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
    if (ctx.IDENTIFIER().isEmpty()) {
      return true;
    }
    boolean stillPossible = true;
    @SuppressWarnings("unchecked")
    Map<String, Object> it = (Map<String, Object>) oIt;
    for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
      String key = ctx.IDENTIFIER(i).getText();
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
    String stateContext = ctx.IDENTIFIER() == null ? "" : ctx.IDENTIFIER().getText();
    Queue<Object> value = visitValueChain(ctx.valueChain());
    if (value.size() != 1) {
      throw new IllegalArgumentException("Attempt to set state to multiple values " + value);
    }
    scope.setState(stateContext, value.peek());
    return null;
  }

  @Override
  public Object visitResultValue(TailspinParser.ResultValueContext ctx) {
    return visitValueChain(ctx.valueChain());
  }
}
