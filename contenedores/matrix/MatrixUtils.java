package contenedores.matrix;

import java.util.ArrayList;
import java.util.Date;

public abstract class MatrixUtils {

  static String[] ciudades = { "Madrid", "New York", "Pekin", "Leganés", "Londres", "Paris" };

  static String[] nombres = { "Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía",
      "Lucía", "Elena", "Miguel" };

  public static ArrayList<Personaje> FactoriaPersonas(int cantidad) {
    ArrayList<Personaje> lista = new ArrayList<>(cantidad);

    for (int i = 0; i < cantidad; i++) {
      String nom = nombres[(int) (Math.random() * nombres.length)];
      String ciu = ciudades[(int) (Math.random() * ciudades.length)];

      int edad = (int) (Math.random() * 99);
      int probMorir = (int) (Math.random() * 99);

      Personaje p = new Humano(i, nom, ciu, new Date(), new Date().getTime(), edad, probMorir);
      lista.add(p);

      // Esperar para que no todas las fechas/horas sean iguales
      try {
        Thread.sleep(4);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }

    return lista;
  }
}
