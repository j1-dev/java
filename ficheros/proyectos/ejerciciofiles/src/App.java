package ficheros.proyectos.ejerciciofiles.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    FileReader fr = null;
    BufferedReader br = null;
    Scanner s = null;

    try {
      fr = new FileReader("src/txt/f_reales.txt");
      br = new BufferedReader(fr);

      String line = br.readLine();

      double total;
      int lineNum = 1;
      while (line != null) {
        s = new Scanner(line);
        total = 0;

        try {
          while (s.hasNextDouble()) {
            double d = s.nextDouble();
            total += d;
          }
          System.out.println("Linea " + lineNum + " = " + total);
        } catch (Exception e) {
          System.out.println("Linea " + lineNum + " vacia.");
        }
        line = br.readLine();
        lineNum++;
      }
    } catch (Exception e) {
      System.out.println(e.toString());
    } finally {
      fr.close();
      br.close();
      s.close();
    }

  }
}
