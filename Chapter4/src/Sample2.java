import java.util.ArrayList;
import java.util.Arrays;

public class Sample2 {
  public static void main(String[] args) {
    // for
    String[] numbers = {"One", "Two", "Three"};
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    int[] marks = {90, 25, 67, 45, 80};
    for (int i = 0; i < marks.length; i++) {
      if (marks[i] >= 60) {
        System.out.println((i + 1) + "번 학생은 합격입니다.");
      } else {
        System.out.println((i + 1) + "번 학생은 불합격입니다.");
      }
    }

    for (int i = 0; i < marks.length; i++) {
      if (marks[i] < 60) {
        continue;
      }
      System.out.println((i + 1) + "번 학생 축하합니다. 합격입니다.");
    }

    for (int i = 2; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.print(i * j + " ");
      }
      System.out.println();
    }

    // for each
    for (String number: numbers) {
      System.out.println(number);
    }

    ArrayList<String> numbs = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
    for (String number: numbs) {
      System.out.println(number);
    }
  }
}
