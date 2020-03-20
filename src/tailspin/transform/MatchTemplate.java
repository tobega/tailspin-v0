package tailspin.transform;

import tailspin.control.Block;
import tailspin.types.Criterion;

public class MatchTemplate {
  final Criterion matcher;
  final Block block;

  public MatchTemplate(Criterion matcher, Block block) {
    this.matcher = matcher;
    this.block = block;
  }
}
