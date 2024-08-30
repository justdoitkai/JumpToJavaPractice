abstract class Predator extends Animal2 {
  abstract String getFood();
  static int LEG_COUNT = 4;

  void printFood() {
    System.out.printf("My food is %s\n", getFood());
  }

  static int speed() {
    return LEG_COUNT * 30;
  }
}

interface Barkable {
  void bark();
}

class Animal2 {
  String name;

  void setName(String name) {
    this.name = name;
  }
}

class Tiger extends Predator implements Barkable {
  public String getFood() {
    return "Apple";
  }

  public void bark() {
    System.out.println("어흥");
  }
}

class Lion extends Predator implements Barkable {
  public String getFood() {
    return "Banana";
  }

  public void bark() {
    System.out.println("으르렁");
  }
}

class ZooKeeper {
  void feed(Predator predator) {
    System.out.println("Feed " + predator.getFood());
  }
}

class Bouncer {
  void barkAnimal(Barkable animal) {
    animal.bark();
  }
}

public class Sample6 {
  public static void main(String[] args) {
    ZooKeeper zooKeeper = new ZooKeeper();
    Tiger tiger = new Tiger();
    Lion lion = new Lion();
    zooKeeper.feed(tiger);
    zooKeeper.feed(lion);

    System.out.println(Predator.speed());

    Bouncer bouncer = new Bouncer();
    bouncer.barkAnimal(tiger);
    bouncer.barkAnimal(lion);
  }
}
