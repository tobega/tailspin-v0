/*
 * This benchmark is derived from Mario Wolczko's Java and Smalltalk version of
 * Richards.
 *
 * It is modified based on the SOM version and to use Java 8 features.
 * License details:
 *   http://web.archive.org/web/20050825101121/http://www.sunlabs.com/people/mario/java_benchmarking/index.html
 */
import richards2.Monitor;
import richards2.Scheduler;

/*
 * This version is a port of the SOM Richards benchmark to Java.
 * It is kept as close to the SOM version as possible, for cross-language
 * benchmarking.
 */

public class Richards2 extends Benchmark {

  @Override
  public Object benchmark() {
    return (new Scheduler(new Monitor())).start();
  }

  @Override
  public boolean verifyResult(final Object result) {
    return (boolean) result;
  }
}
