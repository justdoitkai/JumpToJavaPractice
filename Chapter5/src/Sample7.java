import java.util.ArrayList;
import java.util.Arrays;

class Calculators {
  int value;

  Calculators() {
    this.value = 0;
  }

  void add(int val) {
    this.value += val;
  }

  int avg(int[] arr) {
    int result = 0;

    for (int num: arr) {
      result += num;
    }

    return (result / arr.length);
  }

  int avg(ArrayList<Integer> arrayList) {
    int result = 0;

    for (int num: arrayList) {
      result += num;
    }

    return (result / arrayList.size());
  }

  int getValue() {
    return this.value;
  }

  boolean isOdd(int val) {
    if (val % 2 == 1) {
      return true;
    } else {
      return false;
    }
  }
}

class UpgradeCalculator extends Calculators {
  void minus(int val) {
    this.value -= val;
  }
}

class MaxLimitCalculator extends Calculators {
  void add(int val) {
    this.value += val;

    if (this.value > 100) {
      this.value = 100;
    }
  }
}

public class Sample7 {
  public static void main(String[] args) {
    Calculators cal = new Calculators();

    int[] data1 = {1, 3, 5, 7, 9};
    ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));

    int result1 = cal.avg(data1);
    int result2 = cal.avg(data2);

    System.out.println(result1);
    System.out.println(result2);
  }
}
