import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("");
        BufferedReader br = new BufferedReader(fr, 0);

        String line = br.readLine();
        while (line != "") {
            System.out.println(line);
            line = br.readLine();
        }
    }
}
