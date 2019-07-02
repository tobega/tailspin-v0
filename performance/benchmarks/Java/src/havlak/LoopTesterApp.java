// Copyright 2011 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package havlak;

public final class LoopTesterApp {

  private final ControlFlowGraph   cfg;
  private final LoopStructureGraph lsg;

  public LoopTesterApp() {
    cfg = new ControlFlowGraph();
    lsg = new LoopStructureGraph();
    cfg.createNode(0);
  }

  // Create 4 basic blocks, corresponding to and if/then/else clause
  // with a CFG that looks like a diamond
  private int buildDiamond(final int start) {
    int bb0 = start;
    new BasicBlockEdge(cfg, bb0, bb0 + 1);
    new BasicBlockEdge(cfg, bb0, bb0 + 2);
    new BasicBlockEdge(cfg, bb0 + 1, bb0 + 3);
    new BasicBlockEdge(cfg, bb0 + 2, bb0 + 3);

    return bb0 + 3;
  }

  // Connect two existing nodes
  private void buildConnect(final int start, final int end) {
    new BasicBlockEdge(cfg, start, end);
  }

  // Form a straight connected sequence of n basic blocks
  private int buildStraight(final int start, final int n) {
    for (int i = 0; i < n; i++) {
      buildConnect(start + i, start + i + 1);
    }
    return start + n;
  }

  // Construct a simple loop with two diamonds in it
  private int buildBaseLoop(final int from) {
    int header   = buildStraight(from, 1);
    int diamond1 = buildDiamond(header);
    int d11      = buildStraight(diamond1, 1);
    int diamond2 = buildDiamond(d11);
    int footer   = buildStraight(diamond2, 1);
    buildConnect(diamond2, d11);
    buildConnect(diamond1, header);

    buildConnect(footer, from);
    footer = buildStraight(footer, 1);
    return footer;
  }

  public int[] main(final int numDummyLoops, final int findLoopIterations,
      final int parLoops, final int pparLoops, final int ppparLoops) {
    constructSimpleCFG();
    addDummyLoops(numDummyLoops);
    constructCFG(parLoops, pparLoops, ppparLoops);

    // Performing Loop Recognition, 1 Iteration, then findLoopIteration
    findLoops(lsg);
    for (int i = 0; i < findLoopIterations; i++) {
      findLoops(new LoopStructureGraph());
    }

    lsg.calculateNestingLevel();
    return new int[] {lsg.getNumLoops(), cfg.getNumNodes()};
  }

  private void constructCFG(final int parLoops, final int pparLoops,
      final int ppparLoops) {
    int n = 2;

    for (int parlooptrees = 0; parlooptrees < parLoops; parlooptrees++) {
      cfg.createNode(n + 1);
      buildConnect(2, n + 1);
      n += 1;

      for (int i = 0; i < pparLoops; i++) {
        int top = n;
        n = buildStraight(n, 1);
        for (int j = 0; j < ppparLoops; j++) {
          n = buildBaseLoop(n);
        }
        int bottom = buildStraight(n, 1);
        buildConnect(n, top);
        n = bottom;
      }
      buildConnect(n, 1);
    }
  }

  private void addDummyLoops(final int numDummyLoops) {
    for (int dummyloop = 0; dummyloop < numDummyLoops; dummyloop++) {
      findLoops(lsg);
    }
  }

  private void findLoops(final LoopStructureGraph loopStructure) {
    HavlakLoopFinder finder = new HavlakLoopFinder(cfg, loopStructure);
    finder.findLoops();
  }

  private void constructSimpleCFG() {
    cfg.createNode(0);
    buildBaseLoop(0);
    cfg.createNode(1);
    new BasicBlockEdge(cfg, 0, 2);
  }
}
