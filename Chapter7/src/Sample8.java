import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample8 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("없는파일"));
    br.readLine();
    br.close();
  }
}
