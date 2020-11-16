/*
 * This benchmark is derived from Mario Wolczko's Java and Smalltalk version of
 * Richards.
 *
 * It is modified based on the SOM version and to use Java 8 features.
 * License details:
 *   http://web.archive.org/web/20050825101121/http://www.sunlabs.com/people/mario/java_benchmarking/index.html
 */
package richards2;

final class DeviceTask extends TaskControlBlock {

  private Packet pending;

  DeviceTask(Monitor monitor,
      final TaskControlBlock link,
      final int identity,
      final int priority,
      final Packet[] work,
      final TaskState state) {
    super(monitor, link, identity, priority, work, state);
    pending = NO_WORK;
  }

  public Packet getPending() {
    return pending;
  }

  public void setPending(final Packet packet) {
    pending = packet;
  }

  public Packet function(final Packet workArg) {
    Packet functionWork = workArg;
    if (NO_WORK == functionWork) {
      if (NO_WORK == (functionWork = getPending())) {
        setTaskWaiting(true);
        return NO_WORK;
      } else {
        setPending(NO_WORK);
        return functionWork;
      }
    } else {
      setPending(functionWork);
      monitor.trace(functionWork.getDatum());
      setTaskHolding(true);
      return NO_WORK;
    }
  }
}
