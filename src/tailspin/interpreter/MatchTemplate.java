package tailspin.interpreter;

import tailspin.ast.Block;
import tailspin.parser.TailspinParser;

public class MatchTemplate {
  final TailspinParser.MatcherContext matcher;
  final Block block;

  MatchTemplate(TailspinParser.MatcherContext matcher, Block block) {
    this.matcher = matcher;
    this.block = block;
  }
}
