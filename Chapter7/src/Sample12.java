class FoolException extends Exception {

}

public class Sample12 {
  public void sayNick(String nick) throws FoolException {
    if ("바보".equals(nick)) {
      throw new FoolException();
    }

    System.out.println("당신의 별명은 " + nick + " 입니다.");
  }

  public static void main(String[] args) {
    Sample12 sample12 = new Sample12();

    try {
      sample12.sayNick("바보");
      sample12.sayNick("야호");
    } catch (FoolException e) {
      System.err.println("FoolException이 발생했습니다.");
    }
  }
}
