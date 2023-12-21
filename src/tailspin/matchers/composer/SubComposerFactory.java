package tailspin.matchers.composer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import tailspin.control.ChainStage;
import tailspin.control.Expression;
import tailspin.control.Value;
import tailspin.interpreter.Scope;
import tailspin.matchers.RangeMatch;
import tailspin.types.Bytes;
import tailspin.types.Unit;

public class SubComposerFactory {

  static final HashMap<String, Pattern> namedPatterns = new HashMap<>();
  static final HashMap<String, Function<? super String, Object>> namedValueCreators = new HashMap<>();
  final Map<String, List<CompositionSpec>> definedSequences;

  static {
    namedPatterns.put("INT", Pattern.compile("[+-]?(0|[1-9][0-9]*)"));
    namedValueCreators.put("INT", Long::valueOf);
    namedPatterns.put("WS", Pattern.compile("\\s+"));
    namedValueCreators.put("WS", Function.identity());
    namedPatterns.put("HEX", Pattern.compile(("[0-9a-fA-F]+")));
    namedValueCreators.put("HEX", Bytes::fromString);
  }

  public SubComposerFactory(Map<String, List<CompositionSpec>> definedSequences) {
    this.definedSequences = definedSequences;
  }

  public SubComposer resolveSpec(CompositionSpec spec, Scope scope) {
    if (spec instanceof NamedComposition namedSpec) {
      String name = namedSpec.namedPattern;
      if (definedSequences.containsKey(name)) {
        return new RuleSubComposer(name, definedSequences.get(name), scope, this::resolveSpec);
      }
      if (!namedPatterns.containsKey(name)) {
        throw new IllegalArgumentException("Unknown composition rule " + name);
      }
      return new RegexpSubComposer(namedPatterns.get(name), namedValueCreators.get(name));
    }
    if (spec instanceof RegexComposition regexSpec) {
      // Note that we do not allow regex interpolations to reference $. What would that even mean?
      return new RegexpSubComposer(
          Pattern.compile((String) regexSpec.pattern.getResults(null, scope)), Function.identity());
    }
    if (spec instanceof SkipComposition) {
      return new SkipSubComposer(new SequenceSubComposer(((SkipComposition) spec).skipSpecs, scope, this::resolveSpec));
    }
    if (spec instanceof ChoiceComposition choiceSpec) {
      return new ChoiceSubComposer(resolveSpecs(choiceSpec.choices, scope));
    }
    if (spec instanceof ArrayComposition arraySpec) {
      return new ArraySubComposer(
          new SequenceSubComposer(arraySpec.itemSpecs, scope, this::resolveSpec), arraySpec.offset, scope);
    }
    if (spec instanceof StructureComposition structureSpec) {
      return new StructureSubComposer(
          new SequenceSubComposer(structureSpec.contents, scope, this::resolveSpec));
    }
    if (spec instanceof KeyValueComposition keyValueSpec) {
      return new KeyValueSubComposer(resolveSpec(keyValueSpec.key, scope),
          new SequenceSubComposer(keyValueSpec.valueMatch, scope, this::resolveSpec), scope);
    }
    if (spec instanceof MultiplierComposition) {
      return new MultiplierSubComposer(
          ((MultiplierComposition) spec).compositionSpec,
          ((MultiplierComposition) spec).multiplier, scope, this::resolveSpec);
    }
    if (spec instanceof DereferenceComposition) {
      return new DereferenceSubComposer(((DereferenceComposition) spec).source, scope);
    }
    if (spec instanceof CaptureComposition captureComposition) {
      return new CaptureSubComposer(captureComposition.identifier, scope,
          resolveSpec(captureComposition.compositionSpec, scope));
    }
    if (spec instanceof Constant) {
      return new ConstantSubComposer(((Constant) spec).value);
    }
    if (spec instanceof InverseComposition) {
      return new InvertSubComposer(
          resolveSpec(((InverseComposition) spec).compositionSpec, scope));
    }
    if (spec instanceof TransformComposition transformSpec) {
      return new TransformSubComposer(resolveSpec(transformSpec.compositionSpec, scope),
          transformSpec.transform, scope);
    }
    if (spec instanceof StateAssignmentComposition stateSpec) {
      SubComposer value = stateSpec.value == null ? null : resolveSpec(stateSpec.value, scope);
      return new StateAssignmentSubComposer(value, stateSpec.stateAssignment,
          stateSpec.stateContext, scope);
    }
    if (spec instanceof LiteralComposition lc) {
      return new LiteralSubComposer((String) lc.literal.getResults(null, scope));
    }
    if (spec instanceof MeasureComposition mc) {
      return new MeasureSubComposer(resolveSpec(mc.compositionSpec, scope), mc.unit);
    }
    if (spec instanceof TagComposition tc) {
      return new TagSubComposer(scope, tc.tag, resolveSpec(tc.compositionSpec, scope));
    }
    throw new UnsupportedOperationException(
        "Unknown composition spec " + spec.getClass().getSimpleName());
  }

  List<SubComposer> resolveSpecs(List<CompositionSpec> specs, Scope scope) {
    return specs.stream().map(spec -> resolveSpec(spec, scope)).collect(
        Collectors.toList());
  }

  public static class NamedComposition implements CompositionSpec {

    private final String namedPattern;

    public NamedComposition(String namedPattern) {
      this.namedPattern = namedPattern;
    }
  }

  public static class RegexComposition implements CompositionSpec {

    private final Value pattern;

    public RegexComposition(Value pattern) {
      this.pattern = pattern;
    }
  }

  public static class SkipComposition implements CompositionSpec {

    private final List<CompositionSpec> skipSpecs;

    public SkipComposition(List<CompositionSpec> skipSpecs) {
      this.skipSpecs = skipSpecs;
    }
  }

  public static class ArrayComposition implements CompositionSpec {

    private final List<CompositionSpec> itemSpecs;
    private final Value offset;

    public ArrayComposition(List<CompositionSpec> itemSpecs, Value offset) {
      this.itemSpecs = itemSpecs;
      this.offset = offset;
    }
  }

  public static class StructureComposition implements CompositionSpec {

    private final List<CompositionSpec> contents;

    public StructureComposition(List<CompositionSpec> contents) {
      this.contents = contents;
    }
  }

  public static class KeyValueComposition implements CompositionSpec {

    private final CompositionSpec key;
    private final List<CompositionSpec> valueMatch;

    public KeyValueComposition(CompositionSpec key, List<CompositionSpec> valueMatch) {
      this.key = key;
      this.valueMatch = valueMatch;
    }
  }

  public static class Constant implements CompositionSpec {

    private final String value;

    public Constant(String value) {
      this.value = value;
    }
  }

  public static class DereferenceComposition implements CompositionSpec {

    private final Expression source;

    public DereferenceComposition(Expression source) {
      this.source = source;
    }
  }

  public static class CaptureComposition implements CompositionSpec {

    private final String identifier;
    private final CompositionSpec compositionSpec;

    public CaptureComposition(String identifier, CompositionSpec compositionSpec) {
      this.identifier = identifier;
      this.compositionSpec = compositionSpec;
    }
  }

  public static class MultiplierComposition implements CompositionSpec {

    private final CompositionSpec compositionSpec;
    private final RangeMatch multiplier;

    public MultiplierComposition(CompositionSpec compositionSpec, RangeMatch multiplier) {
      this.compositionSpec = compositionSpec;
      this.multiplier = multiplier;
    }
  }

  public static class ChoiceComposition implements CompositionSpec {

    private final List<CompositionSpec> choices;

    public ChoiceComposition(List<CompositionSpec> choices) {
      this.choices = choices;
    }
  }

  public static class TransformComposition implements CompositionSpec {

    private final CompositionSpec compositionSpec;
    private final ChainStage transform;

    public TransformComposition(CompositionSpec compositionSpec, ChainStage transform) {
      this.compositionSpec = compositionSpec;
      this.transform = transform;
    }
  }

  public static class InverseComposition implements CompositionSpec {

    private final CompositionSpec compositionSpec;

    public InverseComposition(CompositionSpec compositionSpec) {
      this.compositionSpec = compositionSpec;
    }
  }

  public static class StateAssignmentComposition implements CompositionSpec {

    private final CompositionSpec value;
    private final Expression stateAssignment;
    public String stateContext;

    public StateAssignmentComposition(/* @Nullable */ CompositionSpec value, Expression stateAssignment,
        String stateContext) {
      this.value = value;
      this.stateAssignment = stateAssignment;
      this.stateContext = stateContext;
    }
  }

  public static class LiteralComposition implements CompositionSpec {

    private final Value literal;

    public LiteralComposition(Value literal) {
      this.literal = literal;
    }
  }

  public static class MeasureComposition implements CompositionSpec {

    private final CompositionSpec compositionSpec;
    private final Unit unit;

    public MeasureComposition(CompositionSpec compositionSpec, Unit unit) {
      this.compositionSpec = compositionSpec;
      this.unit = unit;
    }
  }

  public static class TagComposition implements CompositionSpec {

    private final String tag;
    private final CompositionSpec compositionSpec;

    public TagComposition(String tag, CompositionSpec compositionSpec) {
      this.tag = tag;
      this.compositionSpec = compositionSpec;
    }
  }
}