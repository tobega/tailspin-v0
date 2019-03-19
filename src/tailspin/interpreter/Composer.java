package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Composer implements Transform {
  private static final HashMap<String, Pattern> namedPatterns = new HashMap<>();
  private static final HashMap<String, Function<? super String, Object>> namedValueCreators = new HashMap<>();
  static {
    namedPatterns.put("INT", Pattern.compile("[+-]?[1-9][0-9]*"));
    namedValueCreators.put("INT", Integer::valueOf);
    namedPatterns.put("WS", Pattern.compile("\\s+"));
    namedValueCreators.put("WS", Function.identity());
  }

  private final List<CompositionSpec> specs;
  private final Map<String, List<CompositionSpec>> definedSequences;

  Composer(List<CompositionSpec> specs, Map<String, List<CompositionSpec>> definedSequences) {
    this.specs = specs;
    this.definedSequences = definedSequences;
  }

  @Override
  public Queue<Object> run(Scope scope) {
    ArrayDeque<Object> result = new ArrayDeque<>();
    String s = (String) scope.getIt().peek();
    for (CompositionSpec spec : specs) {
      SubComposer subComposer = resolveSpec(spec);
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

  private SubComposer resolveSpec(CompositionSpec spec) {
    if (spec instanceof NamedComposition) {
      NamedComposition namedSpec = (NamedComposition) spec;
      String name = namedSpec.namedPattern;
      if (definedSequences.containsKey(name)) {
        return new SequenceSubComposer(resolveSpecs(definedSequences.get(name)));
      }
      return new RegexpSubComposer(namedPatterns.get(name), namedValueCreators.get(name),
          namedSpec.invert);
    }
    if (spec instanceof RegexComposition) {
      RegexComposition regexSpec = (RegexComposition) spec;
      return new RegexpSubComposer(Pattern.compile(regexSpec.pattern), Function.identity(),
          regexSpec.invert);
    }
    if (spec instanceof SkipComposition) {
      return new SkipSubComposer(resolveSpecs(((SkipComposition) spec).skipSpecs));
    }
    if (spec instanceof ArrayComposition) {
      return new ArraySubComposer(resolveSpecs(((ArrayComposition) spec).itemSpecs));
    }
    if (spec instanceof OptionalComposition) {
      return new OptionalSubComposer(resolveSpec(((OptionalComposition) spec).compositionSpec));
    }
    if (spec instanceof OneOrMoreComposition) {
      return new OneOrMoreSubComposer(resolveSpec(((OneOrMoreComposition) spec).compositionSpec));
    }
    if (spec instanceof AnyComposition) {
      return new AnySubComposer(resolveSpec(((AnyComposition) spec).compositionSpec));
    }
    throw new UnsupportedOperationException("Unknown composition spec " + spec.getClass().getSimpleName());
  }

  private List<SubComposer> resolveSpecs(List<CompositionSpec> specs) {
    return specs.stream().map(this::resolveSpec).collect(
        Collectors.toList());
  }

  interface CompositionSpec {}

  static class NamedComposition implements CompositionSpec {
    private final String namedPattern;
    private final boolean invert;

    NamedComposition(String namedPattern, boolean invert) {
      this.namedPattern = namedPattern;
      this.invert = invert;
    }
  }

  static class RegexComposition implements CompositionSpec {
    private final String pattern;
    private final boolean invert;

    RegexComposition(String pattern, boolean invert) {
      this.pattern = pattern;
      this.invert = invert;
    }
  }

  static class SkipComposition implements CompositionSpec {
    private final List<CompositionSpec> skipSpecs;

    public SkipComposition(List<CompositionSpec> skipSpecs) {
      this.skipSpecs = skipSpecs;
    }
  }

  static class ArrayComposition implements CompositionSpec {
    private final List<CompositionSpec> itemSpecs;

    public ArrayComposition(List<CompositionSpec> itemSpecs) {
      this.itemSpecs = itemSpecs;
    }
  }

  static class OptionalComposition implements CompositionSpec {
    private final CompositionSpec compositionSpec;

    public OptionalComposition(CompositionSpec compositionSpec) {
      this.compositionSpec = compositionSpec;
    }
  }

  static class OneOrMoreComposition implements CompositionSpec {
    private final CompositionSpec compositionSpec;

    public OneOrMoreComposition(CompositionSpec compositionSpec) {
      this.compositionSpec = compositionSpec;
    }
  }

  static class AnyComposition implements CompositionSpec {
    private final CompositionSpec compositionSpec;

    public AnyComposition(CompositionSpec compositionSpec) {
      this.compositionSpec = compositionSpec;
    }
  }
}
