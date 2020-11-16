/*
 * This benchmark is derived from Mario Wolczko's Java and Smalltalk version of
 * Richards.
 * 
 * It is modified based on the SOM version and to use Java 8 features.
 * License details:
 *   http://web.archive.org/web/20050825101121/http://www.sunlabs.com/people/mario/java_benchmarking/index.html
 */
package richards2;


class TaskState extends RBObject {
  private boolean packetPending;
  private boolean taskWaiting;
  private boolean taskHolding;
  final Monitor monitor;

  TaskState(Monitor monitor) {
    this.monitor = monitor;
  }

  public boolean isPacketPending() { return packetPending; }
  public boolean isTaskHolding()   { return taskHolding;   }
  public boolean isTaskWaiting()   { return taskWaiting;   }

  public void setTaskHolding(final boolean b) {
    taskHolding = b;
    if (b) monitor.incrementHoldCount();
  }
  public void setTaskWaiting(final boolean b) { taskWaiting = b; }
  public void setPacketPending(final boolean b) { packetPending = b; }

  public void packetPending() {
    packetPending = true;
    taskWaiting   = false;
    taskHolding   = false;
  }

  public void running() {
    packetPending = taskWaiting = taskHolding = false;
  }

  public void waiting() {
    packetPending = taskHolding = false;
    taskWaiting = true;
  }

  public void waitingWithPacket() {
    taskHolding = false;
    taskWaiting = packetPending = true;
  }

  public boolean isRunning() {
    return !packetPending && !taskWaiting && !taskHolding;
  }

  public boolean isTaskHoldingOrWaiting() {
    return taskHolding || (!packetPending && taskWaiting);
  }

  public boolean isWaiting() {
    return !packetPending && taskWaiting && !taskHolding;
  }

  public boolean isWaitingWithPacket() {
    return packetPending && taskWaiting && !taskHolding;
  }

  public static TaskState createPacketPending(Monitor monitor) {
    TaskState t = new TaskState(monitor);
    t.packetPending();
    return t;
  }

  public static TaskState createRunning(Monitor monitor) {
    TaskState t = new TaskState(monitor);
    t.running();
    return t;
  }

  public static TaskState createWaiting(Monitor monitor) {
    TaskState t = new TaskState(monitor);
    t.waiting();
    return t;
  }

  public static TaskState createWaitingWithPacket(Monitor monitor) {
    TaskState t = new TaskState(monitor);
    t.waitingWithPacket();
    return t;
  }
}
