package tailspin.transform;

import tailspin.control.Block;
import tailspin.types.Membrane;

public class MatchTemplate {
  final Membrane matcher;
  final Block block;

  public MatchTemplate(Membrane matcher, Block block) {
    this.matcher = matcher;
    this.block = block;
  }
}
