package tailspin.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import tailspin.parser.TailspinParser;

class RunTemplateBlock extends RunMain {
  private final Templates templates;

  RunTemplateBlock(Templates templates, Scope scope) {
    super(scope);
    this.templates = templates;
  }

  @Override
  public Boolean visitMatcher(TailspinParser.MatcherContext ctx) {
    if (ctx.condition() == null) {
      return true;
    }
    return (Boolean) visit(ctx.condition());
  }

  @Override
  public Boolean visitIntegerEquals(TailspinParser.IntegerEqualsContext ctx) {
    Integer expected = Integer.valueOf(ctx.MatchInteger().getText());
    return expected.equals(scope.resolveValue("it"));
  }

  @Override
  public Boolean visitRangeMatch(TailspinParser.RangeMatchContext ctx) {
    Object oIt = scope.resolveValue("it");
    if (!(oIt instanceof Integer)) return false;
    Integer it = (Integer) oIt;
    if (ctx.lowerBound() != null) {
      int lowerBound = Integer.valueOf(ctx.lowerBound().MatchInteger().getText());
      if (it < lowerBound) return false;
    }
    if (ctx.upperBound() != null) {
      int upperBound = Integer.valueOf(ctx.upperBound().MatchInteger().getText());
      return it <= upperBound;
    }
    return true;
  }

  @Override
  public Boolean visitRegexpMatch(TailspinParser.RegexpMatchContext ctx) {
    Object oIt = scope.resolveValue("it");
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
    Object oIt = scope.resolveValue("it");
    if (!(oIt instanceof Map)) return false;
    if (ctx.StructureKey().isEmpty()) {
      return true;
    }
    boolean stillPossible = true;
    @SuppressWarnings("unchecked")
    Map<String, Object> it = (Map<String, Object>) oIt;
    for (int i = 0; stillPossible && i < ctx.StructureKey().size(); i++) {
      String key = ctx.StructureKey(i).getText().replace(":", "");
      scope.defineValue("it", it.get(key));
      TailspinParser.MatcherContext matcher = ctx.matcher(i);
      if (!visitMatcher(matcher)) {
        stillPossible = false;
      }
    }
    scope.defineValue("it", it);
    return stillPossible;
  }

  @Override
  public Stream<?> visitBlock(TailspinParser.BlockContext ctx) {
    Stream<Object> results = Stream.empty();
    Object it = scope.resolveValue("it");
    for (TailspinParser.BlockExpressionContext exp : ctx.blockExpression()) {
      Object result = visit(exp);
      if (result != null) {
        results =
            Stream.concat(
                results, result instanceof Stream ? (Stream<?>) result : Stream.of(result));
      }
      // reset $it for next chain
      scope.defineValue("it", it);
    }
    return results;
  }

  @Override
  public Stream<Object> visitSendToTemplates(TailspinParser.SendToTemplatesContext ctx) {
    Object oIt = visitValueChain(ctx.valueChain());
    if (!(oIt instanceof Stream)) {
      oIt = Stream.of(oIt);
    }
    Stream<?> sIt = (Stream<?>) oIt;
    List<Object> result = new ArrayList<>();
    sIt.forEach(it -> {
      Scope matcherScope = newMatcherScope();
      matcherScope.defineValue("it", it);
      result.add(templates.matchTemplates(new RunMatcherBlock(templates, matcherScope)));
    });
    return result.stream().flatMap(r -> r instanceof Stream ? (Stream<?>) r : Stream.of(r));
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
    Object value = visitValueChain(ctx.valueChain());
    if (!(value instanceof Stream)) {
      value = Stream.of(value);
    }
    ((Stream<?>) value).forEach(v -> scope.setState(stateContext, v));
    return null;
  }

  @Override
  public Object visitResultValue(TailspinParser.ResultValueContext ctx) {
    return visitValueChain(ctx.valueChain());
  }
}
