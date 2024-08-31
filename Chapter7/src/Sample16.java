@FunctionalInterface
interface Calculator {
  int sum(int a, int b);
}

public class Sample16 {
  public static void main(String[] args) {
    Calculator mc = (a, b) -> a + b;
    int result = mc.sum(3, 4);
    System.out.println(result);
  }
}
