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

  Stream<?> run(Scope scope) {
    RunTemplateBlock runner = new RunTemplateBlock(this, scope);
    if (block != null) {
      return runner.visitBlock(block);
    } else {
      return matchTemplates(runner);
    }
  }

  Stream<?> matchTemplates(RunTemplateBlock runner) {
    Optional<MatchTemplate> match = matchTemplates.stream()
        .filter(m -> runner.visitMatcher(m.matcher)).findFirst();
    // This cannot be written as match.stream().flatMap because that will defer execution of
    // visitBlock.
    return match.map(m -> runner.visitBlock(m.block)).orElse(Stream.empty());
  }
}
