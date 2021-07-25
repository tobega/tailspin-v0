package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import tailspin.arithmetic.ArithmeticContextValue;
import tailspin.arithmetic.ArithmeticOperation;
import tailspin.arithmetic.ArithmeticValue;
import tailspin.arithmetic.IntegerConstant;
import tailspin.arithmetic.IntegerExpression;
import tailspin.arithmetic.MeasureExpression;
import tailspin.control.ArrayTemplates;
import tailspin.control.Block;
import tailspin.control.Bound;
import tailspin.control.ChainStage;
import tailspin.control.CollectorStage;
import tailspin.control.ComposerDefinition;
import tailspin.control.DataDefinition;
import tailspin.control.Deconstructor;
import tailspin.control.Definition;
import tailspin.control.DeleteState;
import tailspin.control.Expression;
import tailspin.control.InlineTemplates;
import tailspin.control.OperatorApplication;
import tailspin.control.ProcessorDefinition;
import tailspin.control.ProcessorMessage;
import tailspin.control.RangeGenerator;
import tailspin.control.Reference;
import tailspin.control.SendToTemplates;
import tailspin.control.SinkReference;
import tailspin.control.SinkValueChain;
import tailspin.control.SourceReference;
import tailspin.control.StateAssignment;
import tailspin.control.TemplatesCall;
import tailspin.control.TemplatesDefinition;
import tailspin.control.TemplatesDefinition.TemplatesConstructor;
import tailspin.control.TemplatesReference;
import tailspin.control.TransformStage;
import tailspin.control.TypestateDefinition;
import tailspin.control.Value;
import tailspin.control.ValueChain;
import tailspin.literals.ArrayLiteral;
import tailspin.literals.ByteLiteral;
import tailspin.literals.BytesConstant;
import tailspin.literals.CartesianExpansion;
import tailspin.literals.CodedCharacter;
import tailspin.literals.KeyValueExpression;
import tailspin.literals.RelationLiteral;
import tailspin.literals.StringConstant;
import tailspin.literals.StringInterpolation;
import tailspin.literals.StringLiteral;
import tailspin.literals.StructureLiteral;
import tailspin.matchers.AlwaysFalse;
import tailspin.matchers.AnyOf;
import tailspin.matchers.ArrayMatch;
import tailspin.matchers.CollectionCriterionFactory;
import tailspin.matchers.CollectionSegmentCriterion;
import tailspin.matchers.Condition;
import tailspin.matchers.DefinedCriterion;
import tailspin.matchers.Equality;
import tailspin.matchers.MultipliedCollectionCriterionFactory;
import tailspin.matchers.OnceOnlyCollectionCriterionFactory;
import tailspin.matchers.OneElementMatch;
import tailspin.matchers.RangeMatch;
import tailspin.matchers.RegexpMatch;
import tailspin.matchers.SequenceMatch;
import tailspin.matchers.StereotypeMatch;
import tailspin.matchers.StructureMatch;
import tailspin.matchers.UnitMatch;
import tailspin.matchers.ValueMatcher;
import tailspin.matchers.composer.CompositionSpec;
import tailspin.matchers.composer.SubComposerFactory;
import tailspin.parser.TailspinParser;
import tailspin.parser.TailspinParser.ByteValueContext;
import tailspin.parser.TailspinParser.BytesLiteralContext;
import tailspin.parser.TailspinParser.CompositionSequenceContext;
import tailspin.parser.TailspinParser.DefinedCompositionSequenceContext;
import tailspin.parser.TailspinParser.DimensionReferenceContext;
import tailspin.parser.TailspinParser.InheritModuleContext;
import tailspin.parser.TailspinParser.ModuleIdentifierContext;
import tailspin.parser.TailspinParser.ModuleImportContext;
import tailspin.parser.TailspinParser.ModuleModificationContext;
import tailspin.parser.TailspinParser.ModuleShadowingContext;
import tailspin.parser.TailspinParser.OperandContext;
import tailspin.parser.TailspinParser.OperatorExpressionContext;
import tailspin.parser.TailspinParser.ProgramModificationContext;
import tailspin.parser.TailspinParser.StateSinkContext;
import tailspin.parser.TailspinParser.StereotypeMatchContext;
import tailspin.parser.TailspinParser.StructuresContext;
import tailspin.parser.TailspinParser.TermArithmeticOperationContext;
import tailspin.parser.TailspinParser.TermContext;
import tailspin.parser.TailspinParser.UseModuleContext;
import tailspin.parser.TailspinParser.ValueProductionContext;
import tailspin.parser.TailspinParserBaseVisitor;
import tailspin.testing.Assertion;
import tailspin.transform.Composer;
import tailspin.transform.ExpectedParameter;
import tailspin.transform.Lens;
import tailspin.transform.MatchTemplate;
import tailspin.transform.Operator;
import tailspin.transform.Templates;
import tailspin.transform.lens.ArrayLens;
import tailspin.transform.lens.CollectedValue;
import tailspin.transform.lens.DefinedLens;
import tailspin.transform.lens.Grouping;
import tailspin.transform.lens.KeyLens;
import tailspin.transform.lens.LensDimension;
import tailspin.transform.lens.MultiValueArrayLens;
import tailspin.transform.lens.Projection;
import tailspin.transform.lens.RangeArrayLens;
import tailspin.transform.lens.SingleValueArrayLens;
import tailspin.types.Criterion;
import tailspin.types.KeyValue;
import tailspin.types.Unit;

public class RunMain extends TailspinParserBaseVisitor<Object> {
  private final Deque<DependencyCounter> dependencyCounters;

  public RunMain() {
    dependencyCounters = new ArrayDeque<>();
    dependencyCounters.push(new DependencyCounter());
  }

  @Override
  public Program visitProgram(TailspinParser.ProgramContext ctx) {
    List<ModuleProvider> modules = ctx.useModule().stream().map(this::visitUseModule)
        .collect(Collectors.toList());
    List<IncludedFile> includedFiles = ctx.inclusion().stream()
        .map(this::visitInclusion).collect(Collectors.toList());
    List<TopLevelStatement> statements = new ArrayList<>();
    List<DefinitionStatement> definitions = new ArrayList<>();
    List<TestStatement> tests = new ArrayList<>();
    ctx.statement().forEach(s -> {
      dependencyCounters.push(new DependencyCounter());
      Expression statement = (Expression) visit(s);
      Set<String> requiredDefinitions = dependencyCounters.pop().getRequiredDefinitions();
      if (statement instanceof Test) {
        tests.add(new TestStatement((Test) statement, requiredDefinitions));
      } else if (statement instanceof Definition || statement instanceof DataDefinition) {
        definitions.add(new DefinitionStatement(statement, requiredDefinitions));
      } else {
        statements.add(new TopLevelStatement(statement, requiredDefinitions));
      }
    });
    return new Program(statements, definitions, tests, includedFiles, modules);
  }

  @Override
  public IncludedFile visitInclusion(TailspinParser.InclusionContext ctx) {
    Value dependency = visitStringLiteral(ctx.stringLiteral());
    String prefix = ctx.From() == null ? null : ctx.localIdentifier().getText() + "/";
    return new IncludedFile(prefix, dependency);
  }

  @Override
  public Expression visitValueChainToSink(TailspinParser.ValueChainToSinkContext ctx) {
    Expression valueChain = visitValueChain(ctx.valueChain());
    Expression sink = visitSink(ctx.sink());
    return new SinkValueChain(valueChain, sink);
  }

  @Override
  public Expression visitValueChain(TailspinParser.ValueChainContext ctx) {
    Expression valueChain = visitSource(ctx.source());
    if (ctx.transform() != null) {
      valueChain = new ValueChain(valueChain, visitTransform(ctx.transform()));
    }
    return valueChain;
  }

  @Override
  public Expression visitSource(TailspinParser.SourceContext ctx) {
    if (ctx.stringLiteral() != null) {
      return visitStringLiteral(ctx.stringLiteral());
    }
    if (ctx.sourceReference() != null) {
      return visitSourceReference(ctx.sourceReference());
    }
    if (ctx.arithmeticValue() != null) {
      return visitArithmeticValue(ctx.arithmeticValue());
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
    if (ctx.operatorExpression() != null) {
      return visitOperatorExpression(ctx.operatorExpression());
    }
    if (ctx.bytesLiteral() != null) {
      return visitBytesLiteral(ctx.bytesLiteral());
    }
    if (ctx.relationLiteral() != null) {
      return visitRelationLiteral(ctx.relationLiteral());
    }
    throw new UnsupportedOperationException(ctx.getText());
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
    if (ctx.DeleteMarker() != null) {
      String stateIdentifier = ctx.stateIdentifier().getText();
      Reference reference = getReference(ctx.reference(), stateIdentifier);
      return new DeleteState(reference);
    }
    String identifier = ctx.anyIdentifier() == null ? "" : visitAnyIdentifier(ctx.anyIdentifier());
    if (ctx.Reflexive() != null) identifier = "§";
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
    } else if (identifier.equals("§")) {
      reference = Reference.reflexive();
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
    if (ctx.lens() != null) {
      try {
        reference = resolveLens(ctx.lens(), reference);
      } catch (RuntimeException e) {
        throw new IllegalArgumentException("Failed array dereference: " + ctx.getText(), e);
      }
    }
    for (TailspinParser.StructureReferenceContext sdc : ctx.structureReference()) {
      reference = resolveFieldDereference(reference, sdc.FieldReference().getText().substring(1));
      if (sdc.lens() != null) {
        reference = resolveLens(sdc.lens(), reference);
      }
    }
    return reference;
  }

  private Reference resolveFieldDereference(Reference reference, String fieldIdentifier) {
    return reference.field(fieldIdentifier);
  }

  private Reference resolveLens(TailspinParser.LensContext ctx, Reference reference) {
    return reference.lens(visitLens(ctx));
  }

  @Override
  public Lens visitLens(TailspinParser.LensContext ctx) {
    List<LensDimension> dimensions = new ArrayList<>();
    for (DimensionReferenceContext dimCtx : ctx.dimensionReference()) {
      if (dimCtx.simpleDimension() != null) {
        dimensions.add(visitSimpleDimension(dimCtx.simpleDimension()));
      } else if (dimCtx.multiValueDimension() != null){
        dimensions.add(visitMultiValueDimension(dimCtx.multiValueDimension()));
      } else if (dimCtx.projection() != null) {
        dimensions.add(visitProjection(dimCtx.projection()));
      } else if (dimCtx.key() != null) {
        dimensions.add(new KeyLens(dimCtx.key().localIdentifier().getText()));
      } else if (dimCtx.localIdentifier() != null) {
        dimensions.add(new DefinedLens(dimCtx.localIdentifier().getText()));
      } else if (dimCtx.grouping() != null) {
        dimensions.add(visitGrouping(dimCtx.grouping()));
      } else {
        throw new UnsupportedOperationException("Unknown dimension reference " + ctx.getText());
      }
    }
    return new Lens(dimensions);
  }

  @Override
  public ArrayLens visitSimpleDimension(TailspinParser.SimpleDimensionContext ctx) {
      if (ctx.arithmeticValue() != null) {
        return new SingleValueArrayLens(visitArithmeticValue(ctx.arithmeticValue()));
      } else if (ctx.rangeLiteral() != null) {
        return new RangeArrayLens(visitRangeLiteral(ctx.rangeLiteral()));
      } else if (ctx.sourceReference() != null) {
        return new SingleValueArrayLens(Value.of(visitSourceReference(ctx.sourceReference())));
      } else {
        throw new UnsupportedOperationException(
            "Unknown way to dereference array at "
                + ctx.getStart().getLine()
                + ":"
                + ctx.getStart().getCharPositionInLine() + " " + ctx.getText());
      }
  }

  @Override
  public LensDimension visitMultiValueDimension(TailspinParser.MultiValueDimensionContext ctx) {
    List<ArrayLens> values = new ArrayList<>();
    for (TailspinParser.SimpleDimensionContext sctx : ctx.simpleDimension()) {
      values.add(visitSimpleDimension(sctx));
    }
    return new MultiValueArrayLens(values);
  }

  @Override
  public LensDimension visitProjection(TailspinParser.ProjectionContext ctx) {
    return new Projection(Stream.concat(ctx.keyValue().stream().map(this::visitKeyValue),
        ctx.key().stream().map(kc -> {
          String field = kc.localIdentifier().getText();
          return new KeyValueExpression(field, Reference.reflexive().field(field));
        })).collect(Collectors.toList()));
  }

  @Override
  public LensDimension visitGrouping(TailspinParser.GroupingContext ctx) {
    return new Grouping(visitSource(ctx.source()), ctx.collectedValue().stream().map(this::visitCollectedValue).collect(
        Collectors.toList()));
  }

  @Override
  public CollectedValue visitCollectedValue(TailspinParser.CollectedValueContext ctx) {
    return new CollectedValue(ctx.key().localIdentifier().getText(), visitTemplatesReference(ctx.templatesReference()));
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
    TemplatesDefinition templatesDefinition = visitTemplatesBody(name, visitLocalDataDeclaration(ctx.localDataDeclaration()), ctx.templatesBody(),
        Templates::new);
    return new InlineTemplates(templatesDefinition);
  }

  @Override
  public Set<String> visitLocalDataDeclaration(TailspinParser.LocalDataDeclarationContext ctx) {
    return ctx == null ? Set.of() : ctx.localIdentifier().stream().map(RuleContext::getText).collect(Collectors.toSet());
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
    DependencyCounter depCounter = new DependencyCounter();
    loopVariables.forEach(depCounter::define);
    dependencyCounters.push(depCounter);
    TemplatesDefinition templatesDefinition = visitTemplatesBody(name, visitLocalDataDeclaration(ctx.localDataDeclaration()), ctx.templatesBody(),
        Templates::new);
    Set<String> requiredDefinitions = dependencyCounters.pop().getRequiredDefinitions();
    dependencyCounters.peek().requireAll(requiredDefinitions);
    return new ArrayTemplates(loopVariables, templatesDefinition);
  }

  @Override
  public TemplatesDefinition visitTemplatesBody(TailspinParser.TemplatesBodyContext ctx) {
    throw new UnsupportedOperationException();
  }

  public TemplatesDefinition visitTemplatesBody(String name,
      Set<String> localDatatypes, TailspinParser.TemplatesBodyContext ctx,
      TemplatesConstructor constructor) {
    // The match templates are conceptually in the scope of the block, otherwise we could just do this in visitBlock
    dependencyCounters.push(new DependencyCounter());
    Block block = visitBlock(ctx.block());
    List<MatchTemplate> matchTemplates = new ArrayList<>();
    for (TailspinParser.MatchTemplateContext mtc : ctx.matchTemplate()) {
      dependencyCounters.push(new DependencyCounter());
      matchTemplates.add(visitMatchTemplate(mtc));
      Set<String> requiredDefinitions = dependencyCounters.pop().getRequiredDefinitions();
      dependencyCounters.peek().requireAll(requiredDefinitions);
    }
    Set<String> requiredDefinitions = dependencyCounters.pop().getRequiredDefinitions();
    dependencyCounters.peek().requireAll(requiredDefinitions);
    return new TemplatesDefinition(name, localDatatypes, block, matchTemplates, constructor);
  }

  @Override
  public MatchTemplate visitMatchTemplate(TailspinParser.MatchTemplateContext ctx) {
    if (ctx.Otherwise() != null) {
      return new MatchTemplate(new ValueMatcher(null, List.of()), visitBlock(ctx.block()));
    }
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
        ctx.condition().stream().map(this::visitCondition).collect(Collectors.toList()));
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
  public Criterion visitStereotypeMatch(StereotypeMatchContext ctx) {
    String identifier = ctx.localIdentifier() != null
        ? ctx.localIdentifier().getText() : ctx.externalIdentifier().getText();
    // We don't reference this as an identifier here, data definitions have a different namespace
    return new StereotypeMatch(identifier);
  }

  @Override
  public Criterion visitArrayMatch(TailspinParser.ArrayMatchContext ctx) {
    List<CollectionCriterionFactory> criterionFactories = ctx.arrayContentMatcher().stream()
        .map(this::visitArrayContentMatcher)
        .collect(Collectors.toList());
    Criterion lengthCriterion = null;
    if (ctx.rangeBounds() != null) {
      lengthCriterion = visitRangeBounds(ctx.rangeBounds());
    } else if (ctx.arithmeticValue() != null) {
      lengthCriterion = new Equality(visitArithmeticValue(ctx.arithmeticValue()));
    }
    return new ArrayMatch(lengthCriterion, criterionFactories, ctx.Void() != null);
  }

  @Override
  public CollectionCriterionFactory visitArrayContentMatcher(TailspinParser.ArrayContentMatcherContext ctx) {
    CollectionSegmentCriterion criterion;
    if (ctx.matcher() != null) {
      criterion = new OneElementMatch(visitMatcher(ctx.matcher()));
    } else {
      criterion = visitSequenceMatch(ctx.sequenceMatch());
    }
    if (ctx.multiplier() == null) {
      return new OnceOnlyCollectionCriterionFactory(criterion);
    }
    return new MultipliedCollectionCriterionFactory(criterion, visitMultiplier(ctx.multiplier()));
  }

  @Override
  public CollectionSegmentCriterion visitSequenceMatch(TailspinParser.SequenceMatchContext ctx) {
    return new SequenceMatch(ctx.matcher().stream().map(this::visitMatcher).collect(Collectors.toList()));
  }

  @Override
  public Criterion visitUnitMatch(TailspinParser.UnitMatchContext ctx) {
    return new UnitMatch(visitUnit(ctx.unit()));
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
  public Expression visitStateAssignment(TailspinParser.StateAssignmentContext ctx) {
    StateAssignment stateAssignment = visitStateSink(ctx.stateSink());
    if (ctx.valueChain() != null) {
      return new SinkValueChain(visitValueChain(ctx.valueChain()), stateAssignment);
    }
    return stateAssignment;
  }

  /** Ugly trick for getting the root of a state reference higher up */
  String lastAssignedStateContext;
  @Override
  public StateAssignment visitStateSink(StateSinkContext ctx) {
    lastAssignedStateContext = ctx.stateIdentifier().getText().substring(1);
    Reference reference = resolveReference(ctx.reference(), Reference.state(
        lastAssignedStateContext));
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
    // Account for definition of parameters
    dependencyCounters.push(new DependencyCounter());
    String name = ctx.localIdentifier(0).getText();
    if (!name.equals(ctx.localIdentifier(1).getText())) {
      throw new IllegalStateException(
          "Mismatched end " + ctx.localIdentifier(1).getText() + " for templates " + name);
    }
    // Parameters must be defined first so as they don't get required
    List<ExpectedParameter> expectedParameters = visitParameterDefinitions(ctx.parameterDefinitions());
    TemplatesDefinition templatesDefinition = visitTemplatesBody(name, visitLocalDataDeclaration(ctx.localDataDeclaration()), ctx.templatesBody(),
        Templates::new);
    templatesDefinition.expectParameters(expectedParameters);
    Set<String> requiredDefinitions = dependencyCounters.pop().getRequiredDefinitions();
    dependencyCounters.peek().define(name);
    dependencyCounters.peek().requireAll(requiredDefinitions);
    return new Definition(name, (it, scope) -> templatesDefinition.define(scope));
  }

  @Override
  public List<ExpectedParameter> visitParameterDefinitions(TailspinParser.ParameterDefinitionsContext ctx) {
    List<ExpectedParameter> parameters = new ArrayList<>();
    if (ctx == null) {
      return parameters;
    }
    for (TailspinParser.KeyContext key : ctx.key()) {
      String name = key.localIdentifier().getText();
      dependencyCounters.peek().define(name);
      parameters.add(new ExpectedParameter(name));
    }
    return parameters;
  }

  @Override
  public Expression visitOperatorDefinition(TailspinParser.OperatorDefinitionContext ctx) {
    // Account for definition of parameters
    dependencyCounters.push(new DependencyCounter());
    String name = ctx.localIdentifier(1).getText();
    if (!name.equals(ctx.localIdentifier(3).getText())) {
      throw new IllegalStateException(
          "Mismatched end " + ctx.localIdentifier(1).getText() + " for templates " + name);
    }
    // Parameters must be defined first so as they don't get required
    List<ExpectedParameter> expectedParameters = visitParameterDefinitions(ctx.parameterDefinitions());
    String left = ctx.localIdentifier(0).getText();
    dependencyCounters.peek().define(left);
    expectedParameters.add(new ExpectedParameter(left));
    String right = ctx.localIdentifier(2).getText();
    dependencyCounters.peek().define(right);
    expectedParameters.add(new ExpectedParameter(right));
    TemplatesDefinition templatesDefinition = visitTemplatesBody(name, visitLocalDataDeclaration(ctx.localDataDeclaration()),
        ctx.templatesBody(), new TemplatesConstructor() {
          @Override
          public Templates create(String name, Scope definingScope, Set<String> localDatatypes, Block block,
              List<MatchTemplate> matchTemplates) {
            return new Operator(name, definingScope, localDatatypes, block, matchTemplates, new String[]{left, right});
          }
        });
    templatesDefinition.expectParameters(expectedParameters);
    Set<String> requiredDefinitions = dependencyCounters.pop().getRequiredDefinitions();
    dependencyCounters.peek().define(name);
    dependencyCounters.peek().requireAll(requiredDefinitions);
    return new Definition(name, (it, scope) -> templatesDefinition.define(scope));
  }

  @Override
  public Expression visitProcessorDefinition(TailspinParser.ProcessorDefinitionContext ctx) {
    dependencyCounters.push(new DependencyCounter());
    String name = ctx.localIdentifier(0).getText();
    if (!name.equals(ctx.localIdentifier(1).getText())) {
      throw new IllegalStateException(
          "Mismatched end " + ctx.localIdentifier(1).getText() + " for processor " + name);
    }
    // Parameters must be defined first so as they don't get required
    List<ExpectedParameter> expectedParameters = visitParameterDefinitions(ctx.parameterDefinitions());
    // Then block, so those definitions may be used in typestates
    Block rootBlock = visitBlock(ctx.block());
    List<TypestateDefinition> typestates = ctx.typestateDefinition().stream().map(this::visitTypestateDefinition).toList();
    ProcessorDefinition processorDefinition = new ProcessorDefinition(name, visitLocalDataDeclaration(ctx.localDataDeclaration()),
        rootBlock, expectedParameters, typestates);
    Set<String> requiredDefinitions = dependencyCounters.pop().getRequiredDefinitions();
    dependencyCounters.peek().define(name);
    dependencyCounters.peek().requireAll(requiredDefinitions);
    return new Definition(name, (it, scope) -> processorDefinition.define(scope));
  }

  @Override
  public TypestateDefinition visitTypestateDefinition(TailspinParser.TypestateDefinitionContext ctx) {
    dependencyCounters.push(new DependencyCounter());
    String name = ctx.localIdentifier(0).getText();
    if (!name.equals(ctx.localIdentifier(1).getText())) {
      throw new IllegalStateException(
          "Mismatched end " + ctx.localIdentifier(1).getText() + " for state " + name);
    }
    TypestateDefinition typestateDefinition = new TypestateDefinition(name,
        new Block(ctx.messageDefinition().stream().map(this::visit).map(Expression.class::cast).toList()));
    Set<String> requiredDefinitions = dependencyCounters.pop().getRequiredDefinitions();
    dependencyCounters.peek().define(name);
    dependencyCounters.peek().requireAll(requiredDefinitions);
    return typestateDefinition;
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
    if (ctx.lens() != null) {
      return new KeyValue(key, visitLens(ctx.lens()));
    }
    if (ctx.Colon() != null) {
      return new KeyValue(key, new Lens(List.of()));
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
      return new TransformStage(Deconstructor.INSTANCE, nextStage);
    }
    if (ctx.collectorChain() != null) {
      return new CollectorStage(visitTemplatesReference(ctx.collectorChain().templatesReference()), nextStage);
    }
    Expression transform = (Expression) visit(ctx.templates());
    return new TransformStage(transform, nextStage);
  }

  @Override
  public Expression visitLiteralTemplates(TailspinParser.LiteralTemplatesContext ctx) {
    return visitSource(ctx.source());
  }

  @Override
  public DataDefinition visitDataDefinition(TailspinParser.DataDefinitionContext ctx) {
    String identifier = ctx.localIdentifier().getText();
    AnyOf matcher = visitMatcher(ctx.matcher());
    dependencyCounters.peek().define(identifier);
    return new DataDefinition(identifier, (it,scope) -> new DefinedCriterion(matcher, scope));
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
      return new CodedCharacter(visitArithmeticValue(ctx.characterCode().arithmeticValue()));
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
      interpolation = new ValueChain(interpolation, visitTransform(ctx.transform()));
    }
    if (ctx.TemplateMatch() != null) {
      interpolation = new SendToTemplates(interpolation);
    }
    return new StringInterpolation(interpolation);
  }

  @Override
  public Value visitIntegerLiteral(TailspinParser.IntegerLiteralContext ctx) {
    long value = ctx.Zero() != null ? 0 : visitNonZeroInteger(ctx.nonZeroInteger());
    return new IntegerConstant(value, visitUnit(ctx.unit()));
  }

  @Override
  public Unit visitUnit(TailspinParser.UnitContext ctx) {
    if (ctx == null) return null;
    if (ctx.Scalar() != null) return Unit.SCALAR;
    return Unit.validate(visitMeasureProduct(ctx.measureProduct())
        + (ctx.measureDenominator() == null ? ""
        : "/" + visitMeasureProduct(ctx.measureDenominator().measureProduct())));
  }

  @Override
  public String visitMeasureProduct(TailspinParser.MeasureProductContext measureProduct) {
    return measureProduct.localIdentifier().stream()
        .map(RuleContext::getText)
        .collect(Collectors.joining(" "));
  }

  @Override
  public Long visitNonZeroInteger(TailspinParser.NonZeroIntegerContext ctx) {
    long value = Long.parseLong(ctx.PositiveInteger().getText());
    if (ctx.additiveOperator() != null && ctx.additiveOperator().getText().equals("-")) {
      value = - value;
    }
    return value;
  }

  @Override
  public Value visitArithmeticValue(TailspinParser.ArithmeticValueContext ctx) {
    return new ArithmeticValue(visitArithmeticExpression(ctx.arithmeticExpression()));
  }

  @Override
  public Value visitArithmeticExpression(TailspinParser.ArithmeticExpressionContext ctx) {
    if (ctx.sourceReference() != null) {
      boolean isNegative = ctx.additiveOperator() != null && ctx.additiveOperator().getText().equals("-");
      return new IntegerExpression(isNegative, Value.of(visitSourceReference(ctx.sourceReference())));
    }
    if (ctx.LeftParen() != null) {
      Value value = visitArithmeticExpression(ctx.arithmeticExpression(0));
      if (ctx.unit() != null) {
        return new MeasureExpression(value, visitUnit(ctx.unit()));
      }
      return value;
    }
    if (ctx.term() != null && ctx.unit() != null) {
      return new MeasureExpression(visitTerm(ctx.term()), visitUnit(ctx.unit()));
    }
    if (ctx.additiveOperator() != null) {
      Value left = visitArithmeticExpression(ctx.arithmeticExpression(0));
      Value right = ctx.term() == null ? visitArithmeticExpression(ctx.arithmeticExpression(1))
          : visitTerm(ctx.term());
      String operation = ctx.additiveOperator().getText();
      return newArithmeticOperation(left, right, operation);
    }
    if (ctx.multiplicativeOperator() != null) {
      Value left = visitArithmeticExpression(ctx.arithmeticExpression(0));
      Value right = ctx.term() == null ? visitArithmeticExpression(ctx.arithmeticExpression(1))
          : visitTerm(ctx.term());
      String operation = ctx.multiplicativeOperator().getText();
      return newArithmeticOperation(left, right, operation);
    }
    if (ctx.integerLiteral() != null) {
      return visitIntegerLiteral(ctx.integerLiteral());
    }
    if (ctx.arithmeticContextKeyword() != null) {
      return new ArithmeticContextValue(ctx.arithmeticContextKeyword().getText());
    }
    if (ctx.termArithmeticOperation() != null) {
      return visitTermArithmeticOperation(ctx.termArithmeticOperation());
    }
    throw new UnsupportedOperationException();
  }

  ArithmeticOperation newArithmeticOperation(Value left, Value right, String operation) {
    switch (operation) {
      case "+":
        return new ArithmeticOperation(left, ArithmeticOperation.Op.Add, right);
      case "-":
        return new ArithmeticOperation(left, ArithmeticOperation.Op.Subtract, right);
      case "*":
        return new ArithmeticOperation(left, ArithmeticOperation.Op.Multiply, right);
      case "~/":
        return new ArithmeticOperation(left, ArithmeticOperation.Op.DivideTruncate, right);
      case "mod":
        return new ArithmeticOperation(left, ArithmeticOperation.Op.Modulo, right);
    }
    throw new UnsupportedOperationException("Unknown arithmetic operator '" + operation + "'");
  }

  @Override
  public Value visitTermArithmeticOperation(TermArithmeticOperationContext ctx) {
    if (ctx.additiveOperator() != null) {
      Value left = visitTerm(ctx.term(0));
      Value right = ctx.arithmeticExpression() != null ? visitArithmeticExpression(ctx.arithmeticExpression())
          : visitTerm(ctx.term(1));
      String operation = ctx.additiveOperator().getText();
      return newArithmeticOperation(left, right, operation);
    }
    if (ctx.multiplicativeOperator() != null) {
      Value left = visitTerm(ctx.term(0));
      Value right = ctx.arithmeticExpression() != null ? visitArithmeticExpression(ctx.arithmeticExpression())
          : visitTerm(ctx.term(1));
      String operation = ctx.multiplicativeOperator().getText();
      return newArithmeticOperation(left, right, operation);
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public Value visitTerm(TermContext ctx) {
    if (ctx.valueProduction() != null) {
      return Value.of(visitValueProduction(ctx.valueProduction()));
    }
    if (ctx.operatorExpression() != null) {
      return Value.of(visitOperatorExpression(ctx.operatorExpression()));
    }
    throw new IllegalArgumentException("Unknown term type");
  }

  @Override
  public Expression visitOperatorExpression(OperatorExpressionContext ctx) {
    Value left = visitOperand(ctx.operand(0));
    Value right = visitOperand(ctx.operand(1));
    Reference operator = visitTemplatesReference(ctx.templatesReference());
    return new OperatorApplication(left, operator, right);
  }

  @Override
  public Value visitOperand(OperandContext ctx) {
    if (ctx.term() != null) {
      return visitTerm(ctx.term());
    }
    if (ctx.source() != null) {
      return Value.of(visitSource(ctx.source()));
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public RangeGenerator visitRangeLiteral(TailspinParser.RangeLiteralContext ctx) {
    Bound lowerBound = ctx.lowerBound() != null ? visitLowerBound(ctx.lowerBound()) : null;
    Bound upperBound = ctx.upperBound() != null ? visitUpperBound(ctx.upperBound()) : null;
    Value increment =
        ctx.arithmeticValue() == null ? null : visitArithmeticValue(ctx.arithmeticValue());
    return new RangeGenerator(lowerBound, upperBound, increment);
  }

  @Override
  public Bound visitLowerBound(TailspinParser.LowerBoundContext ctx) {
    Value bound;
    if (ctx.sourceReference() != null) {
      bound = Value.of(visitSourceReference(ctx.sourceReference()));
    } else if (ctx.arithmeticValue() != null) {
      bound = visitArithmeticValue(ctx.arithmeticValue());
    } else if (ctx.stringLiteral() != null) {
      bound = visitStringLiteral(ctx.stringLiteral());
    } else if (ctx.term() != null) {
      bound = visitTerm(ctx.term());
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
    } else if (ctx.arithmeticValue() != null) {
      bound = visitArithmeticValue(ctx.arithmeticValue());
    } else if (ctx.stringLiteral() != null) {
      bound = visitStringLiteral(ctx.stringLiteral());
    } else if (ctx.term() != null) {
      bound = visitTerm(ctx.term());
    } else {
      throw new UnsupportedOperationException(
          "Cannot extract comparison object at " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
    }
    return new Bound(bound, ctx.Invert() == null);
  }

  @Override
  public ArrayLiteral visitArrayLiteral(TailspinParser.ArrayLiteralContext ctx) {
    return new ArrayLiteral(ctx.arrayExpansion().stream()
        .map(this::visitArrayExpansion)
        .collect(Collectors.toList()));
  }

  @Override
  public CartesianExpansion visitArrayExpansion(TailspinParser.ArrayExpansionContext ctx) {
    return new CartesianExpansion(ctx.By() != null, visitValueProduction(ctx.valueProduction()));
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
    return new StructureLiteral(ctx.structureExpansion().stream().map(this::visitStructureExpansion).collect(Collectors.toList()));
  }

  @Override
  public RelationLiteral visitRelationLiteral(TailspinParser.RelationLiteralContext ctx) {
    return new RelationLiteral(ctx.structures().stream().map(this::visitStructures).collect(Collectors.toList()));
  }

  @Override
  public Expression visitStructures(StructuresContext ctx) {
    if (ctx.structureLiteral() != null) {
      return visitStructureLiteral(ctx.structureLiteral());
    }
    return visitValueProduction(ctx.valueProduction());
  }

  @Override
  public CartesianExpansion visitStructureExpansion(TailspinParser.StructureExpansionContext ctx) {
    Expression expression;
    if (ctx.keyValue() != null) {
      expression = visitKeyValue(ctx.keyValue());
    } else if (ctx.valueProduction() != null) {
      expression = visitValueProduction(ctx.valueProduction());
    } else {
      throw new UnsupportedOperationException("Unknown structure expansion " + ctx);
    }
    return new CartesianExpansion(ctx.By() != null, expression);
  }

  @Override
  public KeyValueExpression visitKeyValue(TailspinParser.KeyValueContext ctx) {
    String key = ctx.key().localIdentifier().getText();
    return new KeyValueExpression(key, Value.of(visitValueProduction(ctx.valueProduction())));
  }

  @Override
  public Value visitBytesLiteral(BytesLiteralContext ctx) {
    return new ByteLiteral(
        ctx.byteValue().stream().map(this::visitByteValue).collect(Collectors.toList()));
  }

  @Override
  public Expression visitByteValue(ByteValueContext ctx) {
    if (ctx.Bytes() != null) {
      String hex = ctx.Bytes().getText();
      byte[] bytes = new byte[hex.length()/2];
      for (int i = 0; i < hex.length(); i += 2) {
        bytes[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
            + Character.digit(hex.charAt(i+1), 16));
      }
      return new BytesConstant(bytes);
    }
    if (ctx.LeftParen() != null) {
      return visitValueProduction(ctx.valueProduction());
    }
    if (ctx.operatorExpression() != null) {
      return visitOperatorExpression(ctx.operatorExpression());
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public Expression visitComposerDefinition(TailspinParser.ComposerDefinitionContext ctx) {
    dependencyCounters.push(new DependencyCounter());
    String name = ctx.localIdentifier(0).getText();
    if (!name.equals(ctx.localIdentifier(1).getText())) {
      throw new IllegalStateException(
          "Mismatched end " + ctx.localIdentifier(1).getText() + " for parser " + name);
    }
    // Parameters must be defined first so as they don't get required
    List<ExpectedParameter> expectedParameters = visitParameterDefinitions(ctx.parameterDefinitions());
    Set<String> localDatatypes = visitLocalDataDeclaration(ctx.localDataDeclaration());
    ComposerDefinition composerDefinition = visitComposerBody(ctx.composerBody());
    composerDefinition.expectParameters(expectedParameters);
    Set<String> requiredDefinitions = dependencyCounters.pop().getRequiredDefinitions();
    dependencyCounters.peek().define(name);
    dependencyCounters.peek().requireAll(requiredDefinitions);
    return new Definition(name, (it, scope) -> {
      Composer composer = composerDefinition.define(scope, localDatatypes);
      composer.setScopeContext(name);
      return composer;
    });
  }

  @Override
  public ComposerDefinition visitComposerBody(TailspinParser.ComposerBodyContext ctx) {
    List<CompositionSpec> mainComposition = visitCompositionSequence(ctx.compositionSequence());
    Map<String, List<CompositionSpec>> definedSequences = new HashMap<>();
    for (DefinedCompositionSequenceContext definition : ctx.definedCompositionSequence()) {
      String key = definition.key().localIdentifier().getText();
      definedSequences.put(key, visitCompositionSequence(definition.compositionSequence()));
    }
    Expression stateAssignment = ctx.stateAssignment() == null ? null : visitStateAssignment(ctx.stateAssignment());
    return new ComposerDefinition(stateAssignment,
        mainComposition,
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
      CompositionSpec matcher = visitCompositionMatcher(ctx.compositionMatcher());
      if (ctx.transform() != null) {
        matcher = new SubComposerFactory.TransformComposition(matcher, visitTransform(ctx.transform()));
      }
      result.add(matcher);
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
    if (ctx.transform() != null) {
      value = new SubComposerFactory.TransformComposition(value, visitTransform(ctx.transform()));
    }
    if (ctx.key() != null) {
      String identifier = ctx.key().localIdentifier().getText();
      dependencyCounters.peek().define(identifier);
      value = new SubComposerFactory.CaptureComposition(identifier, value);
    } else if (ctx.stateSink() != null){
      StateAssignment stateAssignment = visitStateSink(ctx.stateSink());
      value = new SubComposerFactory.StateAssignmentComposition(value,
          stateAssignment, lastAssignedStateContext);
    } else if (ctx.stateAssignment() != null) {
      Expression stateAssignment = visitStateAssignment(ctx.stateAssignment());
      value = new SubComposerFactory.StateAssignmentComposition(null,
          stateAssignment, lastAssignedStateContext);
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
    } else if (ctx.source() != null) {
      Expression source = visitSource(ctx.source());
      spec = new SubComposerFactory.DereferenceComposition(source);
    } else if (ctx.compositionKeyValue() != null) {
      spec = visitCompositionKeyValue(ctx.compositionKeyValue());
    } else {
      throw new UnsupportedOperationException("Unknown type of composition matcher");
    }
    return spec;
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
    } else if (ctx.literalComposition() != null) {
      Expression expression = (Expression) visit(ctx.literalComposition());
      Value literal = (expression instanceof Value) ? (Value) expression : Value.of(expression) ;
      compositionSpec = new SubComposerFactory.LiteralComposition(literal);
    } else {
      throw new UnsupportedOperationException("Unknown composition spec " + ctx.getText());
    }
    return compositionSpec;
  }

  private final RangeMatch AT_MOST_ONE = new RangeMatch(
      new Bound(new IntegerConstant(0, null), true),
      new Bound(new IntegerConstant(1, null), true));
  private final RangeMatch AT_LEAST_ONE = new RangeMatch(
      new Bound(new IntegerConstant(1, null), true),
      null);
  private final RangeMatch ANY_AMOUNT = new RangeMatch(
      new Bound(new IntegerConstant(0, null), true),
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
      count = new IntegerConstant(Long.parseLong(ctx.PositiveInteger().getText()), null);
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
    ProgramModification programModification
        = Optional.ofNullable(ctx.programModification()).map(this::visitProgramModification)
        .orElse(new ProgramModification(List.of()));
    List<ModuleProvider> dependencies = ctx.useModule().stream().map(this::visit)
        .map(ModuleProvider.class::cast).collect(Collectors.toList());
    List<Expression> testBody = visitTestBody(ctx.testBody());
    return new Test(visitStringLiteral(ctx.stringLiteral(0)), dependencies, testBody, programModification);
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

  @Override
  public ProgramModification visitProgramModification(ProgramModificationContext ctx) {
    return new ProgramModification(ctx.statement().stream().map(s -> {
      dependencyCounters.push(new DependencyCounter());
      Expression statement = (Expression) visit(s);
      Set<String> requiredDefinitions = dependencyCounters.pop().getRequiredDefinitions();
      if (statement instanceof Definition) {
        return new DefinitionStatement(statement, requiredDefinitions);
      } else {
        throw new UnsupportedOperationException("Only definitions are relevant in program modification");
      }
    }).collect(Collectors.toList()));
  }

  @Override
  public List<ModuleProvider> visitDependencyProvision(TailspinParser.DependencyProvisionContext ctx) {
    if (ctx == null) return List.of();
    return ctx.moduleConfiguration().stream().map(this::visit).map(ModuleProvider.class::cast)
        .collect(Collectors.toList());
  }

  @Override
  public ModuleProvider visitUseModule(UseModuleContext ctx) {
    return (ModuleProvider) visit(ctx.moduleConfiguration());
  }

  @Override
  public ModuleProvider visitModuleShadowing(ModuleShadowingContext ctx) {
    List<DefinitionStatement> statements = new ArrayList<>();
    ctx.statement().forEach(s -> {
      dependencyCounters.push(new DependencyCounter());
      Definition statement = (Definition) visit(s);
      Set<String> requiredDefinitions = dependencyCounters.pop().getRequiredDefinitions();
      statements.add(new DefinitionStatement(statement, requiredDefinitions));
    });
    String prefix = visitModuleIdentifier(ctx.moduleIdentifier(0));
    String inheritedModulePrefix = ctx.From() == null ? prefix : visitModuleIdentifier(ctx.moduleIdentifier(1));
    List<ModuleProvider> providedDependencies = visitDependencyProvision(ctx.dependencyProvision());
    return new ModuleShadowing(prefix, inheritedModulePrefix, statements, providedDependencies);
  }

  @Override
  public Object visitModuleModification(ModuleModificationContext ctx) {
    Value includePath = visitStringLiteral(ctx.stringLiteral(0));
    List<DefinitionStatement> statements = new ArrayList<>();
    ctx.statement().forEach(s -> {
      dependencyCounters.push(new DependencyCounter());
      Definition statement = (Definition) visit(s);
      Set<String> requiredDefinitions = dependencyCounters.pop().getRequiredDefinitions();
      statements.add(new DefinitionStatement(statement, requiredDefinitions));
    });
    String prefix = visitModuleIdentifier(ctx.moduleIdentifier());
    List<ModuleProvider> providedDependencies = visitDependencyProvision(ctx.dependencyProvision());
    return new ModuleModifier(prefix, statements, includePath, providedDependencies);
  }

  @Override
  public String visitModuleIdentifier(ModuleIdentifierContext ctx) {
    if (ctx == null) return null;
    if (ctx.CoreSystem() != null) return "";
    return ctx.localIdentifier().getText() + "/";
  }

  @Override
  public ModuleProvider visitModuleImport(ModuleImportContext ctx) {
    Value includePath = visitStringLiteral(ctx.stringLiteral());
    String prefix = visitModuleIdentifier(ctx.moduleIdentifier());
    List<ModuleProvider> providedDependencies = visitDependencyProvision(ctx.dependencyProvision());
    return new ModuleImport(prefix, includePath, providedDependencies);
  }

  @Override
  public ModuleProvider visitInheritModule(InheritModuleContext ctx) {
    String prefix = visitModuleIdentifier(ctx.moduleIdentifier(0));
    String inheritedModulePrefix = ctx.From() == null ? prefix : visitModuleIdentifier(ctx.moduleIdentifier(1));
    return new ModuleInheritance(prefix, inheritedModulePrefix);
  }
}
