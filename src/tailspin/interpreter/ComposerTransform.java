package tailspin.interpreter;

import java.util.Queue;
import tailspin.parser.TailspinParser;

public class ComposerTransform {
  private final TailspinParser.TransformContext transformCtx;
  private final Scope scope;

  public ComposerTransform(TailspinParser.TransformContext transformCtx, Scope scope) {
    this.transformCtx = transformCtx;
    this.scope = scope;
  }

  public Queue<Object> convert(Queue<Object> matchResult) {
    if (transformCtx == null) {
      return matchResult;
    }
    TransformScope transformScope = new TransformScope(scope, "");
    transformScope.setIt(matchResult);
    return new RunTemplateBlock(null, transformScope).visitTransform(transformCtx);
  }
}
