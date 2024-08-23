import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample4 {
  public static void main(String[] args) {
    // Array
    String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
    System.out.println(weeks[3]);

    for (int i = 0; i < weeks.length; i++) {
      System.out.println(weeks[i]);
    }

    // List
    ArrayList<String> pitches = new ArrayList<>();
    pitches.add("138");
    pitches.add("129");
    pitches.add("142");
    pitches.add(1, "133");

    System.out.println(pitches);
    System.out.println(pitches.get(1));
    System.out.println(pitches.size());
    System.out.println(pitches.contains("142"));

    System.out.println(pitches.remove("129"));
    System.out.println(pitches.remove(0));

    String[] data = {"100", "200", "300"};
    ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList(data));
    System.out.println(pitches2);

    ArrayList<String> pitches3 = new ArrayList<>(Arrays.asList("400", "500", "600"));
    System.out.println(pitches3);

    String result = String.join(", ", pitches3);
    System.out.println(result);

    String result2 = String.join(", ", data);
    System.out.println(result2);

    ArrayList<String> pitches4 = new ArrayList<>(Arrays.asList("138", "129", "142"));
    pitches4.sort(Comparator.naturalOrder()); // 오름차순
    System.out.println(pitches4);

    pitches4.sort(Comparator.reverseOrder()); // 내림차순
    System.out.println(pitches4);
  }
}
