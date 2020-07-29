package tailspin.matchers.composer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import tailspin.control.Expression;
import tailspin.control.Value;
import tailspin.interpreter.NestedScope;
import tailspin.interpreter.Scope;
import tailspin.matchers.RangeMatch;

public class SubComposerFactory {

  static final HashMap<String, Pattern> namedPatterns = new HashMap<>();
  static final HashMap<String, Function<? super String, Object>> namedValueCreators = new HashMap<>();
  final Map<String, List<CompositionSpec>> definedSequences;

  static {
    namedPatterns.put("INT", Pattern.compile("[+-]?(0|[1-9][0-9]*)"));
    namedValueCreators.put("INT", Long::valueOf);
    namedPatterns.put("WS", Pattern.compile("\\s+"));
    namedValueCreators.put("WS", Function.identity());
  }

  public SubComposerFactory(Map<String, List<CompositionSpec>> definedSequences) {
    this.definedSequences = definedSequences;
  }

  public SubComposer resolveSpec(CompositionSpec spec, Scope scope) {
    if (spec instanceof NamedComposition) {
      NamedComposition namedSpec = (NamedComposition) spec;
      String name = namedSpec.namedPattern;
      if (definedSequences.containsKey(name)) {
        return new ScopedSequenceSubComposer(definedSequences.get(name), scope);
      }
      if (!namedPatterns.containsKey(name)) {
        throw new IllegalArgumentException("Unknown composition rule " + name);
      }
      return new RegexpSubComposer(namedPatterns.get(name), namedValueCreators.get(name));
    }
    if (spec instanceof RegexComposition) {
      RegexComposition regexSpec = (RegexComposition) spec;
      // Note that we do not allow regex interpolations to reference $. What would that even mean?
      return new RegexpSubComposer(
          Pattern.compile((String) regexSpec.pattern.getResults(null, scope)), Function.identity());
    }
    if (spec instanceof SkipComposition) {
      return new SkipSubComposer(resolveSpecs(((SkipComposition) spec).skipSpecs, scope));
    }
    if (spec instanceof ChoiceComposition) {
      ChoiceComposition choiceSpec = (ChoiceComposition) spec;
      return new ChoiceSubComposer(resolveSpecs(choiceSpec.choices, scope));
    }
    if (spec instanceof ArrayComposition) {
      ArrayComposition arraySpec = (ArrayComposition) spec;
      return new ArraySubComposer(
          new SequenceSubComposer(arraySpec.itemSpecs, scope, this::resolveSpec));
    }
    if (spec instanceof StructureComposition) {
      StructureComposition structureSpec = (StructureComposition) spec;
      return new StructureSubComposer(
          new SequenceSubComposer(structureSpec.contents, scope, this::resolveSpec));
    }
    if (spec instanceof KeyValueComposition) {
      KeyValueComposition keyValueSpec = (KeyValueComposition) spec;
      return new KeyValueSubComposer(resolveSpec(keyValueSpec.key, scope),
          new SequenceSubComposer(keyValueSpec.valueMatch, scope, this::resolveSpec));
    }
    if (spec instanceof MultiplierComposition) {
      return new MultiplierSubComposer(
          resolveSpec(((MultiplierComposition) spec).compositionSpec, scope),
          ((MultiplierComposition) spec).multiplier, scope);
    }
    if (spec instanceof DereferenceComposition) {
      return new DereferenceSubComposer(((DereferenceComposition) spec).source, scope);
    }
    if (spec instanceof CaptureComposition) {
      CaptureComposition captureComposition = (CaptureComposition) spec;
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
    if (spec instanceof TransformComposition) {
      TransformComposition transformSpec = (TransformComposition) spec;
      return new TransformSubComposer(resolveSpec(transformSpec.compositionSpec, scope),
          transformSpec.transform, scope);
    }
    if (spec instanceof StateAssignmentComposition) {
      StateAssignmentComposition stateSpec = (StateAssignmentComposition) spec;
      SubComposer value = stateSpec.value == null ? null : resolveSpec(stateSpec.value, scope);
      return new StateAssignmentSubComposer(value, stateSpec.stateAssignment,
          scope);
    }
    if (spec instanceof LiteralComposition) {
      return new LiteralSubComposer((String) ((LiteralComposition) spec).literal.getResults(null, scope));
    }
    throw new UnsupportedOperationException(
        "Unknown composition spec " + spec.getClass().getSimpleName());
  }

  List<SubComposer> resolveSpecs(List<CompositionSpec> specs, Scope scope) {
    return specs.stream().map(spec -> resolveSpec(spec, scope)).collect(
        Collectors.toList());
  }

  private class ScopedSequenceSubComposer implements SubComposer {

    private final List<CompositionSpec> compositionSpecs;
    private final Scope scope;
    SequenceSubComposer sequenceSubComposer;

    ScopedSequenceSubComposer(List<CompositionSpec> compositionSpecs, Scope scope) {
      this.compositionSpecs = compositionSpecs;
      this.scope = scope;
    }

    @Override
    public String nibble(String s) {
      sequenceSubComposer = new SequenceSubComposer(compositionSpecs, new NestedScope(scope),
          SubComposerFactory.this::resolveSpec);
      return sequenceSubComposer.nibble(s);
    }

    @Override
    public Object getValues() {
      Object values = sequenceSubComposer.getValues();
      sequenceSubComposer = null;
      return values;
    }

    @Override
    public boolean isSatisfied() {
      return sequenceSubComposer.isSatisfied();
    }
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

    public ArrayComposition(List<CompositionSpec> itemSpecs) {
      this.itemSpecs = itemSpecs;
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
    private final Expression transform;

    public TransformComposition(CompositionSpec compositionSpec, Expression transform) {
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

    public StateAssignmentComposition(/* @Nullable */ CompositionSpec value, Expression stateAssignment) {
      this.value = value;
      this.stateAssignment = stateAssignment;
    }
  }

  public static class LiteralComposition implements CompositionSpec {

    private final Value literal;

    public LiteralComposition(Value literal) {
      this.literal = literal;
    }
  }
}