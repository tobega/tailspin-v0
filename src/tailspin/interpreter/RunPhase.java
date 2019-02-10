package tailspin.interpreter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.antlr.v4.runtime.ParserRuleContext;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParserBaseVisitor;

public class RunPhase extends TailspinParserBaseVisitor {
    private final Scope scope;

    public RunPhase(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Object visitProgram(TailspinParser.ProgramContext ctx) {
        ctx.statement().forEach(this::visit);
        return null;
    }

    @Override
    public Object visitValueChainToSink(TailspinParser.ValueChainToSinkContext ctx) {
        Object value = visit(ctx.valueChain());
        if (!(value instanceof Stream))  value = Stream.of(value);
        ((Stream<?>) value).forEach(v -> {
            scope.defineValue("it", v);
            visit(ctx.sink());
        });
        return null;
    }

    @Override
    public Object visitValueChain(TailspinParser.ValueChainContext ctx) {
        Object source = visit(ctx.source());
        if (ctx.transform() != null) {
            return chain(ctx.transform(), source);
        }
        return source;
    }

    private Object chain(ParserRuleContext ctx, Object source) {
        if (source instanceof Stream) {
            return ((Stream<?>) source).map(s -> {
                scope.defineValue("it", s);
                return visit(ctx);
            });
        }
        scope.defineValue("it", source);
        return visit(ctx);
    }

    @Override
    public Object visitSource(TailspinParser.SourceContext ctx) {
        if (ctx.stringLiteral() != null) {
            // TODO: Difference between stringLiteral here and StringLiteralTemplates
            return visit(ctx.stringLiteral());
        }
        if (ctx.Dereference() != null) {
            String identifier = ctx.Dereference().getText().substring(1);
            return scope.resolveValue(identifier);
        }
        if (ctx.arithmeticExpression() != null) {
            return visit(ctx.arithmeticExpression());
        }
        if (ctx.rangeLiteral() != null) {
            return visit(ctx.rangeLiteral());
        }
        throw new UnsupportedOperationException(ctx.toString());
    }

    @Override
    public Object visitSink(TailspinParser.SinkContext ctx) {
        if (ctx.Stdout() != null) {
            try {
                scope.getOutput().write(
                    scope.resolveValue("it").toString().getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    @Override
    public Object visitStringLiteralTemplates(TailspinParser.StringLiteralTemplatesContext ctx) {
        return visit(ctx.stringLiteral());
    }

    @Override
    public Object visitInlineTemplates(TailspinParser.InlineTemplatesContext ctx) {
        Templates templates = visitTemplatesBody(ctx.templatesBody());
        return templates.run(scope);
    }

    @Override
    public Templates visitTemplatesBody(TailspinParser.TemplatesBodyContext ctx) {
        List<MatchTemplate> matchTemplates = new ArrayList<>();
        for (TailspinParser.MatchTemplateContext mtc : ctx.matchTemplate()) {
            matchTemplates.add(visitMatchTemplate(mtc));
        }
        return new Templates(matchTemplates);
    }

    @Override
    public MatchTemplate visitMatchTemplate(TailspinParser.MatchTemplateContext ctx) {
        return new MatchTemplate(ctx.matcher(), ctx.block());
    }

    @Override
    public Object visitTemplatesDefinition(TailspinParser.TemplatesDefinitionContext ctx) {
        String name = ctx.IDENTIFIER(0).getText();
        if (!name.equals(ctx.IDENTIFIER(1).getText())) {
            throw new IllegalStateException("Mismatched end " + ctx.IDENTIFIER(1).getText()
                + " for templates " + name);
        }
        Templates templates = visitTemplatesBody(ctx.templatesBody());
        scope.defineValue(name, templates);
        return null;
    }

    @Override
    public Object visitCallDefinedTemplates(TailspinParser.CallDefinedTemplatesContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Templates templates = (Templates) scope.resolveValue(name);
        return templates.run(scope);
    }

    @Override
    public Object visitTransform(TailspinParser.TransformContext ctx) {
        Object nextValue = visit(ctx.templates());
        if (ctx.transform() != null) {
            scope.defineValue("it", nextValue);
            return visit(ctx.transform());
        }
        return nextValue;
    }

    @Override
    public Object visitDefinition(TailspinParser.DefinitionContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        scope.defineValue(identifier, visit(ctx.source()));
        return null;
    }

    @Override
    public String visitStringLiteral(TailspinParser.StringLiteralContext ctx) {
        return ctx.stringContent().stream().map(this::visit).map(Object::toString).collect(Collectors.joining());
    }

    @Override
    public String visitStringContent(TailspinParser.StringContentContext ctx) {
        if (ctx.STRING_TEXT() != null) {
            return ctx.STRING_TEXT().getSymbol().getText()
                .replace("''", "'").replace("$$", "$");
        }
        return visit(ctx.stringInterpolate()).toString();
    }

    @Override
    public String visitStringInterpolate(TailspinParser.StringInterpolateContext ctx) {
        if (ctx.StringDereference() != null) {
            String identifier = ctx.StringDereference().getText().replaceAll("[$;]", "");
            Object interpolated = scope.resolveValue(identifier);
            if (interpolated instanceof Templates) {
                return ((Templates) interpolated).run(scope).toString();
            }
            return interpolated.toString();
        }
        if (ctx.valueChain() != null) {
            return visit(ctx.valueChain()).toString();
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public Integer visitIntegerLiteral(TailspinParser.IntegerLiteralContext ctx) {
        if (ctx.Zero() != null) return 0;
        return Integer.valueOf(ctx.NonZeroInteger().getText());
    }

    @Override
    public Integer visitArithmeticExpression(TailspinParser.ArithmeticExpressionContext ctx) {
        if (ctx.AdditiveOperator() != null) {
            Integer left = (Integer) visit(ctx.arithmeticExpression(0));
            Integer right = (Integer) visit(ctx.arithmeticExpression(1));
            String operation = ctx.AdditiveOperator().getText();
            switch (operation) {
                case "+":
                    return left + right;
                case "-":
                    return left - right;
            }
        }
        if (ctx.integerLiteral() != null) {
            return (Integer) visit(ctx.integerLiteral());
        }
        if (ctx.Dereference() != null) {
            String identifier = ctx.Dereference().getText().replaceAll("[$;]", "");
            return (Integer) scope.resolveValue(identifier);
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public Object visitRangeLiteral(TailspinParser.RangeLiteralContext ctx) {
        Integer start = (Integer) visit(ctx.integerLiteral(0));
        Integer end = (Integer) visit(ctx.integerLiteral(1));
        Integer increment = ctx.NonZeroInteger() == null ? 1 : Integer.valueOf(ctx.NonZeroInteger().getText());
        return Stream.iterate(
                start,
                i -> (increment > 0 && i <= end) || (increment < 0 && i >= end),
                i -> i + increment);
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
}
