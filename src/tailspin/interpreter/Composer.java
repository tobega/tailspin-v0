package tailspin.interpreter;

import static tailspin.ast.Expression.queueOf;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import tailspin.ast.Expression;
import tailspin.ast.Value;

public class Composer implements Transform {
  private static final HashMap<String, Pattern> namedPatterns = new HashMap<>();
  private static final HashMap<String, Function<? super String, Object>> namedValueCreators = new HashMap<>();
  static {
    namedPatterns.put("INT", Pattern.compile("[+-]?(0|[1-9][0-9]*)"));
    namedValueCreators.put("INT", Integer::valueOf);
    namedPatterns.put("WS", Pattern.compile("\\s+"));
    namedValueCreators.put("WS", Function.identity());
  }

  private final Scope definingScope;
  private final List<CompositionSpec> specs;
  private final List<ExpectedParameter> expectedParameters = new ArrayList<>();
  private final Map<String, List<CompositionSpec>> definedSequences;

  public Composer(Scope definingScope, List<CompositionSpec> specs,
      Map<String, List<CompositionSpec>> definedSequences) {
    this.definingScope = definingScope;
    this.specs = specs;
    this.definedSequences = definedSequences;
  }

  @Override
  public Queue<Object> run(Object it, Map<String, Object> parameters) {
    TransformScope scope = createTransformScope(it, parameters);
    ArrayDeque<Object> result = new ArrayDeque<>();
    String s = (String) it;
    for (CompositionSpec spec : specs) {
      SubComposer subComposer = resolveSpec(spec, scope);
      s = subComposer.nibble(s);
      if (!subComposer.isSatisfied()) {
        throw new IllegalStateException("No composer match at '" + s + "'");
      }
      result.addAll(subComposer.getValues());
    }
    if (!s.isEmpty()) {
      throw new IllegalStateException("Composer did not use entire string. Remaining:'" + s + "'");
    }
    return result;
  }

  private TransformScope createTransformScope(Object it, Map<String, Object> parameters) {
    TransformScope scope = new TransformScope(definingScope, "");
    scope.setIt(queueOf(it));
    int foundParameters = 0;
    for (ExpectedParameter expectedParameter : expectedParameters) {
      if (parameters.containsKey(expectedParameter.name)) {
        foundParameters++;
        scope.defineValue(expectedParameter.name, parameters.get(expectedParameter.name));
      } else {
        throw new IllegalArgumentException("Missing parameter " + expectedParameter.name + " to " + scope.scopeContext);
      }
    }
    if (foundParameters != parameters.size()) {
      throw new IllegalArgumentException("Too many parameters for " + scope.scopeContext + ":\n" + parameters);
    }
    return scope;
  }

  public void expectParameters(List<ExpectedParameter> parameters) {
    expectedParameters.addAll(parameters);
  }

  private class PendingSequenceSubComposer implements SubComposer {
    private final List<CompositionSpec> compositionSpecs;
    private final Scope scope;
    SequenceSubComposer sequenceSubComposer;

    PendingSequenceSubComposer(List<CompositionSpec> compositionSpecs, Scope scope) {
      this.compositionSpecs = compositionSpecs;
      this.scope = scope;
    }

    @Override
    public String nibble(String s) {
      sequenceSubComposer = new SequenceSubComposer(resolveSpecs(compositionSpecs, new NestedScope(scope)));
      return sequenceSubComposer.nibble(s);
    }

    @Override
    public Queue<Object> getValues() {
      Queue<Object> values = sequenceSubComposer.getValues();
      sequenceSubComposer = null;
      return values;
    }

    @Override
    public boolean isSatisfied() {
      return sequenceSubComposer.isSatisfied();
    }
  }

  private SubComposer resolveSpec(CompositionSpec spec, Scope scope) {
    if (spec instanceof NamedComposition) {
      NamedComposition namedSpec = (NamedComposition) spec;
      String name = namedSpec.namedPattern;
      if (definedSequences.containsKey(name)) {
        return new PendingSequenceSubComposer(definedSequences.get(name), scope);
      }
      return new RegexpSubComposer(namedPatterns.get(name), namedValueCreators.get(name));
    }
    if (spec instanceof RegexComposition) {
      RegexComposition regexSpec = (RegexComposition) spec;
      // Note that we do not allow regex interpolations to reference $it. What would that even mean?
      return new RegexpSubComposer(Pattern.compile((String) regexSpec.pattern.evaluate(null, scope)), Function.identity());
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
      return new ArraySubComposer(resolveSpecs(arraySpec.itemSpecs, scope));
    }
    if (spec instanceof StructureComposition) {
      StructureComposition structureSpec = (StructureComposition) spec;
      return new StructureSubComposer(resolveSpecs(structureSpec.contents, scope));
    }
    if (spec instanceof KeyValueComposition) {
      KeyValueComposition keyValueSpec = (KeyValueComposition) spec;
      return new KeyValueSubComposer(resolveSpec(keyValueSpec.key, scope), resolveSpecs(keyValueSpec.valueMatch, scope));
    }
    if (spec instanceof OptionalComposition) {
      return new OptionalSubComposer(resolveSpec(((OptionalComposition) spec).compositionSpec, scope));
    }
    if (spec instanceof OneOrMoreComposition) {
      return new OneOrMoreSubComposer(resolveSpec(((OneOrMoreComposition) spec).compositionSpec, scope));
    }
    if (spec instanceof AnyComposition) {
      return new AnySubComposer(resolveSpec(((AnyComposition) spec).compositionSpec, scope));
    }
    if (spec instanceof DereferenceComposition) {
      return new DereferenceSubComposer(((DereferenceComposition) spec).source, scope);
    }
    if (spec instanceof CaptureComposition) {
      CaptureComposition captureComposition = (CaptureComposition) spec;
      return new CaptureSubComposer(captureComposition.identifier, scope,
          resolveSpec(captureComposition.compositionSpec, scope));
    }
    if (spec instanceof CountComposition) {
      CountComposition countSpec = (CountComposition) spec;
      return new CountSubComposer(resolveSpec(countSpec.compositionSpec, scope), countSpec.count, scope);
    }
    if (spec instanceof Constant) {
      return new ConstantSubComposer(((Constant) spec).value);
    }
    if (spec instanceof InverseComposition) {
      return new InvertSubComposer(resolveSpec(((InverseComposition) spec).compositionSpec, scope));
    }
    if (spec instanceof TransformComposition) {
      TransformComposition transformSpec = (TransformComposition) spec;
      return new TransformSubComposer(resolveSpec(transformSpec.compositionSpec, scope), transformSpec.transform, scope);
    }
    throw new UnsupportedOperationException("Unknown composition spec " + spec.getClass().getSimpleName());
  }

  private List<SubComposer> resolveSpecs(List<CompositionSpec> specs, Scope scope) {
    return specs.stream().map(spec -> resolveSpec(spec, scope)).collect(
        Collectors.toList());
  }

  public interface CompositionSpec {}

  static class NamedComposition implements CompositionSpec {
    private final String namedPattern;

    NamedComposition(String namedPattern) {
      this.namedPattern = namedPattern;
    }
  }

  static class RegexComposition implements CompositionSpec {
    private final Value pattern;

    RegexComposition(Value pattern) {
      this.pattern = pattern;
    }
  }

  static class SkipComposition implements CompositionSpec {
    private final List<CompositionSpec> skipSpecs;

    SkipComposition(List<CompositionSpec> skipSpecs) {
      this.skipSpecs = skipSpecs;
    }
  }

  static class ArrayComposition implements CompositionSpec {
    private final List<CompositionSpec> itemSpecs;

    ArrayComposition(List<CompositionSpec> itemSpecs) {
      this.itemSpecs = itemSpecs;
    }
  }

  static class OptionalComposition implements CompositionSpec {
    private final CompositionSpec compositionSpec;

    OptionalComposition(CompositionSpec compositionSpec) {
      this.compositionSpec = compositionSpec;
    }
  }

  static class OneOrMoreComposition implements CompositionSpec {
    private final CompositionSpec compositionSpec;

    OneOrMoreComposition(CompositionSpec compositionSpec) {
      this.compositionSpec = compositionSpec;
    }
  }

  static class AnyComposition implements CompositionSpec {
    private final CompositionSpec compositionSpec;

    AnyComposition(CompositionSpec compositionSpec) {
      this.compositionSpec = compositionSpec;
    }
  }

  static class StructureComposition implements CompositionSpec {
    private final List<CompositionSpec> contents;

    StructureComposition(List<CompositionSpec> contents) {
      this.contents = contents;
    }
  }

  static class KeyValueComposition implements CompositionSpec {
    private final CompositionSpec key;
    private final List<CompositionSpec> valueMatch;

    KeyValueComposition(CompositionSpec key, List<CompositionSpec> valueMatch) {
      this.key = key;
      this.valueMatch = valueMatch;
    }
  }

  static class Constant implements CompositionSpec {
    private final String value;

    Constant(String value) {
      this.value = value;
    }
  }

  static class DereferenceComposition implements CompositionSpec {
    private final Expression source;

    DereferenceComposition(Expression source) {
      this.source = source;
    }
  }

  static class CaptureComposition implements CompositionSpec {
    private final String identifier;
    private final CompositionSpec compositionSpec;

    CaptureComposition(String identifier, CompositionSpec compositionSpec) {
      this.identifier = identifier;
      this.compositionSpec = compositionSpec;
    }
  }

  static class CountComposition implements CompositionSpec {
    private final CompositionSpec compositionSpec;
    private final Value count;

    CountComposition(CompositionSpec compositionSpec, Value count) {
      this.compositionSpec = compositionSpec;
      this.count = count;
    }
  }

  static class ChoiceComposition implements CompositionSpec {
    private final List<CompositionSpec> choices;

    ChoiceComposition(List<CompositionSpec> choices) {
      this.choices = choices;
    }
  }

  static class TransformComposition implements CompositionSpec {
    private final CompositionSpec compositionSpec;
    private final Expression transform;

    TransformComposition(CompositionSpec compositionSpec, Expression transform) {
      this.compositionSpec = compositionSpec;
      this.transform = transform;
    }
  }

  static class InverseComposition implements CompositionSpec {
    private final CompositionSpec compositionSpec;

    InverseComposition(CompositionSpec compositionSpec) {
      this.compositionSpec = compositionSpec;
    }
  }
}
