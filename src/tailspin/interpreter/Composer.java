package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.function.Function;
import java.util.stream.Collectors;

class Composer implements Transform {
  private static final HashMap<String, SubComposerFactory> namedComposers = new HashMap<>();
  static {
    namedComposers.put("INT", new RegexpComposerFactory("[+-]?[1-9][0-9]*", Integer::valueOf));
  }

  private final List<CompositionSpec> specs;

  interface CompositionSpec {}

  static class NamedComposition implements CompositionSpec {
    private final String namedPattern;

    NamedComposition(String namedPattern) {
      this.namedPattern = namedPattern;
    }
  }

  static class RegexComposition implements CompositionSpec {
    private final String pattern;

    RegexComposition(String pattern) {
      this.pattern = pattern;
    }
  }

  static class SkipComposition implements CompositionSpec {
    private final List<CompositionSpec> skipSpecs;

    public SkipComposition(List<CompositionSpec> skipSpecs) {
      this.skipSpecs = skipSpecs;
    }
  }

  Composer(List<CompositionSpec> specs) {
    this.specs = specs;
  }

  @Override
  public Queue<Object> run(Scope scope) {
    ArrayDeque<Object> result = new ArrayDeque<>();
    String s = (String) scope.getIt().peek();
    for (CompositionSpec spec : specs) {
      SubComposer subComposer = resolveSpec(spec);
      for (s = subComposer.accept(s); subComposer.hasNewValue(); s = subComposer.accept(s)) {
        result.add(subComposer.getValue());
      }
    }
    return result;
  }

  private SubComposer resolveSpec(CompositionSpec spec) {
    if (spec instanceof NamedComposition) {
      return namedComposers.get(((NamedComposition) spec).namedPattern).newSubComposer();
    }
    if (spec instanceof RegexComposition) {
      return new RegexpComposerFactory(((RegexComposition) spec).pattern, Function.identity()).newSubComposer();
    }
    if (spec instanceof SkipComposition) {
      return new SkipSubComposer(((SkipComposition) spec).skipSpecs.stream().map(this::resolveSpec).collect(
          Collectors.toList()));
    }
    throw new UnsupportedOperationException("Unknown composition spec " + spec.getClass().getSimpleName());
  }
}
