package tailspin.interpreter;

import tailspin.parser.TailspinParser;

class MatchTemplate {
  final TailspinParser.MatcherContext matcher;
  final TailspinParser.BlockContext block;

  MatchTemplate(TailspinParser.MatcherContext matcher, TailspinParser.BlockContext block) {
    this.matcher = matcher;
    this.block = block;
  }
}
