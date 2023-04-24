
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) throws Exception {
    FileReader fr = null;
    BufferedReader br = null;
    ArrayList<Alumno> alumnos = new ArrayList<>();

    int totalEdad = 0, totalAlumnos = 0, totalSuspensos = 0, totalMujeres = 0, mujeresSuspensas = 0;
    try {
      fr = new FileReader("src/txt/f.txt");
      br = new BufferedReader(fr);

      br.readLine();
      String line = br.readLine();

      while (line != null) {
        String[] splitLine = line.split("\\s+");

        String sexo = splitLine[0];
        int edad = Integer.valueOf(splitLine[1]);
        double estatura = Double.valueOf(splitLine[2]);
        int p1 = Integer.valueOf(splitLine[3]);
        int p2 = Integer.valueOf(splitLine[4]);
        String aprobado = splitLine[5];

        Alumno a = new Alumno(sexo, edad, estatura, p1, p2, aprobado);
        alumnos.add(a);

        line = br.readLine();
        totalAlumnos++;
        totalEdad += edad;

        if (sexo.equals("Mujer")) {
          totalMujeres++;
        }

        if (aprobado.equals("Suspenso")) {
          totalSuspensos++;
          if (sexo.equals("Mujer")) {
            mujeresSuspensas++;
          }
        }
      }
    } catch (Exception e) {
      System.out.println(e.toString());
    } finally {
      fr.close();
      br.close();
    }

    alumnos.sort((arg0, arg1) -> {
      return arg0.getEdad() - arg1.getEdad();
    });

    System.out.println("ALUMNOS ORDENADOS POR EDAD");
    System.out.println(alumnos.toString());

    System.out.println("TOTAL ALUMNOS:\t\t " + totalAlumnos);
    System.out.println("EDAD MEDIA:\t\t " + totalEdad / totalAlumnos);
    System.out.println("NUMERO DE SUSPENSOS:\t " + totalSuspensos);
    System.out.println("TOTAL MUJERES:\t\t " + totalMujeres);
    System.out.println("MUJERES SUSPENSAS:\t " + mujeresSuspensas);

  }
}