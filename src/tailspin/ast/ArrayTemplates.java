package tailspin.ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;
import tailspin.interpreter.ExpectedParameter;
import tailspin.interpreter.Scope;
import tailspin.interpreter.Templates;

public class ArrayTemplates implements Expression {
  private final List<String> loopVariables;
  private final TemplatesDefinition templatesDefinition;

  public ArrayTemplates(List<String> loopVariables, TemplatesDefinition templatesDefinition) {
    this.loopVariables = loopVariables;
    this.templatesDefinition = templatesDefinition;
  }

  @Override
  public Queue<Object> run(Object it, Scope definingScope) {
    Templates templates = templatesDefinition.define(definingScope);
    templates.expectParameters(loopVariables.stream().map(ExpectedParameter::new)
        .collect(Collectors.toList()));
    return Expression.queueOf(runArrayTemplate(it, templates));
  }

  @SuppressWarnings("unchecked")
  private List<Object> runArrayTemplate(Object oIt, Templates templates) {
    if (!(oIt instanceof List)) {
      throw new UnsupportedOperationException("Cannot apply array templates to " + oIt.getClass());
    }
    List<Object>[] dimLists = new List[loopVariables.size()];
    dimLists[0] = (List<Object>) oIt;
    List[] results = new List[loopVariables.size()];
    results[0] = new ArrayList<>();
    for (int i = 1; i < loopVariables.size(); i++) {
      dimLists[i] = (List<Object>) dimLists[0].get(0);
      results[i] = new ArrayList<>();
    }
    int[] dimCounters = new int[loopVariables.size()];
    int lastIdx = loopVariables.size() - 1;
    while (dimCounters[0] < dimLists[0].size()) {
      for (dimCounters[lastIdx] = 0; dimCounters[lastIdx] < dimLists[lastIdx].size(); dimCounters[lastIdx]++) {
        Map<String, Object> counters = new HashMap<>();
        for (int i = 0; i < loopVariables.size(); i++) {
          counters.put(loopVariables.get(i), dimCounters[i] + 1);
        }
        Object itemIt = dimLists[lastIdx].get(dimCounters[lastIdx]);
        results[lastIdx].addAll(templates.run(itemIt, counters));
      }
      int idx = lastIdx - 1;
      while (idx >= 0) {
        results[idx].add(results[idx+1]);
        dimCounters[idx]++;
        if (dimCounters[idx] >= dimLists[idx].size()) {
          idx--;
          continue;
        }
        while (++idx <= lastIdx) {
          dimCounters[idx] = 0;
          results[idx] = new ArrayList<>();
          dimLists[idx] = (List<Object>) dimLists[idx-1].get(dimCounters[idx-1]);
        }
        break;
      }
    }
    return results[0];
  }
}
