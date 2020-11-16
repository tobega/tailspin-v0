/*
 * This benchmark is derived from Mario Wolczko's Java and Smalltalk version of
 * Richards.
 *
 * It is modified based on the SOM version and to use Java 8 features.
 * License details:
 *   http://web.archive.org/web/20050825101121/http://www.sunlabs.com/people/mario/java_benchmarking/index.html
 */
package richards2;

final class WorkerTask extends TaskControlBlock {

  private int destination;
  private int count;

  WorkerTask(Monitor monitor,
      final TaskControlBlock link,
      final int identity,
      final int priority,
      final Packet[] work,
      final TaskState state) {
    super(monitor, link, identity, priority, work, state);
    destination = HANDLER_A;
    count = 0;
  }

  public int getCount() {
    return count;
  }

  public void setCount(final int aCount) {
    count = aCount;
  }

  public int getDestination() {
    return destination;
  }

  public void setDestination(final int aHandler) {
    destination = aHandler;
  }

  public Packet function(final Packet work) {
    if (NO_WORK == work) {
      setTaskWaiting(true);
      return NO_WORK;
    } else {
      setDestination((HANDLER_A == getDestination()) ? HANDLER_B : HANDLER_A);
      int[] transformedData = new int[Packet.DATA_SIZE];
      for (int i = 0; i < Packet.DATA_SIZE; i++) {
        setCount(getCount() + 1);
        if (getCount() > 26) {
          setCount(1);
        }
        transformedData[i] = 65 + getCount() - 1;
      }
      return new Packet(getDestination(), work.getKind(), 0, transformedData);
    }
  }
}
