package tailspin.interpreter;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import tailspin.parser.TailspinParser;

class Templates {
  // @Nullable
  private final TailspinParser.BlockContext block;
  private final List<MatchTemplate> matchTemplates;

  Templates(/*@Nullable*/ TailspinParser.BlockContext block, List<MatchTemplate> matchTemplates) {
    this.block = block;
    this.matchTemplates = matchTemplates;
  }

  Stream<?> run(Scope parentScope) {
    RunTemplateBlock runner = new RunTemplateBlock(this, new NestedScope(parentScope));
    // This cannot be written as Optional.stream().flatMap because that will defer execution of
    // visitBlock.
    Stream<?> initialStream = Optional.ofNullable(block)
        .map(runner::visitBlock).orElse(Stream.empty());
    return Stream.concat(initialStream, matchTemplates(runner));
  }

  Stream<?> matchTemplates(RunTemplateBlock runner) {
    Optional<MatchTemplate> match = matchTemplates.stream()
        .filter(m -> runner.visitMatcher(m.matcher)).findFirst();
    // This cannot be written as match.stream().flatMap because that will defer execution of
    // visitBlock.
    return match.map(m -> runner.visitBlock(m.block)).orElse(Stream.empty());
  }
}
