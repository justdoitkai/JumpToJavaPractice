public class Sample11 {
  public void shouldBeRun() {
    System.out.println("OK Thanks.");
  }

  public static void main(String[] args) {
    Sample11 sample11 = new Sample11();
    int c;

    try {
      c = 4 / 0;
    } catch (ArithmeticException e) {
      c = -1;
    } finally {
      sample11.shouldBeRun();
    }
  }
}
