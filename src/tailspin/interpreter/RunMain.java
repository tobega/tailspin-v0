package tailspin.interpreter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import tailspin.Tailspin;
import tailspin.matchers.AlwaysFalse;
import tailspin.matchers.AnyOf;
import tailspin.arithmetic.ArithmeticContextKeywordResolver;
import tailspin.arithmetic.ArithmeticContextValue;
import tailspin.arithmetic.ArithmeticOperation;
import tailspin.control.ArrayDimensionRange;
import tailspin.literals.ArrayLiteral;
import tailspin.matchers.ArrayMatch;
import tailspin.control.ArrayTemplates;
import tailspin.control.Block;
import tailspin.control.Bound;
import tailspin.control.ChainStage;
import tailspin.literals.CodedCharacter;
import tailspin.control.ComposerDefinition;
import tailspin.matchers.CollectionCriterionFactory;
import tailspin.matchers.MultipliedCollectionCriterionFactory;
import tailspin.matchers.OnceOnlyCollectionCriterionFactory;
import tailspin.testing.Assertion;
import tailspin.testing.Test;
import tailspin.transform.Composer;
import tailspin.transform.ExpectedParameter;
import tailspin.transform.MatchTemplate;
import tailspin.transform.ProcessorConstructor;
import tailspin.transform.Templates;
import tailspin.matchers.composer.CompositionSpec;
import tailspin.matchers.composer.SubComposerFactory;
import tailspin.types.Criterion;
import tailspin.control.Deconstructor;
import tailspin.control.Definition;
import tailspin.control.DeleteState;
import tailspin.control.DimensionContextKeywordResolver;
import tailspin.control.DimensionReference;
import tailspin.matchers.Equality;
import tailspin.control.Expression;
import tailspin.control.InlineTemplates;
import tailspin.arithmetic.IntegerConstant;
import tailspin.arithmetic.IntegerExpression;
import tailspin.literals.KeyValueExpression;
import tailspin.control.MultiValueDimension;
import tailspin.control.ProcessorDefinition;
import tailspin.control.ProcessorMessage;
import tailspin.control.RangeGenerator;
import tailspin.matchers.RangeMatch;
import tailspin.control.Reference;
import tailspin.matchers.RegexpMatch;
import tailspin.control.SendToTemplates;
import tailspin.control.SimpleDimensionReference;
import tailspin.control.SinkReference;
import tailspin.control.SinkValueChain;
import tailspin.control.SourceReference;
import tailspin.control.StateAssignment;
import tailspin.literals.StringConstant;
import tailspin.literals.StringInterpolation;
import tailspin.literals.StringLiteral;
import tailspin.literals.StructureLiteral;
import tailspin.matchers.StructureMatch;
import tailspin.matchers.Condition;
import tailspin.control.TemplatesCall;
import tailspin.control.TemplatesDefinition;
import tailspin.control.TemplatesReference;
import tailspin.control.Value;
import tailspin.matchers.ValueMatcher;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParser.CompositionSequenceContext;
import tailspin.parser.TailspinParser.DefinedCompositionSequenceContext;
import tailspin.parser.TailspinParser.DimensionReferenceContext;
import tailspin.parser.TailspinParser.KeyValuesContext;
import tailspin.parser.TailspinParser.StateSinkContext;
import tailspin.parser.TailspinParser.ValueProductionContext;
import tailspin.parser.TailspinParserBaseVisitor;
import tailspin.types.KeyValue;

public class RunMain extends TailspinParserBaseVisitor<Object> {
  private final Deque<DependencyCounter> dependencyCounters;

  public RunMain() {
    dependencyCounters = new ArrayDeque<>();
    dependencyCounters.push(new DependencyCounter());
  }

  @Override
  public Program visitProgram(TailspinParser.ProgramContext ctx) {
    if (ctx.packageDefinition() != null) {
      visitPackageDefinition(ctx.packageDefinition());
    }
    List<ProgramDependency> dependencies = ctx.dependency().stream()
        .map(this::visitDependency).collect(Collectors.toList());
    List<TopLevelStatement> statements = new ArrayList<>();
    List<TopLevelStatement> tests = new ArrayList<>();
    ctx.statement().forEach(s -> {
      dependencyCounters.push(new DependencyCounter());
      Expression statement = (Expression) visit(s);
      Set<String> requiredDefinitions = dependencyCounters.pop().getRequiredDefinitions();
      TopLevelStatement topLevelStatement = new TopLevelStatement(statement, requiredDefinitions);
      if (statement instanceof Test) {
        tests.add(topLevelStatement);
      } else {
        statements.add(topLevelStatement);
      }
    });
    return new Program(statements, tests, dependencies);
  }

  @Override
  public Object visitPackageDefinition(TailspinParser.PackageDefinitionContext ctx) {
    return null;
  }

  @Override
  public ProgramDependency visitDependency(TailspinParser.DependencyContext ctx) {
    Value dependency = visitStringLiteral(ctx.stringLiteral());
    return new ProgramDependency(dependency);
  }

  @Override
  public Expression visitValueChainToSink(TailspinParser.ValueChainToSinkContext ctx) {
    Expression valueChain = visitValueChain(ctx.valueChain());
    Expression sink = visitSink(ctx.sink());
    return new SinkValueChain(valueChain, sink);
  }

  @Override
  public Expression visitValueChain(TailspinParser.ValueChainContext ctx) {
    if (ctx.keyValue() != null) {
      return visitKeyValue(ctx.keyValue());
    }
    Expression source = visitSource(ctx.source());
    return new ChainStage(source, ctx.transform() == null ? null : visitTransform(ctx.transform()));
  }

  @Override
  public Expression visitSource(TailspinParser.SourceContext ctx) {
    if (ctx.stringLiteral() != null) {
      return visitStringLiteral(ctx.stringLiteral());
    }
    if (ctx.sourceReference() != null) {
      return visitSourceReference(ctx.sourceReference());
    }
    if (ctx.deleteState() != null) {
      return visitDeleteState(ctx.deleteState());
    }
    if (ctx.arithmeticExpression() != null) {
      return visitArithmeticExpression(ctx.arithmeticExpression());
    }
    if (ctx.rangeLiteral() != null) {
      return visitRangeLiteral(ctx.rangeLiteral());
    }
    if (ctx.arrayLiteral() != null) {
      return visitArrayLiteral(ctx.arrayLiteral());
    }
    if (ctx.structureLiteral() != null) {
      return visitStructureLiteral(ctx.structureLiteral());
    }
    if (ctx.LeftParen() != null) {
      return visitKeyValue(ctx.keyValue());
    }
    throw new UnsupportedOperationException(ctx.toString());
  }

  @Override
  public String visitAnyIdentifier(TailspinParser.AnyIdentifierContext ctx) {
    if (ctx.localIdentifier() != null) {
      return ctx.localIdentifier().getText();
    }
    if (ctx.stateIdentifier() != null) {
      return ctx.stateIdentifier().getText();
    }
    return ctx.externalIdentifier().getText();
  }

  @Override
  public Expression visitSourceReference(TailspinParser.SourceReferenceContext ctx) {
    String identifier = ctx.anyIdentifier() == null ? "" : visitAnyIdentifier(ctx.anyIdentifier());
    return createSourceReference(identifier, ctx.reference(), ctx.Message(), ctx.parameterValues());
  }

  private Expression createSourceReference(String identifier,
      TailspinParser.ReferenceContext refCtx, TerminalNode message,
      TailspinParser.ParameterValuesContext paramCtx) {
    Reference reference = getReference(refCtx, identifier);
    Map<String, Value> parameters = visitParameterValues(paramCtx);
    if (message != null) {
      reference = new ProcessorMessage(
          reference, message.getText().substring(2),
          parameters);
    } else if (!parameters.isEmpty()) {
      reference = new TemplatesReference(reference, parameters);
    }
    return new SourceReference(reference);
  }

  private Reference getReference(TailspinParser.ReferenceContext ctx, String identifier) {
    Reference reference;
    if (identifier.equals("")) {
      reference = Reference.it();
    } else if (identifier.startsWith("@")) {
      reference = Reference.state(identifier.substring(1));
    } else {
      dependencyCounters.peek().reference(identifier);
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

  private Reference resolveFieldDereference(Reference reference, String fieldIdentifier) {
    return reference.field(fieldIdentifier);
  }

  private Reference resolveArrayDereference(TailspinParser.ArrayReferenceContext ctx, Reference reference) {
    resolver.push(new DimensionContextKeywordResolver());
    try {
      List<DimensionReference> dimensions = new ArrayList<>();
      for (DimensionReferenceContext dimCtx : ctx.dimensionReference()) {
        if (dimCtx.simpleDimension() != null) {
          dimensions.add(visitSimpleDimension(dimCtx.simpleDimension()));
        } else {
          dimensions.add(visitMultiValueDimension(dimCtx.multiValueDimension()));
        }
      }
      return reference.array(dimensions, (DimensionContextKeywordResolver) resolver.peek());
    } finally{
      resolver.pop();
    }
  }

  @Override
  public DimensionReference visitSimpleDimension(TailspinParser.SimpleDimensionContext ctx) {
      if (ctx.arithmeticExpression() != null) {
        return new SimpleDimensionReference(visitArithmeticExpression(ctx.arithmeticExpression()));
      } else if (ctx.rangeLiteral() != null) {
        return new ArrayDimensionRange(visitRangeLiteral(ctx.rangeLiteral()));
      } else if (ctx.sourceReference() != null) {
        return new SimpleDimensionReference(Value.of(visitSourceReference(ctx.sourceReference())));
      } else {
        throw new UnsupportedOperationException(
            "Unknown way to dereference array at "
                + ctx.getStart().getLine()
                + ":"
                + ctx.getStart().getCharPositionInLine() + " " + ctx.getText());
      }
  }

  @Override
  public DimensionReference visitMultiValueDimension(TailspinParser.MultiValueDimensionContext ctx) {
    List<DimensionReference> values = new ArrayList<>();
    for (TailspinParser.SimpleDimensionContext sctx : ctx.simpleDimension()) {
      values.add(visitSimpleDimension(sctx));
    }
    return new MultiValueDimension(values);
  }

  @Override
  public Value visitDeleteState(TailspinParser.DeleteStateContext ctx) {
    String stateIdentifier = ctx.stateIdentifier().getText();
    Reference reference = getReference(ctx.reference(), stateIdentifier);
    return new DeleteState(reference);
  }

  @Override
  public Expression visitSink(TailspinParser.SinkContext ctx) {
    if (ctx.Void() == null) {
      String identifier = ctx.anyIdentifier().getText();
      Reference reference = getReference(ctx.reference(), identifier);
      Map<String, Value> parameters = visitParameterValues(ctx.parameterValues());
      if (ctx.Message() != null) {
        reference = new ProcessorMessage(
            reference, ctx.Message().getText().substring(2),
            parameters);
      } else if (!parameters.isEmpty()) {
        reference = new TemplatesReference(reference, parameters);
      }
      return new SinkReference(reference);
    }
    return null;
  }

  @Override
  public Expression visitLambdaTemplates(TailspinParser.LambdaTemplatesContext ctx) {
    String name = "";
    if (!ctx.localIdentifier().isEmpty()) {
      name = ctx.localIdentifier(0).getText();
      String endName = ctx.localIdentifier().size() > 1 ? ctx.localIdentifier(1).getText() : "";
      if (!name.equals(endName)) {
        throw new IllegalStateException(
            "Mismatched end \"" + endName + "\" for templates " + name);
      }
    }
    TemplatesDefinition templatesDefinition = visitTemplatesBody(ctx.templatesBody());
    return new InlineTemplates(templatesDefinition, name);
  }

  @Override
  public List<String> visitArrayIndexDecomposition(TailspinParser.ArrayIndexDecompositionContext ctx) {
    return ctx.localIdentifier().stream().map(RuleNode::getText).collect(
        Collectors.toList());
  }

  @Override
  public Object visitLambdaArrayTemplates(TailspinParser.LambdaArrayTemplatesContext ctx) {
    String name = "";
    if (!ctx.localIdentifier().isEmpty()) {
      name = ctx.localIdentifier(0).getText();
      String endName = ctx.localIdentifier().size() > 1 ? ctx.localIdentifier(1).getText() : "";
      if (!name.equals(endName)) {
        throw new IllegalStateException(
            "Mismatched end \"" + endName + "\" for templates " + name);
      }
    }
    List<String> loopVariables = visitArrayIndexDecomposition(ctx.arrayIndexDecomposition());
    TemplatesDefinition templatesDefinition = visitTemplatesBody(ctx.templatesBody());
    return new ArrayTemplates(loopVariables, templatesDefinition, name);
  }

  @Override
  public TemplatesDefinition visitTemplatesBody(TailspinParser.TemplatesBodyContext ctx) {
    Block block = visitBlock(ctx.block());
    List<MatchTemplate> matchTemplates = new ArrayList<>();
    for (TailspinParser.MatchTemplateContext mtc : ctx.matchTemplate()) {
      matchTemplates.add(visitMatchTemplate(mtc));
    }
    return new TemplatesDefinition(block, matchTemplates);
  }

  @Override
  public MatchTemplate visitMatchTemplate(TailspinParser.MatchTemplateContext ctx) {
    return new MatchTemplate(visitMatcher(ctx.matcher()), visitBlock(ctx.block()));
  }

  @Override
  public AnyOf visitMatcher(TailspinParser.MatcherContext ctx) {
    return new AnyOf(ctx.Invert() != null, ctx.criterion().stream().map(this::visitCriterion).collect(Collectors.toList()));
  }

  @Override
  public ValueMatcher visitCriterion(TailspinParser.CriterionContext ctx) {
    Criterion basicCriterion = ctx.typeMatch() == null ? null : (Criterion) visit(ctx.typeMatch());
    if (basicCriterion == null && ctx.literalMatch() != null) {
      basicCriterion = visitLiteralMatch(ctx.literalMatch());
    }
    return new ValueMatcher(basicCriterion,
        ctx.condition() == null ? List.of()
            : ctx.condition().stream().map(this::visitCondition).collect(Collectors.toList()));
  }

  @Override
  public Condition visitCondition(TailspinParser.ConditionContext ctx) {
    return new Condition(Value.of(visitValueChain(ctx.valueChain())), visitMatcher(ctx.matcher()));
  }

  @Override
  public Criterion visitLiteralMatch(TailspinParser.LiteralMatchContext ctx) {
    return new Equality(Value.of(visitSource(ctx.source())));
  }

  @Override
  public Criterion visitRangeMatch(TailspinParser.RangeMatchContext ctx) {
    return visitRangeBounds(ctx.rangeBounds());
  }

  @Override
  public RangeMatch visitRangeBounds(TailspinParser.RangeBoundsContext ctx) {
    Bound lowerBound = ctx.lowerBound() != null ? visitLowerBound(ctx.lowerBound()) : null;
    Bound upperBound = ctx.upperBound() != null ? visitUpperBound(ctx.upperBound()) : null;
    return new RangeMatch(lowerBound, upperBound);
  }

  @Override
  public Criterion visitRegexpMatch(TailspinParser.RegexpMatchContext ctx) {
    return new RegexpMatch(visitStringLiteral(ctx.stringLiteral()));
  }

  @Override
  public Criterion visitStructureMatch(TailspinParser.StructureMatchContext ctx) {
    Map<String, Criterion> keyMatchers = new HashMap<>();
    for (int i = 0; i < ctx.key().size(); i++) {
      String key = ctx.key(i).localIdentifier().getText();
      TailspinParser.StructureContentMatcherContext matcherCtx = ctx.structureContentMatcher(i);
      Criterion matcher = matcherCtx.Void() == null ? visitMatcher(matcherCtx.matcher())
          : AlwaysFalse.INSTANCE;
      keyMatchers.put(key, matcher);
    }
    return new StructureMatch(keyMatchers, ctx.Void() == null);
  }

  @Override
  public Criterion visitArrayMatch(TailspinParser.ArrayMatchContext ctx) {
    List<CollectionCriterionFactory> criterionFactories = ctx.arrayContentMatcher().stream()
        .map(this::visitArrayContentMatcher)
        .collect(Collectors.toList());
    Criterion lengthCriterion = null;
    if (ctx.rangeBounds() != null) {
      lengthCriterion = visitRangeBounds(ctx.rangeBounds());
    } else if (ctx.arithmeticExpression() != null) {
      lengthCriterion = new Equality(visitArithmeticExpression(ctx.arithmeticExpression()));
    }
    return new ArrayMatch(lengthCriterion, criterionFactories, ctx.Void() != null);
  }

  @Override
  public CollectionCriterionFactory visitArrayContentMatcher(TailspinParser.ArrayContentMatcherContext ctx) {
    if (ctx.multiplier() == null) {
      return new OnceOnlyCollectionCriterionFactory(visitMatcher(ctx.matcher()));
    }
    return new MultipliedCollectionCriterionFactory(visitMatcher(ctx.matcher()), visitMultiplier(ctx.multiplier()));
  }

  @Override
  public Block visitBlock(TailspinParser.BlockContext ctx) {
    dependencyCounters.push(new DependencyCounter());
    if (ctx == null) return null;
    List<Expression> blockExpressions = new ArrayList<>();
    for (TailspinParser.BlockExpressionContext exp : ctx.blockExpression()) {
      Expression expression = (Expression) visit(exp);
      blockExpressions.add(expression);
    }
    Set<String> requiredDefinitions = dependencyCounters.pop().getRequiredDefinitions();
    dependencyCounters.peek().requireAll(requiredDefinitions);
    return new Block(blockExpressions);
  }

  @Override
  public Expression visitStateAssignment(TailspinParser.StateAssignmentContext ctx) {
    StateAssignment stateAssignment = visitStateSink(ctx.stateSink());
    if (ctx.valueChain() != null) {
      return new SinkValueChain(visitValueChain(ctx.valueChain()), stateAssignment);
    }
    return stateAssignment;
  }

  @Override
  public StateAssignment visitStateSink(StateSinkContext ctx) {
    String stateContext = ctx.stateIdentifier().getText().substring(1);
    Reference reference = resolveReference(ctx.reference(), Reference.state(stateContext));
    return new StateAssignment(visitValueProduction(ctx.valueProduction()), reference, ctx.Range() != null);
  }

  @Override
  public Expression visitResultValue(TailspinParser.ResultValueContext ctx) {
    return visitValueChain(ctx.valueChain());
  }

  @Override
  public Expression visitBlockStatement(TailspinParser.BlockStatementContext ctx) {
    return (Expression) visit(ctx.statement());
  }

  @Override
  public Expression visitTemplatesDefinition(TailspinParser.TemplatesDefinitionContext ctx) {
    String name = ctx.localIdentifier(0).getText();
    if (!name.equals(ctx.localIdentifier(1).getText())) {
      throw new IllegalStateException(
          "Mismatched end " + ctx.localIdentifier(1).getText() + " for templates " + name);
    }
    TemplatesDefinition templatesDefinition = visitTemplatesBody(ctx.templatesBody());
    templatesDefinition.expectParameters(visitParameterDefinitions(ctx.parameterDefinitions()));
    dependencyCounters.peek().define(name);
    return new Definition(name, (it, scope) -> {
      Templates templates = templatesDefinition.define(scope);
      templates.setScopeContext(name);
      return templates;
    });
  }

  @Override
  public List<ExpectedParameter> visitParameterDefinitions(TailspinParser.ParameterDefinitionsContext ctx) {
    List<ExpectedParameter> parameters = new ArrayList<>();
    if (ctx == null) {
      return parameters;
    }
    for (TailspinParser.KeyContext key : ctx.key()) {
      parameters.add(new ExpectedParameter(key.localIdentifier().getText()));
    }
    return parameters;
  }

  @Override
  public Expression visitProcessorDefinition(TailspinParser.ProcessorDefinitionContext ctx) {
    String name = ctx.localIdentifier(0).getText();
    if (!name.equals(ctx.localIdentifier(1).getText())) {
      throw new IllegalStateException(
          "Mismatched end " + ctx.localIdentifier(1).getText() + " for templates " + name);
    }
    ProcessorDefinition processorDefinition = new ProcessorDefinition(visitBlock(ctx.block()),
        visitParameterDefinitions(ctx.parameterDefinitions()));
    dependencyCounters.peek().define(name);
    return new Definition(name, (it, scope) -> {
      ProcessorConstructor processorConstructor = processorDefinition.define(scope);
      processorConstructor.setScopeContext(name);
      return processorConstructor;
    });
  }

  @Override
  public Expression visitCallDefinedTransform(TailspinParser.CallDefinedTransformContext ctx) {
    return new TemplatesCall(visitTemplatesReference(ctx.templatesReference()));
  }

  @Override
  public Reference visitTemplatesReference(TailspinParser.TemplatesReferenceContext ctx) {
    String name = visitAnyIdentifier(ctx.anyIdentifier());
    Reference reference = getReference(ctx.reference(), name);
    Map<String, Value> parameters = ctx.parameterValues() != null
        ? visitParameterValues(ctx.parameterValues())
        : Map.of();
    if (ctx.Message() != null) {
      return new ProcessorMessage(
          reference, ctx.Message().getText().substring(2),
          parameters);
    }
    return new TemplatesReference(reference, parameters);
  }

  @Override
  public Map<String, Value> visitParameterValues(TailspinParser.ParameterValuesContext ctx) {
    if (ctx == null) return Map.of();
    Map<String, Value> parameters = new HashMap<>();
    for(TailspinParser.ParameterValueContext parameterValueContext : ctx.parameterValue()) {
      KeyValue keyValue = visitParameterValue(parameterValueContext);
      parameters.put(keyValue.getKey(), (Value) keyValue.getValue());
    }
    return parameters;
  }

  @Override
  public KeyValue visitParameterValue(TailspinParser.ParameterValueContext ctx) {
    String key = ctx.key().localIdentifier().getText();
    if (ctx.valueChain() != null) {
      return new KeyValue(key, Value.of(visitValueChain(ctx.valueChain())));
    }
    if (ctx.templatesReference() != null) {
      Reference reference = visitTemplatesReference(ctx.templatesReference());
      return new KeyValue(key, reference);
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
    Expression transform = (Expression) visit(ctx.templates());
    return new ChainStage(transform, nextStage);
  }

  @Override
  public Expression visitLiteralTemplates(TailspinParser.LiteralTemplatesContext ctx) {
    return visitSource(ctx.source());
  }

  @Override
  public Object visitDefinition(TailspinParser.DefinitionContext ctx) {
    String identifier = ctx.key().localIdentifier().getText();
    Value value = Value.of(visitValueProduction(ctx.valueProduction()));
    dependencyCounters.peek().define(identifier);
    return new Definition(identifier, value);
  }

  @Override
  public Value visitStringLiteral(TailspinParser.StringLiteralContext ctx) {
    return new StringLiteral(ctx.stringContent().stream()
        .map(this::visitStringContent)
        .collect(Collectors.toList()));
  }

  @Override
  public Value visitStringContent(TailspinParser.StringContentContext ctx) {
    if (ctx.STRING_TEXT() != null) {
      return new StringConstant(ctx.STRING_TEXT().getSymbol().getText().replace("''", "'").replace("$$", "$"));
    }
    return visitStringInterpolate(ctx.stringInterpolate());
  }

  @Override
  public Value visitStringInterpolate(TailspinParser.StringInterpolateContext ctx) {
    if (ctx.interpolateEvaluate() != null) {
      return visitInterpolateEvaluate(ctx.interpolateEvaluate());
    }
    if (ctx.characterCode() != null) {
      return new CodedCharacter(visitArithmeticExpression(ctx.characterCode().arithmeticExpression()));
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public Value visitInterpolateEvaluate(TailspinParser.InterpolateEvaluateContext ctx) {
    Expression interpolation;
    if (ctx.Colon() != null) {
      interpolation = visitSource(ctx.source());
    } else {
      String identifier = ctx.anyIdentifier() == null ? "" : visitAnyIdentifier(ctx.anyIdentifier());
      interpolation = createSourceReference(identifier, ctx.reference(), ctx.Message(), ctx.parameterValues());
    }
    if (ctx.transform() != null) {
      interpolation = new ChainStage(interpolation, visitTransform(ctx.transform()));
    }
    if (ctx.TemplateMatch() != null) {
      interpolation = new SendToTemplates(interpolation);
    }
    return new StringInterpolation(interpolation);
  }

  @Override
  public Value visitIntegerLiteral(TailspinParser.IntegerLiteralContext ctx) {
    if (ctx.Zero() != null) return new IntegerConstant(0);
    return visitNonZeroInteger(ctx.nonZeroInteger());
  }

  @Override
  public Value visitNonZeroInteger(TailspinParser.NonZeroIntegerContext ctx) {
    long value = Long.parseLong(ctx.PositiveInteger().getText());
    if (ctx.additiveOperator() != null && ctx.additiveOperator().getText().equals("-")) {
      value = - value;
    }
    return new IntegerConstant(value);
  }

  private final Deque<ArithmeticContextKeywordResolver> resolver = new ArrayDeque<>();

  @Override
  public Value visitArithmeticExpression(TailspinParser.ArithmeticExpressionContext ctx) {
    if (ctx.sourceReference() != null) {
      boolean isNegative = ctx.additiveOperator() != null && ctx.additiveOperator().getText().equals("-");
      return new IntegerExpression(isNegative, Value.of(visitSourceReference(ctx.sourceReference())));
    }
    if (ctx.deleteState() != null) {
      boolean isNegative = ctx.additiveOperator() != null && ctx.additiveOperator().getText().equals("-");
      return new IntegerExpression(isNegative, Value.of(visitDeleteState(ctx.deleteState())));
    }
    if (ctx.LeftParen() != null) {
      return new IntegerExpression(false, Value.of(visitValueProduction(ctx.valueProduction())));
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
        case "~/":
          return new ArithmeticOperation(left, ArithmeticOperation.Op.DivideTruncate, right);
        case "mod":
          return new ArithmeticOperation(left, ArithmeticOperation.Op.Modulo, right);
      }
    }
    if (ctx.integerLiteral() != null) {
      return (Value) visit(ctx.integerLiteral());
    }
    if (!resolver.isEmpty() && ctx.arithmeticContextKeyword() != null) {
      return new ArithmeticContextValue(ctx.arithmeticContextKeyword().getText(), resolver.peek());
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
    if (ctx.sourceReference() != null) {
      bound = Value.of(visitSourceReference(ctx.sourceReference()));
    } else if (ctx.arithmeticExpression() != null) {
      bound = visitArithmeticExpression(ctx.arithmeticExpression());
    } else if (ctx.stringLiteral() != null) {
      bound = visitStringLiteral(ctx.stringLiteral());
    } else {
      throw new UnsupportedOperationException(
          "Cannot extract comparison object at " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
    }
    return new Bound(bound, ctx.Invert() == null);
  }

  @Override
  public Bound visitUpperBound(TailspinParser.UpperBoundContext ctx) {
    Value bound;
    if (ctx.sourceReference() != null) {
      bound = Value.of(visitSourceReference(ctx.sourceReference()));
    } else if (ctx.arithmeticExpression() != null) {
      bound = visitArithmeticExpression(ctx.arithmeticExpression());
    } else if (ctx.stringLiteral() != null) {
      bound = visitStringLiteral(ctx.stringLiteral());
    } else {
      throw new UnsupportedOperationException(
          "Cannot extract comparison object at " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
    }
    return new Bound(bound, ctx.Invert() == null);
  }

  @Override
  public ArrayLiteral visitArrayLiteral(TailspinParser.ArrayLiteralContext ctx) {
    return new ArrayLiteral(ctx.valueProduction().stream()
        .map(this::visitValueProduction)
        .collect(Collectors.toList()));
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
      return visitKeyValue(ctx.keyValue());
    }
    if (ctx.sourceReference() != null) {
      return visitSourceReference(ctx.sourceReference());
    }
    return visitValueProduction(ctx.valueProduction());
  }

  @Override
  public KeyValueExpression visitKeyValue(TailspinParser.KeyValueContext ctx) {
    String key = ctx.key().localIdentifier().getText();
    return new KeyValueExpression(key, Value.of(visitValueProduction(ctx.valueProduction())));
  }

  @Override
  public Expression visitComposerDefinition(TailspinParser.ComposerDefinitionContext ctx) {
    dependencyCounters.push(new DependencyCounter());
    String name = ctx.localIdentifier(0).getText();
    if (!name.equals(ctx.localIdentifier(1).getText())) {
      throw new IllegalStateException(
          "Mismatched end " + ctx.localIdentifier(1).getText() + " for parser " + name);
    }
    ComposerDefinition composerDefinition = visitComposerBody(ctx.composerBody());
    composerDefinition.expectParameters(visitParameterDefinitions(ctx.parameterDefinitions()));
    dependencyCounters.peek().define(name);
    return new Definition(name, (it, scope) -> {
      Composer composer = composerDefinition.define(scope);
      composer.setScopeContext(name);
      return composer;
    });
  }

  @Override
  public ComposerDefinition visitComposerBody(TailspinParser.ComposerBodyContext ctx) {
    Map<String, List<CompositionSpec>> definedSequences = new HashMap<>();
    for (DefinedCompositionSequenceContext definition : ctx.definedCompositionSequence()) {
      String key = definition.key().localIdentifier().getText();
      definedSequences.put(key, visitCompositionSequence(definition.compositionSequence()));
    }
    Expression stateAssignment = ctx.stateAssignment() == null ? null : visitStateAssignment(ctx.stateAssignment());
    return new ComposerDefinition(stateAssignment, visitCompositionSequence(ctx.compositionSequence()),
        new SubComposerFactory(definedSequences));
  }

  @Override
  public List<CompositionSpec> visitCompositionSequence(CompositionSequenceContext ctx) {
    List<CompositionSpec> result = new ArrayList<>();
    if (ctx.compositionComponents() != null) {
      result.addAll(visitCompositionComponents(ctx.compositionComponents()));
    } else {
      ctx.compositionSkipRule().forEach(r -> result.add(visitCompositionSkipRule(r)));
    }
    return result;
  }

  @Override
  public List<CompositionSpec> visitCompositionComponents(TailspinParser.CompositionComponentsContext ctx) {
    List<CompositionSpec> result = new ArrayList<>();
    ctx.compositionSkipRule().forEach(s -> result.add(visitCompositionSkipRule(s)));
    result.addAll(visitCompositionComponent(ctx.compositionComponent()));
    if (ctx.compositionComponents() != null) {
      result.addAll(visitCompositionComponents(ctx.compositionComponents()));
    }
    return result;
  }

  @Override
  public List<CompositionSpec> visitCompositionComponent(TailspinParser.CompositionComponentContext ctx) {
    List<CompositionSpec> result = new ArrayList<>();
    if (ctx.compositionMatcher() != null) {
      result.add(visitCompositionMatcher(ctx.compositionMatcher()));
    }
    ctx.compositionSkipRule().forEach(s -> result.add(visitCompositionSkipRule(s)));
    return result;
  }

  @Override
  public CompositionSpec visitCompositionSkipRule(TailspinParser.CompositionSkipRuleContext ctx) {
    return new SubComposerFactory.SkipComposition(ctx.compositionCapture().stream()
        .map(this::visitCompositionCapture).collect(Collectors.toList()));
  }

  @Override
  public CompositionSpec visitCompositionCapture(TailspinParser.CompositionCaptureContext ctx) {
    CompositionSpec value = visitCompositionMatcher(ctx.compositionMatcher());
    if (ctx.key() != null) {
      String identifier = ctx.key().localIdentifier().getText();
      value = new SubComposerFactory.CaptureComposition(identifier, value);
    } else if (ctx.stateSink() != null){
      value = new SubComposerFactory.StateAssignmentComposition(value, visitStateSink(ctx.stateSink()));
    } else if (ctx.stateAssignment() != null) {
      value = new SubComposerFactory.StateAssignmentComposition(null, visitStateAssignment(ctx.stateAssignment()));
    }
    return value;
  }

  @Override
  public CompositionSpec visitCompositionMatcher(TailspinParser.CompositionMatcherContext ctx) {
    if (ctx == null) {
      return null;
    }
    CompositionSpec spec;
    if (ctx.LeftBracket() != null) {
      List<CompositionSpec> contents = new ArrayList<>();
      if (ctx.compositionSequence() != null) {
        contents.addAll(visitCompositionSequence(ctx.compositionSequence()));
      } else {
        contents.add(visitCompositionSkipRule(ctx.compositionSkipRule()));
      }
      spec = new SubComposerFactory.ArrayComposition(contents);
    } else if (ctx.LeftBrace() != null) {
      List<CompositionSpec> contents = new ArrayList<>();
      if (ctx.structureMemberMatchers() != null) {
        contents.addAll(visitStructureMemberMatchers(ctx.structureMemberMatchers()));
      } else {
        contents.add(visitCompositionSkipRule(ctx.compositionSkipRule()));
      }
      spec = new SubComposerFactory.StructureComposition(contents);
    } else if (ctx.tokenMatcher() != null) {
      spec = visitTokenMatcher(ctx.tokenMatcher());
    } else if (ctx.sourceReference() != null) {
      Expression source = visitSourceReference(ctx.sourceReference());
      spec = new SubComposerFactory.DereferenceComposition(source);
    } else if (ctx.compositionKeyValue() != null) {
      spec = visitCompositionKeyValue(ctx.compositionKeyValue());
    } else {
      throw new UnsupportedOperationException("Unknown type of composition matcher");
    }
    if (ctx.transform() != null) {
      return new SubComposerFactory.TransformComposition(spec, visitTransform(ctx.transform()));
    } else {
      return spec;
    }
  }

  @Override
  public List<CompositionSpec> visitStructureMemberMatchers(TailspinParser.StructureMemberMatchersContext ctx) {
    List<CompositionSpec> result = new ArrayList<>();
    ctx.compositionSkipRule().forEach(s -> result.add(visitCompositionSkipRule(s)));
    result.addAll(visitStructureMemberMatcher(ctx.structureMemberMatcher()));
    if (ctx.structureMemberMatchers() != null) {
      result.addAll(visitStructureMemberMatchers(ctx.structureMemberMatchers()));
    }
    return result;
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
    CompositionSpec compositionSpec = new SubComposerFactory.ChoiceComposition(ctx.compositionToken().stream()
        .map(this::visitCompositionToken).collect(Collectors.toList()));
    if (ctx.Invert() != null) {
      compositionSpec = new SubComposerFactory.InverseComposition(compositionSpec);
    }
    if (ctx.multiplier() == null) return compositionSpec;
    return new SubComposerFactory.MultiplierComposition(compositionSpec, visitMultiplier(ctx.multiplier()));
  }

  @Override
  public CompositionSpec visitCompositionToken(TailspinParser.CompositionTokenContext ctx) {
    CompositionSpec compositionSpec;
    if (ctx.localIdentifier() != null) {
      String matchRule = ctx.localIdentifier().getText();
      compositionSpec = new SubComposerFactory.NamedComposition(matchRule);
    } else if (ctx.stringLiteral() != null) {
      Value regex = visitStringLiteral(ctx.stringLiteral());
      compositionSpec = new SubComposerFactory.RegexComposition(regex);
    } else {
      throw new UnsupportedOperationException("Unknown composition spec " + ctx.getText());
    }
    return compositionSpec;
  }

  private final RangeMatch AT_MOST_ONE = new RangeMatch(
      new Bound(new IntegerConstant(0), true),
      new Bound(new IntegerConstant(1), true));
  private final RangeMatch AT_LEAST_ONE = new RangeMatch(
      new Bound(new IntegerConstant(1), true),
      null);
  private final RangeMatch ANY_AMOUNT = new RangeMatch(
      new Bound(new IntegerConstant(0), true),
      null);
  @Override
  public RangeMatch visitMultiplier(TailspinParser.MultiplierContext ctx) {
    switch (ctx.getText()) {
      case "?": return AT_MOST_ONE;
      case "+": return AT_LEAST_ONE;
      case "*": return ANY_AMOUNT;
    }
    if (ctx.Equal() == null) throw new UnsupportedOperationException("Unknown multiplier " + ctx.getText());
    Value count;
    if (ctx.PositiveInteger() != null) {
      count = new IntegerConstant(Long.parseLong(ctx.PositiveInteger().getText()));
    } else {
      count = Value.of(visitSourceReference(ctx.sourceReference()));
    }
    return new RangeMatch(new Bound(count, true), new Bound(count, true));
  }

  @Override
  public CompositionSpec visitCompositionKeyValue(TailspinParser.CompositionKeyValueContext ctx) {
    CompositionSpec key;
    if (ctx.key() != null) {
      key = new SubComposerFactory.Constant(ctx.key().localIdentifier().getText());
    } else {
      key = visitTokenMatcher(ctx.compositionKey().tokenMatcher());
    }
    List<CompositionSpec> valueMatch = new ArrayList<>();
    ctx.compositionSkipRule().forEach(s -> valueMatch.add(visitCompositionSkipRule(s)));
    valueMatch.addAll(visitCompositionComponent(ctx.compositionComponent()));
    return new SubComposerFactory.KeyValueComposition(key, valueMatch);
  }

  @Override
  public Test visitTestDefinition(TailspinParser.TestDefinitionContext ctx) {
    if (!ctx.stringLiteral(0).getText().equals(ctx.stringLiteral(1).getText())) {
      throw new AssertionError("Mismatched end " + ctx.stringLiteral(1).getText()
        + " to test " + ctx.stringLiteral(0).getText());
    }
    List<Expression> testBody = visitTestBody(ctx.testBody());
    return new Test(visitStringLiteral(ctx.stringLiteral(0)), testBody);
  }

  @Override
  public List<Expression> visitTestBody(TailspinParser.TestBodyContext ctx) {
    return ctx.testBlock().stream().flatMap(this::visitTestBlock).collect(Collectors.toList());
  }

  @Override
  public Stream<Expression> visitTestBlock(TailspinParser.TestBlockContext ctx) {
    return Stream.concat(ctx.statement().stream().map(this::visit).map(Expression.class::cast),
        ctx.assertion().stream().map(this::visitAssertion));
  }

  @Override
  public Assertion visitAssertion(TailspinParser.AssertionContext ctx) {
    return new Assertion(visitValueChain(ctx.valueChain()),
        visitMatcher(ctx.matcher()), visitStringLiteral(ctx.stringLiteral()));
  }
}
