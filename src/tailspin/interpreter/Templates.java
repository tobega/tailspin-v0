package tailspin.interpreter;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class Templates {
  private final List<MatchTemplate> matchTemplates;

  Templates(List<MatchTemplate> matchTemplates) {
    this.matchTemplates = matchTemplates;
  }

  Stream<?> run(Scope parentScope) {
    RunTemplateBlock runner = new RunTemplateBlock(this, new NestedScope(parentScope));
    return matchTemplates(runner);
  }

  Stream<?> matchTemplates(RunTemplateBlock runner) {
    Optional<MatchTemplate> match = matchTemplates.stream()
        .filter(m -> runner.visitMatcher(m.matcher)).findFirst();
    // This cannot be written as match.stream().flatMap because that will defer execution of
    // visitBlock.
    return match.map(m -> runner.visitBlock(m.block)).orElse(Stream.empty());
  }
}
