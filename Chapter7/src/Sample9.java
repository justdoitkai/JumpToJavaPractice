public class Sample9 {
  public static void main(String[] args) {
    int c;

    try {
      c = 4 / 0;
    } catch (ArithmeticException e) {
      c = -1;
    }

    System.out.println(c);
  }
}
