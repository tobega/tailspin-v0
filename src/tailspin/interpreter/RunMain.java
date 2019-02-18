package tailspin.interpreter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParserBaseVisitor;

public class RunMain extends TailspinParserBaseVisitor {
    final Scope scope;

    public RunMain(Scope scope) {
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
            }).flatMap(r -> r instanceof Stream ? (Stream<?>) r : Stream.of(r));
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
        if (ctx.dereferenceValue() != null) {
            return visitDereferenceValue(ctx.dereferenceValue());
        }
        if (ctx.arithmeticExpression() != null) {
            return visit(ctx.arithmeticExpression());
        }
        if (ctx.rangeLiteral() != null) {
            return visit(ctx.rangeLiteral());
        }
        if (ctx.arrayLiteral() != null) {
            return visitArrayLiteral(ctx.arrayLiteral());
        }
        if (ctx.structureLiteral() != null) {
            return visitStructureLiteral(ctx.structureLiteral());
        }
        throw new UnsupportedOperationException(ctx.toString());
    }

    @Override
    public Object visitDereferenceValue(TailspinParser.DereferenceValueContext ctx) {
        String identifier = ctx.Dereference().getText().substring(1);
        Object value = scope.resolveValue(identifier);
        for (TerminalNode fieldDereference : ctx.FieldDereference()) {
            String fieldIdentifier = fieldDereference.getText().substring(1);
            @SuppressWarnings("unchecked")
            Map<String, Object> structure = (Map<String, Object>) value;
            value = structure.get(fieldIdentifier);
        }
        return value;
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
        return templates.run(new NestedScope(scope));
    }

    @Override
    public List<?> visitArrayTemplates(TailspinParser.ArrayTemplatesContext ctx) {
        String loopVariable = ctx.IDENTIFIER().getText();
        Templates templates = visitTemplatesBody(ctx.templatesBody());
        Object oIt = scope.resolveValue("it");
        if (!(oIt instanceof Stream)) {
            oIt = Stream.of(oIt);
        }
        return ((Stream<?>) oIt).flatMap(it -> runArrayTemplate(loopVariable, templates, it))
            .collect(Collectors.toList());
    }

    private Stream<?> runArrayTemplate(String loopVariable, Templates templates, Object oIt) {
        if (!(oIt instanceof List)) {
            throw new UnsupportedOperationException("Cannot apply array templates to " + oIt.getClass());
        }
        List<?> it = (List<?>) oIt;
        Stream<?>[] result = new Stream[it.size()];
        for (int i = 0; i < it.size(); i++) {
            Scope itemScope = new NestedScope(scope);
            itemScope.defineValue(loopVariable, i + 1);
            itemScope.defineValue("it", it.get(i));
            result[i] = templates.run(itemScope);
        }
        return Stream.of(result).flatMap(Function.identity());
    }

    @Override
    public Templates visitTemplatesBody(TailspinParser.TemplatesBodyContext ctx) {
        List<MatchTemplate> matchTemplates = new ArrayList<>();
        for (TailspinParser.MatchTemplateContext mtc : ctx.matchTemplate()) {
            matchTemplates.add(visitMatchTemplate(mtc));
        }
        return new Templates(ctx.block(), matchTemplates);
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
        return templates.run(new NestedScope(scope));
    }

    @Override
    public Object visitTransform(TailspinParser.TransformContext ctx) {
        if (ctx.Deconstructor() != null) {
            Object it = scope.resolveValue("it");
            if (it instanceof List) {
                Stream<?> deconstructed =  ((List<?>) it).stream();
                if (ctx.transform() != null) {
                    return chain(ctx.transform(), deconstructed);
                }
                return deconstructed;
            }
            throw new UnsupportedOperationException("Cannot deconstruct " + it.getClass());
        }
        Object nextValue = visit(ctx.templates());
        if (ctx.transform() != null) {
            scope.defineValue("it", nextValue);
            return visit(ctx.transform());
        }
        return nextValue;
    }

    @Override
    public Object visitDefinition(TailspinParser.DefinitionContext ctx) {
        String identifier = ctx.Key().getText().replace(":", "");
        scope.defineValue(identifier, visit(ctx.valueChain()));
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
                return ((Templates) interpolated).run(new NestedScope(scope))
                    .map(Object::toString).collect(Collectors.joining());
            }
            return interpolated.toString();
        }
        if (ctx.valueChain() != null) {
            Object value = visit(ctx.valueChain());
            if (!(value instanceof Stream)) {
                value = Stream.of(value);
            }
            return ((Stream<?>) value).map(Object::toString).collect(Collectors.joining());
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
        if (ctx.dereferenceValue() != null) {
            String unaryOperator = ctx.AdditiveOperator() == null ? "" : ctx.AdditiveOperator().getText();
            switch (unaryOperator) {
                case "":
                case "+":
                    return (Integer) visitDereferenceValue(ctx.dereferenceValue());
                case "-":
                    return - (Integer) visitDereferenceValue(ctx.dereferenceValue());
                default:
                    throw new UnsupportedOperationException("Unknown unary operator " + unaryOperator);
            }
        }
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
        if (ctx.MultiplicativeOperator() != null) {
            Integer left = (Integer) visit(ctx.arithmeticExpression(0));
            Integer right = Math.abs((Integer) visit(ctx.arithmeticExpression(1)));
            String operation = ctx.MultiplicativeOperator().getText();
            switch (operation) {
                case "*":
                    return left * right;
                case "/":
                    return left / right;
                case "mod":
                    int truncateRemainder = left % right;
                    return truncateRemainder < 0 ? right + truncateRemainder : truncateRemainder;
            }
        }
        if (ctx.integerLiteral() != null) {
            return (Integer) visit(ctx.integerLiteral());
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
    public List<?> visitArrayLiteral(TailspinParser.ArrayLiteralContext ctx) {
        return ctx.valueChain().stream().flatMap(vc -> {
            Object result = visitValueChain(vc);
            if (!(result instanceof Stream)) {
                result = Stream.of(result);
            }
            return (Stream<?>) result;
        }).collect(Collectors.toList());
    }

    @Override
    public Object visitStructureLiteral(TailspinParser.StructureLiteralContext ctx) {
        Map<String, Object> structure = new TreeMap<>();
        for (TailspinParser.KeyValueContext kvc : ctx.keyValue()) {
            KeyValue keyValue = visitKeyValue(kvc);
            structure.put(keyValue.key, keyValue.value);
        }
        return structure;
    }

    @Override
    public KeyValue visitKeyValue(TailspinParser.KeyValueContext ctx) {
        String key = ctx.Key().getText().replace(":", "");
        Object value = visitValueChain(ctx.valueChain());
        return new KeyValue(key, value);
    }

    private static class KeyValue {
        final String key;
        final Object value;

        private KeyValue(String key, Object value) {
            this.key = key;
            this.value = value;
        }
    }
}
