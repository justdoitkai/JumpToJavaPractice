public class Sample3 {
  int num;

  int sum(int a, int b) {
    return a + b;
  }

  String say() {
    return "Hi!";
  }

  void sum2(int a, int b) {
    System.out.printf("%d와 %d의 합은 %d입니다.\n", a, b, a + b);
  }

  void say2() {
    System.out.println("Hi!");
  }

  void sayNick(String nick) {
    if ("바보".equals(nick)) {
      return;
    }
    System.out.printf("나의 별명은 %s 입니다.\n", nick);
  }

  void varTest() {
    this.num++;
  }

  public static void main(String[] args) {
    int a = 3;
    int b = 4;

    Sample3 sample = new Sample3();
    int c = sample.sum(a, b);
    System.out.println(c);

    String d = sample.say();
    System.out.println(d);

    sample.sum2(3, 4);

    sample.say2();

    sample.sayNick("야호");
    sample.sayNick("바보");

    sample.num = 1;
    sample.varTest();
    System.out.println(sample.num);
  }
}
