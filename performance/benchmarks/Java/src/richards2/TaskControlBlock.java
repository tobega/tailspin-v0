/*
 * This benchmark is derived from Mario Wolczko's Java and Smalltalk version of
 * Richards.
 * 
 * It is modified based on the SOM version and to use Java 8 features.
 * License details:
 *   http://web.archive.org/web/20050825101121/http://www.sunlabs.com/people/mario/java_benchmarking/index.html
 */
package richards2;


import java.util.ArrayList;
import java.util.List;

abstract class TaskControlBlock extends TaskState {
  private final TaskControlBlock link;
  private final int identity;
  private final int priority;
  private List<Packet> input = new ArrayList<>();

  TaskControlBlock(Monitor monitor, final TaskControlBlock aLink, final int anIdentity,
      final int aPriority, final Packet[] anInitialWorkQueue,
      final TaskState anInitialState) {
    super(monitor);
    link = aLink;
    identity = anIdentity;
    priority = aPriority;
    for (Packet packet : anInitialWorkQueue) {
      input.add(packet);
    }
    setPacketPending(anInitialState.isPacketPending());
    setTaskWaiting(anInitialState.isTaskWaiting());
    setTaskHolding(anInitialState.isTaskHolding());
  }

  public int getIdentity() { return identity; }
  public TaskControlBlock getLink()  { return link; }
  public int getPriority() { return priority; }

  public void addInput(final Packet packet) {
    if (input.isEmpty()) {
      setPacketPending(true);
    }
    input.add(packet);
  }

  public Packet runTask() {
    Packet message;
    if (isWaitingWithPacket()) {
      message = input.remove(0);
      if (input.isEmpty()) {
        running();
      } else {
        packetPending();
      }
    } else {
      message = NO_WORK;
    }
    return function(message);
  }

  public abstract Packet function(final Packet workArg);
}
