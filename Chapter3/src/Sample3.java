public class Sample3 {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    sb.append("hello");
    sb.append(" ");
    sb.append("jump to java");

    String result = sb.toString();
    System.out.println(result);

    StringBuilder stb = new StringBuilder();
    stb.append("jump to java");
    stb.insert(0, "hello ");
    System.out.println(stb.toString());

    StringBuilder stbu = new StringBuilder();
    stbu.append("Hello jump to java");
    System.out.println(stbu.substring(0, 4));
  }
}
