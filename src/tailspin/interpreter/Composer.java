package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
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
    namedPatterns.put("WS", Pattern.compile("\\s"));
    namedValueCreators.put("WS", Function.identity());
  }

  private final List<CompositionSpec> specs;

  Composer(List<CompositionSpec> specs) {
    this.specs = specs;
  }

  @Override
  public Queue<Object> run(Scope scope) {
    ArrayDeque<Object> result = new ArrayDeque<>();
    String s = (String) scope.getIt().peek();
    for (CompositionSpec spec : specs) {
      SubComposer subComposer = resolveSpec(spec);
      s = subComposer.nibble(s);
      result.addAll(subComposer.getValues());
    }
    return result;
  }

  private SubComposer resolveSpec(CompositionSpec spec) {
    if (spec instanceof NamedComposition) {
      String name = ((NamedComposition) spec).namedPattern;
      return new RegexpSubComposer(namedPatterns.get(name), namedValueCreators.get(name));
    }
    if (spec instanceof RegexComposition) {
      return new RegexpSubComposer(Pattern.compile(((RegexComposition) spec).pattern), Function.identity());
    }
    if (spec instanceof SkipComposition) {
      return new SkipSubComposer(((SkipComposition) spec).skipSpecs.stream().map(this::resolveSpec).collect(
          Collectors.toList()));
    }
    if (spec instanceof ArrayComposition) {
      return new ArraySubComposer(((ArrayComposition) spec).itemSpecs.stream().map(this::resolveSpec).collect(
          Collectors.toList()));
    }
    throw new UnsupportedOperationException("Unknown composition spec " + spec.getClass().getSimpleName());
  }

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

  static class ArrayComposition implements CompositionSpec {
    private final List<CompositionSpec> itemSpecs;

    public ArrayComposition(List<CompositionSpec> itemSpecs) {
      this.itemSpecs = itemSpecs;
    }
  }
}
