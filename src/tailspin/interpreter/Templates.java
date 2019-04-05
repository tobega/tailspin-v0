package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import tailspin.parser.TailspinParser;

class Templates implements Transform {
  // @Nullable
  private final TailspinParser.BlockContext block;
  private final List<MatchTemplate> matchTemplates;

  Templates(/*@Nullable*/ TailspinParser.BlockContext block, List<MatchTemplate> matchTemplates) {
    this.block = block;
    this.matchTemplates = matchTemplates;
  }

  @Override
  public Queue<Object> run(TransformScope scope) {
    RunTemplateBlock runner = new RunTemplateBlock(this, scope);
    if (block != null) {
      return runner.visitBlock(block);
    } else {
      return matchTemplates(runner.createMatcherBlockRunner(scope.getIt()));
    }
  }

  Queue<Object> matchTemplates(RunTemplateBlock.RunMatcherBlock runner) {
    Optional<MatchTemplate> match =
        matchTemplates.stream().filter(m -> runner.visitMatcher(m.matcher)).findFirst();
    return match.map(m -> runner.visitBlock(m.block)).orElse(new ArrayDeque<>());
  }
}
