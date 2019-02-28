package tailspin.interpreter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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
  public Void visitValueChainToSink(TailspinParser.ValueChainToSinkContext ctx) {
    Queue<Object> value = visitValueChain(ctx.valueChain());
    scope.setIt(value);
    visitSink(ctx.sink());
    return null;
  }

  @Override
  public Queue<Object> visitValueChain(TailspinParser.ValueChainContext ctx) {
    Queue<Object> oldIt = scope.getIt();
    Queue<Object> value = visitSource(ctx.source());
    if (ctx.transform() != null) {
      scope.setIt(value);
      value = visitTransform(ctx.transform());
    }
    if (oldIt != null) {
      scope.setIt(oldIt); // reset for next value chain in same scope
    }
    return value;
  }

  @Override
  public Queue<Object> visitSource(TailspinParser.SourceContext ctx) {
    if (ctx.stringLiteral() != null) {
      // TODO: Difference between stringLiteral here and StringLiteralTemplates
      return queueOf(visitStringLiteral(ctx.stringLiteral()));
    }
    if (ctx.dereferenceValue() != null) {
      return queueOf(visitDereferenceValue(ctx.dereferenceValue()));
    }
    if (ctx.arithmeticExpression() != null) {
      return queueOf(visitArithmeticExpression(ctx.arithmeticExpression()));
    }
    if (ctx.rangeLiteral() != null) {
      return queueOf(visitRangeLiteral(ctx.rangeLiteral()));
    }
    if (ctx.arrayLiteral() != null) {
      return queueOf(visitArrayLiteral(ctx.arrayLiteral()));
    }
    if (ctx.structureLiteral() != null) {
      return queueOf(visitStructureLiteral(ctx.structureLiteral()));
    }
    throw new UnsupportedOperationException(ctx.toString());
  }

  Queue<Object> queueOf(Object generated) {
    Queue<Object> result = new ArrayDeque<>();
    if (generated instanceof Stream) {
      ((Stream<?>) generated).forEach(result::add);
    } else if (generated instanceof Queue) {
      result.addAll((Collection<?>) generated);
    } else {
      result.add(generated);
    }
    return result;
  }

  @Override
  public Object visitDereferenceValue(TailspinParser.DereferenceValueContext ctx) {
    String identifier = ctx.Dereference() != null ? ctx.Dereference().getText().substring(1)
            : ctx.StartArrayDereference().getText().substring(1).replace("(", "");
    Object value;
    if (identifier.equals("it")) {
      Queue<Object> itQ = scope.getIt();
      if (itQ.size() != 1) {
        throw new AssertionError("Invalid it dereference " + itQ.size());
      }
      value = itQ.peek();
    } else if (identifier.startsWith(":")) {
      value = scope.getState(identifier.substring(1));
    } else {
      value = scope.resolveValue(identifier);
    }
    if (ctx.arrayDereference() != null) {
      value = resolveArrayDereference(ctx.arrayDereference(), (List<?>) value);
    }
    for (TailspinParser.StructureDereferenceContext sdc : ctx.structureDereference()) {
      List<TerminalNode> fieldDereferences = new ArrayList<>(sdc.FieldDereference());
      if (sdc.FieldArrayDereference() != null) {
        fieldDereferences.add(sdc.FieldArrayDereference());
      }
      value = resolveFieldDereferences(value, fieldDereferences);
      if (sdc.arrayDereference() != null) {
        value = resolveArrayDereference(sdc.arrayDereference(), (List<?>) value);
      }
    }
    return value;
  }

  Object resolveFieldDereferences(Object value, List<TerminalNode> terminalNodes) {
    for (TerminalNode fieldDereference : terminalNodes) {
      String fieldIdentifier = fieldDereference.getText().substring(1).replace("(", "");
      @SuppressWarnings("unchecked")
      Map<String, Object> structure = (Map<String, Object>) value;
      value = structure.get(fieldIdentifier);
    }
    return value;
  }

  Object resolveArrayDereference(TailspinParser.ArrayDereferenceContext ctx, List<?> array) {
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
    if (index <= 0) {
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
  public Void visitSink(TailspinParser.SinkContext ctx) {
    if (ctx.Stdout() != null) {
      scope.getIt().forEach(it ->
      {
        try {
          scope
              .getOutput()
              .write(it.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      });
    }
    return null;
  }

  @Override
  public Queue<Object> visitInlineTemplates(TailspinParser.InlineTemplatesContext ctx) {
    Templates templates = visitTemplatesBody(ctx.templatesBody());
    Queue<Object> qIt = scope.getIt();
    Queue<Object> result = new ArrayDeque<>();
    qIt.forEach(it -> {
      scope.setIt(queueOf(it));
      result.addAll(templates.run(new TemplatesScope(scope, "")));
    });
    return result;
  }

  @Override
  public Queue<Object> visitArrayTemplates(TailspinParser.ArrayTemplatesContext ctx) {
    String loopVariable = ctx.IDENTIFIER().getText();
    Templates templates = visitTemplatesBody(ctx.templatesBody());
    Queue<Object> its = scope.getIt();
    List<Object> result = new ArrayList<>();
    its.forEach(it -> result.addAll(runArrayTemplate(loopVariable, templates, it)));
    return queueOf(result);
  }

  private Queue<Object> runArrayTemplate(String loopVariable, Templates templates, Object oIt) {
    if (!(oIt instanceof List)) {
      throw new UnsupportedOperationException("Cannot apply array templates to " + oIt.getClass());
    }
    List<?> it = (List<?>) oIt;
    Queue<Object> result = new ArrayDeque<>();
    for (int i = 0; i < it.size(); i++) {
      Scope itemScope = new TemplatesScope(scope, "");
      itemScope.defineValue(loopVariable, i + 1);
      itemScope.setIt(queueOf(it.get(i)));
      result.addAll(templates.run(itemScope));
    }
    return result;
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
  public Queue<Object> visitCallDefinedTemplates(TailspinParser.CallDefinedTemplatesContext ctx) {
    String name = ctx.IDENTIFIER().getText();
    Templates templates = (Templates) scope.resolveValue(name);
    Queue<Object> qIt = scope.getIt();
    Queue<Object> result = new ArrayDeque<>();
    qIt.forEach(it -> {
      scope.setIt(queueOf(it));
      result.addAll(templates.run(new TemplatesScope(scope, name)));
    });
    return result;
  }

  @Override
  public Queue<Object> visitTransform(TailspinParser.TransformContext ctx) {
    if (ctx.collector() != null) {
      Queue<Object> it = scope.getIt();
      Object collector = visitCollector(ctx.collector());
      if (collector instanceof Map) {
        @SuppressWarnings("unchecked")
        Map<String, Object> collectorMap = (Map<String, Object>) collector;
        it.forEach(m -> {
          @SuppressWarnings("unchecked")
          Map<String, Object> itMap = (Map<String, Object>) m;
          collectorMap.putAll(itMap);
        });
      } else if (collector instanceof StringBuilder){
        StringBuilder sbCollector = (StringBuilder) collector;
        it.forEach(s -> sbCollector.append(s.toString()));
        collector = sbCollector.toString();
      } else {
        throw new UnsupportedOperationException("Cannot collect in " + collector.getClass());
      }
      Queue<Object> result = queueOf(collector);
      if (ctx.transform() != null) {
        scope.setIt(result);
        return visitTransform(ctx.transform());
      }
      return result;
    }
    if (ctx.Deconstructor() != null) {
      Queue<Object> its = scope.getIt();
      Queue<Object> result = new ArrayDeque<>();
      its.forEach(it -> {
        if (it instanceof List) {
          Stream<?> deconstructed = ((List<?>) it).stream();
          if (ctx.transform() != null) {
            scope.setIt(queueOf(deconstructed));
            result.addAll(visitTransform(ctx.transform()));
            return;
          }
          result.addAll(queueOf(deconstructed));
          return;
        }
        throw new UnsupportedOperationException("Cannot deconstruct " + it.getClass());
      });
      return result;
    }
    @SuppressWarnings("unchecked")
    Queue<Object> nextValue = (Queue<Object>) visit(ctx.templates());
    if (ctx.transform() != null) {
      scope.setIt(nextValue);
      return visitTransform(ctx.transform());
    }
    return nextValue;
  }

  @Override
  public Object visitCollector(TailspinParser.CollectorContext ctx) {
    if (ctx.dereferenceValue() != null) {
      Object originalCollector = visitDereferenceValue(ctx.dereferenceValue());
      if (originalCollector instanceof Map) {
        @SuppressWarnings("unchecked")
        Map<String, Object> collector = new TreeMap<>((Map<String, Object>) originalCollector);
        return collector;
      }
      throw new UnsupportedOperationException("Cannot create collector for " + originalCollector);
    }
    if (ctx.START_STRING() != null) {
      return new StringBuilder();
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public Queue<Object> visitLiteralTemplates(TailspinParser.LiteralTemplatesContext ctx) {
    Queue<Object> its = scope.getIt();
    Queue<Object> result = new ArrayDeque<>();
    its.forEach(it -> {
      scope.setIt(queueOf(it));
      result.addAll(visitSource(ctx.source()));
    });
    return result;
  }

  @Override
  public Object visitDefinition(TailspinParser.DefinitionContext ctx) {
    String identifier = ctx.Key().getText().replace(":", "");
    Queue<Object> valueChainResult = visitValueChain(ctx.valueChain());
    if (valueChainResult.size() != 1) {
      throw new IllegalArgumentException(
          "Attempt to define a symbol with " + valueChainResult.size() + " values");
    }
    scope.defineValue(identifier, valueChainResult.peek());
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
      return ctx.STRING_TEXT().getSymbol().getText().replace("''", "'")
          .replace("$$", "$");
    }
    return visit(ctx.stringInterpolate()).toString();
  }

  @Override
  public String visitStringInterpolate(TailspinParser.StringInterpolateContext ctx) {
    if (ctx.interpolateDereferenceValue() != null) {
      String identifier = ctx.interpolateDereferenceValue().InterpolateIdentifier().getText();
      Object interpolated = visitInterpolateDereferenceValue(ctx.interpolateDereferenceValue());
      if (interpolated instanceof Templates) {
        return ((Templates) interpolated)
            .run(new TemplatesScope(scope, identifier))
            .stream()
            .map(Object::toString)
            .collect(Collectors.joining());
      }
      return interpolated.toString();
    }
    if (ctx.interpolateEvaluate() != null) {
      Queue<Object> valueQueue = visitValueChain(ctx.interpolateEvaluate().valueChain());
      return valueQueue.stream().map(Object::toString).collect(Collectors.joining());
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public Object visitInterpolateDereferenceValue(TailspinParser.InterpolateDereferenceValueContext ctx) {
    String identifier = ctx.InterpolateIdentifier().getText();
    Object value;
    if (identifier.equals("it")) {
      Queue<Object> itQ = scope.getIt();
      if (itQ.size() != 1) {
        throw new AssertionError("Invalid it dereference " + itQ.size());
      }
      value = itQ.peek();
    } else if (identifier.startsWith(":")) {
      value = scope.getState(identifier.substring(1));
    } else {
      value = scope.resolveValue(identifier);
    }
    if (ctx.arrayDereference() != null) {
      List<?> array = (List<?>) value;
      value = resolveArrayDereference(ctx.arrayDereference(), array);
    }
    for (TailspinParser.InterpolateStructureDereferenceContext sdc : ctx.interpolateStructureDereference()) {
      value = resolveFieldDereferences(value, sdc.InterpolateField());
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
  public Stream<Integer> visitRangeLiteral(TailspinParser.RangeLiteralContext ctx) {
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
              Queue<Object> result = visitValueChain(vc);
              return result.stream();
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
    Queue<Object> valueQueue = visitValueChain(ctx.valueChain());
    if (valueQueue.size() != 1) {
      throw new AssertionError("Invalid multiple value " + valueQueue.size());
    }
    return new KeyValue(key, valueQueue.peek());
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
