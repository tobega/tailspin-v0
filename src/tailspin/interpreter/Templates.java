package tailspin.interpreter;

import java.util.List;
import java.util.Optional;

class Templates {
  private final List<MatchTemplate> matchTemplates;

  Templates(List<MatchTemplate> matchTemplates) {
    this.matchTemplates = matchTemplates;
  }

  Object run(Scope parentScope) {
    RunPhase runPhase = new RunPhase(new NestedScope(parentScope));
    Optional<MatchTemplate> match = matchTemplates.stream()
        .filter(m -> runPhase.visitMatcher(m.matcher)).findFirst();
    return match.map(m -> runPhase.visitBlock(m.block)).orElse(null);
  }
}
