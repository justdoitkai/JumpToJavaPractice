import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample7 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("./Chapter6/src/out2.txt"));
    while (true) {
      String line = br.readLine();
      if (line == null) {
        break;
      }

      System.out.println(line);
    }

    br.close();
  }
}
