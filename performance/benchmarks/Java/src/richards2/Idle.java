/*
 * This benchmark is derived from Mario Wolczko's Java and Smalltalk version of
 * Richards.
 * 
 * It is modified based on the SOM version and to use Java 8 features.
 * License details:
 *   http://web.archive.org/web/20050825101121/http://www.sunlabs.com/people/mario/java_benchmarking/index.html
 */
package richards2;


final class Idle extends RBObject {

  private final Scheduler scheduler;
  private int control;
  private int count;

  public int getControl() { return control; }
  public void setControl(final int aNumber) {
    control = aNumber;
  }

  public int getCount() { return count; }
  public void setCount(final int aCount) { count = aCount; }

  Idle(Scheduler scheduler) {
    this.scheduler = scheduler;
    control = 1;
    count = 10000;
  }

  public TaskControlBlock getNextTask() {
    setCount(getCount() - 1);
    if (0 == getCount()) {
      return NO_TASK;
    } else {
      if (0 == (getControl() & 1)) {
        setControl(getControl() / 2);
        return scheduler.release(DEVICE_A);
      } else {
        setControl((getControl() / 2) ^ 53256);
        return scheduler.release(DEVICE_B);
      }
    }
  }
}
