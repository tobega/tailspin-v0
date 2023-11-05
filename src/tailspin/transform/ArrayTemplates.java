package tailspin.transform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tailspin.control.Expression;
import tailspin.control.ResultIterator;
import tailspin.control.TemplatesDefinition;
import tailspin.interpreter.Scope;
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
    return runArrayTemplate(it, templates);
  }

  private TailspinArray runArrayTemplate(Object oIt, Templates templates) {
    if (!(oIt instanceof TailspinArray)) {
      throw new UnsupportedOperationException("Cannot apply array templates to " + oIt.getClass());
    }
    TailspinArray[] dimLists = new TailspinArray[loopVariables.size()];
    dimLists[0] = (TailspinArray) oIt;
    TailspinArray[] results = new TailspinArray[loopVariables.size()];
    results[0] = TailspinArray.value(new ArrayList<>(), ((TailspinArray) oIt).getOffset());
    for (int i = 1; i < loopVariables.size(); i++) {
      TailspinArray nextDim = (TailspinArray) dimLists[i - 1].getNative(0);
      dimLists[i] = nextDim;
      results[i] =
          TailspinArray.value(
              new ArrayList<>(), nextDim.getOffset());
    }
    int[] dimCounters = new int[loopVariables.size()];
    Arrays.fill(dimCounters, 0);
    int lastIdx = loopVariables.size() - 1;
    while (dimCounters[0] < dimLists[0].length()) {
      for (dimCounters[lastIdx] = 0; dimCounters[lastIdx] < dimLists[lastIdx].length(); dimCounters[lastIdx]++) {
        Map<String, Object> counters = new HashMap<>();
        for (int i = 0; i < loopVariables.size(); i++) {
          counters.put(loopVariables.get(i), dimLists[i].getTailspinIndex(dimCounters[i]));
        }
        Object itemIt = dimLists[lastIdx].getNative(dimCounters[lastIdx]);
        ResultIterator.forEach(runElement(templates, counters, itemIt), results[lastIdx]::append);
      }
      int idx = lastIdx - 1;
      while (idx >= 0) {
        results[idx].append(results[idx+1]);
        dimCounters[idx]++;
        if (dimCounters[idx] >= dimLists[idx].length()) {
          idx--;
          continue;
        }
        while (++idx <= lastIdx) {
          dimCounters[idx] = 0;
          TailspinArray nextDim = (TailspinArray) dimLists[idx - 1].getNative(dimCounters[idx - 1]);
          dimLists[idx] = nextDim;
          results[idx] = TailspinArray.value(new ArrayList<>(), nextDim.getOffset());
        }
        break;
      }
    }
    return results[0];
  }

  private static Object runElement(Templates templates,
      Map<String, Object> counters, Object itemIt) {
    TransformScope scope = templates.createTransformScope(Map.of());
    for (Map.Entry<String, Object> counter : counters.entrySet()) {
      scope.defineValue(counter.getKey(), counter.getValue());
    }
    return templates.runInScope(itemIt, scope);
  }
}
