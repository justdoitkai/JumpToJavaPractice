import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample6 {
  // Enum
  enum CoffeeType {
    AMERICANO,
    ICE_AMERICANO,
    CAFE_LATTE
  };


  public static void main(String[] args) {
    // Enum
    System.out.println(CoffeeType.AMERICANO);
    System.out.println(CoffeeType.ICE_AMERICANO);
    System.out.println(CoffeeType.CAFE_LATTE);

    for (CoffeeType type: CoffeeType.values()) {
      System.out.println(type);
    }

    // Casting
    String num = "123";
    int n = Integer.parseInt(num);
    System.out.println(n);

    String num2 = n + "";
    System.out.println(num2);

    String num3 = String.valueOf(n);
    System.out.println(num3);
    String num4 = Integer.toString(n);
    System.out.println(num4);

    String num5 = "123.456";
    double d = Double.parseDouble(num5);
    System.out.println(d);

    int n1 = 123;
    double d1 = n1;
    System.out.println(d1);

    double d2 = 123.456;
    int n2 = (int) d2; // 정수형으로 캐스팅
    System.out.println(n2);

    // final
    final int fn = 123;
    final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
    final List<String> la = List.of("a", "b");
  }
}
