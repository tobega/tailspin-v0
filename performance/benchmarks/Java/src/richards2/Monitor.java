package richards2;

public class Monitor {

  private static final boolean TRACING = false;

  private int queuePacketCount = 0;
  private int holdCount = 0;

  private int layout = 0;

  public void incrementPacketCount() {
    queuePacketCount++;
  }

  public void incrementHoldCount(){
    holdCount++;
  }

  public int getQueuePacketCount() {
    return queuePacketCount;
  }

  public int getHoldCount() {
    return holdCount;
  }

  public void trace(final int id) {
    if (!TRACING) return;
    layout = layout - 1;
    if (0 >= layout) {
      // Checkstyle: stop
      System.out.println();
      // Checkstyle: resume
      layout = 50;
    }
    // Checkstyle: stop
    System.out.print(id);
    // Checkstyle: resume
  }
}
