package tailspin.interpreter;

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
    return visitCondition(ctx.condition());
  }

  @Override
  public Boolean visitCondition(TailspinParser.ConditionContext ctx) {
    if (ctx.integerLiteral() != null) {
      Integer expected = visitIntegerLiteral(ctx.integerLiteral());
      return expected.equals(scope.resolveValue("it"));
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public Stream<?> visitBlock(TailspinParser.BlockContext ctx) {
    Stream<Object> results = Stream.empty();
    for (TailspinParser.BlockExpressionContext exp : ctx.blockExpression()) {
      Object result = visit(exp);
      if (result != null) {
        results =
            Stream.concat(
                results, result instanceof Stream ? (Stream<?>) result : Stream.of(result));
      }
    }
    return results;
  }

  @Override
  public Object visitSendToTemplates(TailspinParser.SendToTemplatesContext ctx) {
    Object it = visitValueChain(ctx.valueChain());
    Scope matcherScope = new NestedScope(scope);
    matcherScope.defineValue("it", it);
    return templates.matchTemplates(new RunMatcherBlock(templates, matcherScope));
  }

  private class RunMatcherBlock extends RunTemplateBlock {
    RunMatcherBlock(Templates templates, Scope scope) {
      super(templates, scope);
    }

    @Override
    public Object visitSendToTemplates(TailspinParser.SendToTemplatesContext ctx) {
      Object it = visitValueChain(ctx.valueChain());
      Scope matcherScope = new NestedScope(RunTemplateBlock.this.scope);
      matcherScope.defineValue("it", it);
      return templates.matchTemplates(RunTemplateBlock.this.new RunMatcherBlock(templates, matcherScope));
    }
  }
}
