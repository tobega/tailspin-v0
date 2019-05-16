package tailspin.interpreter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import tailspin.parser.TailspinParser;

class Templates implements Transform {
  // @Nullable
  private final TailspinParser.BlockContext block;
  private final List<MatchTemplate> matchTemplates;
  private final List<ExpectedParameter> expectedParameters = new ArrayList<>();
  private String scopeName = "";

  Templates(/*@Nullable*/ TailspinParser.BlockContext block, List<MatchTemplate> matchTemplates) {
    this.block = block;
    this.matchTemplates = matchTemplates;
  }

  @Override
  public Queue<Object> run(TransformScope scope, Map<String, Object> parameters) {
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
    RunTemplateBlock runner = new RunTemplateBlock(this, scope);
    if (block != null) {
      return runner.visitBlock(block);
    } else {
      return matchTemplates(runner.createMatcherBlockRunner(scope.getIt()));
    }
  }

  Queue<Object> matchTemplates(RunTemplateBlock.RunMatcherBlock runner) {
    Optional<MatchTemplate> match =
        matchTemplates.stream().filter(m -> runner.visitMatcher(m.matcher).matches(oneValue(runner.scope.getIt()), runner)).findFirst();
    return match.map(m -> runner.visitBlock(m.block)).orElse(new ArrayDeque<>());
  }

  private Object oneValue(Queue<Object> itStream) {
    if (itStream.size() != 1) {
      throw new AssertionError("Matcher called with several values");
    }
    return itStream.peek();
  }

  void expectParameters(List<ExpectedParameter> parameters) {
    expectedParameters.addAll(parameters);
  }

  String getScopeName() {
    return scopeName;
  }

  public void setScopeContext(String name) {
    scopeName = name;
  }
}
