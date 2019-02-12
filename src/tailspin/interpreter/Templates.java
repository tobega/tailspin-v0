package tailspin.interpreter;

import java.util.List;
import java.util.Optional;

class Templates {
  private final List<MatchTemplate> matchTemplates;

  Templates(List<MatchTemplate> matchTemplates) {
    this.matchTemplates = matchTemplates;
  }

  Object run(Scope parentScope) {
    RunTemplateBlock runner = new RunTemplateBlock(this, new NestedScope(parentScope));
    return matchTemplates(runner);
  }

  Object matchTemplates(RunTemplateBlock runner) {
    Optional<MatchTemplate> match = matchTemplates.stream()
        .filter(m -> runner.visitMatcher(m.matcher)).findFirst();
    return match.map(m -> runner.visitBlock(m.block)).orElse(null);
  }
}
