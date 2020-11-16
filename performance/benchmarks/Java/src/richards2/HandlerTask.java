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

final class HandlerTask extends TaskControlBlock {

  private List<Packet> workIn = new ArrayList<>();
  private List<Packet> deviceIn = new ArrayList<>();

  HandlerTask(Monitor monitor,
      final TaskControlBlock link,
      final int identity,
      final int priority,
      final Packet[] work,
      final TaskState state) {
    super(monitor, link, identity, priority, work, state);
  }

  public void deviceInAdd(final Packet packet) {
    deviceIn.add(packet);
  }

  public void workInAdd(final Packet packet) {
    workIn.add(packet);
  }

  public Packet function(final Packet work) {
    if (NO_WORK != work) {
      if (WORK_PACKET_KIND == work.getKind()) {
        workInAdd(work);
      } else {
        deviceInAdd(work);
      }
    }

    if (workIn.isEmpty()) {
      setTaskWaiting(true);
      return NO_WORK;
    } else {
      int count = workIn.get(0).getDatum();
      if (count >= Packet.DATA_SIZE) {
        return workIn.remove(0);
      } else {
        if (deviceIn.isEmpty()) {
          setTaskWaiting(true);
          return NO_WORK;
        } else {
          Packet devicePacket = deviceIn.remove(0);
          workIn.set(0, workIn.get(0).withDatum(count + 1));
          return devicePacket.withDatum(workIn.get(0).getData(count));
        }
      }
    }
  }
}
