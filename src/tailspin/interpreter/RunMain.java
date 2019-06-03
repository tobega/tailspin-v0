package tailspin.interpreter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.antlr.v4.runtime.tree.TerminalNode;
import tailspin.ast.Bound;
import tailspin.ast.RangeGenerator;
import tailspin.ast.Reference;
import tailspin.interpreter.Composer.CompositionSpec;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParser.CompositionSequenceContext;
import tailspin.parser.TailspinParser.DefinedCompositionSequenceContext;
import tailspin.parser.TailspinParser.DimensionReferenceContext;
import tailspin.parser.TailspinParser.SendToTemplatesContext;
import tailspin.parser.TailspinParser.ValueProductionContext;
import tailspin.parser.TailspinParserBaseVisitor;

public class RunMain extends TailspinParserBaseVisitor {
  public final Scope scope;

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
    if (ctx.keyValue() != null) {
      return queueOf(visitKeyValue(ctx.keyValue()));
    }
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
      return queueOf(visitRangeLiteral(ctx.rangeLiteral()).stream());
    }
    if (ctx.arrayLiteral() != null) {
      return queueOf(visitArrayLiteral(ctx.arrayLiteral()));
    }
    if (ctx.structureLiteral() != null) {
      return queueOf(visitStructureLiteral(ctx.structureLiteral()));
    }
    if (ctx.Stdin() != null) {
      return queueOf(scope.getInput().lines());
    }
    if (ctx.LeftParen() != null) {
      return visitValueChain(ctx.valueChain());
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
    String identifier = ctx.Dereference().getText().substring(1);
    Reference reference;
    if (identifier.equals("it")) {
      reference = Reference.it();
    } else if (identifier.startsWith("@")) {
      reference = Reference.state(identifier.substring(1));
    } else {
      reference = Reference.named(identifier);
    }
    reference = resolveReference(ctx.reference(), reference);
    Object value = reference.getValue(scope);
    if (reference.isMutable()) {
      value = Reference.copy(value);
    }
    if (ctx.message() != null) {
      value = resolveProcessorMessage(ctx.message().Message().getText().substring(2), value);
    }
    return value;
  }

  Reference resolveReference(TailspinParser.ReferenceContext ctx, Reference reference) {
    if (ctx.arrayReference() != null) {
      try {
        reference = resolveArrayDereference(ctx.arrayReference(), reference);
      } catch (RuntimeException e) {
        throw new IllegalArgumentException("Failed array dereference: " + ctx.getText(), e);
      }
    }
    for (TailspinParser.StructureReferenceContext sdc : ctx.structureReference()) {
      reference = resolveFieldDereference(reference, sdc.FieldReference().getText().substring(1));
      if (sdc.arrayReference() != null) {
        reference = resolveArrayDereference(sdc.arrayReference(), reference);
      }
    }
    return reference;
  }

  private Queue<Object> resolveProcessorMessage(String message, Object value) {
    Queue<Object> result;
    if (value instanceof List) {
      if (message.equals("length")) {
        result = queueOf(((List<?>) value).size());
      } else {
        throw new UnsupportedOperationException("Unknown array message " + message);
      }
    } else if (value instanceof ProcessorInstance) {
      result = ((ProcessorInstance) value).receiveMessage(message, scope.getIt());
    } else {
      throw new UnsupportedOperationException("Unimplemented processor type " + value.getClass().getSimpleName());
    }
    return result;
  }

  private Reference resolveFieldDereference(Reference reference, String fieldIdentifier) {
    return reference.field(fieldIdentifier);
  }

  private Reference resolveArrayDereference(TailspinParser.ArrayReferenceContext ctx, Reference reference) {
    List<Object> dimensions = new ArrayList<>();
    for (DimensionReferenceContext dimCtx : ctx.dimensionReference()) {
      if (dimCtx.arithmeticExpression() != null) {
        dimensions.add(visitArithmeticExpression(dimCtx.arithmeticExpression()));
      } else if (dimCtx.rangeLiteral() != null) {
        dimensions.add(visitRangeLiteral(dimCtx.rangeLiteral()));
      } else if (dimCtx.arrayLiteral() != null) {
        @SuppressWarnings("unchecked")
        List<Integer> permutation = (List<Integer>) visitArrayLiteral(dimCtx.arrayLiteral());
        dimensions.add(permutation);
      } else if (dimCtx.dereferenceValue() != null) {
        Object index = visitDereferenceValue(dimCtx.dereferenceValue());
        if ((index instanceof Queue) && ((Queue<?>) index).size() == 1) {
          index = ((Queue<?>) index).peek();
        }
        if (index instanceof Integer) {
          dimensions.add(index);
        } else if (index instanceof List) {
          @SuppressWarnings("unchecked")
          List<Integer> permutation = (List) index;
          dimensions.add(permutation);
        } else {
          throw new UnsupportedOperationException(
              "Unable to dereference array by "
                  + index.getClass().getName()
                  + " at "
                  + dimCtx.getStart().getLine()
                  + ":"
                  + dimCtx.getStart().getCharPositionInLine() + " " + dimCtx.getText());
        }
      } else {
        throw new UnsupportedOperationException(
            "Unknown way to dereference array at "
                + ctx.getStart().getLine()
                + ":"
                + ctx.getStart().getCharPositionInLine() + " " + ctx.getText());
      }
    }
    return reference.array(dimensions);
  }

  @Override
  public Void visitSink(TailspinParser.SinkContext ctx) {
    if (ctx.Stdout() != null) {
      scope
          .getIt()
          .forEach(
              it -> {
                try {
                  scope.getOutput().write(it.toString().getBytes(StandardCharsets.UTF_8));
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
    qIt.forEach(
        it -> {
          scope.setIt(queueOf(it));
          result.addAll(templates.run(new TransformScope(scope, ""), Map.of()));
        });
    return result;
  }

  @Override
  public Queue<Object> visitArrayTemplates(TailspinParser.ArrayTemplatesContext ctx) {
    List<String> loopVariables = ctx.IDENTIFIER().stream().map(TerminalNode::getText).collect(
        Collectors.toList());
    Templates templates = visitTemplatesBody(ctx.templatesBody());
    Queue<Object> its = scope.getIt();
    Queue<Object> result = new ArrayDeque<>();
    its.forEach(it -> result.add(runArrayTemplate(loopVariables, templates, it)));
    return result;
  }

  @SuppressWarnings("unchecked")
  private List<Object> runArrayTemplate(List<String> loopVariables, Templates templates, Object oIt) {
    if (!(oIt instanceof List)) {
      throw new UnsupportedOperationException("Cannot apply array templates to " + oIt.getClass());
    }
    List<Object>[] dimLists = new List[loopVariables.size()];
    dimLists[0] = (List<Object>) oIt;
    List[] results = new List[loopVariables.size()];
    results[0] = new ArrayList<>();
    for (int i = 1; i < loopVariables.size(); i++) {
      dimLists[i] = (List<Object>) dimLists[0].get(0);
      results[i] = new ArrayList<>();
    }
    int[] dimCounters = new int[loopVariables.size()];
    int lastIdx = loopVariables.size() - 1;
    while (dimCounters[0] < dimLists[0].size()) {
      for (dimCounters[lastIdx] = 0; dimCounters[lastIdx] < dimLists[lastIdx].size(); dimCounters[lastIdx]++) {
        TransformScope itemScope = new TransformScope(scope, "");
        for (int i = 0; i < loopVariables.size(); i++) {
          itemScope.defineValue(loopVariables.get(i), dimCounters[i] + 1);
        }
        itemScope.setIt(queueOf(dimLists[lastIdx].get(dimCounters[lastIdx])));
        results[lastIdx].addAll(templates.run(itemScope, Map.of()));
      }
      int idx = lastIdx - 1;
      while (idx >= 0) {
        results[idx].add(results[idx+1]);
        dimCounters[idx]++;
        if (dimCounters[idx] >= dimLists[idx].size()) {
          idx--;
          continue;
        }
        while (++idx <= lastIdx) {
          dimCounters[idx] = 0;
          results[idx] = new ArrayList<>();
          dimLists[idx] = (List<Object>) dimLists[idx-1].get(dimCounters[idx-1]);
        }
        break;
      }
    }
    return results[0];
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
    templates.setScopeContext(name);
    if (ctx.parameterDefinitions() != null) {
      List<ExpectedParameter> parameters = visitParameterDefinitions(ctx.parameterDefinitions());
      templates.expectParameters(parameters);
    }
    scope.defineValue(name, templates);
    return null;
  }

  @Override
  public List<ExpectedParameter> visitParameterDefinitions(TailspinParser.ParameterDefinitionsContext ctx) {
    List<ExpectedParameter> parameters = new ArrayList<>();
    for (TerminalNode key : ctx.Key()) {
      parameters.add(new ExpectedParameter(key.getText().replace(":", "")));
    }
    return parameters;
  }

  @Override
  public Object visitProcessorDefinition(TailspinParser.ProcessorDefinitionContext ctx) {
    String name = ctx.IDENTIFIER(0).getText();
    if (!name.equals(ctx.IDENTIFIER(1).getText())) {
      throw new IllegalStateException(
          "Mismatched end " + ctx.IDENTIFIER(1).getText() + " for templates " + name);
    }
    ProcessorDefinition processor = new ProcessorDefinition(ctx.block());
    scope.defineValue(name, processor);
    return null;
  }

  @Override
  public Queue<Object> visitCallDefinedTransform(TailspinParser.CallDefinedTransformContext ctx) {
    Queue<Object> qIt = scope.getIt();
    Queue<Object> result = new ArrayDeque<>();
    qIt.forEach(
        it -> {
          scope.setIt(queueOf(it));
          TransformCall transformCall = visitTransformCall(ctx.transformCall());
          result.addAll(transformCall.execute(scope));
        });
    return result;
  }

  @Override
  public TransformCall visitTransformCall(TailspinParser.TransformCallContext ctx) {
    String name = ctx.IDENTIFIER().getText();
    Map<String, Object> parameters = ctx.parameterValues() != null
        ? visitParameterValues(ctx.parameterValues())
        : Map.of();
    Transform transform = (Transform) scope.resolveValue(name);
    return new TransformCall(name, transform, parameters);
  }

  @Override
  public Map<String, Object> visitParameterValues(TailspinParser.ParameterValuesContext ctx) {
    Map<String, Object> parameters = new HashMap<>();
    for(TailspinParser.ParameterValueContext parameterValueContext : ctx.parameterValue()) {
      KeyValue keyValue = visitParameterValue(parameterValueContext);
      parameters.put(keyValue.getKey(), keyValue.getValue());
    }
    return parameters;
  }

  @Override
  public KeyValue visitParameterValue(TailspinParser.ParameterValueContext ctx) {
    String key = ctx.Key().getText().replace(":", "");
    if (ctx.valueChain() != null) {
      Queue<Object> valueQueue = visitValueChain(ctx.valueChain());
      if (valueQueue.size() != 1) {
        throw new AssertionError("Invalid multiple value " + valueQueue.size());
      }
      return new KeyValue(key, valueQueue.peek());
    }
    if (ctx.transformCall() != null) {
      return new KeyValue(key, visitTransformCall(ctx.transformCall()));
    }
    throw new IllegalArgumentException("Unknown parameter value " + ctx.getText());
  }

  @Override
  public Queue<Object> visitTransform(TailspinParser.TransformContext ctx) {
    if (ctx.collector() != null) {
      Queue<Object> it = scope.getIt();
      Object collector = visitCollector(ctx.collector());
      collector = collect(it, collector);
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
      its.forEach(
          it -> {
            if (it instanceof List) {
              Queue<Object> deconstructed = queueOf(((List<?>) it).stream());
              result.addAll(deconstructed);
            } else if (it instanceof String) {
              ArrayDeque<String> deconstructed = new ArrayDeque<>();
              for (char c : ((String) it).toCharArray()) {
                int type = Character.getType(c);
                if (Character.isLowSurrogate(c)
                    || type == Character.COMBINING_SPACING_MARK
                    || type == Character.ENCLOSING_MARK
                    || type == Character.NON_SPACING_MARK) {
                  deconstructed.add(deconstructed.removeLast() + c);
                } else {
                  deconstructed.add(String.valueOf(c));
                }
              }
              result.addAll(deconstructed);
            } else if (it instanceof Map) {
              Queue<Object> deconstructed = queueOf(((Map<?,?>) it).entrySet().stream());
              result.addAll(deconstructed);
            } else {
              throw new UnsupportedOperationException("Cannot deconstruct " + it.getClass());
            }
          });
      if (ctx.transform() != null) {
        scope.setIt(result);
        return visitTransform(ctx.transform());
      }
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

  Object collect(Queue<Object> it, Object collector) {
    if (collector instanceof Map) {
      @SuppressWarnings("unchecked")
      Map<String, Object> collectorMap = (Map<String, Object>) collector;
      it.forEach(
          m -> {
            if (m instanceof Map) {
              @SuppressWarnings("unchecked")
              Map<String, Object> itMap = (Map<String, Object>) m;
              collectorMap.putAll(itMap);
            } else {
              @SuppressWarnings("unchecked")
              Map.Entry<String, Object> itEntry = (Map.Entry<String, Object>) m;
              collectorMap.put(itEntry.getKey(), itEntry.getValue());
            }
          });
    } else if (collector instanceof StringBuilder) {
      StringBuilder sbCollector = (StringBuilder) collector;
      it.forEach(s -> sbCollector.append(s.toString()));
      collector = sbCollector.toString();
    } else if (collector instanceof List) {
      @SuppressWarnings("unchecked")
      List<Object> collectorList = (List<Object>) collector;
      collectorList.addAll(it);
    } else {
      throw new UnsupportedOperationException("Cannot collect in " + collector.getClass());
    }
    return collector;
  }

  @Override
  public Object visitCollector(TailspinParser.CollectorContext ctx) {
    if (ctx.dereferenceValue() != null) {
      Object originalCollector = visitDereferenceValue(ctx.dereferenceValue());
      if ((originalCollector instanceof Queue) && ((Queue<?>) originalCollector).size() == 1) {
        originalCollector = ((Queue<?>) originalCollector).peek();
      }
      if (originalCollector instanceof Map) {
        @SuppressWarnings("unchecked")
        Map<String, Object> collector = new TreeMap<>((Map<String, Object>) originalCollector);
        return collector;
      }
      if (originalCollector instanceof List) {
        @SuppressWarnings("unchecked")
        List<Object> collector = new ArrayList<>((List<Object>) originalCollector);
        return collector;
      }
      throw new UnsupportedOperationException("Cannot create collector for " + originalCollector);
    }
    if (ctx.START_STRING() != null) {
      return new StringBuilder();
    }
    if (ctx.structureLiteral() != null) {
      return visitStructureLiteral(ctx.structureLiteral());
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public Queue<Object> visitLiteralTemplates(TailspinParser.LiteralTemplatesContext ctx) {
    Queue<Object> its = scope.getIt();
    Queue<Object> result = new ArrayDeque<>();
    its.forEach(
        it -> {
          scope.setIt(queueOf(it));
          Queue<Object> source = visitSource(ctx.source());
          if (source.peek() instanceof TransformCall) {
            result.addAll(((TransformCall) source.peek()).execute(scope));
          } else {
            result.addAll(source);
          }
        });
    return result;
  }

  @Override
  public Object visitDefinition(TailspinParser.DefinitionContext ctx) {
    String identifier = ctx.Key().getText().replace(":", "");
    Queue<Object> valueChainResult = visitValueChain(ctx.valueChain());
    if (valueChainResult.size() != 1) {
      throw new IllegalArgumentException(
          "Attempt to define symbol " + identifier + " with " + valueChainResult.size() + " values");
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
      return ctx.STRING_TEXT().getSymbol().getText().replace("''", "'").replace("$$", "$");
    }
    return visit(ctx.stringInterpolate()).toString();
  }

  @Override
  public String visitStringInterpolate(TailspinParser.StringInterpolateContext ctx) {
    if (ctx.dereferenceValue() != null) {
      Object interpolated = visitDereferenceValue(ctx.dereferenceValue());
      if (interpolated instanceof Templates) {
        Templates templates = (Templates) interpolated;
        return templates
            .run(new TransformScope(scope, templates.getScopeName()), Map.of()).stream()
                .map(Object::toString)
                .collect(Collectors.joining());
      } else if (interpolated instanceof Queue) {
        return ((Queue<?>) interpolated).stream()
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
  public Integer visitIntegerLiteral(TailspinParser.IntegerLiteralContext ctx) {
    if (ctx.Zero() != null) return 0;
    return visitNonZeroInteger(ctx.nonZeroInteger());
  }

  @Override
  public Integer visitNonZeroInteger(TailspinParser.NonZeroIntegerContext ctx) {
    Integer value = Integer.valueOf(ctx.PositiveInteger().getText());
    if (ctx.additiveOperator() != null && ctx.additiveOperator().getText().equals("-")) {
      value = - value;
    }
    return value;
  }

  @Override
  public Integer visitArithmeticExpression(TailspinParser.ArithmeticExpressionContext ctx) {
    if (ctx.dereferenceValue() != null) {
      String unaryOperator = ctx.additiveOperator() == null ? "" : ctx.additiveOperator().getText();
      Object value = visitDereferenceValue(ctx.dereferenceValue());
      if (value instanceof Queue && ((Queue<?>) value).size() == 1) {
        value = ((Queue<?>) value).peek();
      }
      switch (unaryOperator) {
        case "":
        case "+":
          return (Integer) value;
        case "-":
          return -(Integer) value;
        default:
          throw new UnsupportedOperationException("Unknown unary operator " + unaryOperator);
      }
    }
    if (ctx.LeftParen() != null) {
      Queue<Object> values = visitValueChain(ctx.valueChain());
      if (values.size() != 1) {
        throw new UnsupportedOperationException("Several values at " + ctx.valueChain().getText());
      }
      return (Integer) values.peek();
    }
    if (ctx.additiveOperator() != null) {
      Integer left = (Integer) visit(ctx.arithmeticExpression(0));
      Integer right = (Integer) visit(ctx.arithmeticExpression(1));
      String operation = ctx.additiveOperator().getText();
      switch (operation) {
        case "+":
          return left + right;
        case "-":
          return left - right;
      }
    }
    if (ctx.multiplicativeOperator() != null) {
      Integer left = (Integer) visit(ctx.arithmeticExpression(0));
      Integer right = Math.abs((Integer) visit(ctx.arithmeticExpression(1)));
      String operation = ctx.multiplicativeOperator().getText();
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
  public RangeGenerator visitRangeLiteral(TailspinParser.RangeLiteralContext ctx) {
    Bound lowerBound = ctx.lowerBound() != null ? visitLowerBound(ctx.lowerBound()) : null;
    Bound upperBound = ctx.upperBound() != null ? visitUpperBound(ctx.upperBound()) : null;
    Integer increment =
        ctx.arithmeticExpression() == null ? null : (Integer) visit(ctx.arithmeticExpression());
    if (increment != null && increment == 0) {
      throw new IllegalArgumentException(
          "Cannot produce range with zero increment at "
              + ctx.stop.getLine()
              + ":"
              + ctx.stop.getCharPositionInLine());
    }
    return new RangeGenerator(lowerBound, upperBound, increment);
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
  public List<?> visitArrayLiteral(TailspinParser.ArrayLiteralContext ctx) {
    return ctx.valueProduction().stream()
        .flatMap(
            vp -> {
              Queue<Object> result = visitValueProduction(vp);
              return result.stream();
            })
        .collect(Collectors.toList());
  }

  @Override
  public Queue<Object> visitValueProduction(ValueProductionContext ctx) {
    if (ctx.valueChain() != null) {
      return visitValueChain(ctx.valueChain());
    }
    if (ctx.sendToTemplates() != null) {
      return visitSendToTemplates(ctx.sendToTemplates());
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public Queue<Object> visitSendToTemplates(SendToTemplatesContext ctx) {
    throw new UnsupportedOperationException("Can only send to templates in a templates object");
  }

  @Override
  public Map<String, Object> visitStructureLiteral(TailspinParser.StructureLiteralContext ctx) {
    Map<String, Object> structure = new TreeMap<>();
    for (TailspinParser.KeyValueContext kvc : ctx.keyValue()) {
      KeyValue keyValue = visitKeyValue(kvc);
      structure.put(keyValue.getKey(), keyValue.getValue());
    }
    return structure;
  }

  @Override
  public KeyValue visitKeyValue(TailspinParser.KeyValueContext ctx) {
    String key = ctx.Key().getText().replace(":", "");
    Queue<Object> valueQueue = visitValueProduction(ctx.valueProduction());
    if (valueQueue.size() != 1) {
      throw new AssertionError("Invalid multiple value " + valueQueue.size());
    }
    return new KeyValue(key, valueQueue.peek());
  }

  @Override
  public Object visitComposerDefinition(TailspinParser.ComposerDefinitionContext ctx) {
    String name = ctx.IDENTIFIER(0).getText();
    if (!name.equals(ctx.IDENTIFIER(1).getText())) {
      throw new IllegalStateException(
          "Mismatched end " + ctx.IDENTIFIER(1).getText() + " for parser " + name);
    }
    Composer composer = visitComposerBody(ctx.composerBody());
    scope.defineValue(name, composer);
    return null;
  }

  @Override
  public Composer visitComposerBody(TailspinParser.ComposerBodyContext ctx) {
    Map<String, List<CompositionSpec>> definedSequences = new HashMap<>();
    for (DefinedCompositionSequenceContext definition : ctx.definedCompositionSequence()) {
      String key = definition.Key().getText().replace(":", "");
      definedSequences.put(key, visitCompositionSequence(definition.compositionSequence()));
    }
    return new Composer(visitCompositionSequence(ctx.compositionSequence()), definedSequences);
  }

  @Override
  public List<CompositionSpec> visitCompositionSequence(CompositionSequenceContext ctx) {
    List<CompositionSpec> result = new ArrayList<>();
    ctx.compositionSkipRule().forEach(s -> result.add(visitCompositionSkipRule(s)));
    ctx.compositionComponent().stream()
        .map(this::visitCompositionComponent)
        .forEach(result::addAll);
    return result;
  }

  @Override
  public List<CompositionSpec> visitCompositionComponent(TailspinParser.CompositionComponentContext ctx) {
    List<CompositionSpec> result = new ArrayList<>();
    result.add(visitCompositionMatcher(ctx.compositionMatcher()));
    ctx.compositionSkipRule().forEach(s -> result.add(visitCompositionSkipRule(s)));
    return result;
  }

  @Override
  public CompositionSpec visitCompositionSkipRule(TailspinParser.CompositionSkipRuleContext ctx) {
    return new Composer.SkipComposition(ctx.compositionCapture().stream()
        .map(this::visitCompositionCapture).collect(Collectors.toList()));
  }

  @Override
  public CompositionSpec visitCompositionCapture(TailspinParser.CompositionCaptureContext ctx) {
    CompositionSpec value = visitCompositionMatcher(ctx.compositionMatcher());
    if (ctx.Key() != null) {
      String identifier = ctx.Key().getText().replace(":", "");
      value = new Composer.CaptureComposition(identifier, value);
    }
    return value;
  }

  @Override
  public CompositionSpec visitCompositionMatcher(
      TailspinParser.CompositionMatcherContext ctx) {
    CompositionSpec compositionSpec;
    if (ctx.LeftBracket() != null) {
      compositionSpec = new Composer.ArrayComposition(visitCompositionSequence(ctx.compositionSequence()));
    } else if (ctx.LeftBrace() != null) {
      List<CompositionSpec> contents = new ArrayList<>();
      ctx.compositionSkipRule().forEach(s -> contents.add(visitCompositionSkipRule(s)));
      ctx.compositionKeyValue().forEach(k -> contents.add(visitCompositionKeyValue(k)));
      compositionSpec = new Composer.StructureComposition(contents);
    } else if (ctx.IDENTIFIER() != null) {
      String matchRule = ctx.IDENTIFIER().getText();
      compositionSpec = new Composer.NamedComposition(matchRule, ctx.Invert() != null);
    } else if (ctx.stringLiteral() != null) {
      String regex = visitStringLiteral(ctx.stringLiteral());
      compositionSpec = new Composer.RegexComposition(regex, ctx.Invert() != null);
    } else if (ctx.Dereference() != null) {
      String identifier = ctx.Dereference().getText().substring(1);
      compositionSpec = new Composer.DereferenceComposition(identifier);
    } else {
      throw new UnsupportedOperationException("Unknown type of composition matcher");
    }
    if (ctx.multiplier() == null) return compositionSpec;
    return resolveMultiplier(ctx.multiplier(), compositionSpec);
  }

  private CompositionSpec resolveMultiplier(TailspinParser.MultiplierContext ctx,
      CompositionSpec compositionSpec) {
    switch (ctx.getText()) {
      case "?": return new Composer.OptionalComposition(compositionSpec);
      case "+": return new Composer.OneOrMoreComposition(compositionSpec);
      case "*": return new Composer.AnyComposition(compositionSpec);
    }
    if (ctx.Equal() == null) throw new UnsupportedOperationException("Unknown multiplier " + ctx.getText());
    Integer amount = ctx.PositiveInteger() == null ? null : Integer.valueOf(ctx.PositiveInteger().getText());
    String identifier = ctx.Dereference() == null ? null : ctx.Dereference().getText().substring(1);
    return new Composer.CountComposition(compositionSpec, amount, identifier);
  }

  @Override
  public CompositionSpec visitCompositionKeyValue(TailspinParser.CompositionKeyValueContext ctx) {
    String key = ctx.Key().getText().replace(":", "");
    List<CompositionSpec> valueMatch = new ArrayList<>();
    ctx.compositionSkipRule().forEach(s -> valueMatch.add(visitCompositionSkipRule(s)));
    valueMatch.addAll(visitCompositionComponent(ctx.compositionComponent()));
    return new Composer.KeyValueComposition(key, valueMatch);
  }
}
