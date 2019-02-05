package tailspin.interpreter;

import org.antlr.v4.runtime.tree.TerminalNode;

interface TerminalSink {
  void acceptTerminal(TerminalNode node);
  Object getValue();
  void acceptNestedValue(Object value);
}
