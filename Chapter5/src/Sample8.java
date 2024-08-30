interface Mineral {
  int getValue();
}

class Gold implements Mineral {
  int value = 100;

  public int getValue() {
    return this.value;
  }
}

class Silver implements Mineral {
  int value = 90;

  public int getValue() {
    return this.value;
  }
}

class Bronze implements Mineral {
  int value = 80;

  public int getValue() {
    return this.value;
  }
}

class MineralCalculator {
  int value = 0;

  public void add(Mineral mineral) {
    this.value += mineral.getValue();
  }

  public int getValue() {
    return this.value;
  }
}

public class Sample8 {
  public static void main(String[] args){
    MineralCalculator cal = new MineralCalculator();
    cal.add(new Gold());
    cal.add(new Silver());
    cal.add(new Bronze());
    System.out.println(cal.getValue());
  }
}
