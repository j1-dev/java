package contenedores.matrix;

import java.util.ArrayList;
import java.util.Date;

public class Matrix {
  public static void main(String[] args) {
    final int matrixLength = 25;
    ArrayList<Personaje> l = MatrixUtils.FactoriaPersonas(200);
    ArrayList<Personaje> matrix = new ArrayList<>(matrixLength);
    Neo neo = new Neo(999, "Neo", "Sevilla", new Date(), new Date().getTime(), 23, false, 100);
    Smith smith = new Smith(666, "Smith", "Oriuelas", new Date(), new Date().getTime(), 999, 50);

    int posNeo, posSmith;
    posNeo = (int) (Math.random() * matrixLength);
    do {
      posSmith = (int) (Math.random() * matrixLength);
    } while (posSmith == posNeo);

    for (int i = 0; i < matrixLength; i++) {
      if (i == posNeo) {
        matrix.add(i, neo);
      }
      if (i == posSmith) {
        matrix.add(i, smith);
      }
      matrix.add(l.remove(0));
    }

    System.out.println("--- COMIENZA EL JUEGO ---");
    final int maxIters = 300;
    int cont = 0;

    while (cont < maxIters) {
      for (int i = 0; i < matrixLength; i++) {
        Personaje p = matrix.get(i);
        if (p instanceof Humano) {
          Humano h = (Humano) p;
          if (h.getProbMorir() <= 10) {
            if (l.size() > 0) {
              matrix.set(i, l.remove(0));
            } else {
              l = MatrixUtils.FactoriaPersonas(200);
              matrix.set(i, l.remove(0));
            }
          } else {
            h.setProbMorir(h.getProbMorir() - 10);
          }
        }
      }

      if (cont % 2 == 0) {

      }

      if (cont % 5 == 0) {

      }

      if (cont % 10 == 0) {

      }

      if (cont % 30 == 0) {
        System.out.println("--INFO--");
        for (int i = 0; i < matrixLength; i++) {
          System.out.println(matrix.get(i).mostrarInformacion());
        }
        System.out.println(imprimirMatrix(matrix).toString());
      }
      cont++;

    }

  }

  static ArrayList<String> imprimirMatrix(ArrayList<Personaje> m) {
    ArrayList<String> res = new ArrayList<>(m.size());

    for (int i = 0; i < m.size(); i++) {
      Personaje p = m.get(i);

      if (p instanceof Humano) {
        res.add(i, "[P]");
      } else if (p instanceof Smith) {
        res.add(i, "[S]");
      } else if (p instanceof Neo) {
        res.add(i, "[N]");
      } else {
        res.add(i, "[ ]");
      }

    }

    return res;
  }

}
