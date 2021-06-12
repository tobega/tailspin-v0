package tailspin.control;

import tailspin.interpreter.Scope;

public class TypestateDefinition {
  private final String name;
  private final Block block;

  public TypestateDefinition(String name, Block block) {
    this.name = name;
    this.block = block;
  }

  public void evaluateBlock(Scope stateScope) {
    Object results = block == null ? null : block.getResults(null, stateScope);
    // TODO: assert everything null
    if (results instanceof ResultIterator ri) {
      Object r;
      while ((r = ri.getNextResult()) != null) {
        if (r instanceof ResultIterator) {
          ri = (ResultIterator) r;
        }
      }
      results = r;
    }
    if (results != null) throw new IllegalStateException("Typestate definition " + name + " emitted value " + results);
  }

  public String getName() {
    return name;
  }
}
