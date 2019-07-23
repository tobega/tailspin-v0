package tailspin.interpreter;

import static tailspin.ast.Expression.EMPTY_RESULT;
import static tailspin.ast.Expression.atMostOneValue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.antlr.v4.runtime.tree.TerminalNode;
import tailspin.Tailspin;
import tailspin.ast.ArithmeticOperation;
import tailspin.ast.ArrayDimensionRange;
import tailspin.ast.ArrayLiteral;
import tailspin.ast.ArrayTemplates;
import tailspin.ast.Block;
import tailspin.ast.BlockStatement;
import tailspin.ast.Bound;
import tailspin.ast.ChainStage;
import tailspin.ast.Deconstructor;
import tailspin.ast.DereferenceValue;
import tailspin.ast.Expression;
import tailspin.ast.InlineTemplates;
import tailspin.ast.IntegerExpression;
import tailspin.ast.IntegerLiteral;
import tailspin.ast.KeyValueExpression;
import tailspin.ast.RangeGenerator;
import tailspin.ast.Reference;
import tailspin.ast.SendToTemplates;
import tailspin.ast.SinkReference;
import tailspin.ast.StateAssignment;
import tailspin.ast.StringLiteral;
import tailspin.ast.StructureLiteral;
import tailspin.ast.TemplatesCall;
import tailspin.ast.TemplatesDefinition;
import tailspin.ast.TemplatesReference;
import tailspin.ast.Value;
import tailspin.interpreter.Composer.CompositionSpec;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParser.CompositionSequenceContext;
import tailspin.parser.TailspinParser.DefinedCompositionSequenceContext;
import tailspin.parser.TailspinParser.DimensionReferenceContext;
import tailspin.parser.TailspinParser.KeyValuesContext;
import tailspin.parser.TailspinParser.ValueProductionContext;
import tailspin.parser.TailspinParserBaseVisitor;
import tailspin.types.ProcessorInstance;

public class RunMain extends TailspinParserBaseVisitor {
  public final Scope scope;

  public RunMain(Scope scope) {
    this.scope = scope;
  }

  @Override
  public Object visitProgram(TailspinParser.ProgramContext ctx) {
    if (ctx.packageDefinition() != null) {
      visitPackageDefinition(ctx.packageDefinition());
    }
    ctx.dependency().forEach(this::visit);
    ctx.statement().forEach(s -> {
      scope.setIt(EMPTY_RESULT);
      visit(s);
    });
    return null;
  }

  @Override
  public Object visitPackageDefinition(TailspinParser.PackageDefinitionContext ctx) {
    ((BasicScope) scope).setPackageName(ctx.IDENTIFIER().getText());
    return null;
  }

  @Override
  public Object visitDependency(TailspinParser.DependencyContext ctx) {
    String dependency = visitStringLiteral(ctx.stringLiteral());
    String dependencyName = dependency.substring(dependency.lastIndexOf('/') + 1);
    Path depPath = scope.basePath().resolve(dependency + ".tt");
    try {
      Tailspin dep = Tailspin.parse(Files.newInputStream(depPath));
      @SuppressWarnings("unchecked")
      List<String> args = (List<String>) scope.resolveValue("args");
      // deps should not read from input
      ByteArrayInputStream emptyInput = new ByteArrayInputStream(new byte[0]);
      BasicScope depScope = dep.run(scope.basePath(), emptyInput, scope.getOutput(), args);
      String packageName = depScope.getPackageName();
      if (!dependencyName.equals(packageName)) {
        throw new IllegalStateException("Mismatched package " + packageName + " in file " + dependencyName);
      }
      depScope.getExportedDefinitions()
          .forEach(e -> scope.defineValue(packageName + "/" + e.getKey(), e.getValue()));
      return null;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Void visitValueChainToSink(TailspinParser.ValueChainToSinkContext ctx) {
    Queue<Object> value = visitValueChain(ctx.valueChain()).run(Expression.atMostOneValue(scope.getIt()), scope);
    scope.setIt(value);
    visitSink(ctx.sink());
    return null;
  }

  @Override
  public Expression visitValueChain(TailspinParser.ValueChainContext ctx) {
    if (ctx.keyValue() != null) {
      return Expression.wrap(visitKeyValue(ctx.keyValue()));
    }
    Expression source = visitSource(ctx.source());
    return new ChainStage(source, ctx.transform() == null ? null : visitTransform(ctx.transform()));
  }

  @Override
  public Expression visitSource(TailspinParser.SourceContext ctx) {
    if (ctx.stringLiteral() != null) {
      return Expression.wrap(new StringLiteral(ctx.stringLiteral()));
    }
    if (ctx.dereferenceValue() != null) {
      return visitDereferenceValue(ctx.dereferenceValue());
    }
    if (ctx.arithmeticExpression() != null) {
      return Expression.wrap(visitArithmeticExpression(ctx.arithmeticExpression()));
    }
    if (ctx.rangeLiteral() != null) {
      return visitRangeLiteral(ctx.rangeLiteral());
    }
    if (ctx.arrayLiteral() != null) {
      return Expression.wrap(new ArrayLiteral(ctx.arrayLiteral()));
    }
    if (ctx.structureLiteral() != null) {
      return Expression.wrap(visitStructureLiteral(ctx.structureLiteral()));
    }
    if (ctx.LeftParen() != null) {
      return Expression.wrap(visitKeyValue(ctx.keyValue()));
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
  public DereferenceValue visitDereferenceValue(TailspinParser.DereferenceValueContext ctx) {
    boolean isDelete = ctx.DeleteState() != null;
    TerminalNode dereference = isDelete ? ctx.DeleteState() : ctx.Dereference();
    String identifier = dereference.getText().substring(1);
    Reference reference = getReference(ctx.reference(), identifier);
    return new DereferenceValue(reference, isDelete, ctx.message());
  }

  private Reference getReference(TailspinParser.ReferenceContext ctx, String identifier) {
    Reference reference;
    if (identifier.equals("it")) {
      reference = Reference.it();
    } else if (identifier.startsWith("@")) {
      reference = Reference.state(identifier.substring(1));
    } else {
      reference = Reference.named(identifier);
    }
    reference = resolveReference(ctx, reference);
    return reference;
  }

  private Reference resolveReference(TailspinParser.ReferenceContext ctx, Reference reference) {
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

  public Queue<Object> resolveProcessorMessage(TailspinParser.MessageContext ctx, Object value) {
    String message = ctx.Message().getText().substring(2);
    Queue<Object> result;
    if (value instanceof List) {
      if (message.equals("length")) {
        result = queueOf(((List<?>) value).size());
      } else {
        throw new UnsupportedOperationException("Unknown array message " + message);
      }
    } else if (value instanceof KeyValue) {
      if (message.equals("key")) {
        result = queueOf(((KeyValue) value).getKey());
      } else if (message.equals("value")) {
        result = queueOf(((KeyValue) value).getValue());
      } else {
        throw new UnsupportedOperationException("Unknown array message " + message);
      }
    } else if (value instanceof ProcessorInstance) {
      Map<String, Value> parameters = ctx.parameterValues() == null ? Map.of()
        : visitParameterValues(ctx.parameterValues());
      Object it = Expression.atMostOneValue(scope.getIt());
      Map<String, Object> resolvedParams = parameters.entrySet().stream()
          .map(e -> new AbstractMap.SimpleEntry<>(e.getKey(), e.getValue().evaluate(it, scope)))
          .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
      result = ((ProcessorInstance) value).receiveMessage(message, scope.getIt(), resolvedParams);
    } else {
      throw new UnsupportedOperationException("Unimplemented processor type " + value.getClass().getSimpleName());
    }
    return result;
  }

  private Reference resolveFieldDereference(Reference reference, String fieldIdentifier) {
    return reference.field(fieldIdentifier);
  }

  private Reference resolveArrayDereference(TailspinParser.ArrayReferenceContext ctx, Reference reference) {
    List<Value> dimensions = new ArrayList<>();
    for (DimensionReferenceContext dimCtx : ctx.dimensionReference()) {
      if (dimCtx.arithmeticExpression() != null) {
        dimensions.add(visitArithmeticExpression(dimCtx.arithmeticExpression()));
      } else if (dimCtx.rangeLiteral() != null) {
        dimensions.add(new ArrayDimensionRange(dimCtx.rangeLiteral()));
      } else if (dimCtx.arrayLiteral() != null) {
        dimensions.add(new ArrayLiteral(dimCtx.arrayLiteral()));
      } else if (dimCtx.dereferenceValue() != null) {
        dimensions.add(Value.of(visitDereferenceValue(dimCtx.dereferenceValue())));
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
    if (ctx.SinkReference() != null) {
      SinkReference sink = new SinkReference(
          getReference(ctx.reference(), ctx.SinkReference().getText().substring(1)), ctx.message());
      scope.getIt().forEach(it -> sink.run(it, scope));
    }
    return null;
  }

  @Override
  public Expression visitInlineTemplates(TailspinParser.InlineTemplatesContext ctx) {
    TemplatesDefinition templatesDefinition = visitTemplatesBody(ctx.templatesBody());
    return new InlineTemplates(templatesDefinition);
  }

  @Override
  public Expression visitArrayTemplates(TailspinParser.ArrayTemplatesContext ctx) {
    List<String> loopVariables = ctx.IDENTIFIER().stream().map(TerminalNode::getText).collect(
        Collectors.toList());
    TemplatesDefinition templatesDefinition = visitTemplatesBody(ctx.templatesBody());
    return new ArrayTemplates(loopVariables, templatesDefinition);
  }

  @Override
  public TemplatesDefinition visitTemplatesBody(TailspinParser.TemplatesBodyContext ctx) {
    List<MatchTemplate> matchTemplates = new ArrayList<>();
    for (TailspinParser.MatchTemplateContext mtc : ctx.matchTemplate()) {
      matchTemplates.add(visitMatchTemplate(mtc));
    }
    return new TemplatesDefinition(visitBlock(ctx.block()), matchTemplates);
  }

  @Override
  public MatchTemplate visitMatchTemplate(TailspinParser.MatchTemplateContext ctx) {
    return new MatchTemplate(ctx.matcher(), visitBlock(ctx.block()));
  }

  @Override
  public Block visitBlock(TailspinParser.BlockContext ctx) {
    if (ctx == null) return null;
    List<Expression> blockExpressions = new ArrayList<>();
    for (TailspinParser.BlockExpressionContext exp : ctx.blockExpression()) {
      Expression expression = (Expression) visit(exp);
      blockExpressions.add(expression);
    }
    return new Block(blockExpressions);
  }

  @Override
  public StateAssignment visitStateAssignment(TailspinParser.StateAssignmentContext ctx) {
    String stateContext = ctx.NamedAt() == null ? "" : ctx.NamedAt().getText().substring(1);
    Reference reference = resolveReference(ctx.reference(), Reference.state(stateContext));
    return new StateAssignment(visitValueChain(ctx.valueChain()), reference, ctx.Merge() != null);
  }

  @Override
  public Expression visitResultValue(TailspinParser.ResultValueContext ctx) {
    return visitValueChain(ctx.valueChain());
  }

  @Override
  public BlockStatement visitBlockStatement(TailspinParser.BlockStatementContext ctx) {
    return new BlockStatement(ctx.statement());
  }

  @Override
  public Object visitTemplatesDefinition(TailspinParser.TemplatesDefinitionContext ctx) {
    String name = ctx.IDENTIFIER(0).getText();
    if (!name.equals(ctx.IDENTIFIER(1).getText())) {
      throw new IllegalStateException(
          "Mismatched end " + ctx.IDENTIFIER(1).getText() + " for templates " + name);
    }
    Templates templates = visitTemplatesBody(ctx.templatesBody()).define(scope);
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
    ProcessorDefinition processor = new ProcessorDefinition(scope, visitBlock(ctx.block()));
    processor.setScopeContext(name);
    if (ctx.parameterDefinitions() != null) {
      List<ExpectedParameter> parameters = visitParameterDefinitions(ctx.parameterDefinitions());
      processor.expectParameters(parameters);
    }
    scope.defineValue(name, processor);
    return null;
  }

  @Override
  public Expression visitCallDefinedTransform(TailspinParser.CallDefinedTransformContext ctx) {
    return new TemplatesCall(visitTransformCall(ctx.transformCall()));
  }

  @Override
  public TemplatesReference visitTransformCall(TailspinParser.TransformCallContext ctx) {
    String name = ctx.IDENTIFIER().getText();
    Map<String, Value> parameters = ctx.parameterValues() != null
        ? visitParameterValues(ctx.parameterValues())
        : Map.of();
    return new TemplatesReference(name, parameters);
  }

  @Override
  public Map<String, Value> visitParameterValues(TailspinParser.ParameterValuesContext ctx) {
    Map<String, Value> parameters = new HashMap<>();
    for(TailspinParser.ParameterValueContext parameterValueContext : ctx.parameterValue()) {
      KeyValue keyValue = visitParameterValue(parameterValueContext);
      parameters.put(keyValue.getKey(), (Value) keyValue.getValue());
    }
    return parameters;
  }

  @Override
  public KeyValue visitParameterValue(TailspinParser.ParameterValueContext ctx) {
    String key = ctx.Key().getText().replace(":", "");
    if (ctx.valueChain() != null) {
      return new KeyValue(key, Value.of(visitValueChain(ctx.valueChain())));
    }
    if (ctx.transformCall() != null) {
      return new KeyValue(key, visitTransformCall(ctx.transformCall()));
    }
    throw new IllegalArgumentException("Unknown parameter value " + ctx.getText());
  }

  @Override
  public ChainStage visitTransform(TailspinParser.TransformContext ctx) {
    if (ctx == null) {
      return null;
    }
    ChainStage nextStage = ctx.transform() == null ? null : visitTransform(ctx.transform());
    if (ctx.Deconstructor() != null) {
      return new ChainStage(Deconstructor.INSTANCE, nextStage);
    }
    @SuppressWarnings("unchecked")
    Expression transform = (Expression) visit(ctx.templates());
    return new ChainStage(transform, nextStage);
  }

  @Override
  public Expression visitLiteralTemplates(TailspinParser.LiteralTemplatesContext ctx) {
    return visitSource(ctx.source());
  }

  @Override
  public Object visitDefinition(TailspinParser.DefinitionContext ctx) {
    String identifier = ctx.Key().getText().replace(":", "");
    Queue<Object> valueChainResult = visitValueChain(ctx.valueChain())
        .run(Expression.atMostOneValue(scope.getIt()), scope);
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
      Queue<Object> interpolated = visitDereferenceValue(ctx.dereferenceValue())
          .run(Expression.atMostOneValue(scope.getIt()),scope);
      if (interpolated.size() == 1 && interpolated.peek() instanceof Templates) {
        Templates templates = (Templates) interpolated.peek();
        return templates
            .run(scope.getIt(), Map.of()).stream()
                .map(Object::toString)
                .collect(Collectors.joining());
      }
      return ((Queue<?>) interpolated).stream()
          .map(Object::toString)
          .collect(Collectors.joining());
    }
    if (ctx.interpolateEvaluate() != null) {
      Queue<Object> valueQueue = visitValueChain(ctx.interpolateEvaluate().valueChain())
          .run(Expression.atMostOneValue(scope.getIt()),scope);
      return valueQueue.stream().map(Object::toString).collect(Collectors.joining());
    }
    if (ctx.characterCode() != null) {
      int code = ((Number) visitArithmeticExpression(ctx.characterCode().arithmeticExpression()).evaluate(Expression.atMostOneValue(scope.getIt()),scope)).intValue();
      return Character.toString(code);
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public Value visitIntegerLiteral(TailspinParser.IntegerLiteralContext ctx) {
    if (ctx.Zero() != null) return new IntegerLiteral(0);
    return visitNonZeroInteger(ctx.nonZeroInteger());
  }

  @Override
  public Value visitNonZeroInteger(TailspinParser.NonZeroIntegerContext ctx) {
    long value = Long.valueOf(ctx.PositiveInteger().getText());
    if (ctx.additiveOperator() != null && ctx.additiveOperator().getText().equals("-")) {
      value = - value;
    }
    return new IntegerLiteral(value);
  }

  @Override
  public Value visitArithmeticExpression(TailspinParser.ArithmeticExpressionContext ctx) {
    if (ctx.dereferenceValue() != null) {
      boolean isNegative = ctx.additiveOperator() != null && ctx.additiveOperator().getText().equals("-");
      return new IntegerExpression(isNegative, visitDereferenceValue(ctx.dereferenceValue()));
    }
    if (ctx.LeftParen() != null) {
      return new IntegerExpression(false, visitValueChain(ctx.valueChain()));
    }
    if (ctx.additiveOperator() != null) {
      Value left = (Value) visit(ctx.arithmeticExpression(0));
      Value right = (Value) visit(ctx.arithmeticExpression(1));
      String operation = ctx.additiveOperator().getText();
      switch (operation) {
        case "+":
          return new ArithmeticOperation(left, ArithmeticOperation.Op.Add, right);
        case "-":
          return new ArithmeticOperation(left, ArithmeticOperation.Op.Subtract, right);
      }
    }
    if (ctx.multiplicativeOperator() != null) {
      Value left = (Value) visit(ctx.arithmeticExpression(0));
      Value right = (Value) visit(ctx.arithmeticExpression(1));
      String operation = ctx.multiplicativeOperator().getText();
      switch (operation) {
        case "*":
          return new ArithmeticOperation(left, ArithmeticOperation.Op.Multiply, right);
        case "/":
          return new ArithmeticOperation(left, ArithmeticOperation.Op.DivideTruncate, right);
        case "mod":
          return new ArithmeticOperation(left, ArithmeticOperation.Op.Modulo, right);
      }
    }
    if (ctx.integerLiteral() != null) {
      return (Value) visit(ctx.integerLiteral());
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public RangeGenerator visitRangeLiteral(TailspinParser.RangeLiteralContext ctx) {
    Bound lowerBound = ctx.lowerBound() != null ? visitLowerBound(ctx.lowerBound()) : null;
    Bound upperBound = ctx.upperBound() != null ? visitUpperBound(ctx.upperBound()) : null;
    Value increment =
        ctx.arithmeticExpression() == null ? null : visitArithmeticExpression(ctx.arithmeticExpression());
    return new RangeGenerator(lowerBound, upperBound, increment);
  }

  @Override
  public Bound visitLowerBound(TailspinParser.LowerBoundContext ctx) {
    Value bound;
    if (ctx.dereferenceValue() != null) {
      bound = Value.of(visitDereferenceValue(ctx.dereferenceValue()));
    } else if (ctx.arithmeticExpression() != null) {
      bound = visitArithmeticExpression(ctx.arithmeticExpression());
    } else if (ctx.stringLiteral() != null) {
      bound = new StringLiteral(ctx.stringLiteral());
    } else {
      throw new UnsupportedOperationException(
          "Cannot extract comparison object at " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
    }
    return new Bound(bound, ctx.Invert() == null);
  }

  @Override
  public Bound visitUpperBound(TailspinParser.UpperBoundContext ctx) {
    Value bound;
    if (ctx.dereferenceValue() != null) {
      bound = Value.of(visitDereferenceValue(ctx.dereferenceValue()));
    } else if (ctx.arithmeticExpression() != null) {
      bound = visitArithmeticExpression(ctx.arithmeticExpression());
    } else if (ctx.stringLiteral() != null) {
      bound = new StringLiteral(ctx.stringLiteral());
    } else {
      throw new UnsupportedOperationException(
          "Cannot extract comparison object at " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
    }
    return new Bound(bound, ctx.Invert() == null);
  }

  @Override
  public List<?> visitArrayLiteral(TailspinParser.ArrayLiteralContext ctx) {
    Queue<Object> originalIt = scope.getIt();
    return ctx.valueProduction().stream()
        .flatMap(
            vp -> {
              scope.setIt(originalIt);
              Queue<Object> result = visitValueProduction(vp).run(atMostOneValue(originalIt), scope);
              return result.stream();
            })
        .collect(Collectors.toList());
  }

  @Override
  public Expression visitValueProduction(ValueProductionContext ctx) {
    if (ctx.valueChain() != null) {
      return visitValueChain(ctx.valueChain());
    }
    if (ctx.sendToTemplates() != null) {
      return visitSendToTemplates(ctx.sendToTemplates());
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public SendToTemplates visitSendToTemplates(TailspinParser.SendToTemplatesContext ctx) {
    return new SendToTemplates(visitValueChain(ctx.valueChain()));
  }

  @Override
  public StructureLiteral visitStructureLiteral(TailspinParser.StructureLiteralContext ctx) {
    return new StructureLiteral(ctx.keyValues().stream().map(this::visitKeyValues).collect(Collectors.toList()));
  }

  @Override
  public Expression visitKeyValues(KeyValuesContext ctx) {
    if (ctx.keyValue() != null) {
      return Expression.wrap(visitKeyValue(ctx.keyValue()));
    }
    if (ctx.dereferenceValue() != null) {
      return visitDereferenceValue(ctx.dereferenceValue());
    }
    return visitValueChain(ctx.valueChain());
  }

  @Override
  public KeyValueExpression visitKeyValue(TailspinParser.KeyValueContext ctx) {
    String key = ctx.Key().getText().replace(":", "");
    return new KeyValueExpression(key, Value.of(visitValueProduction(ctx.valueProduction())));
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
    return new Composer(scope, visitCompositionSequence(ctx.compositionSequence()), definedSequences);
  }

  @Override
  public List<CompositionSpec> visitCompositionSequence(CompositionSequenceContext ctx) {
    List<CompositionSpec> result = new ArrayList<>();
    ctx.compositionSkipRule().forEach(s -> result.add(visitCompositionSkipRule(s)));
    ctx.compositionComponent().stream()
        .map(this::visitCompositionComponent)
        .forEach(result::addAll);
    if (ctx.structureMemberMatchers() != null) {
      result.addAll(visitStructureMemberMatchers(ctx.structureMemberMatchers()));
    }
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
    if (ctx.LeftBracket() != null) {
      return new Composer.ArrayComposition(visitCompositionSequence(ctx.compositionSequence()), visitTransform(ctx.transform()));
    } else if (ctx.LeftBrace() != null) {
      List<CompositionSpec> contents = new ArrayList<>();
      ctx.compositionSkipRule().forEach(s -> contents.add(visitCompositionSkipRule(s)));
      if (ctx.structureMemberMatchers() != null) {
        contents.addAll(visitStructureMemberMatchers(ctx.structureMemberMatchers()));
      }
      return new Composer.StructureComposition(contents, visitTransform(ctx.transform()));
    } else if (ctx.tokenMatcher() != null) {
      return visitTokenMatcher(ctx.tokenMatcher());
    } else if (ctx.Dereference() != null) {
      String identifier = ctx.Dereference().getText().substring(1);
      return new Composer.DereferenceComposition(identifier);
    } else {
      throw new UnsupportedOperationException("Unknown type of composition matcher");
    }
  }

  @Override
  public List<CompositionSpec> visitStructureMemberMatchers(TailspinParser.StructureMemberMatchersContext ctx) {
    List<CompositionSpec> members = new ArrayList<>();
    ctx.structureMemberMatcher().forEach(k -> members.addAll(visitStructureMemberMatcher(k)));
    return members;
  }

  @Override
  public List<CompositionSpec> visitStructureMemberMatcher(TailspinParser.StructureMemberMatcherContext ctx) {
    List<CompositionSpec> parts = new ArrayList<>();
    ctx.compositionSkipRule().forEach(sr -> parts.add(visitCompositionSkipRule(sr)));
    if (ctx.compositionKeyValue() != null) {
      parts.add(visitCompositionKeyValue(ctx.compositionKeyValue()));
    } else if (ctx.tokenMatcher() != null) {
      parts.add(visitTokenMatcher(ctx.tokenMatcher()));
    } else {
      throw new UnsupportedOperationException("Unknown matcher " + ctx);
    }
    return parts;
  }

  @Override
  public CompositionSpec visitTokenMatcher(TailspinParser.TokenMatcherContext ctx) {
    CompositionSpec compositionSpec = new Composer.ChoiceComposition(ctx.compositionToken().stream()
        .map(this::visitCompositionToken).collect(Collectors.toList()), visitTransform(ctx.transform()));
    if (ctx.multiplier() == null) return compositionSpec;
    return resolveMultiplier(ctx.multiplier(), compositionSpec);
  }

  @Override
  public CompositionSpec visitCompositionToken(TailspinParser.CompositionTokenContext ctx) {
    CompositionSpec compositionSpec;
    if (ctx.IDENTIFIER() != null) {
      String matchRule = ctx.IDENTIFIER().getText();
      compositionSpec = new Composer.NamedComposition(matchRule, ctx.Invert() != null);
    } else if (ctx.stringLiteral() != null) {
      String regex = visitStringLiteral(ctx.stringLiteral());
      compositionSpec = new Composer.RegexComposition(regex, ctx.Invert() != null);
    } else {
      throw new UnsupportedOperationException("Unknown composition spec " + ctx.getText());
    }
    return compositionSpec;
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
    CompositionSpec key;
    if (ctx.Key() != null) {
      key = new Composer.Constant(ctx.Key().getText().replace(":", ""));
    } else {
      key = visitTokenMatcher(ctx.compositionKey().tokenMatcher());
    }
    List<CompositionSpec> valueMatch = new ArrayList<>();
    ctx.compositionSkipRule().forEach(s -> valueMatch.add(visitCompositionSkipRule(s)));
    valueMatch.addAll(visitCompositionComponent(ctx.compositionComponent()));
    return new Composer.KeyValueComposition(key, valueMatch);
  }
}
