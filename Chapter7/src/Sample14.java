import java.util.ArrayList;

public class Sample14 extends Thread {
  int seq;

  public Sample14(int seq) {
    this.seq = seq;
  }

  public void run() {
    System.out.println(this.seq + " Thread start");

    try {
      Thread.sleep(1000);
    } catch (Exception e) {
    }

    System.out.println(this.seq + " Thread end");
  }

  public static void main(String[] args) {
    ArrayList<Thread> threads = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      Thread t = new Sample14(i);
      t.start();
      threads.add(t);
    }

    for (int i = 0; i < threads.size(); i++) {
      Thread t = threads.get(i);

      try {
        t.join();
      } catch (Exception e) {

      }
    }

    System.out.println("Main end");
  }
}
