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
    if (!(value instanceof Stream)) value = Stream.of(value);
    ((Stream<?>) value)
        .forEach(
            v -> {
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

  Object chain(ParserRuleContext ctx, Object source) {
    if (source instanceof Stream) {
      return ((Stream<?>) source)
          .map(
              s -> {
                scope.defineValue("it", s);
                return visit(ctx);
              })
          .flatMap(r -> r instanceof Stream ? (Stream<?>) r : Stream.of(r));
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
    Object value;
    if (identifier.startsWith(":")) {
      value = scope.getState(identifier.substring(1));
    } else {
      value = scope.resolveValue(identifier);
    }
    if (ctx.arrayDereference() != null) {
      value = resolveArrayDereference(ctx.arrayDereference(), (List<?>) value);
    }
    for (TailspinParser.StructureDereferenceContext sdc : ctx.structureDereference()) {
      value = resolveFieldDereferences(value, sdc.FieldDereference());
      if (sdc.arrayDereference() != null) {
        value = resolveArrayDereference(sdc.arrayDereference(), (List<?>) value);
      }
    }
    return value;
  }

  private Object resolveFieldDereferences(Object value, List<TerminalNode> terminalNodes) {
    for (TerminalNode fieldDereference : terminalNodes) {
      String fieldIdentifier = fieldDereference.getText().substring(1);
      @SuppressWarnings("unchecked")
      Map<String, Object> structure = (Map<String, Object>) value;
      value = structure.get(fieldIdentifier);
    }
    return value;
  }

  private Object resolveArrayDereference(TailspinParser.ArrayDereferenceContext ctx, List<?> array) {
    if (ctx.NonZeroInteger() != null) {
      int index = javaizeArrayIndex(Integer.valueOf(ctx.NonZeroInteger().getText()), array.size());
      return array.get(index);
    }
    if (ctx.rangeLiteral() != null) {
      return resolveArrayRangeDereference(ctx.rangeLiteral(), array);
    }
    if (ctx.arrayLiteral() != null) {
      @SuppressWarnings("unchecked")
      List<Integer> permutation = (List<Integer>) visitArrayLiteral(ctx.arrayLiteral());
      return permutation.stream().map(i -> javaizeArrayIndex(i, array.size())).map(array::get)
          .collect(Collectors.toList());
    }
    if (ctx.dereferenceValue() != null) {
      Object index = visitDereferenceValue(ctx.dereferenceValue());
      if (index instanceof Integer) {
        return array.get(javaizeArrayIndex((Integer) index, array.size()));
      }
      if (index instanceof List) {
        @SuppressWarnings("unchecked")
        List<Integer> permutation = (List) index;
        return permutation.stream().map(i -> javaizeArrayIndex(i, array.size())).map(array::get)
            .collect(Collectors.toList());
      }
      throw new UnsupportedOperationException("Unable to dereference array by " + index.getClass().getName()
        + " at " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine());
    }
    throw new UnsupportedOperationException("Unknown way to dereference array at "
        + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine());
  }

  private int javaizeArrayIndex(int index, int size) {
    if (index < 0) {
      return index + size;
    } else {
      return index - 1;
    }
  }

  private Object resolveArrayRangeDereference(
      TailspinParser.RangeLiteralContext ctx, List<?> array) {
    int start = javaizeArrayIndex((Integer) visit(ctx.arithmeticExpression(0)), array.size());
    int end = javaizeArrayIndex((Integer) visit(ctx.arithmeticExpression(1)), array.size());
    int increment =
        ctx.arithmeticExpression(2) == null ? 1 : (Integer) visit(ctx.arithmeticExpression(2));
    if (increment == 0) {
      throw new IllegalArgumentException(
          "Cannot produce range with zero increment at "
              + ctx.stop.getLine()
              + ":"
              + ctx.stop.getCharPositionInLine());
    }
    return Stream.iterate(
        start, i -> (increment > 0 && i <= end) || (increment < 0 && i >= end), i -> i + increment)
        .map(array::get).collect(Collectors.toList());
  }

  @Override
  public Object visitSink(TailspinParser.SinkContext ctx) {
    if (ctx.Stdout() != null) {
      try {
        scope
            .getOutput()
            .write(scope.resolveValue("it").toString().getBytes(StandardCharsets.UTF_8));
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
    return null;
  }

  @Override
  public Object visitInlineTemplates(TailspinParser.InlineTemplatesContext ctx) {
    Templates templates = visitTemplatesBody(ctx.templatesBody());
    return templates.run(new TemplatesScope(scope, ""));
  }

  @Override
  public List<?> visitArrayTemplates(TailspinParser.ArrayTemplatesContext ctx) {
    String loopVariable = ctx.IDENTIFIER().getText();
    Templates templates = visitTemplatesBody(ctx.templatesBody());
    Object oIt = scope.resolveValue("it");
    if (!(oIt instanceof Stream)) {
      oIt = Stream.of(oIt);
    }
    return ((Stream<?>) oIt)
        .flatMap(it -> runArrayTemplate(loopVariable, templates, it))
        .collect(Collectors.toList());
  }

  private Stream<?> runArrayTemplate(String loopVariable, Templates templates, Object oIt) {
    if (!(oIt instanceof List)) {
      throw new UnsupportedOperationException("Cannot apply array templates to " + oIt.getClass());
    }
    List<?> it = (List<?>) oIt;
    Stream<?>[] result = new Stream[it.size()];
    for (int i = 0; i < it.size(); i++) {
      Scope itemScope = new TemplatesScope(scope, "");
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
      throw new IllegalStateException(
          "Mismatched end " + ctx.IDENTIFIER(1).getText() + " for templates " + name);
    }
    Templates templates = visitTemplatesBody(ctx.templatesBody());
    scope.defineValue(name, templates);
    return null;
  }

  @Override
  public Object visitCallDefinedTemplates(TailspinParser.CallDefinedTemplatesContext ctx) {
    String name = ctx.IDENTIFIER().getText();
    Templates templates = (Templates) scope.resolveValue(name);
    return templates.run(new TemplatesScope(scope, name));
  }

  @Override
  public Object visitTransform(TailspinParser.TransformContext ctx) {
    if (ctx.Deconstructor() != null) {
      Object it = scope.resolveValue("it");
      if (it instanceof List) {
        Stream<?> deconstructed = ((List<?>) it).stream();
        if (ctx.transform() != null) {
          return chain(ctx.transform(), deconstructed);
        }
        return deconstructed;
      }
      throw new UnsupportedOperationException("Cannot deconstruct " + it.getClass());
    }
    Object nextValue = visit(ctx.templates());
    if (ctx.transform() != null) {
      return chain(ctx.transform(), nextValue);
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
    return ctx.stringContent().stream()
        .map(this::visit)
        .map(Object::toString)
        .collect(Collectors.joining());
  }

  @Override
  public String visitStringContent(TailspinParser.StringContentContext ctx) {
    if (ctx.STRING_TEXT() != null) {
      return ctx.STRING_TEXT().getSymbol().getText().replace("''", "'");
    }
    if (ctx.DollarSign() != null) {
      return "$";
    }
    return visit(ctx.stringInterpolate()).toString();
  }

  @Override
  public String visitStringInterpolate(TailspinParser.StringInterpolateContext ctx) {
    if (ctx.stringDereferenceValue() != null) {
      String identifier = ctx.stringDereferenceValue().StringDereferenceIdentifier().getText();
      Object interpolated = visitStringDereferenceValue(ctx.stringDereferenceValue());
      if (interpolated instanceof Templates) {
        return ((Templates) interpolated)
            .run(new TemplatesScope(scope, identifier))
            .map(Object::toString)
            .collect(Collectors.joining());
      }
      return interpolated.toString();
    }
    if (ctx.stringEvaluate() != null) {
      Object value = visit(ctx.stringEvaluate().valueChain());
      if (!(value instanceof Stream)) {
        value = Stream.of(value);
      }
      return ((Stream<?>) value).map(Object::toString).collect(Collectors.joining());
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public Object visitStringDereferenceValue(TailspinParser.StringDereferenceValueContext ctx) {
    String identifier = ctx.StringDereferenceIdentifier().getText();;
    Object value;
    if (identifier.startsWith(":")) {
      value = scope.getState(identifier.substring(1));
    } else {
      value = scope.resolveValue(identifier);
    }
    if (ctx.arrayDereference() != null) {
      List<?> array = (List<?>) value;
      value = resolveArrayDereference(ctx.arrayDereference(), array);
    }
    for (TailspinParser.StringStructureDereferenceContext sdc : ctx.stringStructureDereference()) {
      value = resolveFieldDereferences(value, sdc.StringFieldDereference());
      if (sdc.arrayDereference() != null) {
        List<?> array = (List<?>) value;
        value = resolveArrayDereference(sdc.arrayDereference(), array);
      }
    }
    return value;
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
          return -(Integer) visitDereferenceValue(ctx.dereferenceValue());
        default:
          throw new UnsupportedOperationException("Unknown unary operator " + unaryOperator);
      }
    }
    if (ctx.LeftParen() != null) {
      return visitArithmeticExpression(ctx.arithmeticExpression(0));
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
    Integer start = (Integer) visit(ctx.arithmeticExpression(0));
    Integer end = (Integer) visit(ctx.arithmeticExpression(1));
    Integer increment =
        ctx.arithmeticExpression(2) == null ? 1 : (Integer) visit(ctx.arithmeticExpression(2));
    if (increment == 0) {
      throw new IllegalArgumentException(
          "Cannot produce range with zero increment at "
              + ctx.stop.getLine()
              + ":"
              + ctx.stop.getCharPositionInLine());
    }
    return Stream.iterate(
        start, i -> (increment > 0 && i <= end) || (increment < 0 && i >= end), i -> i + increment);
  }

  @Override
  public List<?> visitArrayLiteral(TailspinParser.ArrayLiteralContext ctx) {
    return ctx.valueChain().stream()
        .flatMap(
            vc -> {
              Object result = visitValueChain(vc);
              if (!(result instanceof Stream)) {
                result = Stream.of(result);
              }
              return (Stream<?>) result;
            })
        .collect(Collectors.toList());
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
