public class Sample {
  public static void main(String[] args) {
    // Number
    int a = 10;
    int b = 5;

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);

    System.out.println(7 % 3);
    System.out.println(3 % 7);

    // Increment & Decrement
    int i = 0;
    int j = 10;

    i++;
    j--;

    System.out.println(i);
    System.out.println(j);

    int k = 0;

    System.out.println(k++);
    System.out.println(k);

    int l = 0;

    System.out.println(++l);
    System.out.println(l);

    // Boolean
    int base = 180;
    int height = 185;
    boolean isTall = height > base;

    if (isTall) {
      System.out.println("키가 크군요!");
    }

    int m = 3;
    boolean isOdd = m % 2 == 1;
    System.out.println(isOdd);

    // Character
    char a1 = 'a';
    char a2 = 97;
    char a3 = '\u0061';

    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
  }
}
