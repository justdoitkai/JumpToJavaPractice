class Counter {
  static int count = 0;

  Counter() {
    count++;
    System.out.println(count);
  }

  public static int getCount() {
    return count;
  }
}

public class Sample5 {
  public static void main(String[] args) {
    Counter c1 = new Counter();
    Counter c2 = new Counter();

    System.out.println(Counter.getCount());
  }
}
