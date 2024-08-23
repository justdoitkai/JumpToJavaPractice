import java.awt.*;
import java.util.Arrays;

public class Sample2 {
  public static void main(String[] args) {
    // String
    String a = "hello";
    String b = "java";
    String c = new String("hello");

    // equals
    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
    System.out.println(a == c);

    // indexOf
    String d = "Hello Java";
    System.out.println(d.indexOf("Java"));

    // contains
    System.out.println(d.contains("Java"));

    // charAt
    System.out.println(d.charAt(6));

    // replaceAll
    System.out.println(d.replaceAll("Java", "World"));

    // substring
    System.out.println(d.substring(0, 4));

    // toUpperCase & toLowerCase
    System.out.println(d.toUpperCase());
    System.out.println(d.toLowerCase());

    // split
    String e = "a:b:c:d";
    String[] result = e.split(":");
    System.out.println(Arrays.toString(result));

    // String Formatting
    System.out.println(String.format("I eat %d apples.", 3));
    System.out.println(String.format("I eat %s apples.", "five"));

    int number = 3;
    System.out.println(String.format("I eat %d apples.", number));

    String day = "three";
    System.out.println(String.format("I ate %d apples. So I was sick for %s days.", number, day));

    System.out.println(String.format("I have %s apples.", 3));
    System.out.println(String.format("rate is %s", 3.234));

    System.out.println(String.format("%10s", "hi"));
    System.out.println(String.format("%-10sjane", "hi"));

    System.out.println(String.format("%.4f", 3.42134234));
    System.out.println(String.format("%10.4f", 3.42134234));

    System.out.printf("I eat %d apples.", 3);
  }
}
