import java.util.ArrayList;

public class Sample {
  public static void main(String[] args) {
    // if - else
    int x = 3;
    int y = 2;
    System.out.println(x > y);
    System.out.println(x < y);
    System.out.println(x == y);
    System.out.println(x != y);

    int money = 2000;
    boolean hasCard = true;

    if (money >= 3000 || hasCard) {
      System.out.println("택시를 타고 가자!");
    } else {
      System.out.println("걸어가자...");
    }

    ArrayList<String> pocket = new ArrayList<>();
    pocket.add("Paper");
    pocket.add("Cellphone");

    if (pocket.contains("Money")) {
      System.out.println("택시를 타고 가자!");
    } else if (hasCard) {
      System.out.println("택시를 타고 가자!");
    } else {
      System.out.println("걸어가자...");
    }

    // switch - case
    int month = 8;
    String monthString = "";

    switch (month) {
      case 1:
        monthString = "January";
        break;
      case 2:
        monthString = "February";
        break;
      case 3:
        monthString = "March";
        break;
      case 4:
        monthString = "April";
        break;
      case 5:
        monthString = "May";
        break;
      case 6:
        monthString = "June";
        break;
      case 7:
        monthString = "July";
        break;
      case 8:
        monthString = "August";
        break;
      case 9:
        monthString = "September";
        break;
      case 10:
        monthString = "October";
        break;
      case 11:
        monthString = "November";
        break;
      case 12:
        monthString = "December";
        break;
      default:
        monthString = "Invalid month";
        break;
    }

    System.out.println(monthString);

    // while
    int treeHit = 0;
    while (treeHit < 10) {
      treeHit++;
      System.out.printf("나무를 %d번 찍었습니다.\n", treeHit);
      if (treeHit == 10) {
        System.out.println("나무가 넘어갑니다.");
      }
    }

    int coffee = 10;
    int wallet = 300;

    while (wallet > 0) {
      System.out.println("돈을 받았습니다. 커피를 제공합니다.");
      coffee--;
      System.out.printf("남은 커피의 양은 %d입니다.\n", coffee);
      if (coffee == 0) {
        System.out.println("커피가 품절되었습니다. 판매를 종료합니다.");
        break;
      }
    }

    int a = 0;
    while (a < 10) {
      a++;
      if (a % 2 == 0) {
        continue;
      }
      System.out.println(a);
    }
  }
}
