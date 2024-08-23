import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Sample5 {
  public static void main(String[] args) {
    // Map
    HashMap<String, String> map = new HashMap<>();
    map.put("People", "사람");
    map.put("Baseball", "야구");

    System.out.println(map.get("People"));

    System.out.println(map.get("Java"));
    System.out.println(map.getOrDefault("Java", "자바"));

    System.out.println(map.containsKey("People"));
    System.out.println(map.keySet());

    System.out.println(map.remove("People"));
    System.out.println(map.size());

    // Set
    HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
    System.out.println(set);

    HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

    HashSet<Integer> intersection = new HashSet<>(s1);
    intersection.retainAll(s2); // 교집합
    System.out.println(intersection);

    HashSet<Integer> union = new HashSet<>(s1);
    union.addAll(s2); // 합집합
    System.out.println(union);

    HashSet<Integer> substract = new HashSet<>(s1);
    substract.removeAll(s2);
    System.out.println(substract);

    HashSet<String> set2 = new HashSet<>();
    set2.add("Jump");
    set2.add("To");
    set2.add("Java");
    System.out.println(set2);

    set2.addAll(Arrays.asList("Practice", "Best")); // 합집합과 동일
    System.out.println(set2);

    set2.remove("To");
    System.out.println(set2);
  }
}
