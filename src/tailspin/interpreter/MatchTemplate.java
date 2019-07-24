package tailspin.interpreter;

import tailspin.ast.Block;
import tailspin.ast.Condition;

public class MatchTemplate {
  final Condition matcher;
  final Block block;

  MatchTemplate(Condition matcher, Block block) {
    this.matcher = matcher;
    this.block = block;
  }
}
