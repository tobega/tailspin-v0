package tailspin.transform;

import tailspin.ast.Block;
import tailspin.types.Condition;

public class MatchTemplate {
  final Condition matcher;
  final Block block;

  public MatchTemplate(Condition matcher, Block block) {
    this.matcher = matcher;
    this.block = block;
  }
}
