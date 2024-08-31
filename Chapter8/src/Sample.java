public class Sample {
  static int[] gugu(int dan) {
    int[] result = new int[9];

    for (int i = 1; i < 10; i++) {
      result[i - 1] = dan * i;
    }

    return result;
  }

  public static void main(String[] args) {
    int[] result = gugu(2);
    for (int a: result) {
      System.out.println(a);
    }
  }
}
