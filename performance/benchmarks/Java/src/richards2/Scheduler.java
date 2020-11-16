/*
 * This benchmark is derived from Mario Wolczko's Java and Smalltalk version of
 * Richards.
 *
 * It is modified based on the SOM version and to use Java 8 features.
 * License details:
 *   http://web.archive.org/web/20050825101121/http://www.sunlabs.com/people/mario/java_benchmarking/index.html
 */
package richards2;

import java.util.Arrays;

public class Scheduler extends RBObject {
  private TaskControlBlock taskList;
  private final TaskControlBlock[] taskTable;

  private final Idle idle = new Idle(this);
  private final Monitor monitor;

  public Scheduler(Monitor monitor) {
    this.monitor = monitor;
    // init scheduler
    taskTable = new TaskControlBlock[NUM_TYPES];
    Arrays.fill(taskTable, NO_TASK);
    taskList = NO_TASK;
  }


  void createDevice(final int identity, final int priority,
      final Packet[] workPacket, final TaskState state) {
    DeviceTask data = new DeviceTask(monitor, taskList, identity, priority, workPacket, state);
    appendTask(data);
  }

  void createHandler(final int identity, final int priority,
      final Packet[] workPackets, final TaskState state) {
    HandlerTask data = new HandlerTask(monitor, taskList, identity, priority, workPackets, state);
    appendTask(data);
  }

  void appendTask(TaskControlBlock t) {
    taskList = t;
    taskTable[t.getIdentity()] = t;
  }

  void createWorker(final int identity, final int priority,
      final Packet[] workPackets, final TaskState state) {
    WorkerTask dataRecord = new WorkerTask(monitor, taskList, identity, priority, workPackets, state);
    appendTask(dataRecord);
  }

  public boolean start() {
    Packet[] workQ;

    workQ = new Packet[]{new Packet(WORKER, WORK_PACKET_KIND),
        new Packet(WORKER, WORK_PACKET_KIND)};
    createWorker(WORKER, 1000, workQ, TaskState.createWaitingWithPacket(monitor));

    workQ = new Packet[]{new Packet(DEVICE_A, DEVICE_PACKET_KIND),
        new Packet(DEVICE_A, DEVICE_PACKET_KIND),
        new Packet(DEVICE_A, DEVICE_PACKET_KIND)};
    createHandler(HANDLER_A, 2000, workQ, TaskState.createWaitingWithPacket(monitor));

    workQ = new Packet[]{new Packet(DEVICE_B, DEVICE_PACKET_KIND),
        new Packet(DEVICE_B, DEVICE_PACKET_KIND),
        new Packet(DEVICE_B, DEVICE_PACKET_KIND)};
    createHandler(HANDLER_B, 3000, workQ, TaskState.createWaitingWithPacket(monitor));

    createDevice(DEVICE_A, 4000, new Packet[0], TaskState.createWaiting(monitor));
    createDevice(DEVICE_B, 5000, new Packet[0], TaskState.createWaiting(monitor));

    schedule();
    return monitor.getQueuePacketCount() == 23246 && monitor.getHoldCount() == 9296;
  }

  TaskControlBlock findTask(final int identity) {
    TaskControlBlock t = taskTable[identity];
    if (NO_TASK == t) { throw new RuntimeException("findTask failed"); }
    return t;
  }

  TaskControlBlock queuePacket(final Packet packet, int currentTaskIdentity) {
    TaskControlBlock t = findTask(packet.getIdentity());
    if (NO_TASK == t) { return NO_TASK; }

    monitor.incrementPacketCount();

    t.addInput(packet.withIdentity(currentTaskIdentity));
    return t;
  }

  TaskControlBlock release(final int identity) {
    TaskControlBlock t = findTask(identity);
    if (NO_TASK == t) { return NO_TASK; }
    t.setTaskHolding(false);
    return t;
  }

  void schedule() {
    TaskControlBlock currentTask = taskList;
    while (NO_TASK != currentTask) {
      if (currentTask.isTaskHoldingOrWaiting()) {
        currentTask = currentTask.getLink();
        if (currentTask == NO_TASK) {
          currentTask = idle.getNextTask();
        }
      } else {
        monitor.trace(currentTask.getIdentity());
        Packet packet = currentTask.runTask();
        if (packet != NO_WORK) {
          TaskControlBlock queuedTask = queuePacket(packet, currentTask.getIdentity());
          if (queuedTask.getPriority() > currentTask.getPriority()) {
            currentTask = queuedTask;
          }
        }
      }
    }
  }
}
