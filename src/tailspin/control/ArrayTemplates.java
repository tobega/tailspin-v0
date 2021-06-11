package tailspin.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import tailspin.transform.ExpectedParameter;
import tailspin.interpreter.Scope;
import tailspin.transform.Templates;
import tailspin.types.TailspinArray;

public class ArrayTemplates implements Expression {
  private final List<String> loopVariables;
  private final TemplatesDefinition templatesDefinition;

  public ArrayTemplates(List<String> loopVariables, TemplatesDefinition templatesDefinition) {
    this.loopVariables = loopVariables;
    this.templatesDefinition = templatesDefinition;
  }

  @Override
  public Object getResults(Object it, Scope definingScope) {
    Templates templates = templatesDefinition.define(definingScope);
    templates.expectParameters(loopVariables.stream().map(ExpectedParameter::new)
        .collect(Collectors.toList()));
    return runArrayTemplate(it, templates);
  }

  private TailspinArray runArrayTemplate(Object oIt, Templates templates) {
    if (!(oIt instanceof TailspinArray)) {
      throw new UnsupportedOperationException("Cannot apply array templates to " + oIt.getClass());
    }
    TailspinArray[] dimLists = new TailspinArray[loopVariables.size()];
    dimLists[0] = (TailspinArray) oIt;
    TailspinArray[] results = new TailspinArray[loopVariables.size()];
    results[0] = TailspinArray.value(new ArrayList<>());
    for (int i = 1; i < loopVariables.size(); i++) {
      dimLists[i] = (TailspinArray) dimLists[i-1].get(1);
      results[i] = TailspinArray.value(new ArrayList<>());
    }
    int[] dimCounters = new int[loopVariables.size()];
    Arrays.fill(dimCounters, 1);
    int lastIdx = loopVariables.size() - 1;
    while (dimCounters[0] <= dimLists[0].length()) {
      for (dimCounters[lastIdx] = 1; dimCounters[lastIdx] <= dimLists[lastIdx].length(); dimCounters[lastIdx]++) {
        Map<String, Object> counters = new HashMap<>();
        for (int i = 0; i < loopVariables.size(); i++) {
          counters.put(loopVariables.get(i), (long) dimCounters[i]);
        }
        Object itemIt = dimLists[lastIdx].get(dimCounters[lastIdx]);
        ResultIterator.forEach(templates.getResults(itemIt, counters), results[lastIdx]::append);
      }
      int idx = lastIdx - 1;
      while (idx >= 0) {
        results[idx].append(results[idx+1]);
        dimCounters[idx]++;
        if (dimCounters[idx] > dimLists[idx].length()) {
          idx--;
          continue;
        }
        while (++idx <= lastIdx) {
          dimCounters[idx] = 1;
          results[idx] = TailspinArray.value(new ArrayList<>());
          dimLists[idx] = (TailspinArray) dimLists[idx-1].get(dimCounters[idx-1]);
        }
        break;
      }
    }
    return results[0];
  }
}
